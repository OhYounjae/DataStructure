package chap02;
import java.util.Scanner;
//배열을 역순으로 정렬하기
//n크기의 배열이 있으면 양 끝에서부터 2개씩 교환한다
// n/2만큼의 교환횟수가 필요(n이 홀수인경우 가운데값은 굳이 교환할 필요가 없다)

public class ReverseArray {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;

        //교환할때마다 교환하는 과정 출력
        System.out.printf("temp[%d]와 temp[%d]를 교환합니다.%n", idx1,idx2);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    static void reverse(int[] a){
        for(int i = 0; i < a.length/2; i++){
            swap(a, i, a.length-1-i);
        }
    }

    static int sumOF(int[] a){//배열의 모든 요소의 합계 반환 메소드
        int sum = 0;
        for(int i = 0; i < a.length; i++)
            sum += a[i];

        return sum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요.");
        int num = in.nextInt();
        int[] temp = new int[num];
        System.out.println("각 배열의 값을 입력하세요.");
        for(int i = 0; i < num; i++){
            temp[i] = in.nextInt();
        }

        System.out.println("배열을 역으로 정렬합니다.");

        reverse(temp);

        System.out.println("역순으로 정렬이 끝났습니다.");
        for(int i = 0; i < temp.length; i++){
            System.out.println("temp["+ i +"] = " + temp[i]);
        }

        System.out.println("배열의 모든 요소의 합은 " + sumOF(temp) + "입니다.");
    }
}
