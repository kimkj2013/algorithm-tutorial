import java.util.Scanner;

class hollywood {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    for (int x = 0; x < 3; x++) {
    String[] contributors = new String[3];
    String[] role = new String[3];
    for (int i = 0; i < contributors.length; i++) {
      contributors[i] = new String();
      role[i] = new String();
      contributors[i] += s.nextLine();
      role[i] += s.nextLine();
    }
    print(contributors, role);
    }
  }

  public static String addSpaceFront(String str) {
    return new String(" " + str);
  }

  public static void print(String[] contributors, String[] role) {
    int maxlencont = Math.max(contributors[0].length(), Math.max(contributors[1].length(), contributors[2].length()));
    int maxlenrole = Math.max(role[0].length(), Math.max(role[1].length(), role[2].length()));
    while (maxlencont != contributors[0].length())
      contributors[0] = addSpaceFront(contributors[0]);
    while (maxlencont != contributors[1].length())
      contributors[1] = addSpaceFront(contributors[1]);
    while (maxlencont != contributors[2].length())
      contributors[2] = addSpaceFront(contributors[2]);
    System.out.println(contributors[0] + "  " + role[0]);
    System.out.println(contributors[1] + "  " + role[1]);
    System.out.println(contributors[2] + "  " + role[2]);
    for (int i = 0; i < (maxlencont + maxlenrole + 2); i++) {
      System.out.print("*");
    }
  }
}
