// This is a sample solution

#include <stdio.h>
#include <math.h>

static int n, tree[200001], count;

void inorder(int s) {
  if (s <= n / 2) {
    inorder(s * 2);
    tree[s] = ++count;
    inorder(s * 2 + 1);
  }
}

int main(void) {
  scanf("%d", &n);
  inorder(1);
  static int i, j, c, t;
  for (i = 1 ;; i++) {
    t = (int) (pow(2.0, i - 1));
    for (i = t, c = 1; c <= t && j <= n / 2; j++, c++) {
      printf("%d ", tree[j]);
    }
    for (j = t * 2 - 1, c = 1; c <= t && j >= t; j--, c++) {
      if (tree[j]) {
        printf("%d ", n - tree[j] + 1);
      }
    }
    if (t + 1 > n / 2) {
      break;
    }
  }
  return 0;
}
