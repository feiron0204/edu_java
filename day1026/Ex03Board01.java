package day1026;
//무제한게시판
import java.util.Scanner;
import util.ScannerUtil;
import util.ArrayUtil;
public class Ex03Board01 {
    public static Scanner scanner=new Scanner(System.in);
    //상수
    public static final int INPUT_CODE=1;
    public static final int PRINT_CODE=2;
    public static final int EXIT_CODE=3;
    //변수
    public static int[] id=new int[0];
    public static String[] writer=new String[0];
    public static String[] title=new String[0];
    public static String[] content=new String[0];
    public static int nextId=1;
    
    // 입력받는 메소드
    public static void input() {
       String message;
       id=ArrayUtil.add(id,nextId++);
       message="글 작성자를 입력해주세요.";
       writer=ArrayUtil.add(writer, ScannerUtil.nextLine(scanner, message));
       message="글 제목을 입력해주세요.";
       title=ArrayUtil.add(title, ScannerUtil.nextLine(scanner, message));
       message="글 내용을 입력해주세요.";
       content=ArrayUtil.add(content, ScannerUtil.nextLine(scanner, message));
       
    }
    // 출력하는 메소드
    public static void printAll() {
        if(ArrayUtil.size(id)!=0) {
            
            for (int i = 0; i < ArrayUtil.size(id); i++) {
                printOne(i);
            }
        }else {
            System.out.println("입력된 게시글이 없습니다.");
        }
    }
    // 1개 출력하는 메소드
    public static void printOne(int index) {
        System.out.println("-------------------------------");
        System.out.printf("글 번호: %d번 글 작성자: %s\n",id[index],writer[index]);
        System.out.printf("글 제목: %s\n", title[index]);
        System.out.printf("글 내용: %s\n", content[index]);
        System.out.println("-------------------------------");
    }
    // 사용자 입력에따른 메뉴
    public static void mainMenu() {
        while(true) {
            int userChoice=ScannerUtil.nextInt(scanner, "1. 입력 2. 출력 3. 종료");
            if(userChoice==INPUT_CODE) {
                input();
            }else if(userChoice==PRINT_CODE){
                printAll();
            }else if(userChoice==EXIT_CODE) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
    public static void main(String[] args) {
        mainMenu();
        scanner.close();
    }
}
