package introduction.day12;

import java.util.Arrays;

public class Day12_3 {

    // 숨어있는 숫자의 덧셈 (1)
    public static void main(String[] args) {

        String my_string = "1a2b3c4d123";

        System.out.println("solution => " + solution(my_string));

    }

    public static int solution(String my_string) {

        int answer = 0;
        String[] a = new String[my_string.length()];

        a = my_string.split("");

        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case "[^0-9]":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    answer += Integer.parseInt(a[i]);
                    break;
            }
        }

        return answer;

    }

}
