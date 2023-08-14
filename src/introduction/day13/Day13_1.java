package introduction.day13;

public class Day13_1 {

    // 컨트롤 제트
    public static void main(String[] args) {

        String s = "-1 -2 -3 Z";

        System.out.println("solution => " + solution(s));

    }

    public static int solution(String s) {

        int answer = 0;
        String[] a = s.split(" ");
        int b = 0;

        for (int i = 0; i < a.length; i++) {
            String c = a[i];
            if (!c.equals("Z")) {
                answer += Integer.parseInt(c);
                b = Integer.parseInt(c);
            } else {
                answer -= b;
                b = 0;
            }
        }

        return answer;

    }

}
