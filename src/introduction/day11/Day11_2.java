package introduction.day11;

public class Day11_2 {

    // 합성수 찾기
    public static void main(String[] args) {

        int n = 10;

        System.out.println("solution => " + solution(n));

    }

    public static int solution(int n) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int a = 0;
            for (int j = 1; j <= i; j++) {
                a += (i % j == 0) ? 1 : 0;
            }
            answer += (a >= 3) ? 1 : 0;
        }

        return answer;

    }

}
