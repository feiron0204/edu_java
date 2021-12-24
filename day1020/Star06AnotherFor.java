package day1020;
import java.util.Scanner;
public class Star06AnotherFor {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.println("이쁜 별만들 숫자 입력해주세요~");
        System.out.print("> ");
        int star = scanner.nextInt();
        //4번에 2번 붙히기
        System.out.println("--------------6번(Another for)---------------");
        for(int i=1;i<=star;i++) {
            String stars="";
            for(int j=1;j<i;j++) {
                stars +=" ";
            }
            for(int j=1;j<=star-i+1;j++) {
                stars +="*";
            }
            for(int j=1;j<=star-i;j++) {
                stars +="*";
            }
            System.out.println(stars);
            
        }
        System.out.println("-----------------------------------------");
        
        
        
        
        
        
        
        
        scanner.close();
    }

}
