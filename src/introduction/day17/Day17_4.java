package introduction.day17;

import java.util.Arrays;

public class Day17_4 {

    // OX퀴즈
    public static void main(String[] args) {

        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};

        System.out.println("solution => " + Arrays.toString(solution(quiz)));

    }

    public static String[] solution(String[] quiz) {

        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] a = quiz[i].split(" ");
            int b = 0;
            int c = Integer.parseInt(a[4]);
            switch (a[1]) {
                case "+":
                    b = Integer.parseInt(a[0]) + Integer.parseInt(a[2]);
                    break;
                case "-":
                    b = Integer.parseInt(a[0]) - Integer.parseInt(a[2]);
                    break;
            }
            if(b == c){
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        return answer;

    }

}
