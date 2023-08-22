package introduction.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day15_4 {

    // 약수 구하기
    public static void main(String[] args) {

        int n = 29;

        System.out.println("solution => " + Arrays.toString(solution(n)));

    }

    public static int[] solution(int n) {

        int[] answer = {};
        List<String> a = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a.add(String.valueOf(i));
            }
        }

        answer = new int[a.size()];

        for (int j = 0; j < a.size(); j++) {
            answer[j] = Integer.parseInt(a.get(j));
        }

        return answer;

        // return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();

    }

}
