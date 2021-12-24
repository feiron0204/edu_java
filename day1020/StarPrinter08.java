package day1020;

// 별찍기 8번
import java.util.Scanner;

public class StarPrinter08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("별찍기 8번");
        System.out.println("------------------------------------\n");

        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i<=2*userNumber-1;i++) {
            String stars="";
            if(i<userNumber) {
                //윗부분
                
                // 공백을 담당하는 j for문
                for(int j=1;j<=userNumber-i;j++) {
                    stars +=" ";
                }
                
                // 별을 담당하는 j for문
                for(int j=1;j<=i;j++) {
                    stars+="*";
                }
            }else {
                //아랫부분
                // 아랫부분에서의 1을 기준으로 변환된 i의 값을 저장할 int 변수
                int lowerI=i-userNumber+1;
                // 공백을 담당하는 j for 문
                for (int j=1; j<=lowerI-1;j++) {
                    stars+=" ";
                }
                // 별을 담당하는 j for 문
                for (int j=lowerI; j<=userNumber; j++) {
                    stars+="*";
                }
            }
            
            System.out.println(stars);
        }

        scanner.close();
    }
}
