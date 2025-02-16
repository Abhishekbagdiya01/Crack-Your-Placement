public class SearchA2DMatrix {
  public static boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length;
    int n = matrix[0].length;
    int l = 0;
    int r = m * n - 1;

    while (l <= r) {
      int mid = l + (r - l) / 2;
      int midVal = matrix[mid / n][mid % n];
      if (midVal == target) {
        return true;
      } else if (midVal > target) {
        r = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
    System.out.println(searchMatrix(matrix, 20));
    System.out.println(searchMatrix(matrix, 70));
  }
}
