package chap01;
import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("1부터 n까지의 합 구하기");
        System.out.println("n의 값 : ");
        int n = in.nextInt();

        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }

        System.out.println("총합 : "+ sum);
        System.out.println(i); //최종 i의 값은 1이 더해져 있다.
    }
}
