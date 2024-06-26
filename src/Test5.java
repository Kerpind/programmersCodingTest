public class Test5 {

    public static void main(String[] args) {

        // tickets: 티켓별 금액(A: 1원, B: 2원, ..)
        // roll: shop에 진열된 상품을 새로고침 할 때 필요한 금액
        // shop: 진열된 상품(배열의 개수는 n개 1번째에서 2번째로 넘어갈 때 마다 roll의 금액만큼 money가 차감 됨)
        // money: 총 내가 받은 금액

        // 같은 알파벳의 티켓이 3장 모이면 황금 티켓으로 교환이 가능합니다.
        // 가장 황금 티켓을 금액에 맞게 많이 구할 수 있는 갯수를 구하면 됩니다.

        // result: 2
        String[] tickets = new String[]{"A 1", "B 2", "C 5", "D 3"}; // 1~10000
        int roll = 10; // 1000
        String[][] shop = new String[][]{{"B", "C", "B", "C"}, {"A", "A", "A", "B"}, {"D", "B", "C", "D"}};
        int money = 30; // 100000000

        // result: 4
        // String[] tickets = new String[]{"A 1", "B 2", "C 5", "D 3"};
        // int roll = 10;
        // String[][] shop = new String[][]{{"B", "C", "B", "C"}, {"A", "A", "A", "B"}, {"D", "B", "C", "D"}};
        // int money = 100;

        // result: 2
        // String[] tickets = new String[]{"A 2", "B 1"};
        // int roll = 1;
        // String[][] shop = new String[][]{{"A", "A", "A"}, {"A", "B", "B"}, {"A", "B", "B"}, {"A", "B", "B"}};
        // int money = 9;

        // result: 2
        // String[] tickets = new String[]{"A 2", "B 1"};
        // int roll = 5;
        // String[][] shop = new String[][]{{"A", "A", "A"}, {"A", "B", "B"}, {"A", "B", "B"}, {"A", "B", "B"}};
        // int money = 19;

        int total_a = 0;
        int total_b = 0;
        int total_c = 0;
        int total_d = 0;

        int ticketPrice_a = Integer.parseInt(tickets[0].substring(2));
        int ticketPrice_b = Integer.parseInt(tickets[1].substring(2));
        int ticketPrice_c = Integer.parseInt(tickets[2].substring(2));
        int ticketPrice_d = Integer.parseInt(tickets[3].substring(2));

        System.out.println("ticketPrice_a => " + ticketPrice_a*3);
        System.out.println("ticketPrice_b => " + ticketPrice_b*3);
        System.out.println("ticketPrice_c => " + ticketPrice_c*3);
        System.out.println("ticketPrice_d => " + ticketPrice_d*3);

        for (int i = 0; i < shop.length; i++) {
            for (int j = 0; j < shop[i].length; j++) {
                switch (shop[i][j]) {
                    case "A":
                        total_a++;
                        break;
                    case "B":
                        total_b++;
                        break;
                    case "C":
                        total_c++;
                        break;
                    case "D":
                        total_d++;
                        break;
                }
            }
        }

        System.out.println("total_a => " + total_a / 3);
        System.out.println("total_b => " + total_b / 3);
        System.out.println("total_c => " + total_c / 3);
        System.out.println("total_d => " + total_d / 3);
    }
}
