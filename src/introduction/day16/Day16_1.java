package introduction.day16;

public class Day16_1 {

    // 편지
    public static void main(String[] args) {

        String message = "I love you~";

        System.out.println("solution => " + solution(message));

    }

    public static int solution(String message) {

        return message.length()*2;

    }

}
