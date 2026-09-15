class Solution {
    public boolean isrow(char[][] board, int i) {
        int[] cn = new int[123];
        int c = board[0].length;
        for(int j = 0; j < c; j++) {
            char ch = board[i][j];
            if(ch != '.') {
                if(cn[ch] == 1) return false;
                else cn[ch] = 1;
            }
        }
        return true;
    }
    public boolean iscol(char[][] board, int i) {
        int[] cn = new int[123];
        int c = board.length;
        for(int j = 0; j < c; j++) {
            char ch = board[j][i];
            if(ch != '.') {
                if(cn[ch] == 1) return false;
                else cn[ch] = 1;
            }
        }
        return true;
    }
    public boolean isgrid(char[][] board, int i, int j) {
        int[] cn = new int[123];
        int r = board.length;
        int c = board[0].length;
        for(int l = i; l < i+3; l++) {
            for(int m = j; m < j+3; m++) {
                char ch = board[l][m];
                if(ch != '.') {
                    if(cn[ch] == 1) return false;
                    else cn[ch] = 1;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        for(int i = 0; i < r; i++) {
            if(!isrow(board,i)) return false;
        }
        for(int i = 0; i < c; i++) {
            if(!iscol(board,i)) return false;
        }
        for(int i = 0; i < r; i+=3) {
            for(int j = 0; j < c; j+=3) {
                if(!isgrid(board,i,j)) return false;
            }
        }
        return true;
    }
}