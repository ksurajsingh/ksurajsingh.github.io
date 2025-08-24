#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>


// THERE IS NO FORWARD REFERENCE IN C

int main(int argc, char *argv[])
{
    int num;
    one(num); // gives implicit declaration error 
  return EXIT_SUCCESS;
}

void one(int num){
  two(num); // implicit declaration
}

void two(int num){
  printf("%d",num); // implicit declaration
}


