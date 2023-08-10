package introduction.day8;

import java.util.Arrays;

public class Day8_1 {

    // 배열 자르기
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;

        System.out.println("solution => " + Arrays.toString(solution(numbers, num1, num2)));

    }

    public static int[] solution(int[] numbers, int num1, int num2) {

        return Arrays.copyOfRange(numbers, num1, num2+1);

    }

}
