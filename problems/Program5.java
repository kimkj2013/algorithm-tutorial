import java.util.Scanner;

class Program5 {


  public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    String name = k.nextLine();
    String origAddress = k.nextLine();
    String phone = k.nextLine();

    int name_comma = name.indexOf(",");

    String lastname = name.substring(0, name_comma).trim().toLowerCase();
    String firstname = name.substring(name_comma + 1).trim().toUpperCase();

    firstname = firstname.substring(firstname.indexOf(" ") + 1);

    name = new String(firstLetterCapital(firstname) + " " + firstLetterCapital(lastname));

    int address_divide = trackSecondLastComma(origAddress);

    String address1 = origAddress.substring(0, address_divide).trim();
    String address2 = origAddress.substring(address_divide + 1).trim();

    printResult(name, address1, address2, phone);
  }

  public static String firstLetterCapital(String str) {
    return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
  }

  public static int trackSecondLastComma(String str) {
    char[] token = str.toCharArray();
    boolean tracker = false;
    for (int i = token.length - 1; i >= 0; i--) {
      if (token[i] == ',') {
         if (tracker) {
           return i;
         }
         else {
           tracker = true;
         }
      }
    }
    return -1;
  }

  public static void printResult(String name, String address, String city, String phone) {
    String to_print = new String();
    to_print += "***** Results *****\n";
    to_print += String.format("%s\n", name);
    to_print += String.format("%s\n", address);
    to_print += String.format("%s\n", city);
    to_print += String.format("%s\n", phone);
    System.out.printf("%s", to_print);
  }

}
