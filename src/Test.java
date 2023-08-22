import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String[] replies = {"AFFDEFDEFDEEC", "AAAAA"};
        boolean[] result = new boolean[replies.length];

        for (int i = 0; i < replies.length; i++) {
            for (int j = 0; j < replies[i].length(); j++) {
                List<String> c = new ArrayList<>();
                c.add(replies[i].substring(0, 2));
            }
        }

    }

}
