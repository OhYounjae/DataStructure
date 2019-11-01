package chap01;
//연습문제 1

public class Max4 {
    //4개의 정수 중 최댓값 찾기
    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max;
    }

    public static void main(String[] args){
        System.out.println("4개중 최대값은 : "+max4(1,5,3,2)+" 입니다.");
    }
}
