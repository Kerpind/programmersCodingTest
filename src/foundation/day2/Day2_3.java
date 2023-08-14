package foundation.day2;

import java.util.Scanner;

public class Day2_3 {

    // 문자열 돌리기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String[] b = a.split("");

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

}
