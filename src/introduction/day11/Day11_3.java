package introduction.day11;

import java.util.Arrays;

public class Day11_3 {

    // 최댓값 만들기 (1)
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("solution => " + solution(numbers));

    }

    public static int solution(int[] numbers) {

        int answer = 0;

        Arrays.sort(numbers);

        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        return answer;

    }

}
