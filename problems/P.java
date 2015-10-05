class P {

  public static long factorial(long i) {
    if (i < 1) return 1;
    return i * factorial(i - 1);
  }

  public static double permutation(long n, long r) {
    return factorial(n) / factorial(n - r);
  }

  public static void main(String[] args) {
    double answer = 0;
    double first = permutation(100, 1);
    double second = permutation(100, 2);
    double third = permutation(100, 3);
    double fourth = permutation(100, 4);
    double chooseAPlus = permutation(40, 1);
    answer += (chooseAPlus / first);
    answer += (chooseAPlus + permutation(60, 1)) / second;
    answer += (chooseAPlus + permutation(60, 2)) / third;
    answer += (chooseAPlus + permutation(60, 3)) / fourth;
    System.out.println(answer);
  }

}
