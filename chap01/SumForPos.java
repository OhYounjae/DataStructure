package chap01;
import java.util.Scanner;

//do문 while 제어식 사용하기
//do문을 사용함으로서 루프 본문을 우선적으로 한번 실행한 후, 계속 반복할 것인지에 대한 판단을 한다

public class SumForPos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("1부터 n까지의 합 구하기");

        do{
            System.out.println("n의 값 : ");
            n = in.nextInt();
        }while(n <= 0); //n이 0보다 크면 while값이 false로 되어서 멈추게 된다.

        int sum = 0;

        for(int i = 0; i <= n; i++){
            sum += i;
        }

        System.out.println("1부터 " + n + "까지의 합은 "+ sum + "입니다.");
    }

}
