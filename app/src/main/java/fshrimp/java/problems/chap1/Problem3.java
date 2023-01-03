package fshrimp.java.problems.chap1;

public class Problem3 {

  public static String reverseLetters(String str) {
    String[] words = str.split(" ");
    String result = "";

    for (String word : words) {
      String[] letters = word.split("");
      String reversedWord = "";
      for (int i = 0; i < word.length(); i++) {
        reversedWord += letters[letters.length - 1 - i];
      }
      if (!result.equals("")) {
        reversedWord = " " + reversedWord;
      }
      result += reversedWord;
    }
    return result;
  }

  public static String reverseWord(String str) {
    String[] words = str.split(" ");
    String result = "";

    for (String word : words) {
      if (result.equals("")) {
        result = word;
      } else {
        result = word + " " + result;
      }
    }
    return result;
  }

}
