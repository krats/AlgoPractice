package io.krats.topcoder.dp.div2.level2;

import java.util.HashMap;

public class EllysCheckers {

  public String getWinner(String board) {
    if (board.charAt(board.length() - 1) == 'o') {
      board = board.substring(0, board.length() - 1) + '.';
    }
    return isAWinningBoard(board, new HashMap<>()) ? "YES" : "NO";
  }

  private boolean isAWinningBoard(String board, HashMap<String, Boolean> map) {
    if (map.containsKey(board)) {
      return map.get(board);
    }
    boolean ans = false;
    char[] arr = board.toCharArray();
    for (int i = 0; i < board.length() - 1; i++) {
      if (board.charAt(i) == 'o' && board.charAt(i + 1) == '.') {
        arr[i] = '.';
        if (i + 1 != board.length() - 1) {
          arr[i + 1] = 'o';
        }
        ans = !isAWinningBoard(new String(arr), map);
        arr[i] = 'o';
        arr[i + 1] = '.';
      } else if (i + 3 < board.length() && board.charAt(i) == 'o' && board.charAt(i + 1) == 'o'
          && board.charAt(i + 2) == 'o' && board.charAt(i + 3) == '.') {
        arr[i] = '.';
        if (i + 3 != board.length() - 1) {
          arr[i + 3] = 'o';
        }
        ans = !isAWinningBoard(new String(arr), map);
        arr[i] = 'o';
        arr[i + 3] = '.';
      }
      if (ans) {
        break;
      }
    }
    map.put(board, ans);
    return ans;
  }
}