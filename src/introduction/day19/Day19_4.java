package introduction.day19;

import java.util.Arrays;

public class Day19_4 {

    // 머쓱이보다 키 큰 사람
    public static void main(String[] args) {

        int[] array = {149, 180, 192, 170};
        int height = 167;

        System.out.println("solution => " + solution(array, height));

    }

    public static int solution(int[] array, int height) {

        int answer = 0;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                answer++;
            }
        }

        return answer;

    }

}
