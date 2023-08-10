package introduction.day4;

import java.util.Arrays;

public class Day4_4 {

    // 배열의 평균값
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("solution => " + solution(numbers));

    }

    public static double solution(int[] numbers) {

        int length = numbers.length;
        double a = 0;

        for (int i = 0; i < length; i++) {
            a += (double)numbers[i];
        }

        return a/length;

    }

}
