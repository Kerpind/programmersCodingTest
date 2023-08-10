package introduction.day11;

public class Day11_1 {

    // 주사위의 개수
    public static void main(String[] args) {

        int[] box = {1, 1, 1};
        int n = 1;

        System.out.println("solution => " + solution(box, n));

    }

    public static int solution(int[] box, int n) {

        int answer = 0;

        int a = box[0]/n;
        int b = box[1]/n;
        int c = box[2]/n;

        answer = a * b * c;

        return answer;

    }

}
