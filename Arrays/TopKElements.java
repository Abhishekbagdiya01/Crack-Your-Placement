import java.util.*;

// https://leetcode.com/problems/top-k-frequent-elements/description/
public class TopKElements {
  public static int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] ans = new int[k];
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    Queue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
    for (int key : map.keySet()) {
      heap.add(key);
      if (heap.size() > k) {
        heap.poll();
      }
    }
    for (int i = 0; i < k; i++) {
      ans[i] = heap.poll();
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2 };
    System.out.println(Arrays.toString(topKFrequent(nums, 2)));
  }
}
