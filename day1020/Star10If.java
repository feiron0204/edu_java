package day1020;
import java.util.Scanner;
public class Star10If {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.println("이쁜 별만들 숫자 입력해주세요~");
        System.out.print("> ");
        int star = scanner.nextInt();
        //첫줄 마지막줄 if넣어서 하나없애기
        //그아래는뭐...중간기준으로 if?
        System.out.println("--------------10번(using if)---------------");
        for(int i=1;i<2*star;i++) {
            String stars="";
            if(i==1) {
                for(int j=2*star;j>i;j--) {
                    stars+="*";
                }
            }else if(i==2*star-1){
                for(int j=1;j<=i;j++) {
                    stars+="*";
                }
            }else {
                if(i<=star) {
                    for(int j=star;j>=i;j--) {
                        stars+="*";
                    }
                    for(int j=1;j<2*(i-1);j++) {
                        stars+=" ";
                    }
                    for(int j=star;j>=i;j--) {
                        stars+="*";
                    }
                }else {
                    for(int j=1;j<=i-star+1;j++) {
                        stars+="*";
                    }
                    for(int j=1;j<=4*star-2*i-3;j++) {
                        stars+=" ";
                    }
                    for(int j=1;j<=i-star+1;j++) {
                        stars+="*";
                    }
                    //이것도 그냥 빈칸넣는 for문 2개로 나누는게 편하긴함
                }
            }
            System.out.println(stars);
        }
        System.out.println("------------------------------------------");
        
        
        
        
        
        
        
        
        
        
        
        
        scanner.close();
    }

}
