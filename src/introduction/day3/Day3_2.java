package introduction.day3;

import java.util.Arrays;

public class Day3_2 {

    // 중앙값 구하기
    public static void main(String[] args) {

        int[] array = {1, 2, 7, 10, 11};

        System.out.println("solution => " + solution(array));

    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length >> 1];
    }

}
