package chap01;
import java.util.Scanner;
//3개의 정수를 입력받고 중앙값을 출력

public class Median {
    static int med3(int a, int b, int c){
        if(a >= b){
            if(b >= c) return b;
            // a, b, c
            else if(a <= c) return a;
            // c, a, b
            else return c;
            //a >= c >= b --> a, c, b
        }
        else if(a > c) return a;
        //a < b && a > c --> c, a, b

        else if(b > c) return c;
        //a < b && a < c && c < b --> a, c, b

        else return b;
        //a < b && a < c && b < c --> a, b, c
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.println("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.println("c의 값 : ");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a,b,c) + "입니다.");

    }
}
