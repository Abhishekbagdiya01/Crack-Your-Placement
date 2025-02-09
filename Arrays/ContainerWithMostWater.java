public class ContainerWithMostWater {
  public static void main(String[] args) {
    int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    System.out.println(maxArea(height));
  }

  private static int maxArea(int[] height) {
    int l = 0;
    int r = height.length - 1;
    int max = 0;
    while (l < r) {
      int area = Math.min(height[l], height[r]) * (r - l);
      max = Math.max(max, area);
      if (height[l] < height[r]) {
        l++;
      } else {
        r--;
      }
    }
    return max;
  }
}
