package day1025;
// 전역변수(Global Variable)
// 전역변수란, 해당 프로그램 전역에서 접근 가능한 변수를 전역변수라고 한다.

// 전역 변수의 장점: 모든 메소드가 해당 변수를 사용할 수 있다.
// 전역 변수의 단점: 모든 메소드가 해당 변수를 사용할 수 있다.
public class Ex04GlobalVar {
    public static int id= 1;
    public static void main(String[] args) {
        System.out.println("id의 현재 값: "+id);
        increase();
        System.out.println("id의 현재 값: "+id);
    }
    
    public static void increase() {
        id++;
    }
}
