package chap02;
import java.util.Scanner;
//배열의 최댓값 출력

public class MaxOfArray {
    static int maxOf(int[] a){ //a는 인자로 들어온 배열의 본체를 참조한다
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max) max = a[i];
        }
        return max;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("사람은 몇명입니까?");
        int num = in.nextInt();
        int[] height = new int[num];
        System.out.println("각 사람들의 키를 입력하세요.");
        for(int i = 0; i < height.length; i++){
            height[i] = in.nextInt();
        }

        System.out.println("제일 큰 키는 " + maxOf(height) + "입니다.");
    }
}
