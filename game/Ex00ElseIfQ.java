package game;
//토너먼트 & else if 질문용
//3팀이 골넣기 경기를하여 골을 많이 넣은팀이 우승자를 확인함
//3강 대진표는 A:B 비교 그리고 C 와 비교
//좀 치사하지만 골수가 같으면 알파벳이 빠른사람이 이김
import java.util.Scanner;
public class Ex00ElseIfQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 각팀 몇골씩 넣었음??
        System.out.print("A팀 골 몇개?: ");
        int aGoal=scanner.nextInt();
        System.out.print("B팀 골 몇개?: ");
        int bGoal=scanner.nextInt();
        System.out.print("C팀 골 몇개?: ");
        int cGoal=scanner.nextInt();
        
        //우선 AB 비교
        if(aGoal>=bGoal) {
            if(aGoal>=cGoal) {
                System.out.println("A 우승!!");
            }else {
                System.out.println("C 우승!!");
            }
                
        }else if(bGoal>=cGoal) {
                System.out.println("B 우승!!");
        }else {
                System.out.println("C 우승!!");
        }
        
        
        scanner.close();
        
    }

}
