import java.util.Scanner;
import java.util.Stack;

class Anagram {

  public static int getASCII(char c) {
    return (int) c;
  }

  public static int sumASCII(char[] k) {
    int sum = 0;
    for (char c : k) {
      sum += getASCII(c);
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String input = new String();
    // ArrayList<String> dict = new ArrayList<String>();
    String tmp = new String();
    while (!tmp.equals("#")) {
      tmp = s.next();
      if (!tmp.equals("#")) input += tmp + " ";
    }
    // System.out.println(dict);
    String[] dict = input.split("\\s");

    for (int i = 0; i < dict.length; i++) {
      Stack<String> anastack = new Stack<String>();
      anastack.push(dict[i]);
      for (int j = i + 1; j < dict.length; j++) {
        if (sumASCII(dict[i].toCharArray()) == sumASCII(dict[j].toCharArray())) anastack.push(dict[j]);
      }
      System.out.println(anastack);
    }
  }

}
