package introduction.day12;

public class Day12_1 {

    // 모음 제거
    public static void main(String[] args) {

        String my_string = "bus";

        System.out.println("solution => " + solution(my_string));

    }

    public static String solution(String my_string) {

        String answer = "";

        my_string = my_string.replaceAll("a", "");
        my_string = my_string.replaceAll("e", "");
        my_string = my_string.replaceAll("i", "");
        my_string = my_string.replaceAll("o", "");
        my_string = my_string.replaceAll("u", "");

        answer = my_string;

        return answer;

    }

}
