package ValidSoduko;

import java.util.HashSet;


class Solution {
    int target;

    public boolean isValidRow(char[][] board,int row_number) {
        HashSet<Character> row = new HashSet<Character>();
        for(int i = 0; i<9; i++){
            if(board[row_number][i]!='.' && !row.add(board[row_number][i])) {
                return false;
            }
        }
        return true;
    }
    public boolean isValidColumn(char[][] board,int column_number) {
        HashSet<Character> column = new HashSet<Character>();
        for(int i = 0; i<9; i++){
            if(board[i][column_number]!='.' && !column.add(board[i][column_number])) {
                return false;
            }
        }
        return true;
    }
    public boolean isValidSquare(char[][] board,int squareNumber) {
        HashSet<Character> square = new HashSet<Character>();
        int startX=(squareNumber%3)*3;
        int startY=(squareNumber/3)*3;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(board[startX+i][startY+j]!='.' && !square.add(board[startX+i][startY+j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++){
            if(!isValidRow(board,i)||!isValidColumn(board,i)||!isValidSquare(board,i)){
                return false;
            }
        }
        return true;
    }
}