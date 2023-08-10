package introduction.day6;

import java.util.Arrays;

public class Day6_1 {

    // 문자열 뒤집기
    public static void main(String[] args) {

        String my_string = "jaron";

        System.out.println("solution => " + solution(my_string));

    }

    public static String solution(String my_string) {

        StringBuffer answer = new StringBuffer(my_string);

        return answer.reverse().toString();

    }

}
