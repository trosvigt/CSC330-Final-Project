package MathClasses;

public class MyMath {
  public static boolean isEven(int num) {
    return num % 2 == 0;
  }

  public static boolean isOdd(int num) {
    return num % 2 != 0;
  }

  public static long pow(int num, int power) {
    long result = num;

    for (int i = 1; i < power; i++) {
      result *= num;
    }

    return result;
  }

  public static long factorial(int num) {
    if (num == 0 || num == 1) {
      return 1;
    } else {
      return num * factorial(num - 1);
    }
  }
}