package introduction.day19;

import java.util.Arrays;

public class Day19_2 {

    // 잘라서 배열로 저장하기
    public static void main(String[] args) {

        String my_str = "abc1Addfggg4556b";
        int n = 6;

        System.out.println("solution => " + Arrays.toString(solution(my_str, n)));

    }

    public static String[] solution(String my_str, int n) {

        String[] answer = {};

        int a = my_str.length();

        if (my_str.length()%n == 0) {
            answer = new String[a / n];
        } else {
            answer = new String[a / n + 1];
        }
        int b = 0;
        int c = n;
        for (int i = 0; i < answer.length; i++) {

            if (a < c) {
                answer[i] = my_str.substring(b);
            } else {
                answer[i] = my_str.substring(b, c);
                b += n;
                c += n;
            }
        }

        return answer;

    }

}
