#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

void varWithoutInit(){
  int var;
  printf("\n without initialisation: \n%d",var); // prints 0 by default
}

void alwaysDeclare(){
  int b=10;
  printf("\nwith initialisation: \n%d",b);
}
int main(int argc, char *argv[])
{
  varWithoutInit();
  
  alwaysDeclare();
  return EXIT_SUCCESS;

  // inorder to initialise a null vairable use null pointers 
}

