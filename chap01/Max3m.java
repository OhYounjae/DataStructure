package chap01;

public class Max3m {
    static int max3(int a, int b, int c){
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;

        return max;
        //void 함수가 아닌 이상 꼭 return값 생각해주기
    }

    public static void main(String[] args){
        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(3,2,2) = " + max3(3,2,2));
        System.out.println("max3(3,1,2) = " + max3(3,1,2));
        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(3,2,1) = " + max3(3,2,1));

    }
}
