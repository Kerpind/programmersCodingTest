package introduction.day17;

import java.util.Arrays;

public class Day17_1 {

    // 자릿수 더하기
    public static void main(String[] args) {

        int n = 1234;

        System.out.println("solution => " + solution(n));

    }

    public static int solution(int n) {

        int answer = 0;

        String a = String.valueOf(n);

        char[] b = a.toCharArray();

        System.out.println(Arrays.toString(b));

        for (int i = 0; i < b.length; i++) {
            answer += (int)b[i]-'0';
        }

        return answer;

    }

}
