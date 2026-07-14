class Solution {

    public boolean checkRow(char[] arr) {
        boolean[] check = new boolean[10];

        for (char c : arr) {
            if (c == '.') continue;

            int d = c - '0';

            if (check[d]) return false;

            check[d] = true;
        }

        return true;
    }

    public boolean checkCol(char[][] arr, int j) {
        boolean[] check = new boolean[10];

        for (int i = 0; i < 9; i++) {
            char c = arr[i][j];

            if (c == '.') continue;

            int d = c - '0';

            if (check[d]) return false;

            check[d] = true;
        }

        return true;
    }

    public boolean checkBox(char[][] arr, int boxNum) {

        // Starting row of the current 3x3 box
        int i = 3 * (boxNum / 3);

        // Starting column of the current 3x3 box
        int j = 3 * (boxNum % 3);

        boolean[] check = new boolean[10];

        for (int a = i; a < i + 3; a++) {
            for (int b = j; b < j + 3; b++) {

                char c = arr[a][b];

                if (c == '.') continue;

                int d = c - '0';

                // FIX: use d instead of c
                // c is a character ('5'), d is the integer 5
                if (check[d]) return false;

                // FIX: use d instead of c
                check[d] = true;
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        // Check all rows
        for (int i = 0; i < 9; i++) {
            if (!checkRow(board[i])) {
                return false;
            }
        }

        // Check all columns
        for (int i = 0; i < 9; i++) {

            // FIX: board[][] -> board
            if (!checkCol(board, i)) {
                return false;
            }
        }

        // Check all 3x3 boxes
        for (int i = 0; i < 9; i++) {

            // FIX: board[][] -> board
            if (!checkBox(board, i)) {
                return false;
            }
        }

        return true;
    }
}