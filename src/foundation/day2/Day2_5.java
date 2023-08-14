package foundation.day2;

public class Day2_5 {

    // 문자열 겹쳐쓰기
    public static void main(String[] args) {

        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;

        System.out.println("solution => " + solution(my_string, overwrite_string, s));

    }

    public static String solution(String my_string, String overwrite_string, int s) {

        String answer = "";
        answer += my_string.substring(0, s);
        my_string = my_string.substring(s, my_string.length());
        answer += my_string.replaceAll(my_string.substring(0, overwrite_string.length()), overwrite_string);

        // answer = my_string.replaceAll(my_string.substring(s, overwrite_string.length() + s), overwrite_string);
        return answer;

    }

}
