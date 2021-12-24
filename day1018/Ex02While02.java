package day1018;
// 1. 3부터 7까지 출력해보세요
// 2. 사용자로부터 입력을 받되, 5가 아니면 다시 입력을 받도록 프로그램을 작성하시오
import java.util.Scanner;
public class Ex02While02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 3;
        while(num<8) {
            System.out.println(num);
            num++;
        }
        
        while(!(num==5)) {
            System.out.print("값을 입력해주세요.: ");
            num=scanner.nextInt();
            
            System.out.println("입력값은 "+num+" 입니다.");
        }
        /*
         * System.out.println("5를 입력해주세요.");
         * System.out.print("> ");
         * num = scanner.nextInt();
         * 
         * while(num !=5){
         *  System.out.println("잘못 입력하엿습니다.");
         *  System.out.println("5를 입력해주세요.");
         *  num = scanner.nextInt();
         * }
         * 
         * System.out.println("5를 입력하셧습니다.");
         * 
         */
        
        
        
        
        
        
        
        
        scanner.close();
    }

}
