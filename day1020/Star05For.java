package day1020;
import java.util.Scanner;
public class Star05For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("이쁜 별만들 숫자 입력해주세요~");
        System.out.print("> ");
        int star = scanner.nextInt();
        
        System.out.println("--------------5번---------------");
        for(int i=1;i<=star;i++) {
            for(int j=1;j<=star-i;j++) {
                System.out.print(' ');
            }
            for(int j=1;j<2*i;j++) {
                System.out.print('*');
            }
            // 뒤에도 같은공백?
//            for(int j=1;j<=star-i;j++) {
//                System.out.print(' ');
//            }
            System.out.println();
            
        }
        System.out.println("-------------------------------\n");
        
        
        
        
        
        
        
        
        scanner.close();
    }
}
