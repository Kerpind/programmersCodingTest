package introduction.day18;

public class Day18_3 {

    // 세균 증식
    public static void main(String[] args) {

        int n = 7;
        int t = 15;

        System.out.println("solution => " + solution(n, t));

    }

    public static int solution(int n, int t) {

        int answer = 1;

        for (int i = 0; i <= t; i++) {
            if (i == 0) {
                answer = n;
            } else {
                answer = answer * 2;
            }
        }

        return answer;

        // 비트연산자 <<

    }

}
