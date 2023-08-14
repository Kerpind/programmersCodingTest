package introduction.day13;

import java.util.Arrays;

public class Day13_2 {

    // 배열 원소의 길이
    public static void main(String[] args) {

        String[] strlist = {"We", "are", "the", "world!"};

        System.out.println("solution => " + Arrays.toString(solution(strlist)));

    }

    public static int[] solution(String[] strlist) {

        int answer[] = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;

    }

}
