package day1015;
// 조건문 02

// switch 조건문

// switch 조건문은,
// 값이 명확하게 나뉘는 정수형 혹은 문자형의 데이터타입 공간 혹은 결과값을 사용하여
// 각각의 값에 대한 코드 처리를 하게 된다.

// switch문은 다음과 같은 형태를 가진다.
// switch( 값이 변할 수 있는 공간 or 결과){
//    case 값1:
//        괄호 안의 결과값이 값1일때 실행할 코드
//        break;
//    case 값2:
//        괄호 안의 결과값이 값2일때 실행할 코드
//        break;
//      ...
//    default:
//        괄호 안의 결과값이 한번도 안나올 경우 실행할 코드
//        break;
// }

public class Ex10Switch {
    public static void main(String[] args) {
        int num = 2;
/*
 * if는 같은 조건문으로 if, else if 중첩 if 다 가능하지만
 * switch는 같은 case 불가함.
 */
        // switch는 case를 통해서 일치하는 결과가 있을 때
        // 코드가 실행되기 때문에,
        // 넓은 범위의 조건을 처리할 때에는 부적합하다.
        // 우리가 프로그램을 만들 때
        // 매우 좁은 범위의 조건을 처리하는 일은 극히 드물기 때문에
        // switch문을 결국에는 잘 사용하지 않는다.
        switch (num) {
        case 1:
            System.out.println("num은 1입니다.");
            break;
        case 2:
            System.out.println("num은 2입니다.");
            break;
        case 3:
            System.out.println("num은 3입니다.");
            break;
        default:
            System.out.println("num은 그외의 숫자입니다.");
            break;

        }

        // break 키워드
        // break 키워드는 실행되는 순간
        // 그 break가 속해있는 switch문 혹은 반복문을 곧장 종료시킨다.
        
    }

}
