/**
 * WordSearch
 * https://leetcode.com/problems/word-search/description/
 */
public class WordSearch {

  public static boolean exist(char[][] board, String word) {
    if (board == null || board.length == 0 || word == null || word.length() == 0) {
      return false;
    }

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (dfs(board, word, i, j, 0)) {
          return true;
        }
      }
    }

    return false;
  }

  private static boolean dfs(char[][] board, String word, int i, int j, int wordIndex) {
    if (wordIndex == word.length()) {
      return true;
    }
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(wordIndex)) {
      return false;
    }

    char temp = board[i][j];
    board[i][j] = '*';

    boolean found = dfs(board, word, i + 1, j, wordIndex + 1) ||
        dfs(board, word, i - 1, j, wordIndex + 1) ||
        dfs(board, word, i, j + 1, wordIndex + 1) ||
        dfs(board, word, i, j - 1, wordIndex + 1);

    board[i][j] = temp;

    return found;
  }

  public static void main(String[] args) {
    char[][] board = {
        { 'A', 'B', 'C', 'E' },
        { 'S', 'F', 'C', 'S' },
        { 'A', 'D', 'E', 'E' }
    };
    String word = "ABCCED";
    System.out.println(exist(board, word));
  }
}
