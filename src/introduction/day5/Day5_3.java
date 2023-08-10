package introduction.day5;

public class Day5_3 {

    // 나이 출력
    public static void main(String[] args) {

        int age = 40;

        System.out.println("solution => " + solution(age));

    }

    public static int solution(int age) {
        return 2022-(age-1);
    }

}
