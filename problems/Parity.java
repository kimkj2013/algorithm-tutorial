import java.util.Scanner;

class Parity {

  private static int[][] matrix;

  private static int size = -1;

  public static boolean isOkay(int[][] array2d) {
    int[] rowsum = new int[array2d.length];
    int[] colsum = new int[array2d[0].length];
    for (int i = 0; i < array2d.length; i++) {
      for (int j = 0; j < array2d[i].length; j++) {
        rowsum[i] += array2d[i][j];
        colsum[j] += array2d[j][i];
      }
    }

    
  }

  public static int isChangable(int[][] array2d) {
    int[] rowsum = new int[array2d.length];
    int[] colsum = new int[array2d.length];

    for (int i = 0; i < array2d.length; i++) {
      for (int j = 0; j < array2d[i].length; j++) {
        rowsum[i] += array2d[i][j];
        colsum[i] += array2d[j][i];
      }
    }

    boolean flag = false;

    int odd_row = 0;
    for (int i = 0; i < rowsum.length; i++) {
      if (rowsum[i] % 2 == 1) {
        if (flag) {
          return -1;
        }
        else {
          odd_row = i;
          flag = true;
        }
      }
    }

    flag = false;

    int odd_col = 0;
    for (int i = 0; i < colsum.length; i++) {
      if (colsum[i] % 2 == 1) {
        if (flag) {
          return -1;
        }
        else {
          odd_col = i;
          flag = true;
        }
      }
    }
 
    return (odd_row + 1) * 100 + odd_col + 1;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    size = s.nextInt();
    if (size >= 100 || size < 0) throw new IllegalArgumentException();

    while (size != 0) {
      matrix = new int[size][size];
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          matrix[i][j] = s.nextInt();
          if (matrix[i][j] != 0 && matrix[i][j] != 1)
            throw new IllegalArgumentException();
        }
      }
      if (isOkay(matrix)) {
        System.out.println("OK");
      }
      else {
        int point = isChangable(matrix);
        if (point < 0) {
          System.out.println("Corrupt");
        }
        else {
          int x = point / 100;
          int y = point % 100;
          System.out.printf("Change bit (%d, %d)\n", x, y);
        }
      }
      size = s.nextInt();
    }

    s.close();
  }

}
