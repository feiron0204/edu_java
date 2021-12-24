package day1013;
// 할당 연산자(Assignment Operator)
// 할당 연산자란 오른쪽 값을 연산 후 결과값을 왼쪽 공간에 저장하는 연산자이다.

// =, +=, -=, *=, /=, %=
public class Ex07Operator02 {
    public static void main(String[] args) {
        // int 변수 num을 선언
        int num;
        
        // 1. =
        //    오른쪽 값을 왼쪽 공간에 그대로 저장해라
        num = 6;
        System.out.println("num의 현재 값: " +num);
        
        // 2. +=
        //    안족 공간의 현재 값에 오른쪽 값을 더한
        //    결과값을 다시 왼쪽 공간에 저장해라
        num += 3;
        System.out.println("num의 현재 값: "+ num);
        
        // 3. -=
        //    안족 공간의 현재 값에 오른쪽 값을 뺀
        //    결과값을 다시 왼쪽 공간에 저장해라
        num -= 4;
        System.out.println("num의 현재 값: "+ num);
        
        // 4. *=
        //    안족 공간의 현재 값에 오른쪽 값을 곱한
        //    결과값을 다시 왼쪽 공간에 저장해라
        num *= 3;
        System.out.println("num의 현재 값: "+ num);
        
        // 5. /=
        //    안족 공간의 현재 값에 오른쪽 값을 나눈 
        //    몫을 다시 왼쪽 공간에 저장해라
        num /= 6;
        System.out.println("num의 현재 값: "+ num);
        
        // 6. %=
        //    안족 공간의 현재 값에 오른쪽 값을 나눈
        //    나머지값을 다시 왼쪽 공간에 저장해라
        num %= 7;
        System.out.println("num의 현재 값: "+ num);

        // 7. String에 대한 +=연산자
        String str = "a";
        str +="1";
        str +=12;
        str +=12.3;

        System.out.println("str의 현재 값: "+ str);
        
        
        
    }

}
