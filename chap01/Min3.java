package chap01;
//연습문제 2
public class Min3 {
    static int min3(int a, int b, int c){
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;

        return min;
    }
    static int min4(int a, int b, int c, int d){
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;
    }

    public static void main(String[] args){
        System.out.println("3개 중 최솟값은 : "+ min3(1,3,2) + " 입니다.");
        System.out.println("4개 중 최솟 값은 : " + min4(0, 9,3,2) + " 입니다.");
    }
}
