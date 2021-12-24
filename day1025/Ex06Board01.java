package day1025;

// 5개의 게시글을 관리하는 프로그램을 작성하시오.
// 단, 메인 메소드의 내용을 최소화 시키시오
// 3시 50분까지
import java.util.Scanner;
import util.ScannerUtil;

public class Ex06Board01 {
    public static final int BOARD_SIZE = 5;
    public static int[] numArray = new int[BOARD_SIZE];
    public static String[] titleArray = new String[BOARD_SIZE];
    public static String[] writerArray = new String[BOARD_SIZE];
    public static String[] contentArray = new String[BOARD_SIZE];
    public static int nextIndex =0;
    public static Scanner scanner = new Scanner(System.in);

    // 글작성메소드
    public static void writing() {
        if (nextIndex < BOARD_SIZE) {
            String message;

            message = "글 번호를 입력해주세요";
            numArray[nextIndex] = ScannerUtil.nextInt(scanner, message);
            message = "글 제목를 입력해주세요";
            titleArray[nextIndex] = ScannerUtil.nextLine(scanner, message);
            message = "글 작성자를 입력해주세요";
            writerArray[nextIndex] = ScannerUtil.nextLine(scanner, message);
            message = "글 내용를 입력해주세요";
            contentArray[nextIndex] = ScannerUtil.nextLine(scanner, message);
            nextIndex++;

        } else {
            System.out.println("더 이상 작성하실수 없습니다.");
        }
    }

    // 글 출력 메소드
    public static void printBoard() {
        if (nextIndex > 0) {
            for (int i = 0; i < nextIndex; i++) {
                printOne(i);
            }
        } else {
            System.out.println("아직 작성하신 글이 없습니다.");
        }

    }
    // 글 한개 출력 메소드
    public static void printOne(int i) {
        System.out.println("-------------------------------------------------");
        System.out.printf("글 번호: %d 작성자: %s\n", numArray[i],writerArray[i]);
        System.out.printf("글 제목:%s\n", titleArray[i]);
        System.out.printf("글 내용:%s\n", contentArray[i]);
        System.out.println("-------------------------------------------------\n");
    }
    //사용자 입력 메뉴 메소드
    public static void menu() {
        while(true) {
            int userChoice=ScannerUtil.nextInt(scanner, "1. 입력 2. 출력 3. 종료");
            
            if(userChoice==1) {
                writing();
            }else if(userChoice==2) {
                printBoard();
            }else if(userChoice==3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }else {
                System.out.println("잘못된 입력입니다. 다시입력해주세요.");
            }
        }
    }
    public static void main(String[] args) {
        
        menu();
        scanner.close();
    }
}
