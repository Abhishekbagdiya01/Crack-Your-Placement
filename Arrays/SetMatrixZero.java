import java.util.HashSet;
import java.util.Set;

class SetMatrixZero {
  public void setZeroes(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;

    Set<Integer> rowToZero = new HashSet<>();
    Set<Integer> colToZero = new HashSet<>();

    // Step 1: Mark rows and cols to zero
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          rowToZero.add(i);
          colToZero.add(j);
        }
      }
    }

    // Step 2: Set cells to 0
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (rowToZero.contains(i) || colToZero.contains(j)) {
          matrix[i][j] = 0;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
    SetMatrixZero obj = new SetMatrixZero();
    obj.setZeroes(matrix);

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
