package introduction.day8;

public class Day8_4 {

    // 순서쌍의 개수
    public static void main(String[] args) {

        int n = 20;

        System.out.println("solution => " + solution(n));

    }

    public static int solution(int n) {

        int answer = 0;

        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += 1;
            }
        }

        return answer;

    }

}
