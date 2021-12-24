package day1108;

// Animal을 상속받는 클래스
// 상속을 받을 때에는
// public class 클래스이름 extends 상속받을 클래스이름
// 으로 상속을 받는다
public class Felidae extends Animal {
    public Felidae() {
        System.out.println("고양이과 클래스 생성자 호출!");
        name=new String("고양이과");
        /*
         * name 변수는 상속해준 Animal이 가지고있으니 생성자때 초기화가능
         */
    }
    
    public void eat() {
        System.out.println("고기를 먹는다.");
    }
}
