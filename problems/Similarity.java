import java.util.Scanner;

class Similarity {

  static int gcd(int a, int b) {
    if (a == b) return a;
    if (b == 0) return a;
    return gcd(b, a % b);
  }

  public static void main(String[] args) {
    System.out.println(gcd(gcd(30, 100), 18));
  }

}
