package introduction.day18;

public class Day18_1 {

    // 문자열안에 문자열
    public static void main(String[] args) {

        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";

        System.out.println("solution => " + solution(str1, str2));

    }

    public static int solution(String str1, String str2) {

        return str1.contains(str2) ? 1 : 2;

    }

}
