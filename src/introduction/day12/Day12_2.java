package introduction.day12;

import java.util.Arrays;

public class Day12_2 {

    // 문자열 정렬하기 (1)
    public static void main(String[] args) {

        String my_string = "hi12392";

        System.out.println("solution => " + Arrays.toString(solution(my_string)));

    }

    public static int[] solution(String my_string) {

        String[] a = new String[my_string.length()];
        String b = "";

        a = my_string.split("");

        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    b += a[i];
                    break;
            }
        }

        int[] answer = new int[b.length()];
        String[] d = new String[b.length()];

        d = b.split("");
        Arrays.sort(d);

        for (int j = 0; j < answer.length; j++) {
            answer[j] = Integer.parseInt(d[j]);
        }

        return answer;

    }

}
