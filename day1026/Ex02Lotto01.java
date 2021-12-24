package day1026;
// ArrayUtil 을 사용한
// 로또번호 배열 만들기
import util.ArrayUtil;
import java.util.Random;

public class Ex02Lotto01 {
    public static final int SIZE=6;
    public static final int NUMBER_MIN=1;
    public static final int NUMBER_MAX=45;
    
    public static void main(String[] args) {
        Random random = new Random();
        // 로또숫자 담을 배열 선언
        int[] numbers=new int[0];
        while(ArrayUtil.size(numbers)<SIZE) {
            int randomNumber = random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
            
            if(!ArrayUtil.contains(numbers, randomNumber)) {
                numbers=ArrayUtil.add(numbers, randomNumber);
            }
        }
        
        for(int i=0;i<ArrayUtil.size(numbers)-1;i++) {
            if(ArrayUtil.get(numbers, i)>ArrayUtil.get(numbers, i+1)) {
                int temp=ArrayUtil.set(numbers, i, ArrayUtil.get(numbers,i+1));
                ArrayUtil.set(numbers, i+1, temp);
                i=-1;
            }
        }
        for(int i=0;i<ArrayUtil.size(numbers);i++) {
            System.out.println(ArrayUtil.get(numbers,i));
        }
    }

}
