import java.util.Scanner;

class Policy {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double length = s.nextDouble();
    double width = s.nextDouble();
    double height = s.nextDouble();

    double volume = length * width * height;

    System.out.printf("Volume: %.2f cubic inches\n", volume);

    double cost = 0;

    if (volume >= 500) {
      cost = 25.0;
    }
    else {
      char yn = 'y';
      if (volume < 200) {
        String k = " ";
        k = s.next();
        yn = k.charAt(0);
      }
      if (yn == 'y') {
        cost = 2.0 + volume * .09;
      }
      else {
        cost = volume * .10;
      }
    }

    System.out.printf("Shipping cost: $%.2f\n", cost);
  }

}
