package fshrimp.java.problems.chap1;

public class Problem4 {

  public static boolean checkOnlyNumber(String str) {

    for (int i = 0; i < str.length(); i++) {
      if (!Character.isDigit(str.charAt(i))) {
        return false;
      }
    }
    return true;
  }
}
