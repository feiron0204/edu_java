package day1014;
// if 조건문

// if 조건문은 우리가 조건문이 필요할 때 가장 많이 쓰이는 조건문으로써
// 특정 조건식이 true가 나오면
// 연결된 코드 블락이 실행된다.
// 만약 false가 나오면
// 해당 코드 블락은 실행되지 않는다.

// if 조건문은 다음과 같은 구조를 가진다.

// if(조건식){
//
//     조건식이 참일때 실행할 코드
//
// }
public class Ex06If {
    public static void main(String[] args) {
        // int 변수 num을 선언하고 5를 저장해보자
        int num = 5;

        if (num >= 0) {

            System.out.println("if문 시작");

            System.out.println("num의 현재 값: " + num);
            System.out.println("num은 0 이상입니다.");

            System.out.println("if문 종료.");

        }

        System.out.println("프로그램 종료");

    }

}
