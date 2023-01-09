package fshrimp.java.problems.chap1;

public class Problem9 {
  public static String mergeStringBySeparator(String[] strs, String separator) {
    String result = "";

    for (int i = 0; i < strs.length; i++) {
      result = result + strs[i];

      if (i == strs.length - 1) {
        break;
      }
      result = result + separator;
    }
    return result;
  }
}
