package introduction.day17;

public class Day17_3 {

    // 숫자 찾기
    public static void main(String[] args) {

        int num = 123456;
        int k = 7;

        System.out.println("solution => " + solution(num, k));

    }

    public static int solution(int num, int k) {

        int answer = 0;

        String[] a = String.valueOf(num).split("");

        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i]) == k) {
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;

        // return ("-" + num).indexOf(String.valueOf(k));

    }

}
