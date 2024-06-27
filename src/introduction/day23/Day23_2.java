package introduction.day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day23_2 {

    // 등수 매기기
    public static void main(String[] args) {

        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};

        System.out.println("solution => " + Arrays.toString(solution(score)));

    }

    public static int[] solution(int[][] score) {

        List<Integer> scoreList = new ArrayList<>();

        for (int[] i : score) {
            scoreList.add(i[0] + i[1]);
        }

        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
        }

        return answer;

    }

}
