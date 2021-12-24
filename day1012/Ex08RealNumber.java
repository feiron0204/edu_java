package day1012;
// 기본형 데이터타입 02
// 실수형 데이터타입

// 실수형 데이터타입에는 double과 float 두가지 데이터타입이 존재한다.
// float : 32비트
// double : 64비트
// 자바는 코드안의 실수를 기본적으로 double로 인식한다.

public class Ex08RealNumber {
    public static void main(String[] args) {
        // double 데이터타입의 변수 myDouble을 만들고 3.14를 저장해보자
        double myDouble = 3.14 ;
        
        // 화면에 myDouble에 저장된 값을 출력해보자
        System.out.println(myDouble);
        
        // myDouble에 20을 저장해보자
        myDouble = 20 ;
        
        // 화면에 myDouble에 저장된 값을 출력해보자
        System.out.println(myDouble);
        
    }

}
