import java.util.Arrays;

public class Test1 {

    // 외계어 사전
    public static void main(String[] args) {

        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};

        System.out.println("solution => " + solution(spell, dic));

    }

    public static int solution(String[] spell, String[] dic) {

        int answer = 0;

        Arrays.sort(spell);
        String a = "";
        String b = "";

        for (int i = 0; i < spell.length; i++) {
            a += spell[i];
        }

        for (int j = 0; j < dic.length; j++) {
            String[] c = dic[j].split("");
            Arrays.sort(c);
            b = "";
            for (int k = 0; k < c.length; k++) {
                b += c[k];
            }
            if (a.equals(b)) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }

        return answer;

    }

}
