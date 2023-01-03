package fshrimp.java.problems.chap1;

import java.util.HashMap;

public class Problem2 {

  public static char findFirstWordNonDublicated(String str) {

    if (str.equals("") || str.length() == 0) {
      return 0;
    }

    int resultIndex = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i =0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
        while (map.get(str.charAt(resultIndex)) != 1) {
          resultIndex++;
        }
      }
      else {
        map.put(c, 1);
      }
    }

    return str.charAt(resultIndex);
  }

}

