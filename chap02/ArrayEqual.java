package chap02;
import java.util.Scanner;
//두 배열이 같은 지 비교

public class ArrayEqual {
    static boolean equals(int[] a, int[] b){
        if(a.length != b.length) return false;

        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]) return false;
        }

        return true;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("배열 A의 크기를 입력하세요.");
        int na = in.nextInt();
        int[] a = new int[na];
        System.out.println("배열 A의 요소를 입력하세요.");
        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }

        System.out.println("배열 B의 크기를 입력하세요.");
        int nb = in.nextInt();
        int[] b = new int[nb];
        System.out.println("배열 B의 요소를 입력하세요.");
        for(int i = 0; i < b.length; i++){
            b[i] = in.nextInt();
        }

        System.out.println("배열 A와 B는 " + (equals(a, b) ? "같습니다." : "같지 않습니다."));
        //equals(a,b)가 참이면 "같습니다."를, 거짓이면 "같지 않습니다."를 반환한다.
        //이처럼 사용하는 연산자를 삼항연산자라 한다.
    }
}
