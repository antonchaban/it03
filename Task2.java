import java.lang.Math;


public class Task2 {
  public static void main(String[] args) {
    printRes2(2.5, 4);
    printRes2(1.2, 1);
    printRes2(3, 2);
    printRes2(3, 3);
    printRes2(3, 4);
    printRes2(Double.MAX_VALUE, 3);
    printRes2(Double.MIN_VALUE, 25);
    printRes2(Double.NaN, 14);
    printRes2(-Double.MAX_VALUE, 24);
    printRes2(-Double.MIN_VALUE, 26);


  }

  public static double gettingTheResult(double i, double t) {
    double res = 0;
    if (i == 1.2 && t>0) {
      return Math.log(t);
    }
    if (i > 2) {
      for (int k = 1; k < i; k++) {
        res += (Math.sin(t)) / k;
      }
    } else {
      throw new IllegalArgumentException("param i=" + i);
    }


    return res;
  }

  static void printRes2(double i, double t) {
    try {
      System.out.println("i=" + i + " " + "t=" + t + " " + "result" + gettingTheResult(i, t));
    } catch (IllegalArgumentException e) {
      System.out.println("Exception" + e.getMessage());
    }
  }
}

