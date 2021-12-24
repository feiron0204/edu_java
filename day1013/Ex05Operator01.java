package day1013;
// 연산자(Operator)
// 연산자란 수학적 기호에 프로그래밍 기능이 정의되어있어서,
// 특정 수학기호를 코드에 적어주면, 미리 설정된 기능이 실행되는 특수한 수학기호들을
// 우리가 연산자라고 부른다.

// 연산자에는 크게
// 산술(Arithmetic)
// 할당(Assignment)
// 비교(Relational)
// 논리(Logical)
// 비트(Bitwise) -> 2진법 관련 연산임 속도가 중요할때 씀
// 5가지 연산자가 있다.

// 산술연산자는 2개의 값 혹은 1개의 값에 대한 산술적(=단순 수학적) 연산을 실행한다.
// +, -, *, /, %, ++, -- 7종류가 있다.
// +: 앞의 값과 뒤의 값을 더한 결과 값을 연산한다.
// -: 앞의 값과 뒤의 값을 뺀 결과 값을 연산한다.
// *: 앞의 값과 뒤의 값을 곱한 결과 값을 연산한다.
// /: 앞의 값과 뒤의 값을 나눈 "몫"을 연산한다.
// %: 앞의 값과 뒤의 값을 나눈 "나머지"를 연산한다.
// ++: 해당 연산자와 연결된 변수의 값을 1 증가시킨다.
// --: 해당 연산자와 연결된 변수의 값을 1 감소시킨다.

// 정수끼리의 산술연산의 결과 값은 int 데이터타입이 된다.
// 정수와 실수의 산술연산의 결과 값은 double 데이터타입이 된다.
// 또한, String 값 혹은 변수에 대한 + 연산이 가능하다.
public class Ex05Operator01 {
    public static void main(String[] args) {
        System.out.println("1. 정수끼리의 산술연산");
        // int 변수 2개를 선언해보자
        int num1, num2;
        // num1에 7을 저장해보자
        num1 = 7;
        // num2에 5를 저장해보자
        num2 = 5;
        
        // A. +
        //     num1의 현재 저장된 값과 num2의 현재 저장된 값을 더한 결과값을 화면에 출력해라
        System.out.println("A. +");
        System.out.println(num1 + num2);
        
        // B. -
        //     num1의 현재 저장된 값과 num2의 현재 저장된 값을 뺀 결과값을 화면에 출력해라
        System.out.println("B. -");
        System.out.println(num1 - num2);
        
        // C. *
        //     num1의 현재 저장된 값과 num2의 현재 저장된 값을 곱한 결과값을 화면에 출력해라
        System.out.println("C. *");
        System.out.println(num1 * num2);
        
        // D. /
        //     num1의 현재 저장된 값과 num2의 현재 저장된 값을 나눈"몫"을 화면에 출력해라
        System.out.println("D. /");
        System.out.println(num1 / num2);
        
        // E. %
        //     num1의 현재 저장된 값과 num2의 현재 저장된 값을 나눈"나머지"을 화면에 출력해라
        System.out.println("E. %");
        System.out.println(num1 % num2);
        System.out.println("---------------------------");
        
        System.out.println("2. 실수끼리의 산술연산");
        // double 변수 2개를 선언해보자
        double myDouble1, myDouble2;
        // myDouble1에 7을 저장해보자
        myDouble1 = 7.0;
        // num2에 5를 저장해보자
        myDouble2 = 5.0;
        
        System.out.println("A. +");
        System.out.println(myDouble1 + myDouble2);
        
        System.out.println("B. -");
        System.out.println(myDouble1 - myDouble2);
        
        System.out.println("C. *");
        System.out.println(myDouble1 * myDouble2);;
        
        System.out.println("D. /");
        System.out.println(myDouble1 / myDouble2);
        
        System.out.println("E. %");
        System.out.println(myDouble1 % myDouble2);
        System.out.println("---------------------------");
        
        System.out.println("3. 정수와 실수의 산술연산");
   
        System.out.println("A. +");
        System.out.println(num1 + myDouble2);
        
        System.out.println("B. -");
        System.out.println(num1 - myDouble2);
        
        System.out.println("C. *");
        System.out.println(num1 * myDouble2);;
        
        System.out.println("D. /");
        System.out.println(num1 / myDouble2);
        
        System.out.println("E. %");
        System.out.println(num1 % myDouble2);
        System.out.println("---------------------------");
        
        System.out.println("4. String에 대한 더하기 연산");
        // String 변수 myStr을 선언하고 "가나다라"를 저장한다.
        String myStr = "가나다라";
        // String 값과 다른 String값 혹은 다른 데이터 타입의 값을 더하는 연산의 경우,
        // 2개를 "문자로써" 이어붙여서 하나의 커다란 String 값을 만들어달란 의미가 된다.
        System.out.println("A. String + String");
        System.out.println(myStr + "123");
        
        System.out.println("B. String + int");
        System.out.println(myStr + 123);
        
        System.out.println("C. double + String");
        System.out.println(myDouble1 + myStr);
        
        System.out.println("D. int + double / int + string");
        System.out.println(num1 + myDouble2 / num2 + myStr);
        
        System.out.println("---------------------------");
        
        System.out.println("5. ++, --");
        // ++, --는 증가(감소)연산자로써, 해당 공간의 값을 1씩 증가시키거나 감소시킨다.
        // 단 해당 연산자가 변수의 앞에 붙나, 뒤에 붙나에 따라서 의미가 달라진다.
        // 연산자가 변수의 앞에 붙을때에는
        // 전위 증가(감소)연산자라고 하며, 해당 줄에서 우선순위가 가장 높은 그룹에 속한다.
        // 연산자가 변수의 뒤에 붙을때에는
        // 후위 증가(감소)연산자라고 하며, 해당 줄에서 우선순위가 가장 낮은 그룹에 속한다.
        System.out.println("A. 전위증가연산자");
        // num1의 현재값을 화면에 출력해라
        System.out.println("num1의 현재 값: "+num1);
        System.out.println("++num1: " + ++num1);
        // 위의 System.out.println("++num1: " + ++num1);은 비록 한줄로 이루어진 코드지만
        // 실제로는 다음과 같은 과정을 거친다.
        // 1. ++num1이 실행되서 num1의 현재 값이 1 증가되어 8이된다.
        // 2. "++num1: " + num1 이 실행되어
        //    "++num1: " 뒤에 num1의 현재 값인 8이 이어져서
        //    "++num1: 8" 이라는 스트링 값이 만들어진다.
        // 3. System.out.println()이 실행되어
        //    화면에 "++num1: 8"이 출력된다.
        
        System.out.println("num2의 현재 값: " + num1);
        
        System.out.println("B. 후위증가연산자");
        System.out.println("num2의 현재 값: "+num2);
        System.out.println("num2++: " + num2++);
        // 위의 System.out.println("num1++: " + num2++);은 비록 한줄로 이루어진 코드지만
        // 실제로는 다음과 같은 과정을 거친다.
        // 1. "num2++: " + num2 이 실행되어
        //    "num2++: " 뒤에 num2의 현재 값인 5가 이어져서
        //    "num2++: 5" 이라는 스트링 값이 만들어진다.
        // 2. System.out.println()이 실행되어
        //    화면에 "num2++: 5"이 출력된다.
        // 3. num2++이 실행되서 num2의 현재 값이 1 증가되어 6이된다.
        
        System.out.println("num2의 현재 값: " + num2);
        System.out.println("---------------------------");
    }

}
