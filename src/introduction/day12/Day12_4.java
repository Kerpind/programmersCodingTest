package introduction.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day12_4 {

    // 소인수분해
    public static void main(String[] args) {

        int n = 420;

        System.out.println("solution => " + Arrays.toString(solution(n)));

    }

    public static int[] solution(int n) {

        int[] answer = {};
        List<Integer> a = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                n = division(n, i);
                a.add(i);
            }
        }

        answer = new int[a.size()];

        for (int j = 0; j < a.size(); j++) {
            answer[j] = a.get(j);
        }

        return answer;

    }

    private static int division(int n, int i) {

        n /= i;

        if (n % i == 0) {
            return division(n, i);
        }

        return n;
    }


}
