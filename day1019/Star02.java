package day1019;
import java.util.Scanner;
public class Star02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("이쁜 별만들 숫자 입력해주세요~");
        System.out.print("> ");
        int star = scanner.nextInt();
        
        System.out.println("--------------2번---------------");
        for(int i=1;i<=star;i++) {
            for(int j=0;j<=star-i;j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("-------------------------------\n");
        
        
        
        
        
        
        scanner.close();
    }
}
