package fshrimp.java.problems.chap1;

public class Problem5 {
  public static int countVowel(String str) {
    if (str.length() == 0 || str.equals("")) {
      return 0;
    }
    int vowelCount = 0;
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (int i = 0; i < str.length(); i++) {
      if(isContain(vowels, str.charAt(i))) {
        vowelCount++;
      }
    }
    return vowelCount;
  }

  private static boolean isContain(char[] arr, char c) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == c) {
        return true;
      }
    }
    return false;
  }

}
