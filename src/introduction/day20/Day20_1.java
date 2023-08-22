package introduction.day20;

public class Day20_1 {

    // 최댓값 만들기 (2)
    public static void main(String[] args) {

        int[] numbers = {-10000, 10000};

        System.out.println("solution => " + solution(numbers));

    }

    public static int solution(int[] numbers) {

        int answer = -100000000;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++){
                int a = numbers[i]*numbers[j];
                if (a >= answer) {
                    answer = numbers[i]*numbers[j];
                }
            }
        }

        return answer;

    }

}
