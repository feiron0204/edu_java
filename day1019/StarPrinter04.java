package day1019;

// 별찍기 4번
import java.util.Scanner;

public class StarPrinter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("별찍기 4번");
        System.out.println("------------------------------------\n");

        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= userNumber; i++) {
            String stars = "";
            
            for(int j = 1; j <= userNumber; j++) {
                if(j <= i - 1) {
                    stars += " ";
                } else {
                    stars += "*";
                }
            }
            
            System.out.println(stars);
        }

        scanner.close();
    }
}
