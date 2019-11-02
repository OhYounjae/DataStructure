package chap01;
import java.util.Scanner;
//2자리의 양수를 입력받음

public class Digits {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int no;

        System.out.println("2자리수의 정수를 입력하세요.");

        do{
            System.out.println("입력: ");
            no = in.nextInt();
        }while(no < 10 || no > 99);
        //(no < 10 || no > 99) == !(no >= 10 && no <= 99)
        //드로르간 법칙

        System.out.println(no +"을(를) 입력했습니다.");
    }
}
