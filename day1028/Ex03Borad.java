package day1028;
//숙제: 게시판을 구조체로 만들고 동적할당을 적용시켜서
//관리하는 프로그램을 만드시오
//게시판 구조체.... 글번호...제목 작성자 내용
//     글번호는 내가 준다...건들지마...
// 편법-> 몇번째 글을 삭제할껀가 (마지막 보드때 이걸로했다!!!!!당첨!)
// 정법-> 몇번의 글을 삭제할껀가..
import struct.Board;
import util.ArrayUtil;
import util.ScannerUtil;
import java.util.Scanner;
public class Ex03Borad {
//사앙수
    public static final int WRITE_CODE=1;
    public static final int PRINT_CODE=2;
    public static final int EXIT_CODE=3;
    public static final int OVERWRITE_CODE=1;
    public static final int DELETE_CODE=2;
    public static final int BACK_CODE=3;
    //벼언수
    public static Scanner scanner=new Scanner(System.in);
    public static Board[] board=new Board[0];
    public static int nextId=1;
    //메인메뉴
    public static void selectMenu() {
        String message;
        while(true) {
            message="1. 새 글 쓰기 2. 글 목록 보기 3. 종료";
            int userChoice=ScannerUtil.nextInt(scanner, message,WRITE_CODE,EXIT_CODE);
            if(userChoice==WRITE_CODE) {
                writeBoard();
            }else if(userChoice==PRINT_CODE) {
                printBoard();
            }else if(userChoice==EXIT_CODE) {
                System.out.println("사용해 주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }
    //입력
    public static void writeBoard() {
        String message;
        Board temp=new Board();
        temp.id=nextId++;
        message="글 제목을 입력하세요";
        temp.title=ScannerUtil.nextLine(scanner, message);
        message="글 작성자을 입력하세요";
        temp.writer=ScannerUtil.nextLine(scanner, message);
        message="글 내용을 입력하세요";
        temp.contents=ScannerUtil.nextLine(scanner, message);
        
        board=ArrayUtil.add(board, temp);
    }
    //대강출력
    public static void printBoard() {
        System.out.println("\n------------------게시판------------------");
        if(ArrayUtil.size(board)==0) {
            System.out.println("아직 작성된 글이 없습니다.");
            System.out.println("---------------------------------------");
        }else {
            for(int i=0;i<ArrayUtil.size(board);i++) {
                System.out.printf("%d. %s\n", i+1,board[i].title);
            }
            System.out.println("---------------------------------------");
            String message="확인하실 글의 번호를 입력해주세요.\n(메인 메뉴로 돌아가시려면 0을 입력해주세요.)";
            int userChoice=ScannerUtil.nextInt(scanner, message,0,ArrayUtil.size(board))-1;
            if(userChoice!=-1) {
                printOne(userChoice);
            }
        }
    }
    //하나자세히출력
    public static void printOne(int i) {
        System.out.println("\n=============================");
        System.out.println("제목: "+board[i].title);
        System.out.println("-----------------------------");
        System.out.printf("글 번호: %d번 작성자: %s\n",board[i].id,board[i].writer);
        System.out.println("-----------------------------");
        System.out.println(board[i].contents);
        
        System.out.println("=============================\n");
        
        printMenu(i);
    }
    //수정삭제뒤로가기
    public static void printMenu(int i) {
        String message;
        message="1. 글 수정하기 2. 삭제 3. 뒤로가기";
        int userChoice=ScannerUtil.nextInt(scanner, message, OVERWRITE_CODE, BACK_CODE);
        if(userChoice==OVERWRITE_CODE) {
            overwrite(i);
        }else if(userChoice==DELETE_CODE) {
            delete(i);
        }else if(userChoice==BACK_CODE) {
            printBoard();
        }
    }
    //제목내용수정
    public static void overwrite(int i) {
        String message;
        message="새 제목을 입력해 주세요.";
        String title=ScannerUtil.nextLine(scanner, message);
        message="새 내용을 입력해 주세요.";
        String contents=ScannerUtil.nextLine(scanner, message);
        ArrayUtil.set(board, i, title, contents);
        printOne(i);
    }
    //삭제
    public static void delete(int i) {
        String message;
        message="정말로 삭제하시겠습니까? Y/N";
        String userChoice=ScannerUtil.nextLine(scanner, message);
        if(userChoice.equalsIgnoreCase("y")) {
            board=ArrayUtil.remove(board, i);
            printBoard();
        }else {
            printOne(i);
        }
    }
    //메인
    public static void main(String[] args) {
        selectMenu();
    }
  
}
