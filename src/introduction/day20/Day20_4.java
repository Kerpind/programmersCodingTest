package introduction.day20;

import java.util.Arrays;

public class Day20_4 {

    // 다항식 더하기
    public static void main(String[] args) {

        // String polynomial = "3x + 7 + x";
        // String polynomial = "x + x + x";
        // String polynomial = "1x + 4x + 2 + 3x + 5";
        // String polynomial = "2 + 2 + 3 + 5";
        // String polynomial = "x + 1";
        String polynomial = "x";

        System.out.println("solution => " + solution(polynomial));

    }

    public static String solution(String polynomial) {

        String answer = "";

        String[] a = polynomial.split(" \\+ ");
        int b = 0;
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            if("x".equals(a[i])) {
                b++;
            } else if (a[i].contains("x")) {
                String d = a[i].replace("x", "");
                b = b + Integer.parseInt(d);
            } else {
                c = c + Integer.parseInt(a[i]);
            }
        }

        if (b != 0 && c != 0) {
            if (b == 1) {
                answer = "x + " + Integer.toString(c);
            } else {
                answer = Integer.toString(b) + "x + " + Integer.toString(c);
            }
        } else if (b == 0) {
            answer = Integer.toString(c);
        } else if (c == 0) {
            if (b == 1) {
                answer = "x";
            } else {
                answer = Integer.toString(b) + "x";
            }
        }

        return answer;

    }

}
