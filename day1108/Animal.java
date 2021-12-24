package day1108;

public class Animal {
    protected String name;
    
    public Animal() {
        System.out.println("Animal 생성자 호출!");
        name="동물계";
    }
    
    public void makeSound() {
        System.out.println("울음소리를 낸다!");
    }
    
    public void move() {
        System.out.println("움직인다!");
    }
}
