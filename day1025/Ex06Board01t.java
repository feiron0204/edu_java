package day1025;

import java.util.Scanner;
import util.ScannerUtil;
public class Ex06Board01t {
    // 전역 상수
    public static final int BOARD_SIZE=5;
    
    // 전역 변수
    public static Scanner scanner = new Scanner(System.in);
    public static int[] idArray = new int[BOARD_SIZE];
    public static String[] titleArray = new String[BOARD_SIZE];
    public static String[] writerArray = new String[BOARD_SIZE];
    public static String[] contentArray = new String[BOARD_SIZE];
    public static int nextIndex=0;
    public static int nextId=1;
    // 메뉴 출력 담당 메소드
    public static void printMenu() {
        while(true) {
            String message = "1. 입력, 2. 출력 3. 종료";
            int userChoice=ScannerUtil.nextInt(scanner, message,1,3);
            if(userChoice==1) {
                writeBoard();
            }else if(userChoice==2) {
                printAll();
            }else if(userChoice==3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }
    // 글 작성 담당 메소드
    public static void writeBoard() {
        if(nextIndex<BOARD_SIZE) {
            idArray[nextIndex]=nextId++;
            String message;
            message = "글 제목을 입력해주세요.";
            titleArray[nextIndex]=ScannerUtil.nextLine(scanner, message);
            message = "글 작성자을 입력해주세요.";
            writerArray[nextIndex]=ScannerUtil.nextLine(scanner, message);
            message = "글 내용을 입력해주세요.";
            contentArray[nextIndex]=ScannerUtil.nextLine(scanner, message);
            nextIndex++;
        }else {
            System.out.println("더이상 입력하실 수 없습니다.");
        }
        
    }
    // 글 몰록 출력 담당 메소드
    public static void printAll() {
        if(nextIndex>0) {
            for(int i=0;i<nextIndex;i++) {
                printOne(i);
            }
        }else {
            System.out.println("아직 등록된 글이 존재하지 않습니다.");
        }
    }
    // 글 개별 출력 담당 메소드
    public static void printOne(int index) {
        System.out.println("------------------------------------");
        System.out.println("제목: "+titleArray[index]);
        System.out.println("------------------------------------");
        System.out.println("번호: "+idArray[index]);
        System.out.println("작성자: "+writerArray[index]);
        System.out.println("------------------------------------");
        System.out.println(contentArray[index]);
    }
    public static void main(String[] args) {
        printMenu();
        scanner.close();
    }

}
