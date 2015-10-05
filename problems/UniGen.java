import java.util.ArrayList;
import java.util.Scanner;

class Main {

  static int STEP = 0;
  static int MOD = 0;

  static int seed(int x) {
    if (x <= 0) return 0;
    return (seed(x - 1) + STEP) % MOD;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    STEP = s.nextInt();
    MOD = s.nextInt();
    ArrayList<Integer> pq = new ArrayList<Integer>();
    for (int x = MOD - 1; x >= 0; x--) {
      pq.add(seed(x));
    }
    java.util.Collections.sort(pq);
    System.out.println(pq.toString());

    for (int i = 0; i < MOD; i++) {
      if (pq.get(i) != i) {
        System.out.println("Bad Choice");
        return;
      }
    }
    System.out.println("Good Choice");
    
  }

}
