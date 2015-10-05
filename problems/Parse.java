import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

class Parse {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(new File("washington.txt"));
    // String text = "";
    int the = 0, and = 0, so = 0;
    while (s.hasNext()) {
      String word = s.next().toLowerCase();
      if (word.equals("the")) {
        the++;
      }
      else if (word.equals("and")) {
        and++;
      }
      // text += s.next() + " ";
    }
    s.close();
  }

}
