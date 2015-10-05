#include <stdio.h>

#define PROPERSUBSET1 "A is a proper subset of B"
#define PROPERSUBSET2 "B is a proper subset of A"
#define EQUAL "A equals B"
#define DISJOINT "A and B are disjoint"
#define CONFUSED "I'm confused!"

int main(void) {
  char* a, b;
  scanf("%s", a);
  scanf("%s", b);
  printf("%s %s", a, b);
  return 0;
}
