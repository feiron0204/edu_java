package day1025;
// Call by Value vs Call By Reference

// 우리가 메소드에 파라미터로 무언가를 적어주면
// 실제로 넘어가는 값은 무엇이 될까?

// 만약 파라미터가 기본형 데이터타입일 경우,
// 실제로 넘어오는 것은 원본이 아닌 복사된 실제 값이 넘어온다.
// 즉, 값이 호출되서 넘어오므로  call by value가 발생한다.

// 만약 파라미터가 참조형 데이터타입일 경우,
// 해당 공간에 저장된 주소값이 넘어오게 된다.
// 즉, 참조값이 넘어오므로 call by reference가 발생한다.

// 각각의 경우, 우리가 메소드를 통해서 값을 바꾸면 무슨 일이 발생할까?
public class Ex03Call {
    public static void main(String[] args) {
        // call by value 에서 사용할 int 변수
        int num = 3;
        
        System.out.println("call by value의 경우");
        System.out.println("num의 값: "+num);
        increase(num);
        System.out.println("num의 값: "+num);
        // call by reference에서 사용할 int[] 변수
        int[] array= new int[4];
        System.out.println("call by reference의 경우");
        System.out.println("array[0]의 값: "+array[0]);
        increase(array);
        System.out.println("array[0]의 값: "+array[0]);
//        System.out.println("********************************");
//        System.out.println(array[0]);
        
        
//        String test="test";
//        increase(test);
//        System.out.println(test);
//
//        String[] test4= {"c"};
//        increase(test4);
//        System.out.println(test4[0]);
//        
//        String test2="c";
//        increase(test2);
//        System.out.println(test2);
//        
//        char test3='a';
//        increase(test3);
//        System.out.println(test3);
//        
        
    }
    public static void increase(int num) {
        System.out.println("increase() 실행");
        System.out.println("num의 현재 값: "+num);
        num++;
        System.out.println("num++ 후의 num의 값: "+ num);
        System.out.println("increase() 종료");
    }
    public static void increase(int[] array) {
        System.out.println("increase() 실행");
        System.out.println("array[0] 의 현재 값: "+ array[0]);
        array[0]=40;
        System.out.println("array[0] 의 현재 값: "+ array[0]);
        System.out.println("increase() 실행");
        
    }
//    
//    public static void increase(String num) {
//        System.out.println("increase() 실행");
//        System.out.println("num의 현재 값: "+num);
//        num="string";
//        System.out.println("num++ 후의 num의 값: "+ num);
//        System.out.println("increase() 종료");
//    }
//    public static void increase(String[] num) {
//        System.out.println("increase() 실행");
//        System.out.println("num의 현재 값: "+num);
//        num[0]+="k";
//        
//        System.out.println("num++ 후의 num의 값: "+ num);
//        System.out.println("increase() 종료");
//    }
//    public static void increase(char num) {
//        System.out.println("increase() 실행");
//        System.out.println("num의 현재 값: "+num);
//        num++;
//        System.out.println("num++ 후의 num의 값: "+ num);
//        System.out.println("increase() 종료");
//    }
}
