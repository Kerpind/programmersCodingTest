package introduction.day14;

import java.util.Arrays;

public class Day14_1 {

    // 가까운 수
    public static void main(String[] args) {

        int[] array = {10, 11, 12};
        int n = 13;

        System.out.println("solution => " + solution(array, n));

    }

    public static int solution(int[] array, int n) {

        int answer = 0;
        Arrays.sort(array);
        int c = 100;
        int e = 0;
        for (int i = 0; i < array.length; i++) {
            int d = Math.max(array[i], n) - Math.min(array[i], n);
            if (c > d && c != d) {
                c = d;
                e = i;
            }
        }

        answer = array[e];

        return answer;

    }

}
