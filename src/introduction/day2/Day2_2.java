package introduction.day2;

public class Day2_2 {

    // 숫자 비교하기
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;

        System.out.println("solution => " + solution(num1, num2));

    }
    public static int solution(int num1, int num2) {

        int answer = 0;

        if (num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }

        return answer;

    }

}
