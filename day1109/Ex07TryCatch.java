package day1109;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 예외처리 (Exception Handling)
// 우리가 자바에서 다양한 메소드를 사용하면서
// 당연히 다양한 Exception을 보게 될 것이다.
// Exception의 경우, NullPointer와 같이
// 코드의 진행함에 문제가 있어서 발생되는 Exception도 있지만
// parse와 같은 특정 메소드는 그 메소드 자체가 특정 Exception이 발생할 수 있다고
// 미리 알려준다.
// 우리는 그러한 Exception을 어떻게 처리해줄지 방법을 항상 고민해봐야한다.

// Exception을 처리할 때 우리는 2가지 방법으로 처리가 가능하다.
// 1. 우리는 아무런 처리를 하지 않고 그냥 에러를 그대로 발생시킨다.
/*
 * 뒤에 throws ParseException 의 의미: 
 * java:저기...이거 에러잘난데..확인해줘
 * 사용자: 'ㅇㅋ확인' ->확인만함 형식다르게에러나면 걍 강제종료
 */
// 2. Exception 될만한거 트라이(try)!
//    에러캐치(catch)됨? 그럼 요거해봐
//    시도랑 캐치했으면 마지막으로(finally)이건꼭해

/*
 * Ex04랑 같은거임
 */
public class Ex07TryCatch {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
        
        System.out.println(sdf.format(cal.getTime()));
        
        sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        String str = new String("1999년 12월 30일 22시 16 27초");
        try {
            Date d= sdf.parse(str);
            cal.setTime(d);
        }catch(ParseException e){
            System.out.println("ParseException이 발생하여, str을 Date로 바꾸는 parsing을 하지 않습니다.");
        }
        
        
        sdf = new SimpleDateFormat("y-M-d H:m:s");
        System.out.println(sdf.format(cal.getTime()));
        sdf.setLenient(false);
        
        str=new String("1999-21-21 21:21:21");
        try {
            cal.setTime(sdf.parse(str));
        }catch(ParseException e) {
            /*
             * 경고문구 출력하게하기 
             */
//            e.printStackTrace();
            
            System.out.println("ParseException이 발생하여, str을 Date로 바꾸는 parsing을 하지 않습니다.");
        }finally {
            // finally 코드 블락은
            // try에서 익셉션이 발생했던 안했던 무조껀 실행되는 코드를 적어주면 된다.
            System.out.println(sdf.format(cal.getTime()));
        }
        
        
    }
}
