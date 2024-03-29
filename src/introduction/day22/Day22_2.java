package introduction.day22;

public class Day22_2 {

    // 평행
    public static void main(String[] args) {

        // int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        // int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        int[][] dots = {{0, 0}, {1, 1}, {2, 2}, {3, 3}};

        System.out.println("solution => " + solution(dots));

    }

    public static int solution(int[][] dots) {

        int answer = 0;

        int x1 = dots[0][0];
        int x2 = dots[1][0];
        int x3 = dots[2][0];
        int x4 = dots[3][0];

        int y1 = dots[0][1];
        int y2 = dots[1][1];
        int y3 = dots[2][1];
        int y4 = dots[3][1];

        /*
        if (((y2 - y1) / (x2 - x1)) == ((y4 - y3) / (x4 - x3))) {
            answer = 1;
        } else if (((y3 - y1) / (x3 - x1)) == ((y4 - y2) / (x4 - x2))) {
            answer = 1;
        } else if (((y4 - y1) / (x4 - x1)) == ((y3 - y2) / (x3 - x2))) {
            answer = 1;
        }
        */

        double slope1 = (double) (y2 - y1) / (x2 - x1);
        double slope2 = (double) (y4 - y3) / (x4 - x3);
        if (slope1 == slope2) answer = 1;

        slope1 = (double) (y3 - y1) / (x3 - x1);
        slope2 = (double) (y4 - y2) / (x4 - x2);
        if (slope1 == slope2) answer = 1;

        slope1 = (double) (y4 - y1) / (x4 - x1);
        slope2 = (double) (y3 - y2) / (x3 - x2);
        if (slope1 == slope2) answer = 1;

        return answer;

    }

}
