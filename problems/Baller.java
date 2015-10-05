import java.util.Scanner;

class Baller {

  private static String frame = "Frame %d -- Ball %d: ";

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int strike_count = 0, spare_count = 0, score = 0, count = 0;

    int strike_score_hold = 0;

    while (count < 10) {
      count++;
      int ball_count = 1;
      System.out.printf(frame, count, ball_count);
      int first_ball = s.nextInt();
      if (first_ball == 10) {
        strike_count++;
        strike_score_hold += first_ball;
      }
      else {
        ball_count++;
        System.out.printf(frame, count, ball_count);
        int second_ball = s.nextInt();
        if (first_ball + second_ball == 10) {
          spare_count++;
        }
        score += (first_ball + second_ball) + strike_score_hold;
        strike_score_hold = 0;
        ball_count -= 2;
      }
    }

    System.out.printf("Your total score is %d.\n", score);
    System.out.printf("You rolled %d strikes and %d spares.\n", strike_count, spare_count);
    s.close();
  }

}
