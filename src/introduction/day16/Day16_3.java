package introduction.day16;

import java.util.Arrays;

public class Day16_3 {

    // 문자열 계산하기
    public static void main(String[] args) {

        String my_string = "1 + 2 + 3";

        System.out.println("solution => " + solution(my_string));

    }

    public static int solution(String my_string) {

        int answer = 0;

        String[] a = my_string.split(" ");
        answer = Integer.parseInt(a[0]);
        String b = "";

        for (int i = 1; i < a.length; i++) {
            if (a[i].equals("+")) {
                answer += Integer.parseInt(a[i+1]);
            } else if (a[i].equals("-")) {
                answer -= Integer.parseInt(a[i+1]);
            }
            i++;
        }

        return answer;

    }

}
