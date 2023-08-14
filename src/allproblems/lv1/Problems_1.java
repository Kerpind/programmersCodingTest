package allproblems.lv1;

public class Problems_1 {

    // 두 정수 사이의 합
    public static void main(String[] args) {

        int a = 3;
        int b = 3;

        System.out.println("solution => " + solution(a, b));

    }

    public static long solution(int a, int b) {

        long answer = 0;
        int c = 0;
        int d = 0;

        if (a == b) {
            answer = a;
        } else if (a > b) {
            c = b;
            d = a;
        } else if (a < b) {
            c = a;
            d = b;
        }

        for (int i = c; i <= d; i++) {
            answer += i;
        }

        return answer;

    }

}
