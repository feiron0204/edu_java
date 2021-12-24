package day1109;

import java.util.Date;

// 시간을 나타내는 클래스 01
// java.util.Date;

// java.util.Date는 1970년 1월 1일 그리니치 표준시 기준으로 혛ㄴ재까지의 시간을
// 1/1000초로 나타낸다.
public class Ex02Date {
    public static void main(String[] args) {
        /*
         * Ctrl+space 해서 위에자동추가할때 'sql' 이 아니라'util'추가해야됨 
         */
        Date d=new Date();
        System.out.println(d);
        
        // Date 객체에 우리가 특정 년도, 월, 일, 시, 분, 초 를 저장하고 싶을 때에는
        // 각각의 set()을 호출해주면 된다.
        /*
         * 취소선의의미 = 구식방법이다라는뜻
         */
        /*
         * 
         */
        d.setYear(99);
        System.out.println(d);
        d.setMonth(5);
        System.out.println(d);
        d.setMinutes(9);
        System.out.println(d);
        d.setHours(24);
        System.out.println(d);
        while(d.getSeconds()!=0) {
            
        }
        System.out.println(d);
    }
}
