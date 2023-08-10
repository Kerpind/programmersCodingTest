package introduction.day7;

public class Day7_1 {

    // 특정 문자 제거하기
    public static void main(String[] args) {

        String my_string = "abcdef";
        String letter = "f";

        System.out.println("solution => " + solution(my_string, letter));

    }

    public static String solution(String my_string, String letter) {

        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (!String.valueOf(my_string.charAt(i)).equals(letter)) {
                answer += my_string.charAt(i);
            }
        }

        return answer;

    }

}
