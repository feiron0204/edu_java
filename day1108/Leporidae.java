package day1108;

public class Leporidae extends Animal{
    public Leporidae() {
        System.out.println("토끼과 생성자 호출!");
        name = "토끼과";
    }
    
    public void eat() {
        System.out.println("풀을 먹는다.");
    }
}
