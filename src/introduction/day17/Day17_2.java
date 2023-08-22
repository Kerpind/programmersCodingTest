package introduction.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day17_2 {

    // n의 배수 고르기
    public static void main(String[] args) {

        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println("solution => " + Arrays.toString(solution(n, numlist)));

    }

    public static int[] solution(int n, int[] numlist) {

        int[] answer = {};
        int a = 0;
        List<String> b = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                b.add(String.valueOf(numlist[i]));
            }
        }

        answer = new int[b.size()];

        for (int j = 0; j < b.size(); j++) {
            answer[j] = Integer.parseInt(b.get(j));
        }

        return answer;

        // return Arrays.stream(numList).filter(value -> value % n == 0).toArray();

    }

}
