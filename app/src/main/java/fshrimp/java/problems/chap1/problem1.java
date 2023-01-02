package fshrimp.java.problems.chap1;

import java.util.HashMap;

public class problem1 {

  public static int countNonDuplicateChar(String str) {

    if (str.equals("") || str.length() == 0) {
      return 0;
    }

    HashMap<Character, Integer> map = new HashMap<>();
    for (int i =0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (map.containsKey(c)) {
        map.put(c, map.get(c)+1);
      }
      else {
        map.put(c, 1);
      }
    }


    return map.size();
  }
}
