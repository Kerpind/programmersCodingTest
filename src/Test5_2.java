public class Test5_2 {

    public static void main(String[] args) {

        // 2
        String[] tickets = new String[]{"A 1", "B 2", "C 5", "D 3"}; // 1~10000
        int roll = 10; // 1000
        String[][] shop = new String[][]{{"B", "C", "B", "C"}, {"A", "A", "A", "B"}, {"D", "B", "C", "D"}};
        int money = 30; // 100000000

        // 4
        // String[] tickets = new String[]{"A 1", "B 2", "C 5", "D 3"};
        // int roll = 10;
        // String[][] shop = new String[][]{{"B", "C", "B", "C"}, {"A", "A", "A", "B"}, {"D", "B", "C", "D"}};
        // int money = 100;

        // 2
        // String[] tickets = new String[]{"A 2", "B 1"};
        // int roll = 1;
        // String[][] shop = new String[][]{{"A", "A", "A"}, {"A", "B", "B"}, {"A", "B", "B"}, {"A", "B", "B"}};
        // int money = 9;

        // 2
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
