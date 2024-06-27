package introduction.day22;

public class Day22_4 {

    // 유한소수 판별하기
    public static void main(String[] args) {

        int a = 12;
        // int a = 11;
        int b = 21;
        // int b = 22;

        System.out.println("solution => " + solution(a, b));

    }

    public static int solution(int a, int b) {

        int answer = 0;

        int gcd = gcd(a, b);
        b /= gcd;  // 기약분수로 만들기 위해 분모를 최대공약수로 나눔

        // 분모가 1이 될 때까지 2와 5로 나눔
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        // 남은 분모가 1이면 유한소수, 아니면 무한소수
        answer = b == 1 ? 1 : 2;

        return answer;

    }

    // 유클리드 호제법으로 최대공약수 계산
    private static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

}
