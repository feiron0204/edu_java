package day1019;
// for 반복문

// 횟수에 제한받지 않던 while 반복문과는 다르게
// for 반복문은 비교적 횟수에 제한적인 반복문이다.

// for 문은 다음과 같은 구조를 가진다.
// for(제어 변수의 선언과 초기화; 반복 조건식; 제어변수의 변화식) {
//    반복할 코드
// }

// 제어 변수: 정수형 데이터타입의 변수로써, 중첩레벨에 따라 i, j, k... 순으로 들어간다.
// 반복 조건식: true이면 코드를 실행하고, false이면 코드를 실행하지 않는다.
// 제어변수의 변화식: 해당 for 문의 반복할 코드가 모두 종료되고 나서 실행된다.

public class Ex01For {
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {

            System.out.println("i의 현재 값: " + i);

        }
        // 위 for 문은 다음과 같은 실행순서를 가진다.
        // 1. int i = 1;이 실행되서 int 변수 i 가 선언되고 1로 초기화된다.
        // 2. i<= 4; 조건식을 실행한다.
        // 현재 i의 값이 1이므로 i<=4의 결과값은 true가 나온다.
        // 3. i <= 4조건식의 결과값이 true이므로
        // System.out.println("i의 현재 값: " +i) 가 실행ㄷ된다.
        // i가 현재1이므로 화면에는 "i의 현재 값: 1"이 출력된다.
        // 4. 더이상 반복할 코드가 없으므로, i++이 실행된다.
        // 따라서 i는 2가된다.
        // 5. i<= 4; 조건식을 실행한다.
        // 현재 i의 값이 2이므로 i<=4의 결과값은 true가 나온다.
        // 6. i <= 4조건식의 결과값이 true이므로
        // System.out.println("i의 현재 값: " +i) 가 실행ㄷ된다.
        // i가 현재2이므로 화면에는 "i의 현재 값: 2"이 출력된다.
        // 7. 더이상 반복할 코드가 없으므로, i++이 실행된다.
        // 따라서 i는 3가된다.
        // 8. i<= 4; 조건식을 실행한다.
        // 현재 i의 값이 3이므로 i<=4의 결과값은 true가 나온다.
        // 9. i <= 4조건식의 결과값이 true이므로
        // System.out.println("i의 현재 값: " +i) 가 실행ㄷ된다.
        // i가 현재3이므로 화면에는 "i의 현재 값: 3"이 출력된다.
        // 10. 더이상 반복할 코드가 없으므로, i++이 실행된다.
        // 따라서 i는 4가된다.
        // 11. i<= 4; 조건식을 실행한다.
        // 현재 i의 값이 4이므로 i<=4의 결과값은 true가 나온다.
        // 12. i <= 4조건식의 결과값이 true이므로
        // System.out.println("i의 현재 값: " +i) 가 실행ㄷ된다.
        // i가 현재4이므로 화면에는 "i의 현재 값: 4"이 출력된다.
        // 13. 더이상 반복할 코드가 없으므로, i++이 실행된다.
        // 따라서 i는 5가된다.
        // 14. i<= 4; 조건식을 실행한다.
        // 현재 i의 값이 4이므로 i<=4의 결과값은 false가 나온다.
        // 조건식이 false가 나왔으므로 for 반복문이 종료된다.

        // for 문에 대한 팁들
        // 1. 전통적으로 제어변수의 이름은 i, 중첩한번되면 j, 그안은 k...순으로 들어가지만
        // 여러분들이 원하는 이름으로 변수의 이름을 지어주더라도 상관없다.
        System.out.println("\n----------------------------");
        System.out.println("1. 다름이름의 for문");
        System.out.println("----------------------------\n");
        for (int num = 1; num <= 3; num++) {
            System.out.println("num의 현재 값: " + num);

        }
        // 2. 필요에 따라서는 제어변수의 변화식이 ++이 아니라 다른 할당 연산자가 나오더라도 무방하다.
        System.out.println("\n----------------------------");
        System.out.println("2. 다른 할당연산자");
        System.out.println("----------------------------\n");
        
        for (int num = 1; num <= 100000; num *= 100) {
            System.out.println("num의 현재 값: " + num);
        }

        // 3. 제어변수의 초기화식이나, 조건식에는 다른 변수를 사용할 수도 있다.
        System.out.println("\n----------------------------");
        System.out.println("3. 다른 변수쓰기");
        System.out.println("----------------------------\n");

        int num1 = 8;
        int num2 = 11;
        for (int i = num1; i <= num2; i++) {
            System.out.println("i의 현재 값: " + i);
        }

        // 4. 만약 맨 처음부터 조건식이 false가 나오면?
        // 아예 for문은 실행되지 않는다.
        System.out.println("\n----------------------------");
        System.out.println("4. 처음부터 false가 나오는 조건식");
        System.out.println("----------------------------\n");
        
        for(int i =1; i<0;i++) {
            System.out.println("i의 현재 값: "+i);
        }
        // 여기서부터는 가능한 방법이지만 절대로 권장되지 않는다.
        
        // 5. 제어변수의 선언, 초기화식은 바깥으로 뺄 수 있다.
        System.out.println("\n----------------------------");
        System.out.println("5. 분리된 제어변수의 선언과 초기화");
        System.out.println("----------------------------\n");
        
        int myNum = 4;
        
        // 단, 제어변수의 선언과 초기화를 밖으로 뺄 경우에도
        //  for문의() 안에는 ;가 정확히 2번 들어가야 한다.
        for(; myNum<=7;myNum++) {
            System.out.println("myNum의 현재 값: "+myNum);
        }
        
        // 6. for문을 사용하여 무한 루프를 만들 수 있다.
        //    이때는 2가지 방법이 있따.
        //    첫번째는 조건식을 항상 참이 나오게 만드는 것이고
        //    두번째는 아예 for문의 ()안에 ;을 제외하곤 아무것도 넣지 않는 것이다.
//        for(;;) {
//            System.out.println("무한 루프");
//        }
        // 7. 여러분들이 주로 하는 실수중에 다음과 같은 실수가 있다.
//        for(int i= 1; 1<=4; i++) {
//            System.out.println("i의 현재 값: "+i);
//        }
    }
}
