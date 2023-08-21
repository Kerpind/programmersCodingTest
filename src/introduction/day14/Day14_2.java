package introduction.day14;

import java.util.Arrays;

public class Day14_2 {

    // 369게임
    public static void main(String[] args) {

        int order = 29423;

        System.out.println("solution => " + solution(order));

    }

    public static int solution(int order) {

        int answer = 0;
        String a = String.valueOf(order);

        char[] b = a.toCharArray();

        for (int i : b) {
            int c = i - '0';
            switch (c) {
                case 3:
                case 6:
                case 9:
                    answer += 1;
                    break;
            }
        }

        return answer;

    }

}
