package introduction.day9;

public class Day9_1 {

    // 개미 군단
    public static void main(String[] args) {

        int hp = 23;

        System.out.println("solution => " + solution(hp));

    }

    public static int solution(int hp) {

        int general = 5;
        int soldier = 3;
        int work = 1;
        int answer = 0;

        answer = hp / general;
        hp = hp - (general * (hp / general));

        if (hp % general != 0 && hp / soldier != 0) {
            answer += hp / soldier;
            hp = hp - (soldier * (hp / soldier));
        }

        if (hp % soldier != 0 && hp / work != 0) {
            answer += hp / work;
        }

        return answer;

    }

}
