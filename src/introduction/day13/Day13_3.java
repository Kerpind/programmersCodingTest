package introduction.day13;

public class Day13_3 {

    // 중복된 문자 제거
    public static void main(String[] args) {

        String my_string = "We are the world";

        System.out.println("solution => " + solution(my_string));

    }

    public static String solution(String my_string) {

        String answer = "";
        String[] a = my_string.split("");

        for (int i = 0; i < a.length; i++) {
            if (answer.indexOf(a[i]) == -1) {
                answer += a[i];
            }
        }

        return answer;

    }

}
