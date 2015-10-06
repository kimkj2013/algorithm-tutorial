import java.util.Scanner;

class phone {
  static class phoneno {
    public int front;
    public int back;

    public phoneno(String number) {
      this.front = Integer.parseInt(number.substring(0, 3));
      this.back = Integer.parseInt(number.substring(4));
    }

  }

  public static void main(String[] args) {
    phoneno[] numbers = new phoneno[];
}
