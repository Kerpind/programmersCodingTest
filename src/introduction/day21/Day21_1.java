package introduction.day21;

public class Day21_1 {

    // 숨어있는 숫자의 덧셈 (2)
    public static void main(String[] args) {

        String my_string = "sdfg4s";

        System.out.println("solution => " + solution(my_string));

    }

    public static int solution(String my_string) {

        int answer = 0;

        // 48 ~ 57
        char[] a = my_string.toCharArray();
        String b = "0";

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 48 && a[i] <= 57) {
                b += a[i];
            } else {
                answer += Integer.parseInt(b);
                b = "0";
            }
        }

        answer += Integer.parseInt(b);

        return answer;

        // Arrays.stream(myString.split("[A-Z|a-z]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum()

    }

}
