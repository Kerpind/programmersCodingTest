package highscore;

import java.time.Duration;
import java.time.Instant;

public class Problems_1 {

    // 스택/큐 - 올바른 괄호(Lv2)
    public static void main(String[] args) {

        String s = "())(()";
        // String s = "))((";
        Instant beforeTime = Instant.now();
        System.out.println("solution => " + solution(s));
        Instant afterTime = Instant.now();

        long diffTime = Duration.between(beforeTime, afterTime).toMillis();
        System.out.println("시간차이(ms) : "+diffTime);

    }

    public static boolean solution(String s) {

        boolean answer = true;

        char[] a = s.toCharArray();
        int b = 0;
        int c = 0;

        if (')' == a[0]) {
            answer = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                switch (a[i]) {
                    case '(':
                        b += 1;
                        break;
                    case ')':
                        c += 1;
                        break;
                }
                if (b < c) {
                    answer = false;
                    break;
                }
            }
        }

        return answer && b == c ? true : false;

    }

}
