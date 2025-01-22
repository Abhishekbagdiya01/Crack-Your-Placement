import java.util.*;

/**
 * GroupAnagrams
 * https://leetcode.com/problems/group-anagrams/description/?envType=problem-list-v2&envId=plakya4j
 */
public class GroupAnagrams {

  public static List<List<String>> groupAnagrams(String[] strs) {
    if (strs.length == 0)
      return new ArrayList<>();

    HashMap<String, List> map = new HashMap<>();
    int[] count = new int[26];

    for (String str : strs) {
      Arrays.fill(count, 0);
      for (char c : str.toCharArray()) {
        count[c - 'a']++;
      }

      StringBuilder sb = new StringBuilder("");

      for (int i = 0; i < 26; i++) {
        sb.append("#");
        sb.append(count[i]);
      }

      String key = sb.toString();

      if (!map.containsKey(key)) {
        map.put(str, new ArrayList());
      }
      map.get(key).add(str);
    }
    return new ArrayList(map.values());
  }

  public static void main(String[] args) {
    String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
    List<List<String>> arrayList = groupAnagrams(strs);
    System.out.println(arrayList);
  }
}
