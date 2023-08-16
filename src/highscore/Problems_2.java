package highscore;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problems_2 {

    // 스택/큐 - 다리를 지나는 트럭(Lv2)
    public static void main(String[] args) {

        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10};

        Instant beforeTime = Instant.now();
        System.out.println("solution => " + solution(bridge_length, weight, truck_weights));
        Instant afterTime = Instant.now();

        long diffTime = Duration.between(beforeTime, afterTime).toMillis();
        System.out.println("시간차이(ms) : "+diffTime);

    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        int answer = 0;                                 // 소요시간

        Stack<Integer> a = new Stack<>();

        int b = 0;

        return answer;

    }

}
