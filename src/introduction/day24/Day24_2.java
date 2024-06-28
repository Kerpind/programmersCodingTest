package introduction.day24;

public class Day24_2 {

    // 이진수 더하기
    public static void main(String[] args) {

        String bin1 = "10";
        String bin2 = "11";

        System.out.println("solution => " + solution(bin1, bin2));

    }

    public static String solution(String bin1, String bin2) {

        return Integer.toString(Integer.parseInt(bin1, 2)+Integer.parseInt(bin2, 2), 2);

    }

}
