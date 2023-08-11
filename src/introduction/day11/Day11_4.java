package introduction.day11;

public class Day11_4 {

    // 팩토리얼
    public static void main(String[] args) {

        int n = 7;

        System.out.println("solution => " + solution(n));

    }

    public static int solution(int n) {

        int answer = 0;
        int a = 1;

        for (int i = 1; i <= 11; i++) {
            if (a * i <= n) {
                a *= i;
            } else {
                answer = i - 1;
                break;
            }
        }

        return answer;

    }

}
