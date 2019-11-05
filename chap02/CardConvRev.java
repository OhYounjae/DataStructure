package chap02;
import java.util.Scanner;
//입력받은 10진수를 2진수~36진수로 기수 변환하여 나타냄

public class CardConvRev {
    static int cardConvR(int x, int r, char[] d){
        // x는 10진수 정수, r은 변환할 진수(2진수, 8진수 ...), d는 변환한 값을 저장할 문자배열

        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //각 기수를 변환하는데 사용하는 문자열
        //index 별 변환되는 숫자 혹은 문자

        do{
            d[digits++] = dchar.charAt(x % r);
            //charAt을 이용하면 문자열 indexing을 할 수 있다
            //digits++은 후위연산자를 사용하기때문에 해당 실행문이 끝난 후에 digits의 값이 변한다
            x /= r;
        }while(x != 0);

//        for(int i = 0; i < digits; i++){
//            System.out.print(d[i] + " " + i);
//            System.out.println();
//        }

        return digits;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do{
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = in.nextInt();
            }while(no < 0);

            do{
                System.out.print("어떤 진수로 변환할까요?(2~36) : ");
                cd = in.nextInt();
            }while(cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for(int i = dno - 1; i >= 0; i--){
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.println("한번 더 하시겠습니까?");
            retry = in.nextInt();
        }while(retry == 1);
    }
}
