package chap02;
import java.util.Scanner;
import java.util.Random; //랜덤을 사용하기 위해 import
//변수를 랜덤으로 생성함
//그 변수를 배열에 넣고 최댓값 출력

public class MaxOfArrayRand {
    static int maxOf(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++){//이미 최댓값은 index 0으로 되어있으니 비교는 1부터 하면 된다
            if(a[i] > max) max = a[i];
        }
        return max;
    }

    public static void main(String[] args){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        System.out.print("사람 수 : ");
        //int num = in.nextInt();
        int num = 0;
        do{
            num = rand.nextInt(10);
            System.out.println(num);
            if (num == 0){
                System.out.println("0이 나왔으므로 다시 난수를 생성합니다.");
            }

        }while(num == 0); //입력되는 사람의 수가 0이면 다시 난수를 생성하도록 만든다.

        int[] height = new int[num];

        System.out.println("입력 되는 랜덤값입니다.");
        for(int i = 0; i < num; i++){
            height[i] = 100 + rand.nextInt(100);
            //rand.nextInt(100)으로 랜덤값은 0부터 100-1값중에서 정해진다.
            System.out.println(height[i]);
        }

        System.out.println("키의 최댓값은 " + maxOf(height) + "입니다.");
    }
}
