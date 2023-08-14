package allproblems.lv2;

import java.util.Arrays;

public class Problems_1 {

    // JadenCase 문자열 만들기
    public static void main(String[] args) {

        String s = "3people    unFollowed me ";

        System.out.println("solution => " + solution(s));

    }

    public static String solution(String s) {

        String answer = "";
        String[] a = s.split("");
        boolean c = true;

        for (int i = 0; i < a.length; i++) {
            char s1 = a[i].charAt(0);
            String b = String.valueOf(s1);

            if (b.equals(" ")) {
                c = false;
            }

            if ((!c || i == 0) && !b.equals(" ")) {
                answer += b.toUpperCase();
                c = true;
            } else {
                answer += b.toLowerCase();
            }

        }

        return answer;

    }

}
