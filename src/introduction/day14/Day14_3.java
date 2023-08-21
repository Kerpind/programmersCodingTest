package introduction.day14;

public class Day14_3 {

    // 암호 해독
    public static void main(String[] args) {

        String cipher = "pfqallllabwaoclk";
        int code = 2;

        System.out.println("solution => " + solution(cipher, code));

    }

    public static String solution(String cipher, int code) {

        String answer = "";
        int a = 2;
        int c = code;
        for (int i = 0; i < cipher.length(); i++) {

            if (i+1 == code) {
                answer += cipher.charAt(code-1);
                code = c * a;
                a++;
            }
        }

        return answer;

    }

}
