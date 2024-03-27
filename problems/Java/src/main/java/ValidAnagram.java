import java.util.HashMap;
import java.util.Map;

/**
 * @author niranjanjoglekar on 17/06/22
 *     <p>Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *     <p>Input: s = "anagram", t = "nagaram" Output: true
 *     <p>Input: s = "rat", t = "car" Output: false
 */
public class ValidAnagram {

  public static void main(String[] args) {
    ValidAnagram validAnagram = new ValidAnagram();
    System.out.print(validAnagram.isAnagram("anagram", "nagaram"));
  }

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    HashMap<String, Integer> map1 = new HashMap<>();
    for (char a : s.toCharArray()) {
      if (map1.containsKey(String.valueOf(a))) {
        map1.put(String.valueOf(a), map1.get(String.valueOf(a)) + 1);
      } else {
        map1.put(String.valueOf(a), 1);
      }
    }

    HashMap<String, Integer> map2 = new HashMap<>();
    for (char a : t.toCharArray()) {
      if (map2.containsKey(String.valueOf(a))) {
        map2.put(String.valueOf(a), map2.get(String.valueOf(a)) + 1);
      } else {
        map2.put(String.valueOf(a), 1);
      }
    }

    if (map1.size() != map2.size()) {
      return false;
    }
    for (Map.Entry element : map1.entrySet()) {
      String key1 = element.getKey().toString();
      if (!map2.containsKey(key1)) {
        return false;
      }
      String value1 = element.getValue().toString();
      for (Map.Entry element2 : map2.entrySet()) {
        String key2 = element2.getKey().toString();
        if (!key1.equals(key2)) {
          continue;
        } else {
          String value2 = element2.getValue().toString();
          if (!value1.equals(value2)) {
            return false;
          }
          break;
        }
      }
    }
    return true;
  }
}
