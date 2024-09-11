import java.util.HashMap;

public class FrequenciesofLimitedRangeArrayElements {
  public static void frequencyCount(int arr[]) {

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (!map.containsKey(arr[i])) {
        map.put(arr[i], 1);
      } else {
        int feq = map.get(arr[i]);
        map.put(arr[i], feq + 1);
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(i + 1)) {
        arr[i] = map.get(i + 1);
      } else {
        arr[i] = 0;
      }
    }

  }

  public static void main(String[] args) {
    int[] arr = { 10, 10, 1, 1, 2 };
    frequencyCount(arr);
    System.out.print("Frequencies of Limited Range Array Elements : ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
