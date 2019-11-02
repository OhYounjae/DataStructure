package chap02;

public class IntArrayInit {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        //배열의 데이터 값을 설정해주면서 배열을 선언하기때문에 크기를 쓰지않는다

        for(int i = 0; i < a.length; i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
}
