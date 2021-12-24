package day1108;
// 기본형 데이터타입을 클래스로 바꾼 포장 클래스(Wrapper Class)

// 포장 클래스의 경우, 우리가 import를 하지 않아도 기본적으로 사용가능하다!

public class Ex03WrapperClass {
    public static void main(String[] args) {
        // Integer, Double, Character, Boolean 을 알아보자
        
        // 1. Integer
        // 인티저의 경우, 우리가 2가지 방법으로 초기화가 가능하다.
        // 생성자를 통한 초기화 혹은 int 값을 통한 초기화
        // 2개의 차이는 없지만
        // 생성자를 통해서 초기화 하는 방법이 좀더 정석적인 표현이다.
        // 또한, 굳이 객체를 생성할 필요가 없는 메소드들(ex: 2개의 값중 더 큰 친구 찾기) 같은 경우에는
        // static 메소도로 정의되어있기 때문에, 우리가 객체 생성을 하지 않아도 된다!
        Integer i = 78152;
        
        // 기본형 데이터타입의 포장클래스들의 경우,
        // 내부적으로 나름 유용한 메소드들이 존재할 수 있지만
        // 실질적으로 가장 많이 사용되는 메소드는
        // toString() 메소드와 parse~~() 메소드이다.
        /*
         * parse~~ 스트링을 해당 데이터타입으로 바꿔준데!!!!
         */
        
        String str = "-000123";
        int num = Integer.parseInt(str);
        
        int result =num*10;
        
        System.out.println(result);
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        int num1=8;
        int num2 = 18;
        System.out.println(Integer.max(num1,num2));
        System.out.println(Integer.min(num1,num2));
        
        
    }
}
