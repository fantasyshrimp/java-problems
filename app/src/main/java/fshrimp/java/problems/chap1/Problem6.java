package fshrimp.java.problems.chap1;

public class Problem6 {
  public static int countCharInString(String str, char c) {

    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == c) {
        count++;
      }
    }
    return count;
  }
}
