package introduction.day24;

public class Day24_4 {

    // k의 개수
    public static void main(String[] args) {

        int i = 1;
        int j = 13;
        int k = 1;

        System.out.println("solution => " + solution(i, j, k));

    }

    public static int solution(int i, int j, int k) {

        int answer = 0;

        for (int a = i; a <= j; a++) {
            String[] b = String.valueOf(a).split("");
            for (int c = 0; c < b.length; c++) {
                if(String.valueOf(k).equals(b[c])){
                    answer++;
                }
            }
        }

        return answer;

    }

}
