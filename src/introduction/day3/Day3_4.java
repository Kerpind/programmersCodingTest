package introduction.day3;

import java.util.Arrays;

public class Day3_4 {

    // 짝수는 싫어요
    public static void main(String[] args) {

        int n = 10;

        System.out.println("solution => " + Arrays.toString(solution(n)));

    }

    public static int[] solution(int n) {

        int[] answer = new int[(n+1)/2];

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                answer[i/2] = i;
            }
        }

        return answer;

    }

}
