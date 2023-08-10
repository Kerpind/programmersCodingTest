package introduction.day4;

public class Day4_2 {

    // 피자 나눠 먹기 (2)
    public static void main(String[] args) {

        int n = 6;

        System.out.println("solution => " + solution(n));

    }

    public static int solution(int n) {

        int answer = 0;

        for (int i = 1; i < n+1; i++) {

            int a = 0;

            a = 6 * i;

            if ((a % n) == 0) {
                answer = i;
                break;
            }
        }

        return answer;

    }

}
