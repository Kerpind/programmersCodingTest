package introduction.day18;

public class Day18_2 {

    // 제곱수 판별하기
    public static void main(String[] args) {

        int n = 976;

        System.out.println("solution => " + solution(n));

    }

    public static int solution(int n) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i*i==n) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }

        return answer;

        // Math.sqrt(n)

    }

}
