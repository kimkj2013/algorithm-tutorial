import java.util.Scanner;

class alarm {

  public static final int HOUR_UP = 60;
  public static final int HOUR_DOWN = -60;
  public static final int TENS_MINUTE_UP = 10;
  public static final int TENS_MINUTE_DOWN = -10;
  public static final int ONE_MINUTE_UP = 1;
  public static final int ONE_MINUTE_DOWN = -1;

  static class Time {
    public int h, m;

    public Time(int h, int m) { this.h = h; this.m = m; }

    public Time(int h, int m, char d) {
      int newh = h;
      if (d == 'a') {
        if (h == 12) newh = 0;
      }
      else if (d == 'p') {
        if (h != 12) newh += 12;
      }
      else throw new IllegalArgumentException();
      this.h = newh;
      this.m = m;
    }

    public Time(String time) {
      String strhr = "", strmn = "", strdy = "";
      if (time.length() == 7) {
        strhr = time.substring(0, 2);
        strmn = time.substring(3, 5);
        strdy = time.substring(5);
      }
      else if (time.length() == 6) {
        strhr = time.substring(0, 1);
        strmn = time.substring(2, 4);
        strdy = time.substring(4);
      }
      else throw new IllegalArgumentException();
      this.h = Integer.parseInt(strhr);
      if (strdy.charAt(0) == 'a') {
        if (h == 12) h = 0;
      }
      else if (strdy.charAt(0) == 'p') {
        if (h != 12) h += 12;
      }
      else throw new IllegalArgumentException();
      this.m = Integer.parseInt(strmn);
    }

    public Time(Time toCopy) {
      this(toCopy.h, toCopy.m);
    }

    public void switchAMPM() {
      if (this.h < 12) this.h += 12;
      else this.h -= 12;
    }

    public void switchTime(int operand) {
      switch (operand) {
        case HOUR_UP:
          this.h++; break;
        case HOUR_DOWN:
          this.h--; break;
        case TENS_MINUTE_UP:
          this.m += 10; break;
        case TENS_MINUTE_DOWN:
          this.m -= 10; break;
        case ONE_MINUTE_UP:
          this.m++; break;
        case ONE_MINUTE_DOWN:
          this.m--; break;
        default: System.out.println("Bad operand");
      }
      while (this.m > 60) {
        this.h++; this.m -= 60;
      }
      while (this.m < 0) {
        this.h--;
        this.h += 60;
      }
      while (this.h >= 24) {
        this.h -= 24;
      }
      while (this.h < 0) {
        this.h += 24;
      }
    }

    public String toString() {
      String strhr = Integer.toString(h);
      String strmn = Integer.toString(m);
      String strdy = new String();
      if (h < 12) {
        if (h == 0) strhr = new String("12");
        strdy = new String("am");
      }
      else {
        if (h != 12) strhr = Integer.toString(h - 12);
        strdy = new String("pm");
      }
      if (strmn.length() < 2) {
        strmn = "0" + strmn;
      }
      return strhr + ":" + strmn + strdy;
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int count = s.nextInt();
    java.util.ArrayList<Time> lst = new java.util.ArrayList<Time>();
    for (int i = 0; i < count; i++) {
      String tmp = s.next();
      lst.add(new Time(tmp));
      tmp = s.next();
      lst.add(new Time(tmp));
      // System.out.println(lst);
    }
    java.util.ArrayList<Integer> log = new java.util.ArrayList<Integer>();
    for (int i = 0; i < lst.size() - 1; i+=2) {
      log.add(pressButtons(new Time(lst.get(i)), lst.get(i + 1)));
      log.add(Integer.MIN_VALUE);
    }
    // System.out.println(log);
    for (int i = 0; i < lst.size() - 1; i+=2) {
      printFmtStr(lst.get(i), lst.get(i + 1), log.get(i));
      if (i < lst.size() - 1) System.out.println();
    }
  }

  public static int pressButtons(Time t1, Time t2) {
    int mindiff = timediff(t1, t2);
    if (mindiff == 0) return 0;
    int count = 0;
    while (timediff(t1, t2) != 0) {
      if (Math.abs(mindiff) > 360) t1.switchAMPM();
      else if (mindiff > 0) {
        if (mindiff >= 60) {
          t1.switchTime(HOUR_UP);
        }
        else if (mindiff >= 10 && mindiff < 60) {
          t1.switchTime(TENS_MINUTE_UP);
        }
        else {
          t1.switchTime(ONE_MINUTE_UP);
        }
      }
      else {
        if (mindiff <= -60) {
          t1.switchTime(HOUR_DOWN);
        }
        else if (mindiff > -60 && mindiff <= -10) {
          t1.switchTime(TENS_MINUTE_DOWN);
        }
        else {
          t1.switchTime(ONE_MINUTE_DOWN);
        }
      }
      count++;
    }
    
    return count;
  }

  // Calculate time difference in minute
  public static int timediff(Time t1, Time t2) {
    int m1 = t1.h * 60 + t1.m;
    int m2 = t2.h * 60 + t2.m;
    int m1m2 = m1 - m2;
    int m2m1 = m2 - m1;
    return Math.min(Math.abs(m1m2), Math.abs(m2m1)) == Math.abs(m1m2) ? m1m2 : m2m1;
  }

  public static void printFmtStr(Time t1, Time t2, int diff) {
    System.out.printf("%s to %s --> %d", t1, t2, diff);
  }

}
