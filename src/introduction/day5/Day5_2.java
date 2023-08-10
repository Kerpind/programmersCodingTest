package introduction.day5;

import java.util.Arrays;

public class Day5_2 {

    // 아이스 아메리카노
    public static void main(String[] args) {

        int money = 5500;

        System.out.println("solution => " + Arrays.toString(solution(money)));

    }

    public static int[] solution(int money) {

        int cnt = money / 5500;
        int other = money % 5500;

        int[] answer = {cnt, other};
        return answer;

    }

}
