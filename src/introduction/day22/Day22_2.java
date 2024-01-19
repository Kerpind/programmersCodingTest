package introduction.day22;

public class Day22_2 {

    // 저주의 숫자 3
    public static void main(String[] args) {

        int n = 9;

        System.out.println("solution => " + solution(n));

    }

    public static int solution(int n) {

        int answer = 0;
        int cnt = 1;
        boolean check = false;
        String numstr = "";

        while(true){

            check = false;

            if(answer % 3 == 0){
                answer++;
                continue;
            }

            numstr = String.valueOf(answer);

            if(numstr.contains("3")){
                answer++;
                check = true;
            }

            if(check) continue;

            if(cnt == n)break;

            answer++;
            cnt++;

        }
        return answer;

    }

}
