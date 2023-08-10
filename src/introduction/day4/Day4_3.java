package introduction.day4;

public class Day4_3 {

    // 피자 나눠 먹기 (3)
    public static void main(String[] args) {

        int slice = 7;
        int n = 10;

        System.out.println("solution => " + solution(slice, n));

    }

    public static int solution(int slice, int n) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {

            int a = 0;

            a = slice * i;

            if((n - a) <= 0) {
                answer = i;
                break;
            }
        }

        return answer;

    }

}
