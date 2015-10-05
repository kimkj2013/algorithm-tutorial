#include <stdio.h>

void function(int *k) {
  k++;
}

int main(void) {
  int n = 5;
  function(&n);
  printf("%d", n);
  return n;
}
