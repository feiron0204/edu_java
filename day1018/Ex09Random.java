package day1018;
// Random 클래스
// Random 클래스는 우리가 무작위의 숫자(=나오는 규칙 혹은 패턴이 없는 숫자)가 필요할 때
// 사용하는 클래스로써, Scanner와 마찬가지로
// java.util에 있는 클래스를 import하여 사용해야한다.
import java.util.Random;
public class Ex09Random {
    public static void main(String[] args) {
        Random random=new Random();
        
        // 1. 0 이상 1미만의 랜덤한 실수가 필요할 때에는?
        //    nextDouble()을 사용하면 된다.
        System.out.println(random.nextDouble());
        
        // 2. int 범위 안의 랜덤한 정수가 필요할 때에는?
        //    nextInt()를 사용하면 된다.

        System.out.println(random.nextInt());
       
        // 3. 0~19 안의 랜덤한 정수가 필요할 때에는?
        //    nextInt(20)을 사용하면 된다.
        //    즉, nextInt()의 ()안에 우리가 특정 int 값을 넣으면
        //    0보다 그 값 -1 까지의 랜덤한 숫자가 나오게 된다.
        System.out.println(random.nextInt(20));
        
        // 4. 만약 0~19가 아닌 1~20 사이의 랜덤한 정수가 필요하다면?
        //    nextInt(20) +1 을 해주면 된다.
        //    nextInt(20) 에서 0이나오면 +1 되서 1이될것이고
        //    1이 나오면 +1 되서 2가 될것이고
        //    2 .....
        //    19가 나오면 20이 되기 때문.
        
    }

}
