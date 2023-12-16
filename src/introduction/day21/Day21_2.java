package introduction.day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day21_2 {

    // 안전지대
    public static void main(String[] args) {

        // int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        // int[][] board = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        // int[][] board = {{0, 0, 1}, {0, 0, 0}, {0, 0, 0}};

        System.out.println("solution => " + solution(board));

    }

    public static int solution(int[][] board) {

        ArrayList<int[]> list = new ArrayList<>();
        int answer = 0;
        int maxLength = 0;

        for(int i = 0; i < board.length; i++){
            maxLength++;
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 1){
                    int[] temp = {i,j};
                    list.add(temp);
                }
            }
        }

        for (int k = 0; k < list.size(); k++) {

            int a = list.get(k)[0];
            int b = list.get(k)[1];

            if(a - 1 >= 0) {
                board[a-1][b] = 1;
                if (b - 1 >= 0) {
                    board[a-1][b-1] = 1;
                }
                if (b + 1 <= maxLength-1) {
                    board[a-1][b+1] = 1;
                }
            }

            if (b - 1 >= 0) {
                board[a][b-1] = 1;
            }
            if (b + 1 <= maxLength-1) {
                board[a][b+1] = 1;
            }

            if (a + 1 <= maxLength-1) {
                board[a+1][b] = 1;
                if (b - 1 >= 0) {
                    board[a+1][b-1] = 1;
                }
                if (b + 1 <= maxLength-1) {
                    board[a+1][b+1] = 1;
                }
            }

        }

        for(int i = 0; i < board.length; i++){
            System.out.println(Arrays.toString(board[i]));
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 0){
                    answer++;
                }
            }
        }

        System.out.println(answer);

        return answer;

    }

}
