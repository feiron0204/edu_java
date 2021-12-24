package day1101;
// object 패키지에 게시판을 담당할 클래스를 만들어서

// 이 Ex02Board.java에 해당 클래스 객체를 사용하여
// 게시글 1개를 입력하고 출력하는 프로그램을 작성해보세요.

// 해당 클래스에는
// 1. 파라미터 없는 생성자
// 2. 파라미터 있는 생성자
// 3. 객체를 예쁘게 출력하는 메소드
// 가 반드시 포함되어야 합니다.
import java.util.Scanner;
import util.ScannerUtil;
import object.Board;

public class Ex02Board {
    public static Scanner scanner=new Scanner(System.in);
    public static Board board=new Board();
    
    public static void main(String[] args) {
        printMenu();
    }
    public static void printMenu() {
        
        while(true) {
            
            String message="1. 입력 2. 출력 3. 종료";
            int userChoice=ScannerUtil.nextInt(scanner, message,1,3);
            if(userChoice==1) {
                message="글 번호를 입력하세요";
                int id=ScannerUtil.nextInt(scanner, message);
                message="글 제목를 입력하세요";
                String title=ScannerUtil.nextLine(scanner, message);
                message="글 작성자를 입력하세요";
                String writer=ScannerUtil.nextLine(scanner, message);
                message="글 제목를 입력하세요";
                String content=ScannerUtil.nextLine(scanner, message);
                board=new Board(id,title,writer,content);
            }else if(userChoice==2) {
                board.printInfo();
            }else if(userChoice==3) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
        
    }
}
