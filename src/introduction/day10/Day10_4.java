package introduction.day10;

import java.util.Arrays;

public class Day10_4 {

    // 배열 회전시키기
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        String direction = "right";

        System.out.println("solution => " + Arrays.toString(solution(numbers, direction)));

    }

    public static int[] solution(int[] numbers, String direction) {

        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];
        }

        for (int i = 0; i < numbers.length-1; i++) {
            switch (direction){
                case "right": answer[i+1] = numbers[i];
                    break;
                case "left": answer[i] = numbers[i+1];
                    break;
            }
        }

        if (direction.equals("left")) {
            answer[numbers.length - 1] = numbers[0];
        }

        return answer;

    }

}
