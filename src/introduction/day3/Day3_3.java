package introduction.day3;

public class Day3_3 {

    // 최빈값 구하기
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 3, 3, 4};

        System.out.println("solution => " + solution(array));

    }

    public static int solution(int[] array) {

        int[] a = new int[1000];

        for (int i = 0; i < array.length; i++) {
            a[array[i]]++;
        }

        int index = 0;
        int max = 0;
        boolean check = false;

        // 0 ~ 1000 배열에서 0보다 큰 수의 값들의 위치를 확인하여 작업 진행
        for (int j = 0; j < a.length; j++) {
            // 동일 값 존재 확인
            if (a[j] > 0) {
                // 동일 값 최댓값보다 큰지 확인
                if (a[j] > max) {
                    max = a[j];
                    index = j;
                    check = false;
                    // 동일 값 최댓값과 동일한지 확인
                } else if (a[j] == max) {
                    check = true;
                }
            }
        }

        return check ? -1 : index;

    }

}
