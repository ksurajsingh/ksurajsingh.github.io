#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <stdbool.h>

typedef struct node{
    int info;
    struct node *left, *right;
} NODE;

static NODE *root = NULL;

static int get_rand_int(void){ return rand() % 2; }

static NODE* new_node(int x){
    NODE *n = (NODE*)malloc(sizeof(NODE));
    if(!n){ perror("malloc"); exit(1); }
    n->info = x; n->left = n->right = NULL;
    return n;
}

/* ---- BST core ---- */
static NODE* insert(int item, NODE *cur, NODE *n){
    if(cur == NULL) return n;
    if(item < cur->info)        cur->left  = insert(item, cur->left,  n);
    else if(item > cur->info)   cur->right = insert(item, cur->right, n);
    else { // duplicate
        if(get_rand_int())      cur->left  = insert(item, cur->left,  n);
        else                    cur->right = insert(item, cur->right, n);
    }
    return cur;
}

static NODE* search(NODE *cur, int item){
    if(!cur) return NULL;
    if(item == cur->info) return cur;
    return (item < cur->info) ? search(cur->left, item) : search(cur->right, item);
}

static NODE* search_parent(NODE *child, NODE *cur){
    if(!child || !cur || child == root) return NULL;
    while(cur){
        if(cur->left == child || cur->right == child) return cur;
        cur = (child->info < cur->info) ? cur->left : cur->right;
    }
    return NULL;
}

/* Inorder successor of value `item` in the tree rooted at `root` */
static NODE* inorder_successor(int item){
    NODE *cur = search(root, item);
    if(!cur) return NULL;

    if(cur->right){ // min in right subtree
        NODE *s = cur->right;
        while(s->left) s = s->left;
        return s;
    }
    // ascend from root to first ancestor where we go left
    NODE *succ = NULL, *anc = root;
    while(anc && anc != cur){
        if(cur->info < anc->info){ succ = anc; anc = anc->left; }
        else                      { anc = anc->right; }
    }
    return succ; // can be NULL if no successor
}

/* ---- Deletion helpers ---- */
static void delete_case_leaf(NODE *del){
    NODE *p = search_parent(del, root);
    if(!p){ // del is root
        root = NULL;
    } else if(p->left == del){
        p->left = NULL;
    } else {
        p->right = NULL;
    }
    free(del);
}

static void delete_case_one_child(NODE *del){
    NODE *child = del->left ? del->left : del->right;
    NODE *p = search_parent(del, root);
    if(!p){            // del is root
        root = child;
    } else if(p->left == del){
        p->left = child;
    } else {
        p->right = child;
    }
    free(del);
}

static void delete_node(int item); // fwd

static void delete_case_two_children(NODE *del){
    NODE *suc = inorder_successor(del->info); // must exist
    int val = suc->info;
    delete_node(suc->info);  // deletes the successor (which is in del's right subtree)
    del->info = val;
}

static void delete_node(int item){
    NODE *node = search(root, item);
    if(!node) return; // not found: no-op
    if(!node->left && !node->right)          delete_case_leaf(node);
    else if(!node->left || !node->right)     delete_case_one_child(node);
    else                                     delete_case_two_children(node);
}

/* ---- Display ---- */
static void display_level_tilt(NODE* r, int level){
    if(!r) return;
    display_level_tilt(r->right, level+1);
    for(int i=0;i<level;i++) printf("  ");
    printf("%d\n", r->info);
    display_level_tilt(r->left, level+1);
}

int main(void){
    srand((unsigned)time(NULL));
    int ch, item, key;

    printf("\n\n***** Implementing a Binary Search Tree *****\n\n");
    for(;;){
        printf("\n*********************************\n");
        printf("Enter your choice:\n1.Create\n2.Search\n3.Inorder Successor\n4.Delete\n5.Display\n");
        if(scanf("%d", &ch) != 1) break;

        switch(ch){
            case 1: {
                printf("\n ** Enter the value of the node: ");
                if(scanf("%d", &item) != 1) break;
                root = insert(item, root, new_node(item));
            } break;

            case 2: {
                printf("\nEnter the element to search: ");
                if(scanf("%d", &key) != 1) break;
                NODE *addr = search(root, key);
                if(addr) printf("Key %d found at address: %p\n", key, (void*)addr);
                else     printf("Key %d not found.\n", key);
            } break;

            case 3: {
                printf("\nEnter the element whose inorder successor you want: ");
                if(scanf("%d", &item) != 1) break;
                NODE *res = inorder_successor(item);
                if(res)  printf("Inorder successor is: %d\n", res->info);
                else     printf("No inorder successor (item missing or it is the max).\n");
            } break;

            case 4: {
                printf("\nEnter the element you want to delete: ");
                if(scanf("%d", &item) != 1) break;
                delete_node(item);
                printf("Element deleted (if it existed).\n");
                printf("\nCurrent elements are:\n");
                display_level_tilt(root, 1);
            } break;

            case 5:
                printf("\nCurrent elements are:\n");
                display_level_tilt(root, 1);
                break;

            default: return 0;
        }
    }
    return 0;
}

