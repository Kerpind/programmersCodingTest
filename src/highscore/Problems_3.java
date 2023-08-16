package highscore;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Stream;

public class Problems_3 {

    // 스택/큐 - 같은 숫자는 싫어(Lv1)
    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1};

        Instant beforeTime = Instant.now();
        System.out.println("solution => " + Arrays.toString(solution(arr)));
        Instant afterTime = Instant.now();

        long diffTime = Duration.between(beforeTime, afterTime).toMillis();
        System.out.println("시간차이(ms) : " + diffTime);

    }

    public static int[] solution(int[] arr) {

        int[] answer = {};
        Queue<Integer> a = new LinkedList<>();
        int b = -1;

        for (int i : arr) {
            if (b != i) {
                a.offer(i);
                b = i;
            }
        }

        answer = new int[a.size()];

        for (int j = 0; j < answer.length; j++) {
            answer[j] = a.poll();
        }

        return answer;

    }

}
