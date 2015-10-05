#include <stdio.h>

int seed(int x, int step, int mod) {
  if (x == 0) return 0;
  return (seed(x - 1, step, mod) + step) % mod;
}

int main(void) {
  int step = 3;
  int mod = 5;
  int i;
  for (i = mod - 1; i >= 0; i--) {
    printf("%d\n", seed(i, step, mod));
  }

  return 0;
}
