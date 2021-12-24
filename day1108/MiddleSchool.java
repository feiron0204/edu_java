package day1108;
// 인터페이스 상속은
// implements 라는 키워드를 통해 이루어진다.
// 인터페이스 상속이 이루어지면
// 인터페이스 안에 선언된 "추상" 메소드들은
// 반드시 해당 클래스가 오버라이드해야한다!!

public class MiddleSchool implements Student{
    public int korean;
    public int english;
    public int math;
    
    public void showName() {
        System.out.println("중학생입니다.");
    }
    public int calculateSum() {
        return korean+english+math;
    }
    public double calculateAverage() {
        return calculateSum()/3.0;
    }
    public int test() {
        return 3;
    }
}
