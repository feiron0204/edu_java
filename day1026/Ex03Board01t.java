package day1026;
// ArrayUtil을 사용한 게시판 관리 프로그램

import java.util.Scanner;
import util.ArrayUtil;
import util.ScannerUtil;
public class Ex03Board01t {
    // 전역변수
    public static Scanner scanner=new Scanner(System.in);
    public static int[] idArray=new int[0];
    public static String[] titleArray=new String[0];
    public static String[] writerArray=new String[0];
    public static String[] contentArray=new String[0];
    public static int nextId=1;
    
    // 메뉴 출력 메소드
    public static void printMenu() {
        String message="1. 새 글 등록 2. 글 전체보기 3. 종료";
        while(true) {
            int userChoice=ScannerUtil.nextInt(scanner, message);
            
            if(userChoice==1) {
                // 입력 메소드 호출
                writeBoard();
            }else if(userChoice==2) {
                // 목록 출력 메소드 호출
                printAll();
            }else if(userChoice==3) {
                // 메세지 출력후 종료
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }
    // 입력 메소드
    public static void writeBoard() {
        // 다음글 번호를 저장한
        // nextId의 현재 값을 idArray에 추가하고
        // nextId의 값을 1 증가시킨다.
        idArray=ArrayUtil.add(idArray, nextId++);
        
        // 사용자로부터 입력을 받아서
        // 글 제목을 titleArray에 추가한다.
        String message="글의 제목을 입력해주세요.";
        String title = ScannerUtil.nextLine(scanner, message);
        titleArray=ArrayUtil.add(titleArray, title);
        
        // 사용자로부터 입력을 받아서
        // 작성자를 writerArray에 추가한다.
        message="글의 작성자을 입력해주세요.";
        String writer = ScannerUtil.nextLine(scanner, message);
        writerArray=ArrayUtil.add(writerArray, writer);
        
        // 사용자로부터 입력을 받아서
        // 작성자를 contentArray에 추가한다.
        message="글의 내용을 입력해주세요.";
        String content = ScannerUtil.nextLine(scanner, message);
        contentArray=ArrayUtil.add(contentArray, content);
        
    }
    // 목록 출력 메소드
    public static void printAll() {
        System.out.println("\n----------------------------");
        if(ArrayUtil.isEmpty(idArray)) {
            // idArray가 비어있다라는 의미는
            // 등록된 글이 한개도 없다라는 의미이므로
            // 경고 메세지만 출력
            System.out.println("\n아직 등록된 글이 없습니다.\n");
        }else {
            // idArray가 비어있지 않으므로
            // 글을 출력한다.
            for(int i=0;i<ArrayUtil.size(idArray);i++) {
//                printOne(i);
                System.out.printf("%d. %s\n",i+1, ArrayUtil.get(titleArray,i));
            }
            
            String message = "상세보기할 글의 번호나 뒤로 가실려면 0을 입력해주세요.";
            int userChoice=ScannerUtil.nextInt(scanner, message,0,ArrayUtil.size(idArray))-1;
            
            if(userChoice !=-1) {
                printOne(userChoice);
            }
        }
        System.out.println("----------------------------\n");
        
    }
    // 개별 출력 메소드
    public static void printOne(int index) {
        System.out.println("\n=============================");
        System.out.println("제목: "+ArrayUtil.get(titleArray, index));
        System.out.println("-----------------------------");
        System.out.printf("글 번호: %d번 작성자: %s\n",ArrayUtil.get(idArray,index),ArrayUtil.get(writerArray, index));
        System.out.println("-----------------------------");
        System.out.println(ArrayUtil.get(contentArray, index));
        
        System.out.println("=============================\n");
        String message="1. 수정 2. 삭제 3. 뒤로가기";
        int userChoice = ScannerUtil.nextInt(scanner, message,1,3);
        
        if(userChoice==1) {
            // 글 수정 메소드 호출
            updateBoard(index);
        }else if(userChoice==2) {
            // 글 삭제 메소드 호출
            deleteBoard(index);
        }else if(userChoice==3) {
            // 지금 단계에서 뒤로가기는
            //당연히 글 목록보기를 뜻하므로
            //글 전체 목록 출력 메소드를 실행한다.
            printAll();
        }
    }
    
    public static void updateBoard(int index) {
        String message;
        
        message = "새로운 제목을 입력하세요.";
        String title = ScannerUtil.nextLine(scanner, message);
        ArrayUtil.set(titleArray, index, title);
        
        message = "새로운 내용을 입력하세요.";
        String content = ScannerUtil.nextLine(scanner, message);
        ArrayUtil.set(contentArray, index, content);
        
        printOne(index);
        
    }
    
    public static void deleteBoard(int index) {
        String message="정말로 삭제하시겠습니까? Y/N";
        String yesNo=ScannerUtil.nextLine(scanner, message);
        if(yesNo.equalsIgnoreCase("y")) {            
            idArray=ArrayUtil.removeByIndex(idArray, index);
            titleArray=ArrayUtil.remove(titleArray, index);
            writerArray=ArrayUtil.remove(writerArray, index);
            contentArray=ArrayUtil.remove(contentArray, index);
            
            printAll();

        }else {
            printOne(index);
            
        }
    }
    // 메인 메소드
    public static void main(String[] args) {
        printMenu();
    }
}
