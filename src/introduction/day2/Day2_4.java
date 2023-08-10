package introduction.day2;

import java.util.Arrays;

public class Day2_4 {

    // 배열 두배 만들기
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("solution => " + Arrays.toString(solution(numbers)));

    }

    public static int[] solution(int[] numbers) {

        int b = numbers.length;

        int[] answer = new int[b];

        for(int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            answer[i] = a*2;
        }

        return answer;

    }

}
