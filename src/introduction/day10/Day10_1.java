package introduction.day10;

import java.util.Arrays;

public class Day10_1 {

    // 배열 자르기
    public static void main(String[] args) {

        int[] dot = {2, 4};

        System.out.println("solution => " + solution(dot));

    }

    public static int solution(int[] dot) {

        boolean a = true;
        boolean b = true;
        int answer = 0;

        if (dot[0] > 0) {
            a = true;
        } else {
            a = false;
        }

        if (dot[1] > 0) {
            b = true;
        } else {
            b = false;
        }

        if (a && b) {
            answer = 1;
        } else if (!a && b) {
            answer = 2;
        } else if (!a && !b) {
            answer = 3;
        } else if (a && !b) {
            answer = 4;
        }

        return answer;

    }

}
