#include <stdio.h>

int algorithm(int n) {
  if (n <= 1) return 1;
  if (n % 2 == 1) return 1 + algorithm(3 * n + 1);
  return 1 + algorithm(n / 2);
}

int max_cycle_length(int n1, int n2) {
  if (n1 > n2) return max_cycle_length1(n2, n1, algorithm(n1));
  return max_cycle_length1(n1, n2, algorithm(n1));
}

int max_cycle_length1(int n1, int n2, int max) {
  if (n1 > n2) return max;
  int n1cycle = algorithm(n1);
  if (n1cycle > max) max = n1cycle;
  return max_cycle_length1(n1 + 1, n2, max);
}

int main(void) {
  int n1;
  int n2;
  scanf("%d", &n1);
  scanf("%d", &n2);
  printf("%d %d %d", n1, n2, max_cycle_length(n1, n2));
  return 0;
}
