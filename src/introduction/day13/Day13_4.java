package introduction.day13;

import java.util.Arrays;

public class Day13_4 {

    // 삼각형의 완성조건 (1)
    public static void main(String[] args) {

        int[] sides = {1, 2, 3};

        System.out.println("solution => " + solution(sides));

    }

    public static int solution(int[] sides) {

        int answer = 0;
        int a = 0;
        int b = 0;

        Arrays.sort(sides);

        b = sides[sides.length - 1];

        for (int i = 0; i < sides.length - 1; i++) {
            a += sides[i];
        }

        if (a > b) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;

    }

}
