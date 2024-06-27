package introduction.day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day22_3 {

    // 겹치는 선분의 길이
    public static void main(String[] args) {

        int[][] lines = {{0, 2}, {-3, -1}, {-2, 1}};

        // int[][] lines = {{0, 0}, {2, 5}, {3, 9}};
        // int[][] lines = {{-1, 1}, {1, 3}, {3, 9}};
        // int[][] lines = {{0, 5}, {3, 9}, {1, 10}};

        System.out.println("solution => " + solution(lines));

    }

    public static int solution(int[][] lines) {

        int answer = 0;

        int[] count = new int[201];

        for (int[] i : lines) {

            int start = i[0]+100;
            int end = i[1]+100;

            for (int j = start; j < end; j++) {
                count[j] += 1;
            }
        }

        for (int i : count) {
            if(i > 1) answer++;
        }

        return answer;

    }

}
