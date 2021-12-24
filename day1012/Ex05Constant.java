package day1012;
// 상수(Constant)
// 상수란, 한번 값이 저장되면 더이상 새로운 값을 저장할 수 없는 공간을
// 상수라고 한다.

// 상수는 다음과 같이 선언한다.
// final 데이터타입 상수이름;

// 변수와 마찬가지로, 상수 공간을 사용하기 위해선
// 값을 초기화해야한다.
// 상수이름 = 값;

// 단, 상수는 한번 값을 초기화한 후에는
// 새로운 값을 저장할 수 없다.

public class Ex05Constant {
    public static void main(String[] args) {
        // int 상수 NUMBER를 선언해보자 
        final int NUMBER;
        
        // NUMBER에 20을 저장해보자
        NUMBER = 20;
        
        // 화면에 NUMBER에 저장된 값을 출력해보자
        System.out.println(NUMBER);
        
        // NUMBER에 새로운 값 30을 저장해보자
        /*
         NUMBER = 30;
         상수는 변하면 안되므로 오류남
         */
        
        // 다시 20저장하는건?
        /*
         NUMBER = 20;
         어림도없지 ㅎ
         */
    }
    
}
