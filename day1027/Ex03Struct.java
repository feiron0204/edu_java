package day1027;
// 구조체(Struct)
// 구조체란, 우리가 필요한 데이터타입들을 모아서
// 우리만의 새로운 데이터타입을 만들어주는 방법을 구조체 라고 한다.

// 예를 들어서, 우리가 기존에 만들었던
// 학생의 경우, int id, String name, int korean, int english, int math를 매번
// 따로 만들어서 관리를 했지만
// 과연 이게 맞는 방법일까?

// 답은 당연히 아니오 이다.
// 만약 우리가 학생의 정보를 관리를 한다고 하면
// 번호, 이름, 국어, 영어, 수학을 한번에 묶어서 새로운"학생"이라는 데이터타입으로 만들어주는 것이 올바른 방법이 된다.

// 이렇게 필요한 데이터타입들을 묶어서 새로운 데이터타입으로 만드는 것이 구조체인데
// 우리한테 작은 문제가 있다.

// 구조체는 2세대 언어들에서만 발견할 수 있는 특수한 데이터타입이기 때문에,
// 3세대 언어인 자바인 당연히 구조체가 존재하지 않는다.

// 대신 우리는 클래스를 사용해서 유사 구조체를 만들어서 프로그램을 만들어볼 것이다.
import struct.Student;
//import struct.test;
public class Ex03Struct {
    public static void main(String[] args) {
        // Student 데이터타입을 가진 변수를 선언하고 초기화해보자.
        Student s=new Student();
        
//        test t=new test();
//        t.stest=new Student();
        // Student 변수 s 의 id공간, name공간, korean 공간, english 공간, math 공간에 접근할 때에는
        // 변수.공간이름 으로 접근하게 된다.
        
        // 예를 들어서"s의 id에 3을 저장해라" 같은 경우 다음과 같이 적어준다.
        s.id=3;
        
        // 반대로 "s의 id를 출력해라" 같은 경우 다음과 같이 적어준다.
        System.out.println("s.id: "+ s.id);
        
        // 우리가 만약 Student 데이터타입을 가진 또 다른 변수를 만들게 되면
        // 당연히, 그 안의 공간들은 서로 다른 곳을 뜻하기 때문에
        // 기존의 값과 다르게 저장 간으하다.
        Student s2 = new Student();
        s2.id =7;
        
        System.out.println("s.id: "+ s.id);
        System.out.println("s2.id: "+ s2.id);
        
        // 구조체의 경우, 우리가 맨 처음 해당 데이터타입의 변수를 선언하고 초기화했을때
        // 내부 공간의 경우, 기본형 데이터타입의 내부 공간은 0으로, 참조형 데이터타입의 내부 공간은 null로 초기화가 된다.
        // 이 내부 공간을 우리는 앞으로 "필드(field)"라고 부를것이다
        Student s3 = new Student();
        System.out.println("s3.id: "+s3.id);
        System.out.println("s3.name: "+s3.name);
        System.out.println("s3.korean: "+s3.korean);
        System.out.println("s3.english: "+s3.english);
        System.out.println("s3.math: "+s3.math);
//        System.out.println("s3.test: "+s3.test);
//        System.out.println("s3.test2: "+s3.test2);
//        System.out.println("t.s: "+t.stest);
        
        // 여러분들이 한가지 주의할 점은, 지금 단계에서는
        // 2개의 구조체 변수가 같은지 다른지 비교할 때에는
        // 안타깝지만 equals()메소드를 사용할 수 없다.
        
        s.id=1;
        s.name="학생";
        
        s3.id = s.id;
        s3.name = s.name;
//        s=test.input(s3);
        System.out.println("s.equals(s3): "+s.equals(s3));
        
        System.out.println("s.id == s3.id && s.name.equals(s3.name): "+(s.id == s3.id && s.name.equals(s3.name)));
    }
}
