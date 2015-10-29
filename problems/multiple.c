#include <stdio.h>
#include <stdlib.h>

#define RESULT "%d is a multiple of %d\n"
#define BADRES "%d is not a multiple of %d\n"

int number;
int multiple;

int determination() {
  if (number * multiple == 0) {
    fprintf(stderr, "./multiple: invalid option\n");
    fprintf(stderr, "Either a number or a multiple should not be 0.\n");
    return -1;
  }
  if (number < multiple) {
    fprintf(stderr, "./multiple: invalid option\n");
    fprintf(stderr, "A number should not be less than a multiple.\n");
    return -1;
  }
  int flag = -1;
  switch (multiple) {
    case 2:
    if (number % multiple == 0) {
      flag = 0;
    } else {
      flag = 1;
    }
    break;
    case 3:
    break;
    case 4:
    break;
    case 5:
    break;
    default: break;
  }
  if (!flag) {
    printf(RESULT, number, multiple);
  } else {
    printf(BADRES, number, multiple);
  }
  return 0;
}

int main(int argc, char* argv[]) {
  if (argc != 3) {
    fprintf(stderr, "Usage: ./multiple [NUMBER] [MULTIPLE]\n");
    return EXIT_FAILURE;
  }
  number = atoi(argv[1]);
  multiple = atoi(argv[2]);
  int result = determination();
  if (result == -1) {
    return EXIT_FAILURE;
  }
  return 0;
}
