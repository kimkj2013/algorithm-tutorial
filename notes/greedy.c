#include <stdio.h>

int main(void) {
  printf("Available coins: 500 KRW, 100 KRW, 50 KRW, 10 KRW, 5 KRW, 1 KRW\n");
  printf("How many Korean wons do you want to change to coins? ");
  int amt;
  scanf("%d", &amt);
  printf("Your %d wons will change to the following number of coins:\n", amt);
  int f_hund = amt / 500;
  amt = amt % 500;
  int hund = amt / 100;
  amt = amt % 100;
  int f_ty = amt / 50;
  amt = amt % 50;
  int ten = amt / 10;
  amt = amt % 10;
  int five = amt / 5;
  int one = amt % 5;
  printf("500 KRW: %d\n", f_hund);
  printf("100 KRW: %d\n", hund);
  printf("50 KRW: %d\n", f_ty);
  printf("10 KRW: %d\n", ten);
  printf("5 KRW: %d\n", five);
  printf("1 KRW: %d\n", one);
  return 0;
}
