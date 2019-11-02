package chap01;
//9*9 구구단 표 출력
//2중 loop 사용
public class Multi99Table {
    public static void main(String[] args){
        System.out.println("----- 곱셈표 -----");

        for(int i = 1; i <= 9; i++){
            for(int j = 1; j<= 9; j++){
                //System.out.printf(i*j + " ");
                //이런식으로 출력하면 표가 찌그러져서 나온다

                System.out.printf("%3d", i*j);
                //printf를 사용해서 형식을 지정해주면 형태가 잡혀서 출력된다

                //format 사용 시,
                //그냥 %d을 하면 왼쪽부터 자동 정렬이지만 자리수가 정의되지않아서 출력상태가 꽤 볼만하다
                //%3d를 하면 오른쪽부터 정렬
                //%-3d를 하면 왼쪽부터 정렬
                //%03d를 하면 오른쪽부터 정렬하고, 왼쪽에 남는 자리수는 0으로 채워준다.
            }
            System.out.println();
        }
    }
}
