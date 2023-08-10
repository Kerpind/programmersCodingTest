package introduction.day7;

public class Day7_3 {

    // 양꼬치
    public static void main(String[] args) {

        int n = 10;
        int k = 3;

        System.out.println("solution => " + solution(n, k));

    }

    public static int solution(int n, int k) {

        k = k - (n / 10);

        return (n*12000)+(k*2000);

    }

}
