package introduction.day24;

public class Day24_1 {

    // 치킨 쿠폰
    public static void main(String[] args) {

        int chicken = 1081;

        System.out.println("solution => " + solution(chicken));

    }

    public static int solution(int chicken) {

        int answer = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            int service = coupon % 10;
            answer += coupon / 10;
            coupon = service + coupon / 10;
        }

        return answer;
    }

}
