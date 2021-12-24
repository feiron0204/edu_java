package day1020;
import java.util.Scanner;
public class Star09If {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.println("이쁜 별만들 숫자 입력해주세요~");
        System.out.print("> ");
        int star = scanner.nextInt();
        //1~star 까진 별증가 if star 넘으면? 감소
        System.out.println("--------------9번(using if)---------------");
        for(int i=1;i<2*star;i++) {
            String stars="";
            
            if(i<=star) {
                for(int j=star;j>i;j--) {
                    stars+=" ";
                }
                for(int j=1;j<2*i;j++) {
                    stars+="*";
                }
            }else {
                for(int j=star;j<i;j++) {
                    stars+=" ";
                }
                for(int j=1;j<4*star-2*i;j++) {
                    stars+="*";
                }
            }
            System.out.println(stars);
        }
        System.out.println("-----------------------------------------");
        
        
        
        
        
        
        
        
        
        scanner.close();
    }

}
