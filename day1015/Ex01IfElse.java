package day1015;
// if 조건문 02
// if - else 조건문

// if -else 조건문이란,
// 만약 if 문의 조건식이 false가 나왔을 경우,
// 실행해야할 코드가 있을 때에는
// else를 사용하여
// else 코드 블락에 해당 코드 블락을 만들어주게 된다.
// 이때에는 if 조건식이 true가 나오면
// if 코드블락이 실행되고,
// false가 나오면
// 무조건 else 코드 블락이 실행된다.

// if - else 구조는 다음과 같이 이루어져 있다.

// if(조건식){
//
//    조건식이 참일때 실행할 코드
//
//} else {
//
//    조건식이 거짓일때 실행할 코드
//
//}

/*
 * else 별개로 존재할 수 없다.
 */
public class Ex01IfElse {
    public static void main(String[] args) {
        
        int num = -3;
        
        if(num>0) {
            System.out.println("num은 양의 정수입니다.");
        }else {
            System.out.println("num은 양의 정수가 아닙니다.");
        }
        
        String name;
        
        if (num>0) {
            name ="이성호";
        }else {
            name ="이성호아님";
        }
        
        System.out.println(name);
        /*
         * else가 없어서 else 에서 name 초기화를 안해주면 실행이안됨
         * 왜냐면 if가 false가 나올경우 초기화가 안되기 때문
         */
        System.out.println("프로그램 종료.");
    }

}
