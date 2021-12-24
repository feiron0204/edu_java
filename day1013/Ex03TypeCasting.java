package day1013;
// 형변환(Type Casting)
// 형변환이란, 특정 데이터타입의 값을 다른 데이터타입으로 바꾸는 것을 뜻한다.
// 형변환에는 암시적 형변환과 명시적 형변환 두가지가 있다.

// 암시적 형변환(implicit type casting)
// 암시적 형변환의 경우, 우리가 특별히 명령어를 적지 않더라도,
// 자바가 내부적으로 알아서 데이터타입을 바꿔주는 것을 말한다.
// 더 작은 데이터타입을 더 큰 데이터타입으로 바꾸거나
// 정수를 실수로 바꿀 때 발생된다.

// 명시적 형변환(explicit type casting)
// 명시적 형변환의 경우, 우리가 명확하게 명령어를 적어주어야
// 형변환이 발생된다.
// 만약 우리가 아무리 명령어를 적어주지 않는다면, 에러가 발생하게 된다.
// 더 큰 데이터타입을 더 작은 데이터타입으로 바꾸거나
// 실수를 정수로 바꿀 때 명시적 형변환을 해야한다.
// 명시적 형변환을 하는 방법은
// (바꿀 데이터타입)바꿀 값;
// 으로 명시적 형변환이 가능하다.

public class Ex03TypeCasting {
    public static void main(String[] args) {
        // byte 변수 myByte를 선언하고 30을 저장해보자
        byte myByte = 30;
        
        // int 변수 myInt를 선언해보자
        int myInt;
        
        // myInt에 myByte의 현재 값을 저장해보자
        myInt = myByte;
        // myInt의 현재값을 출력해보자
        System.out.println(myInt);
        System.out.println("-------------------");
        System.out.println("명시적 형변환(Explicit Type Casting)");
        // myInt에50을 저장해보자
        myInt = 50;
        // myByte에 myInt의 현재 값을 강제로 저장해보자
        /*
         * myByte = myInt; 
         * 어림도없지 ㅎ
         */
        myByte = (byte)myInt;
        System.out.println(myByte);
        System.out.println("-------------------");
        
        System.out.println("overflow");
        // myByte에 126을 저장해보자
        myByte = 126;
        // myByte의 현재값을 출력해보자
        System.out.println(myByte);
        // myByte에 127을 저장해보자
        myByte = 127;
        // myByte의 현재값을 출력해보자
        System.out.println(myByte);
        // myByte에 128을 저장해보자
        myByte = (byte)128;
        // 128은 범위밖의 수이므로 명시적으로 형변환해야함
        
        // myByte의 현재값을 출력해보자
        System.out.println(myByte);
        // myByte에 129을 저장해보자
        myByte = (byte)129;
        // 129은 범위밖의 수이므로 명시적으로 형변환해야함
        
        // myByte의 현재값을 출력해보자
        System.out.println(myByte);
        
        System.out.println("---------------------------");
        System.out.println("underflow");
        // myByte에 -127을 저장해보자
        myByte = -127;
        // myByte의 현재값을 출력해보자
        System.out.println(myByte);
        // myByte에 -128을 저장해보자
        myByte = -128;
        // myByte의 현재값을 출력해보자
        System.out.println(myByte);
        // myByte에 -129을 저장해보자
        myByte = (byte)-129;
        // 128은 범위밖의 수이므로 명시적으로 형변환해야함
        
        // myByte의 현재값을 출력해보자
        System.out.println(myByte);
        // myByte에 -130을 저장해보자
        myByte = (byte)-130;
        // 129은 범위밖의 수이므로 명시적으로 형변환해야함
        
        // myByte의 현재값을 출력해보자
        System.out.println(myByte);
        
        System.out.println("---------------------------");
        // myByte에 300을 강제로 저장해보자
        myByte = (byte)300;
        // myByte의 현재 값을 출력해보자
        System.out.println(myByte);
        // myInt에 myByte의 현재 값을 저장해보자
        myInt = myByte;
        // myInt의 현재 값을 출력해보자
        System.out.println(myInt);
    }

}
