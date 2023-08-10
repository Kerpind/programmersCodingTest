package introduction.day9;

public class Day9_3 {

    // 가위 바위 보
    public static void main(String[] args) {

        String rsp = "2";

        System.out.println("solution => " + solution(rsp));

    }

    public static String solution(String rsp) {

        String answer = "";
        String[] a = rsp.split("");

        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("2")) {
                answer += "0";
            } else if (a[i].equals("0")) {
                answer += "5";
            } else if (a[i].equals("5")) {
                answer += "2";
            }
        }

        return answer;

    }

}
