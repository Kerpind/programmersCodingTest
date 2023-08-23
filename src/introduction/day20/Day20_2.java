package introduction.day20;

import java.util.Arrays;

public class Day20_2 {

    // 직사각형 넓이 구하기
    public static void main(String[] args) {

        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        // int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};

        System.out.println("solution => " + solution(dots));

    }

    public static int solution(int[][] dots) {

        int answer = 0;

        int[] a = new int[4];
        int[] b = new int[4];

        for (int i = 0; i < dots.length; i++) {
            int[] c = dots[i];
            for (int j = 0; j < c.length; j++) {
                if (j == 0) {
                    a[i] = c[j];
                } else if (j == 1) {
                    b[i] = c[j];
                }
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        answer = (a[3] - a[0]) * (b[3] - b[0]);

        return answer;

    }

}
