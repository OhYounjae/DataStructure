package chap02;
//1000이하의 소수 열거
//version 3
//제곱근 사용하기

public class PrimeNumber3 {
    public static void main(String[] args){
        int count = 0; //곱셈과 나눗셈 횟수의 총 합
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for(int n = 5; n <= 1000; n+=2){
            boolean flag = false;
            for(int i = 1; prime[i] * prime[i] <= n; i++){
                count += 2;
                if(n % prime[i] == 0){
                    flag = true;
                    break;
                }

            }

            if(!flag){
                prime[ptr++] = n;
                count++;
            }
        }

        for(int i = 0; i < ptr; i++){
            System.out.println(prime[i]);
        }

        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + count);
        //3774
    }
}
