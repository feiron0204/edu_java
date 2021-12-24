package day1015;
// if 조건문 03

// if - else if 구조

// if - else if 구조에서는
// 첫번째 조건식이 false가 나왔을때
// 다시 다른조건식으로 결과를 체크해야할 때에
// 사용이된다.

// if - else if 구조는 다음과 같다.
// if( 조건식 1 ){
//     조건식1이 참일때 실행할 코드
// } else if( 조건식2 ) {
//     조건식2가 참일때 실행할 코드
// }

// 필요에 따라선, else if 가 여러개가 나올 수도 있고
// 맨 마지막에 else를 붙여줄 수도 있다.

// 단, if - else 구조와 마찬가지로
// if - else if 구조에서도 오직 한개의 코드 블락이 실행된다.
// 그렇기 때문에 , 만약 else 까지 사용하는 경우에는
// else 이후에 else if 는 올수 없다.
public class Ex03IfElseIf {
    public static void main(String[] args) {
        int age = 3;
/*
 * 이건 else if 가 아니라는뎅..?
 * 
        if (age <= 5) {
            System.out.println("영유아입니다.");
        } else {
            if (age <= 13) {
                System.out.println("어린이입니다.");
            } else {
                if (age <= 18) {
                    System.out.println("청소년입니다.");
                } else {
                    System.out.println("성인입니다.");
                }
            }
        }
*/
        if (age <= 5) {
            System.out.println("영유아입니다.");
        } else if (age <= 13) {
            System.out.println("어린이입니다.");
        } else if (age <= 18) {
            System.out.println("청소년입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }

}
