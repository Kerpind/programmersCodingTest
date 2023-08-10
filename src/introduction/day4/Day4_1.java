package introduction.day4;

public class Day4_1 {

    // 피자 나눠 먹기 (1)
    public static void main(String[] args) {

        int n = 7;

        System.out.println("solution => " + solution(n));

    }

    public static int solution(int n) {

        int a = 0;

        for (int i = 1; i < 100; i++) {
            int b = 0;
            b = 7 * i;
            if (b >= n) {
                a = i;
                break;
            }
        }

        return a;

    }

}
