package introduction.day10;

public class Day10_3 {

    // 공 던지기
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};
        int k = 2;

        System.out.println("solution => " + solution(numbers, k));

    }

    public static int solution(int[] numbers, int k) {

        String a = "";
        int b = 0;
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            a += String.valueOf(numbers[i]);
        }
        String repeat = a.repeat(8);

        b = (k-1) * 2;

        char c = repeat.charAt(b);

        answer = (int)c - '0';

        return answer;

    }

}
