package introduction.day9;

public class Day9_4 {

    // 구슬을 나누는 경우의 수
    public static void main(String[] args) {

        int balls = 3;
        int share = 2;

        System.out.println("solution => " + solution(balls, share));

    }

    public static int solution(int balls, int share) {

        if (balls == share || share == 0) {
            return 1;
        }

        long answer = 1;

        int a = (balls - share < share) ? balls - share : share;

        for (int i = 0; i < a; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }

        return (int) answer;

    }

}
