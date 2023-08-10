package introduction.day2;

public class Day2_1 {

    // 두 수의 나눗셈
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 2;

        System.out.println("solution => " + solution(num1, num2));

    }

    public static int solution(int num1, int num2) {
        return (int)((double)num1/(double)num2*1000);
    }

}
