package day1015;
// 중첩 If문
// 제어문들은 중첩하여 사용할 수도 있는데
// if문의 경우 하나의 커다란 if문 안에 또 다른 if 문이 들어가있는 ㅎ여태가 된다.

// 중첩 if 문은 주로
// 한개의 조건을 체크하고
// 코드들을 실행하고
// 그 안에서 다른 조건을 체크해야할 경우에 사용하게 된다.


public class Ex06NestedIf {
    public static void main(String[] args) {
        int num = 40;
        
        if(num > 0 ) {
            // num에 현재 저장된 값이 0 초과, 즉 양의 정수이다.
            
            if(num>=10 && num<=99) {
                System.out.println("num은 두자리 양의 정수입니다.");
            }else {
                System.out.println("num은 두자리 양의 정수가 아닙니다.");
            }
        }else {
            // num에 현재 저장된 값이 0 이하, 즉 양의 정수가 아니다.
            System.out.println("양의 정수가 아닙니다.");
            
            if(num==0) {
                System.out.println("num은 0입니다.");
            }else {
                System.out.println("num은 음의 정수입니다.");
            }
            
        }
    }

}
