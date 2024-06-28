package introduction.day24;

import java.util.Arrays;

public class Day24_3 {

    // A로 B 만들기
    public static void main(String[] args) {

        String before = "olleh";
        String after = "hello";

        System.out.println("solution => " + solution(before, after));

    }

    public static int solution(String before, String after) {

        int answer = 0;

        String[] a = before.split("");
        String[] b = after.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        String c = "";
        String d = "";

        for (int i = 0; i < a.length; i++) {
            c += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            d += b[i];
        }

        answer = (c.equals(d)) ? 1 : 0;

        return answer;

        //toCharArray() 사용

    }

}
