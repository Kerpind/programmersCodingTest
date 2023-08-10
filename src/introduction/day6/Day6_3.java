package introduction.day6;

import java.util.Arrays;

public class Day6_3 {

    // 짝수 홀수 개수
    public static void main(String[] args) {

        int[] num_list = {1, 2, 3, 4, 5};

        System.out.println("solution => " + Arrays.toString(solution(num_list)));

    }

    public static int[] solution(int[] num_list) {

        int odd = 0;
        int even = 0;

        for(int i = 0; i < num_list.length; i++) {

            int num = num_list[i];

            if (oddEvenChk(num)){
                odd++;
            } else {
                even++;
            }
        }

        int[] answer = {odd, even};

        return answer;

    }

    private static boolean oddEvenChk(int n){

        boolean check = true;

        if((n%2)==0){
            check = true;
        } else {
            check = false;
        }

        return check;
    }

}
