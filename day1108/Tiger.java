package day1108;

public class Tiger extends Felidae{
    public Tiger() {
        System.out.println("Tiger() 생성자 호출");
        name = "호랑이";
        
    }
    
    /*
     * 오버라이드!!!! 조상에 있는 메소드 그대로 덮어씌우기
     */
    public void makeSound() {
        System.out.println("어흥!!!");
    }
}
