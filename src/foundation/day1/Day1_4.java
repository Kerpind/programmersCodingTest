package foundation.day1;

import java.util.Scanner;

public class Day1_4 {

    // 대소문자 바꿔서 출력하기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            int d = (int)c;

            if (d >= 65 && d <= 90) {
                answer += String.valueOf(c).toLowerCase();
            } else if (d >= 97 && d <= 122) {
                answer += String.valueOf(c).toUpperCase();
            }
        }

        System.out.println(answer);

    }

}
