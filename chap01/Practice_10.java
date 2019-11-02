package chap01;
import java.util.Scanner;

public class Practice_10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("a: ");
        a = in.nextInt();

        do{
            System.out.println("b: ");
            b = in.nextInt();

            if(a >= b){
                System.out.println("a보다 큰 b를 입력하세요!");
            }
        }while(a >= b);
        //a가 b보다 크거나 같으면 참으로 설정되므로 while loop이 지속된다
        //a가 b보다 작아야 while 조건이 거짓이 된다.

        System.out.println("b - a는 " + (b-a) + "입니다");



    }
}
