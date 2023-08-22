package introduction.day18;

import java.util.Arrays;

public class Day18_4 {

    // 문자열 정렬하기 (2)
    public static void main(String[] args) {

        String my_string = "Bcad";

        System.out.println("solution => " + solution(my_string));

    }

    public static String solution(String my_string) {

        String answer = "";

        String a = my_string.toLowerCase();
        String[] b = a.split("");
        Arrays.sort(b);

        for (int i = 0; i < b.length; i++) {
            answer += b[i];
        }

        return answer;

    }

}
