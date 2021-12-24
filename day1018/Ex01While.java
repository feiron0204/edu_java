package day1018;
// 반복문 01
// while 반복문

// while 반복문의 경우, 특정 조건식을 체크하여
// true가 나오면 while의 코드 블락전체를 실행하고
// 다시 조건식을 체크한다.
// 조건식이 false가 나오면, 반복이 종료된다.

// while 반복문의 구조
// while(조건식){
//    조건식이 참이면 실행할 코드
// }

public class Ex01While {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        
        int num = 1;
        
        while(num <6) {
            System.out.println(num);
            num++;
            switch(num) {
            case 3:
                break;
                
            }
        
        }
    }
}
