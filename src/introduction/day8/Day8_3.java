package introduction.day8;

import java.util.Arrays;

public class Day8_3 {

    // 진료 순서 정하기
    public static void main(String[] args) {

        int[] emergency = {3, 76, 24};

        System.out.println("solution => " + Arrays.toString(solution(emergency)));

    }

    public static int[] solution(int[] emergency) {

        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
            answer[i]++;
        }

        return answer;

    }

}
