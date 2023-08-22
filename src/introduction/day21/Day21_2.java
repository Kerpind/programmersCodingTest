package introduction.day21;

import java.util.Arrays;

public class Day21_2 {

    // 삼각형의 완성조건 (2)
    public static void main(String[] args) {

        int[] sides = {3, 6};

        System.out.println("solution => " + solution(sides));

    }

    public static int solution(int[] sides) {

        int answer = 0;

        Arrays.sort(sides);

        for (int i = sides[0]+sides[1]; i > sides[1]; i--) {
            answer++;
        }
        for(int j = sides[0]+sides[1]-1; j > 0; j--) {
            if (j > sides[1]) {
                answer++;
            }
        }

        return answer;

    }

}
