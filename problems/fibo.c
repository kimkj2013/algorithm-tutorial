#include <stdio.h>

int fibo(int n) {
  if (n == 0) return 0;
  if (n == 1) return 1;
  return fibo(n - 1) + fibo(n - 2);
}

int main(void) {
  int args;
  scanf("%d", &args);
  printf("%d\n", fibo(args));
  return fibo(args);
}
