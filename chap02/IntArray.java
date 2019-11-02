package chap02;

public class IntArray {
    public static void main(String[] args){
        int[] a; //배열 선언
        a = new int[5]; //배열 참조
        // int[] a = new int[5];

        a[1] = 37;
        a[2] = 35;
        a[4] = a[1] * 2;

        for(int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
        //따로 배열의 값을 저장하지 않으면 0으로 초기화 된다
    }
}
