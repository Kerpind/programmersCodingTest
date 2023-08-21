package introduction.day14;

public class Day14_4 {

    // 대문자와 소문자
    public static void main(String[] args) {

        String my_string = "cccCCC";

        System.out.println("solution => " + solution(my_string));

    }

    public static String solution(String my_string) {

        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {

            char c = my_string.charAt(i);
            int d = (int)c;

            if (d >= 65 && d <= 90) {
                answer += String.valueOf(c).toLowerCase();
            } else if (d >= 97 && d <= 122) {
                answer += String.valueOf(c).toUpperCase();
            }
        }

        return answer;

    }

}
