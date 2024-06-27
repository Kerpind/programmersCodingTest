package introduction.day23;

import java.util.*;
import java.util.Comparator;

public class Day23_1 {

    // 특이한 정렬
    public static void main(String[] args) {

        int[] numList = {1, 2, 3, 4, 5, 6};
        // int[] numList = {10000, 20, 36, 47, 40, 6, 10, 7000};
        int n = 4;
        // int n = 30;

        System.out.println("solution => " + Arrays.toString(solution(numList, n)));

    }

    public static int[] solution(int[] numList, int n) {

        // Integer 배열로 변환
        Integer[] numListWrapper = new Integer[numList.length];
        for (int i = 0; i < numList.length; i++) {
            numListWrapper[i] = numList[i];
        }

        // 배열을 n으로부터의 거리와 크기에 따라 정렬하기 위한 Comparator
        Comparator<Integer> comparator = (a, b) -> {
            int distA = Math.abs(a - n); // a와 n 사이의 거리
            int distB = Math.abs(b - n); // b와 n 사이의 거리

            // 거리가 같으면 더 큰 수를 앞으로 오도록 정렬
            if (distA == distB) {
                return Integer.compare(b, a); // 내림차순 정렬
            } else {
                return Integer.compare(distA, distB); // 거리가 작은 순으로 정렬
            }
        };

        // 정의한 Comparator를 사용하여 numListWrapper 정렬
        Arrays.sort(numListWrapper, comparator);

        // Integer 배열을 다시 int 배열로 변환
        for (int i = 0; i < numList.length; i++) {
            numList[i] = numListWrapper[i];
        }

        return numList;
    }

}
