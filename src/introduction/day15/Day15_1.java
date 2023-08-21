package introduction.day15;

public class Day15_1 {

    // 영어가 싫어요
    public static void main(String[] args) {

        String numbers = "onetwothreefourfivesixseveneightnine";

        System.out.println("solution => " + solution(numbers));

    }

    public static long solution(String numbers) {

        long answer = 0;

        String a = "";
        String b = "";

        for (int i = 0; i < numbers.length(); i++) {
            a += numbers.charAt(i);
            switch (a) {
                case "zero":
                    b += "0";
                    a = "";
                    break;
                case "one":
                    b += "1";
                    a = "";
                    break;
                case "two":
                    b += "2";
                    a = "";
                    break;
                case "three":
                    b += "3";
                    a = "";
                    break;
                case "four":
                    b += "4";
                    a = "";
                    break;
                case "five":
                    b += "5";
                    a = "";
                    break;
                case "six":
                    b += "6";
                    a = "";
                    break;
                case "seven":
                    b += "7";
                    a = "";
                    break;
                case "eight":
                    b += "8";
                    a = "";
                    break;
                case "nine":
                    b += "9";
                    a = "";
                    break;
            }
        }

        answer = Long.parseLong(b);

        return answer;

    }

}
