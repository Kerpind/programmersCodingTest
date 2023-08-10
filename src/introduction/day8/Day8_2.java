package introduction.day8;

public class Day8_2 {

    // 외계행성의 나이
    public static void main(String[] args) {

        int age = 23;

        System.out.println("solution => " + solution(age));

    }

    public static String solution(int age) {

        String answer = "";
        String a = String.valueOf(age);
        String[] b = {};

        for (int i = 0; i < a.length(); i++) {
            b = a.split("");

            switch (b[i]) {
                case "0":
                    answer += "a";
                    break;
                case "1":
                    answer += "b";
                    break;
                case "2":
                    answer += "c";
                    break;
                case "3":
                    answer += "d";
                    break;
                case "4":
                    answer += "e";
                    break;
                case "5":
                    answer += "f";
                    break;
                case "6":
                    answer += "g";
                    break;
                case "7":
                    answer += "h";
                    break;
                case "8":
                    answer += "i";
                    break;
                case "9":
                    answer += "j";
                    break;
            }

        }

        return answer;

    }

}
