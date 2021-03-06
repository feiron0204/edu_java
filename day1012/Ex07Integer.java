package day1012;
// 기본형 데이터타입 01
// 정수형 데이터타입

// 정수란, 소숫점이 존재하지 않는 온전한 숫자를 정수라고 한다.
// 정수형 기본 데이터타입에는
// byte, short, int, long 4가지 데이터타입이 존재한다.
// byte: 8비트 -> -2의 7승부터 2의 7승-1까지 총 256(=2의 8승)개의 숫자를 저장 가능
// short: 16비트 -> -2의 15승부터 2의 15승-1까지 총 2의 16승개의 숫자를 저장 가능
// int: 32비트 -> -2의 31승부터 2의 31승-1까지 총 2의 32승개의 숫자를 저장 가능
// long: 64비트 -> -2의 63승부터 2의 63승-1까지 총 2의 64승개의 숫자를 저장 가능

/*
 * byte 기준 맨앞은 부호를결정
 * 0 : +
 * 1 : -
 * 0000 0000 = 0
 * 0111 1111 = 127
 * 1000 0000 = -128
 * 1111 1111 = -1
 * 
 * 127 +1 => -128 overflow
 * -128 -1 => 127 underflow
 */

// 비트란?
// 2진법 자릿수를 뜻한다.


public class Ex07Integer {
    public static void main(String[] args) {
        // byte 변수 myByte를 선언해보자
        byte myByte;
        
        // myByte에 40을 저장해보자
        myByte = 40;
        
        // 화면에 mybyte에 저장된 값을 출력해보자.
        System.out.println(myByte);
        
        /*
        myByte = 200;
        200은 Byte 범위 밖의 숫자이므로 불가능
         */
        
        // 자바 내부에서는 소스코드에 적혀있는 정수를 기본적으로 int 타입으로 인식한다.
        // 예전처럼 리소스가 매우 제한적인 상황이면 모를까,
        // 이제는 리소스가 제한적이지 않다.
        // 따라서 우리가 정수가 필요하면 기본적으로 int 데이터타입의 변수로 만들어주되
        // 만약 +- 20억을 벗어나는 경우에는 long 데이터타입을 사용하면 된다.
    }

}
