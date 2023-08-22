package introduction.day15;

import java.util.Arrays;

public class Day15_3 {

    // 한 번만 등장한 문자
    public static void main(String[] args) {

        String s = "abdc";

        System.out.println("solution => " + solution(s));

    }

    public static String solution(String s) {

        String answer = "";

        String[] a = s.split("");
        Arrays.sort(a);
        int b = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    b++;
                }
            }
            if (b > 1) {
                b = 0;
            } else {
                answer += a[i];
                b = 0;
            }
        }

        return answer;

    }

}
