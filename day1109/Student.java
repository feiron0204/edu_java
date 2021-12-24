package day1109;
// 추상클래스
// 인터페이스의 경우, 인터페이스에 정의된 모든 메소드는 추상메소드이며 따라서
// 해당 인터페이스를 상속받는 클래스가 직접 그 모든 메소드를 정의해주어야 한다.
// 하지만 우리가 특정 메소드 몇개만 추상 메소드로 만들고 일반 메소드들도 만들어서
// 자식 클래스가 상속받아서 추상 메소드를 제외하곤 모두 그대로 쓰게 만들고 싶다면
// 추상 클래스를 만들어야 한다.
/*
 * 추상클래스는 객체를 만들지 못함.
 * 자식클래스의 생성자를 끌어와야함
 */
/*
 * 인터페이스는 추상메소드들만 존재하여야함!!
 */
public abstract class Student{
    public String name;
    public abstract int calculateSum();
    public abstract double calculateAverage();
    public void printInfo() {
        System.out.println("이름: "+name);
        System.out.println("총점: "+calculateSum());
        System.out.println("평균: "+calculateAverage());
    }

}
