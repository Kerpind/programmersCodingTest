package introduction.day22;

public class Day22_1 {

    // 저주의 숫자 3
    public static void main(String[] args) {

        int n = 9;

        System.out.println("solution => " + solution(n));

    }

//    1	    1   (0)
//    2	    2   (0)
//    3	    4   (1)
//    4	    5   (1)
//    5	    7   (2)
//    6	    8   (2)
//    7	    10  (3)
//    8	    11  (3)
//    9	    14  (5)
//    10	16  (6)

    public static int solution(int n) {

        int answer = 0;
        int cnt=1;
        boolean check=false;
        String numstr ="";
        while(true){
            check=false;

            if(answer%3==0){
                answer++;
                continue;
            }
            numstr=String.valueOf(answer);
            //else{
            if(numstr.contains("3")){
                answer++;
                check=true;
                //break;
            }
            //}

            if(check) continue;

            if(cnt==n)break;
            answer++;
            cnt++;

        }
        return answer;

    }

}
