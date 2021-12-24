package day1109;

import java.util.Calendar;

// Calendar 클래스

// Calendar 클래스는 대표적인 추상클래스로써,
// 기본적으로 우리는 그레고리안 달력을 사용하게 된다.

// 만약 여러분들이 더이상 사용되지 않지만 그레고리안 달력의 원형이 되는
// 율리우스 달력을 사용하고 싶다면 사용이 가능하다.

public class Ex03Calendar {
    public static void main(String[] args) {
        // Calendar 클래스 객체를 초기화하는방법은
        // Calendar 클래스의 스태틱 메소드인 getInstance()를 사용하여
        // 현재시간으로 초기화하게 된다.
        /*
         * 이케안함
         */
//        Calendar cal = new Calendar();
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);
        
        // Calendar객체에 시간을 세팅하는 방법은 크게 몇 가지가 있다.
        // 1. 특정 필드에 값 넣기
//        cal.set(Calendar.HOUR, 22);
        System.out.println(cal);
        // 2. 연 월 일 고정시키기
        cal.set(1999,9,8);
        System.out.println(cal);
        // 3. 연 월 일 시 분 고정시키기
        cal.set(1999, 9, 8, 10, 24);
        System.out.println(cal);
        // 4. 연 월 일 시 분 초 고정시키기
        cal.set(1999,11,31,23, 24,35);
        System.out.println(cal);
        
    }
}
