package day1108;

public class Cat extends Felidae{
    public Cat() {
        System.out.println("고양이 생성자 호출!");
        name = "고양이";
        /*
         * name 변수는 상속해준 Animal이 가지고있으니 생성자때 초기화가능
         */
    }
    
    public void makeSound() {
        System.out.println("야옹");
    }
}
