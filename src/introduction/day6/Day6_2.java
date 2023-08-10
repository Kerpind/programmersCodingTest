package introduction.day6;

import java.util.Scanner;

public class Day6_2 {

    // 직각삼각형 출력하기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String a = "";
            for (int j = 0; j <= i; j++) {
                a += "*";
            }
            System.out.println(a);
        }

    }

}
