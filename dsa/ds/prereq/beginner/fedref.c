#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
    int num;

int main(int argc, char *argv[])
{
  one(num);
  return EXIT_SUCCESS;
}

void one(int num){
  num=num+1;
  two(num);
}

void two(int num){
  printf("%d",num);
}
