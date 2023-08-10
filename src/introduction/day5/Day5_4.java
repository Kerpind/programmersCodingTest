package introduction.day5;

import java.util.Arrays;

public class Day5_4 {

    // 배열 뒤집기
    public static void main(String[] args) {

        int[] num_list = {1, 2, 3, 4, 5};

        System.out.println("solution => " + Arrays.toString(solution(num_list)));

    }

    public static int[] solution(int[] num_list) {

        int a = num_list.length;
        int[] aaa = new int[a];
        int b = 0;

        for(int i = a-1; i >= 0; i--){
            aaa[b] = num_list[i];
            b++;
        }

        return aaa;

    }

}
