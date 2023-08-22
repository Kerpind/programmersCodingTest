package introduction.day16;

import java.util.Arrays;

public class Day16_2 {

    // 가장 큰 수 찾기
    public static void main(String[] args) {

        int[] array = {9, 10, 11, 8};

        System.out.println("solution => " + Arrays.toString(solution(array)));

    }

    public static int[] solution(int[] array) {

        int[] answer = new int[2];
        int a = 0;
        int b = 0;

        for (int i = 0; i < array.length; i++) {
            if (a < array[i]) {
                a = array[i];
                b = i;
            }
        }

        answer[0] = a;
        answer[1] = b;

        return answer;

    }

}
