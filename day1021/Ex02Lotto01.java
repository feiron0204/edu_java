package day1021;
// 숙제 2. 1부터 45까지 범위의 랜덤 숫자 6개를 뽑아서 배열에 저장하고 출력하는 프로그램을 작성하시오.
// 중복된 숫자는 허용되고 , 정렬은 안되어도 됩니다.
import java.util.Random;
public class Ex02Lotto01 {
    public static void main(String[] args) {
        // 상수
        // 1. 최소값
        final int NUMBER_MIN=1;
        // 2. 최대값
        final int NUMBER_MAX=45;
        // 3. 크기
        final int SIZE=6;
        
        Random random=new Random();
        
        // 1. 배열을 만든다
        int[] numbers = new int[SIZE];
        
        // 2. 배열 각 칸에 랜덤한 숫자를 넣는다
        for(int i=0;i<SIZE;i++) {
            numbers[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
        }
        
        // 3. 출력한다.
        System.out.print("[");
        for(int i =0; i<SIZE;i++) {
            System.out.printf("%2d", numbers[i]);
            if(i <SIZE -1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
        
    }

}
