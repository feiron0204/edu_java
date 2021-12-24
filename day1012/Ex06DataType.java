package day1012;
// 자료형(Data Type)
// 자료형이란, 해당 변수 혹은 상수 공간에
// 어떤 종류의 값이 저장될 수 있는지를 명시하는 것이다.

// 자료형에는 크게 기본형 데이터타입과 참조형 데이터타입이 있다.

// 기본형(Primitive types)
// 기본형 데이터타입은 해당 공간에 2진법으로 변환된 값이 직접 저장되는 형태이다.
// 기본형 데이터타입은 크게 정수형, 실수형, 논리형, 문자형 4가지 종류가 존재한다.

// 참조형(Reference types)
// 참조형 데이터타입은 해당 공간에 주소값이 저장되고 그 저장된 주소값을 "참조"해야 실제 값을 확인할 수 있는 자료형이다.
// 참조형 데이터타입에는 크게 클래스형, 배열형, 인터페이스형 3가지 데이터타입이 존재한다.

/* 자바의 메모리는 3가지 영역이 존재함
 * stack  : 변수의 이름과 값이 저장
 *          ex) int number = 50;
 *             number라는 int공간이 생기고 50이 이진법으로 들어감.
 *             70을 다시 저장하면 50을 지워버리고 70을 이진법으로 다시 넣음
 * heap   : 참조형 데이터 전용공간
 *          ex) num이라는 공간에 80을 넣고싶다?
 *             80을 이진법으로 넣는게아니라 주소값이 들어감(ex)0x00BB[16진법])
 *             그리고 heap에 0x00BB공간에 80이 들어감
 *             그 주소가 확보가 안되있으면 null
 * method : 실행할 코드가 등록됨
 */


public class Ex06DataType {
    public static void main(String[] args) {
        
    }

}