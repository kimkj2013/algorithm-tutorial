import java.util.Scanner;

class ThreeN {

  static int algorithm(int n) {
    System.out.println(n);
    if (n == 1) return n;
    if (n % 2 == 1) return algorithm(3 * n + 1);
    return algorithm(n / 2);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(algorithm(s.nextInt()));
    s.close();
  }

}
