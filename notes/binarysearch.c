#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
  static int i;
  int count;
  scanf("%d", &count);
  int array[count];

  srand(time(NULL));
  for (i = 0; i < count; i++) {
    array[i] = (rand() % 100 + 1);
  }

  int find;
  scanf("%d", &find);
  
  return 0;
}
