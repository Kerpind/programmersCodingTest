package introduction.day5;

public class Day5_1 {

    // 옷가게 할인 받기
    public static void main(String[] args) {

        int price = 150000;

        System.out.println("solution => " + solution(price));

    }

    public static int solution(int price) {

        float prices = (float)price;
        float minusPrice = 0;
        float discountPrice = 0;

        int result = 0;
        float discount = 0;

        if (prices >= 100000 && prices < 300000) {
            discount = 5;
        } else if (prices >= 300000 && prices < 500000) {
            discount = 10;
        } else if (prices >= 500000) {
            discount = 20;
        }

        discountPrice = discount / 100;

        minusPrice = prices * discountPrice;

        result = (int) Math.floor(prices - minusPrice);

        return result;

    }

}
