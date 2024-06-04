import java.util.*;

public class Test4_2 {

    public static void main(String[] args) {

        // 2
        String[] tickets = new String[]{"A 1", "B 2", "C 5", "D 3"};
        int roll = 10;
        String[][] shop = new String[][]{{"B", "C", "B", "C"}, {"A", "A", "A", "B"}, {"D", "B", "C", "D"}};
        int money = 30;

        System.out.println("Max Golden Tickets: " + maxGoldenTickets(tickets, roll, shop, money));
    }

    public static Map<String, Integer> maxGoldenTickets(String[] tickets, int roll, String[][] shop, int money) {
        Map<String, Integer> ticketPrices = new HashMap<>();
        for (String ticket : tickets) {
            String[] parts = ticket.split(" ");
            ticketPrices.put(parts[0], Integer.parseInt(parts[1]));
        }

        // 값 기준 오름차순 정렬
        Map<String, Integer> sortedTicketPrices = sortByValue(ticketPrices);

        return sortedTicketPrices;
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    private static int getMaxGoldenTickets(Map<String, Integer> ticketPrices, int roll, String[][] shop, int money, int[] counts, int index, int goldenTickets) {
        if (index >= shop.length) {
            return goldenTickets;
        }

        int maxGoldenTickets = goldenTickets;

        // 현재 샵에서 가능한 모든 티켓 구매를 시도
        for (int i = 0; i < shop[index].length; i++) {
            String ticket = shop[index][i];
            int price = ticketPrices.get(ticket);

            if (money >= price) {
                counts[ticket.charAt(0) - 'A']++;
                money -= price;

                // 황금 티켓으로 변환 가능한 경우
                if (counts[ticket.charAt(0) - 'A'] == 3) {
                    counts[ticket.charAt(0) - 'A'] = 0;
                    goldenTickets++;
                }

                // 다음 샵으로 이동
                maxGoldenTickets = Math.max(maxGoldenTickets, getMaxGoldenTickets(ticketPrices, roll, shop, money, counts, index, goldenTickets));

                // 구매한 티켓과 돈을 되돌림
                counts[ticket.charAt(0) - 'A']--;
                money += price;
                if (counts[ticket.charAt(0) - 'A'] == 0) {
                    goldenTickets--;
                    counts[ticket.charAt(0) - 'A'] = 2;
                }
            }
        }

        // 샵을 새로고침하는 경우
        if (money >= roll) {
            maxGoldenTickets = Math.max(maxGoldenTickets, getMaxGoldenTickets(ticketPrices, roll, shop, money - roll, counts, index + 1, goldenTickets));
        }

        return maxGoldenTickets;
    }
}
