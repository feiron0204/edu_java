package day1012;
// 변수(Variable)
// 변수란?
// 해당 공간에 저장된 값이 바뀔 수 있는 공간

// 변수의 경우, 우리가 선언과 초기화 라는 단계를 거쳐야만 사용 가능하다.
// 선언(Declaration)
// 변수의 선언이란, 해당 변수의 이름이 무엇이고 그리고 그 변수 공간에 저장될 수 있는 값의 종류가 무엇인지를
// 등록하는 과정을 변수의 선언이라고 한다.
// 변수의 선언은 다음과 같이 이루어진다.
// 데이터타입 변수이름;

// 초기화(Initialization)
// 변수를 선언한 후에는 반드시 우리가 한번은 그 공간에 알맞는 값을 저장해야 비로소 사용가능한 상태가 된다.
// 변수의 초기화는 다음과 같이 이루어진다.
// 변수이름 = 값;

public class Ex04Variable {
    public static void main(String[] args) {
        // int 타입의 변수 number를 선언해보자
        int number;
        
        // number를 5로 초기화해보자(=number에 5를 저장해보자)
        number = 5;
        
        // 화면에 number에 현재 저장된 값을 출력해라
        System.out.println(number);
        
        // number에 새로운 값 20을 저장해보자
        number = 20;
        
        // 화면에 number에 현재 저장된 값을 출력해라
        System.out.println(number);
        /*
        int number;
        
        number = 7;
        선언불가함
        */
        
        // 변수의 선언과 초기화는 다음과 같이 한줄로 적어줄 수도 있다.
        
        // int 공간 number2를 만들고 30을 저장하라
        int number2 = 30;
        
        // 화면에 number2에 현재 저장된 값을 출력해라.
        System.out.println(number2);
    }

}
