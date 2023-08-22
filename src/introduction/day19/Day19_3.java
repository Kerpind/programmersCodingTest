package introduction.day19;

import java.util.Arrays;

public class Day19_3 {

    // 중복된 숫자 개수
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;

        System.out.println("solution => " + solution(array, n));

    }

    public static int solution(int[] array, int n) {

        int answer = 0;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                answer++;
            }
        }

        return answer;

    }

}
