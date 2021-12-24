package day1108;
// 상속(Inheritance)

// 1. 클래스 상속
// 2. 인터페이스 상속

// 두 개의 상속 모두 코드의 재사용성을 높이기 위해 상속을 하지만
// 그 안에 실질적인 목표는 다른 이유가 된다.
// 클래스의 상속은 부모 클래스의 코드를 자식 클래스가 그대로 사용하기 위해서
// 상속을 받는다.
// 인터페이스 상속은 코드를 재사용하기 위해서가 아니라
// 다형성(Polymorphism)을 위해 상속을 한다.
/*
 * 무조건 오버라이딩이 필수됨 
 * 상속받은 클래스의 경우 인터페이스 내 메소드들이 모두 오버라이딩 되어있어야함!
 */

// 클래스 상속
// 클래스 상속의 경우,
// 우리가 먼저 부모 클래스를 만들어주고
// 자식 클래스는 "extends" 라는 키워드를 통해서
// 상속을 하게 된다.
/*
 * 인터페이스끼리도 클래스 상속이 가능
 * 클래스가 상속받은 인터페이스가 다른 인터페이스를 상속받고있다면
 * 클래스에 모든 인터페이스 내에 있는 메소드가 오버라이드 되어있어야함.
 */

public class Ex01Inheritance {
    
    
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
        a.move();
        System.out.println(a.name);
        
        Felidae f = new Felidae();
        /*
         * Animal 상속받아서 makeSound, move 사용가능
         * name이 고양이과로 초기화됨
         */
        f.makeSound();
        f.move();
        System.out.println(f.name);
        
        Tiger t = new Tiger();
        /*
         * Felidae 상속받아서 
         * 마찬가지로 Animal도 쓸수있음
         * name이 호랑이로 초기화됨
         * 초기화시 makeSound가 어흥으로 바뀌어버림(오버라이드)
         */
        t.makeSound();
        t.move();
        System.out.println(t.name);
        
        Cat c = new Cat();
        /*
         * Felidae 상속받았으며
         * 마찬가지로 Animal도 쓸수있음
         * name이 고양이로 초기화됨
         * 초기화시 makeSound가 야옹으로 바뀌어버림(오버라이드)
         */
        c.makeSound();
        c.move();
        System.out.println(c.name);
        /*
         * 부모클래스는 자식클래스로 초기화 가능하다.
         */
        Animal x = new Felidae();
//        x.eat();
        /*
         * 불가능함 eat() 메소드는 Felidae에 있으니까
         * 사용할라면 자식클래스객체로 바꿔야 자식꺼 쓸수있다.
         */
        
        Felidae fel = (Felidae)x;
        fel.eat();
        
    }
}
