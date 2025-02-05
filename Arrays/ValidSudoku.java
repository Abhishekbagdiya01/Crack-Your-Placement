import java.util.HashSet;

//https://leetcode.com/problems/valid-sudoku/description/
public class ValidSudoku {
  public static void main(String[] args) {
    char[][] board = {
        { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };
    System.out.println(isValidSudoku(board));
    char[][] board1 = {
        { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };
    System.out.println(isValidSudoku(board1));
  }

  public static boolean isValidSudoku(char[][] board) {
    int n = 9;
    HashSet<Character>[] row = new HashSet[n];
    HashSet<Character>[] col = new HashSet[n];
    HashSet<Character>[] box = new HashSet[n];

    for (int i = 0; i < n; i++) {
      row[i] = new HashSet<Character>();
      col[i] = new HashSet<Character>();
      box[i] = new HashSet<Character>();
    }

    for (int r = 0; r < n; r++) {
      for (int c = 0; c < n; c++) {
        char val = board[r][c];

        if (val == '.') {
          continue;
        }
        if (row[r].contains(val)) {
          return false;
        }
        row[r].add(val);

        if (col[c].contains(val)) {
          return false;
        }
        col[c].add(val);

        int idx = (r / 3) * 3 + c / 3;
        if (box[idx].contains(val)) {
          return false;
        }
        box[idx].add(val);
      }

    }
    return true;
  }
}
