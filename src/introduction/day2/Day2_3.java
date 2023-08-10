package introduction.day2;

import java.util.Arrays;

public class Day2_3 {

    // 분수의 덧셈
    public static void main(String[] args) {

        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;

        System.out.println("solution => " + Arrays.toString(solution(numer1, denom1, numer2, denom2)));

    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int totalDenom = denom1 * denom2;
        int totalNumer = (numer1 * denom2) + (numer2 * denom1);
        int rtf = 0;

        rtf = check(totalNumer, totalDenom);

        int[] answer = {totalNumer/rtf, totalDenom/rtf};

        return answer;

    }

    private static int check(int TN, int TD) {

        int rt = 0;

        for (int i = 1; i <= TN; i++) {
            if (TN % i == 0 && TD % i == 0) {
                rt = i;
            }
        }

        return rt;
    }

}
