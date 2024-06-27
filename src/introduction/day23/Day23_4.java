package introduction.day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day23_4 {

    // 로그인 성공?
    public static void main(String[] args) {

        // String[] id_pw = {"meosseugi", "1234"};
        // String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        // String[] id_pw = {"programmer01", "15789"};
        // String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};

        // String[] id_pw = {"rabbit04", "98761"};
        // String[][] db = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};

        String[] id_pw = {"abc04", "335"};
        String[][] db = {{"abc04", "345"}, {"abc04", "335"}, {"abc03", "345"}};

        System.out.println("solution => " + solution(id_pw, db));

    }

    public static String solution(String[] id_pw, String[][] db) {

        String answer = "";

        for (String[] user : db) {
            if (user[0].equals(id_pw[0])) {
                if (user[1].equals(id_pw[1])) {
                    return "login"; // 아이디와 비밀번호가 모두 일치하는 경우
                } else {
                    return "wrong pw"; // 아이디는 일치하지만 비밀번호가 일치하지 않는 경우
                }
            }
        }
        return "fail";

        /* 실패한 소스
        String answer = "";

        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                }
            } else {
                answer = "fail";
            }
        }

        return answer;
        */

    }

}
