package introduction.day19;

public class Day19_1 {

    // 7의 개수
    public static void main(String[] args) {

        int[] array = {7, 77, 17};

        System.out.println("solution => " + solution(array));

    }

    public static int solution(int[] array) {

        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            String a = String.valueOf(array[i]);
            for (int j = 0; j < a.length(); j++) {
                String b = String.valueOf(a.charAt(j));
                if (b.equals("7")) {
                    answer++;
                }
            }
        }

        return answer;

    }

}
