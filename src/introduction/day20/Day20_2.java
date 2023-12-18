package introduction.day20;

import java.util.Arrays;

public class Day20_2 {

    // 캐릭터의 좌표
    public static void main(String[] args) {

        // String[] keyinput = {"left", "right", "up", "right", "right"};
        String[] keyinput = {"down", "down", "down", "down", "down"};
        // int[] board = {11, 11};
        int[] board = {7, 9};

        System.out.println("solution => " + Arrays.toString(solution(keyinput, board)));

    }

    public static int[] solution(String[] keyinput, int[] board) {

        int[] answer = {};

        int a = (board[0] / 2);
        int b = (board[1] / 2);

        int xMin = 0 - a;
        int xMax = 0 + a;
        int yMin = 0 - b;
        int yMax = 0 + b;

        int x = 0;
        int y = 0;

        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "left":
                    if(xMin < x) x = x - 1;
                    break;
                case "right":
                    if(xMax > x) x = x + 1;
                    break;
                case "up":
                    if(yMax > y) y = y + 1;
                    break;
                case "down":
                    if(yMin < y) y = y - 1;
                    break;
            }
        }

        answer = new int[]{x, y};

        return answer;

    }

}
