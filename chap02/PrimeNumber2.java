package chap02;
//1000이하의 소수 열거
//version 2

public class PrimeNumber2 {
    public static void main(String[] args){
        int count = 0; //나눗셈 횟수
        int ptr = 0;   //소수의 개수
        int[] prime = new int[500]; //소수 저장하는 배열

        prime[ptr++] = 2;
        // 2를 제외한 짝수는 모두 소수가 아니므로 미리 배열에 2를 저장하고
        // 홀수들만 판별한다
        // ptr == 1;

        for(int n = 3; n <= 1000; n += 2){ //2는 미리 배열에 넣어놨으므로 홀수들만 소수판별
            int i;
            for(i = 1; i < ptr; i++){
                count++;
                if(n%prime[i] == 0) //미리 찾아놓은 소수들로 소수판별
                    break;
            }

            if(ptr == i) prime[ptr++] = n; //끝까지 나눠지지않은 수는 소수임으로 소수로 확인하고 배열에 넣는다
        }

        for(int i = 0; i < ptr; i++){ //판별한 소수 출력
            System.out.println(prime[i]);
        }

        System.out.println("나눗셈을 한 횟수 : " + count);
        //count == 14622
    }
}
