package chap02;
//배열 복사(복제)

public class CloneArray {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();
        //배열의 주솟값만 복제하는 것이 아니라, 배열 전체를 복제함

        b[3] = 0;

        System.out.print("a = ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.print("b = ");
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}
