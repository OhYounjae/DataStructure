package chap02;
//1000이하의 소수 열거

public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;
        //나눗셈 횟수

        for(int n = 2; n <= 1000; n++){
            int i;
            for(i = 2; i < n; i++){
                counter++;
                if(n%i == 0){
                    break;
                }//나누어떨어지면 소수임으로 안쪽루프만 멈춤
            }

            if(n == i){
                System.out.println(n);
            }
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
        //counter == 78022
    }

}
