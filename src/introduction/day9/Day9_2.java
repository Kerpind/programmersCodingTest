package introduction.day9;

public class Day9_2 {

    // 모스부호 (1)
    public static void main(String[] args) {

        String letter = ".... . .-.. .-.. ---";

        System.out.println("solution => " + solution(letter));

    }

    public static String solution(String letter) {

        String[] a = letter.split(" ");

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
                "-.--","--.."};

        String answer = "";

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (a[i].equals(morse[j])) {
                    char c = (char)(97 + j);
                    answer += String.valueOf(c);
                    break;
                }
            }
        }

        return answer;

    }

}
