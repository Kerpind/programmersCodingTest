package introduction.day23;

public class Day23_3 {

    // 옹알이 (1)
    public static void main(String[] args) {

        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

        System.out.println("solution => " + solution(babbling));

    }

    public static int solution(String[] babbling) {

        int answer = 0;
        String[] babyLanguage = {"aya", "ye", "woo", "ma"};

        for(int i = 0; i < babbling.length; i++) {
            if (babbling[i].equals("aya") || babbling[i].equals("ye") || babbling[i].equals("woo") || babbling[i].equals("ma")) {
                answer++;
            } else {
                String a = "";
                a = babbling[i].replace("aya", "-");
                if (a.contains("ye") || a.contains("woo") || a.contains("ma")) {
                    a = a.replace("ye", "-");
                    if (a.contains("woo") || a.contains("ma")) {
                        a = a.replace("woo", "-");
                        if (a.contains("ma")) {
                            a = a.replace("ma", "-");
                        }
                    }
                }
                a = a.replace("-", "");
                if (a.length() == 0) {
                    answer++;
                }
            }
        }

        return answer;

        // if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$"))

    }

}
