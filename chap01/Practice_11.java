package chap01;
import java.util.Scanner;
//자리수 확인하는 프로그램 만들기

public class Practice_11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("수를 입력하시오.");
        int a = in.nextInt();

        int num = 0;

        while(a != 0){
            a /= 10;
            num++;
        }

        System.out.println(num + "자리수 입니다");

    }
}
