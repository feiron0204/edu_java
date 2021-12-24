package day1013;
// 비교연산자(Relational Operator)
// 비교연산자는 왼쪽의 값과 오른쪽의 값을 비교하여
// 연산자가 맞을 경우에는 true, 틀릴 경우에는 false가 결과값이 된다.

// <, <=, >, >=, ==, !=
public class Ex08Operator03 {
    public static void main(String[] args) {
        // int 변수 num1을 선언하고 5를 저장한다.
        int num1 = 5;
        // int 변수 num2를 선언하고 7을 저장한다.
        int num2 = 7;
        
        // 1. >
        System.out.println("1. >");
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 > 9: " + (num1 > 9));
        System.out.println("num1 > 0: " + (num1 > 0));
        System.out.println("num1 > 5: " + (num1 > 5));
        System.out.println("-------------------------------");
        // 2. >=
        System.out.println("2. >=");
        System.out.println("num1 >= num2: " + (num1 > num2));
        System.out.println("num1 >= 9: " + (num1 >= 9));
        System.out.println("num1 >= 0: " + (num1 >= 0));
        System.out.println("num1 >= 5: " + (num1 >= 5));
        System.out.println("-------------------------------");
        // 3. ==
        System.out.println("3. ==");
        System.out.println("num1 == 5: " + (num1 == 5));
        System.out.println("num1 == 9: " + (num1 == 9));
        System.out.println("-------------------------------");
        // 4. !=
        System.out.println("4. !=");
        System.out.println("num1 != 5: " + (num1 != 5));
        System.out.println("num1 != 9: " + (num1 != 9));
        System.out.println("-------------------------------");
        
        // 단, == 혹은 != 비교연산자를 사용할 때 한가지 주의할 점이 있다.
        // 참조형 데이터타입의 값을 비교할 때에는, == 혹은 != 비교연산자를 사용하면
        // 부정확한 값을 얻을 수 있다라는 점이다
        
        // String은 여러개의 문자를 제어하는 대표적인 클래스이다.
        // 클래스 타입은 참조형 타입 중 하나이다.
        // 우리는 아래에서 String 변수의 대한 비교를 체험하게 될 것이다.
        
        System.out.println("참조형 데이터타입에 대한 비교");
        // String 타입 변수 str1, str2, str3를 만들어보자
        String str1, str2, str3;
        // 각각 "abc"라는 글자를 넣어주되, 저장하는 방법을 각각 다르게 해보자
        str1 = "abc";
        str2 = new String("abc");
        str3 = str1;
        
        // 전부 "abc"라는 세 글자만 들어가 있는지 확인하기 위하여
        // 변수이름: [값] 으로 출력될 수 있도록 다음과 같이 입력해보자
        System.out.println("str1: ["+str1+"]");
        System.out.println("str1: ["+str2+"]");
        System.out.println("str1: ["+str3+"]");
        
        // str1과 str2, str1과 str3, str2와 str3을 비교연산자를 통하여 
        // 같은 값이 들어가있는지 비교해보자
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str2 == str3: " + (str2 == str3));
        // 비교연산자는, 1세대 언어부터 존재하던 연산자로써, Java를 기준으로 이야기하면
        // Stack영역에 저장되어있는 값을 기준으로 해서 비교를 한다.
        // 하지만 참조형 데이터타입의 경우에는 Stack영역에는 실제값이아닌 주소값이 저장되어있기 때문에
        // 비교연산자를 통해서 참조형 데이터타입을 비교하면
        // 실제 값 비교가 아닌 주소 값 비교가 일어나게 된다.
        // 하지만, 참조형 데이터타입을 기준으로 이야기를 해보자면
        // 정말 중요한값은 메모리 주소값이 아니라 Heap영역에 저장되어있는 실제값이 중요한 값이다.
        // 따라서, 참조형 데이터타입의 값을 비교할 때에는 == 혹은 !=의 비교연산자를 사용하면
        // 중요하지 않은 메모리 주소값 비교를 하게 되므로 사용해선 안된다!
        
        // 따라서 우리는 실제 값 비교를 위해서는 비교 연산자가 아닌
        // 해당 변수의 equals() 라는 메소드를 통한 비교를 해야한다!
        
        // equals 메소드는 다음과 같은 방법으로 사용한다.
        // 변수.equals(비교대상)
        System.out.println("equals()를 통한 비교");
        System.out.println("str1.equals(str2): "+ str1.equals(str2));
        System.out.println("str1.equals(str3): "+ str1.equals(str3));
        System.out.println("str2.equals(str3): "+ str2.equals(str3));
        System.out.println("-------------------------------");
        
        
    }

}
