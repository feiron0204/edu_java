package day1109;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 시간 출력 양식을 지정하거나
// 스트링을 시간으로 바꿀 때 사요되는
// DateFormat
public class Ex04DateFormat {
    public static void main(String[] args) throws ParseException {
        Calendar cal=Calendar.getInstance();
        
        // 우리가 DateFormat 클래스를 상속받는
        // SimpleDateFormat 객체를 만들어서
        // 어떻게 시간이 표시가 될지를 지정해준다.
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
        
        // 한가지 주의할점은, SimpleDataFormat객체를 사용해서
        // 날짜를 형식에맞추어 출력할때에는
        // 우리가 format() 이라는 메소드를 써야하는데
        // format의 파라미터는 반드시 1/1000초를 넣어주어야 한다.
        // 즉, Calendar 객체의 getTime()멧드의 결과값을 파라미터로 넣어주어야한다!
        System.out.println(sdf.format(cal.getTime()));
        
        // sdf를 사용하여 스트링을 Date 객체로 바꿔보자
        sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        String str = new String("1999년 12월 30일 22시 16분 27초");
        Date d= sdf.parse(str);
        /*
         * Date 객체를 이용한 Calendar 초기화 -> setTime()메소드
         */
        cal.setTime(d);
        
        sdf = new SimpleDateFormat("y-M-d H:m:s");
        System.out.println(sdf.format(cal.getTime()));
        
        // 만약 범위를 벗어난 형태를 가진 String을 입력했을 경우
        // parse를 아예 실행 시키지 않고 에러를 발생하고 싶다면
        // SimpleDateFormat 객체의 lenientMode를 false로 바꿔준다.
        sdf.setLenient(true);
        
        str=new String("1999-21-21 21:21:21.111");
        cal.setTime(sdf.parse(str));
        
        System.out.println(sdf.format(cal.getTime()));
    }
}
