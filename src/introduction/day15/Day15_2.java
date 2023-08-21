package introduction.day15;

public class Day15_2 {

    // 인덱스 바꾸기
    public static void main(String[] args) {

        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;

        System.out.println("solution => " + solution(my_string, num1, num2));

    }

    public static String solution(String my_string, int num1, int num2) {

        String answer = "";
        char a = 0;
        char b = 0;
        StringBuilder c = new StringBuilder(my_string);

        a = my_string.charAt(num1);
        b = my_string.charAt(num2);

        c.setCharAt(num1, b);
        c.setCharAt(num2, a);

        answer = c.toString();

        return answer;

    }

}
