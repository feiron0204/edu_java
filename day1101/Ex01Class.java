package day1101;
// 클래스
// 객체지향프로그램이란?

// 실행가능한 절차를가진 코드들의 집함 = 프로그램

// 객체지향프로그램이란, 커다란 프로그램이 더 작은 프로그램들을 모아서 하나의 프로그램으로 만드는 것을 뜻한다.
// 즉, 절차지향적프로그래밍에서는 기능을 프로그램의 최소단위로 보았지만,
// 객체지향 프로그래밍에서는 프로그램을 프로그램의 최소단위로 보게 되는 것이다.

// 클래스는 크게 2가지 파트로 이루어져있다.
// 각 클래스 변수가 개별의 정보를 저장할 수 있는 필드와
// 해당 클래스 변수들이 실행가능한 기능들

// 객체(Object)
// 객체란? 클래스 변수를 뜻한다.

// 인스턴스(Instance)
// 인스턴스란? 클래스 변수를 뜻한다.

// 객체 == 인스턴스?
// 객체와 인스턴스의 차이는, 객체는 모든 클래스 변수를 뜻하지만
// 인스턴스는 객체들 중에서 필드에 값이 정해진 객체들을 특별히 인스턴스라고 부른다.

// static 키워드?
// static 키워드는 해당 메소드를 우리가 객체를 통하지않고 직접 불러서 쓰겠다는 의미가 되기 때문에
// 더이상 사용하지 않는다.(ScannerUtil은 제외[편의성을 위해])

// 그럼 직접 한번 우리가 Student 클래스를 만들어서
// 객체를 사용해보자

// 생성자(Constructor)
// 생성자란, 해당 데어타타입의 내부 공간을 만들어주는(=생성해주는)
// 특수한 메소드 이다.

// 우리가 특별히 생성자를 따로 만들어주지 않더라도
// 자바가 제공해주는 기본생성자가,
// 해당 객체의 필드 값들을 기본값으로 초기화를 해주는데
// 이때, 기본형 데이터타입의 필드들은 0으로, 참조형 데이터타입의 필드들은
// null로 초기화 해준다.

// 필요에 따라서는 우리가 생성자를 직접 만들어줄 수도 있는데
// 생성자는 특수한 메소드이기 때문에 다음과 같은 양식을 따른다.
// public 클래스이름(){
//
//      해당 클래스 변수(=객체)가 만들어질 때 실행될 코드
//
// }

// 필요에 따라서는 우리가 파라미터가 있는 생성자를 만들어 줄때도 있는데
// 만약 우리가 파라미터 있는 생성자만 만들어주게 되면
// 더이상 파라미터 없는 생성자는 호출할 수 없다!

// 캡슐화
// 캡슐화란, 모든 필드와 외부에서 반드시 알아야 하는 메소드를 제외하고서는
// 외부의 직접 접근을 모두 막아버리는 방법을 캡슐화라고 한다.
// 즉 외부에서 우리 클래스의 객체를 사용할 때에는
// 항상 통째로 가져다가 해당 객체를 사용하게 만드는 방법이다.
// 외부에서 우리 필드 혹은 알 필요가 없는 메소드를 접근하지 못하게 막을려면?
// 당연히 접근 제한자를 사용해야 한다!
// 즉 모든 필드와 외부가 알 필요없는 메소드는 private으로,
// 외부가 꼭 호출해야 하는 메소드는 public 접근 제한자를 사용하게 되는 것이다!

// 하지만 우리가 필드에 private 접근제한자를 적용시키면
// 더이상 해당 필드에 직접적으로 값을 저장하거나 저장된 값을 호출할 수 없게 된다.
// 따라서 간접적으로 해당 필드에 값을 저장하거나 저장된 값을 호출하는 방법을 만들어주어야 하는데
// 이때 사용되는 것이 바로
// getter/setter 메소드가 된다!

// getter 메소드는 해당 필드에 저장되어있는 값을 호출하는 메소드로써
// 다음과 같은 양식을 가진다.
// public 필드타입 get필드명(){
//  return 필드명;
// }

// setter 메소드는 해당 필드에 외부의 값을 저장하는 메소드로서
// 다음과 같은 양식을 가진다.
// public void set필드명(필드타입 필드명){
//      this.필드명=필드명;
// }

import object.Student;
//import util.ScannerUtil;
//import java.util.Scanner;

public class Ex01Class {
    public static void main(String[] args) {
        Student s1 = new Student(1, "이성호",80,81,81);
//      생성자 없었을때의 코드
//        s1.id=1;
//        s1.name="이성호";
//        s1.korean=80;
//        s1.english=81;
//        s1.math=81;
        
        /*
         * 얘네 private되서 호출안됨.
         */
//        System.out.println("s1.calculateSum(): "+s1.calculateSum());
//        System.out.println("s1.calculateAverage(): "+s1.calculateAverage());
        s1.printInfo();
        
        Student s2 = new Student(2,"이성호2",85,85,87);
        
        /*
         * getter, setter 메소드 없을경우 실행안됨[private니까]
         */
//        s2.id=2;
//        s2.name="이성호2";
//        s2.korean=85;
//        s2.english=85;
//        s2.math=87;
        /*
         * getter setter 메소드 만들어준 후 
         */
        s2.setId(22);
        s2.setName("이성호22");
        s2.setKorean(22);
        s2.setEnglish(22);
        s2.setMath(23);
        
        System.out.println("s2의 학생번호: "+s2.getId());
        
        
//        System.out.println("s2.calculateSum(): "+s2.calculateSum());
//        System.out.println("s2.calculateAverage(): "+s2.calculateAverage());
        s2.printInfo();
        
        /*
         * 생성자를 만들기 전에는 0 참조형의 경우 null 이들어가지만
         * object클래스에 Student()생성자를만드니 -1, 아직입력되지않음
         * 이 초기 선언시 들어감.
         */
        Student s3=new Student();
        s3.setId(22);
        s3.setName("이성호22");
        s3.setKorean(22);
        s3.setEnglish(22);
        s3.setMath(23);
        
        s3.printInfo();
        
        System.out.println("s2.equals(s3): "+s2.equals(s3));
        System.out.println("s1.equals(s3): "+s1.equals(s3));
        String str="abc";
        System.out.println("s3.equals(str): "+s3.equals(str));
        
        System.out.println(s3);
    }

}
