import java.util.Scanner;

class floorme {

  public static class Tuple {
    public int x, y, z;

    public Tuple(int x, int y, int z) {
      this.x = x; this.y = y; this.z = z;
    }

  }

  public static int equation(int k1, int k2, int c) {
    return (int) ((double) (k1 * k2 * c) / (double) (k1 + k2));
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x = -1, y = -1, z = -1;
    java.util.ArrayList<Tuple> lst = new java.util.ArrayList<Tuple>();
    Tuple t = new Tuple(x, y, z);
    do {
      x = s.nextInt();
      y = s.nextInt();
      z = s.nextInt();
      if (x == 0 && y == 0 && z == 0) {
        break;
      }
      t = new Tuple(x, y, z);
      lst.add(t);
    } while (true);
    for (Tuple tuple : lst) {
      System.out.println(equation(tuple.x, tuple.y, tuple.z));
    }
  }

}
