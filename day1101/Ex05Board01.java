package day1101;
//게시판 작성 프로그램
import util.ScannerUtil;
import object.Boardt;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex05Board01 {
    private static final int INPUT_CODE=1;
    private static final int PRINT_CODE=2;
    private static final int EXIT_CODE=3;
    private static final int UPDATE_CODE=1;
    private static final int DELETE_CODE=2;
    private static final int BACK_CODE=0;
    
    private static ArrayList<Boardt> list=new ArrayList<>();
    private static Scanner scanner=new Scanner(System.in);
    private static int nextId=1;
    
    // 메인메뉴 메소드
    private static void showMenu() {
        String showMenuMessage=new String("1. 입력 2. 출력 3. 종료");
        while(true) {
            int userChoice=ScannerUtil.nextInt(scanner, showMenuMessage,INPUT_CODE,EXIT_CODE);
            
            if(userChoice==INPUT_CODE) {
                input();
            }else if(userChoice==PRINT_CODE) {
                printAll();
            }else if(userChoice==EXIT_CODE) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
               
    }
    // 입력창 메소드
    private static void input() {
        Boardt b=new Boardt();
        b.setId(nextId++);
        
        String inputMessage=new String("글 제목을 입력하세요.");
        String title=ScannerUtil.nextLine(scanner,inputMessage);
        b.setTitle(title);
        
        inputMessage=new String("글 작성자를 입력하세요.");
        String writer=ScannerUtil.nextLine(scanner, inputMessage);
        b.setWriter(writer);
        
        inputMessage=new String("글 내용을 입력하세요.");
        String content=ScannerUtil.nextLine(scanner, inputMessage);
        b.setContent(content);
        
        list.add(b);
        
    }
    
    // 전체목록 출력 메소드
    private static void printAll() {
        if(list.size()==0) {
            System.out.println("아직 작성된 게시글이 없습니다.");
        }else {
            System.out.println("-------게시글 목록---------");
            System.out.println(" 글 번호           제목    ");
            System.out.println("------------------------");
            for(int i=0;i<list.size();i++) {
               
                System.out.printf("  %d           %s\n",list.get(i).getId(),list.get(i).getTitle());
                
            }
            System.out.println("------------------------");
            String printAllMessage=new String("글을 상세히 보시려면 글번호를, 뒤로가시려면 0을 입력해주세요");
            int userChoice=ScannerUtil.nextInt(scanner, printAllMessage);
            Boardt b=new Boardt();
            b.setId(userChoice);
            
            if(userChoice==BACK_CODE) {
                
            }else if(list.contains(b)) {
                printOne(list.indexOf(b));
            }else {
                System.out.println("존재하지 않는 게시글 번호 입니다.");
                printAll();
            }
        }
    }
    
    //상세보기 메소드
    private static void printOne(int index) {
        list.get(index).print();
        
        String printOneMessage=new String("0. 뒤로가기 1. 수정 2. 삭제");
        int userChoice=ScannerUtil.nextInt(scanner, printOneMessage,BACK_CODE,DELETE_CODE);
        if(userChoice==BACK_CODE) {
            printAll();
        }else if(userChoice==UPDATE_CODE) {
            update(index);
        }else if(userChoice==DELETE_CODE) {
            delete(index);
        }
    }
    
    // 수정 메소드
    private static void update(int index) {
        Boardt b=list.get(index);
        String updateMessage=new String("새로운 글 제목을 입력해주세요.");
        String title=ScannerUtil.nextLine(scanner, updateMessage);
        b.setTitle(title);
        
        updateMessage=new String("새로운 글 작성자을 입력해주세요.");
        String name=ScannerUtil.nextLine(scanner, updateMessage);
        b.setWriter(name);
        
        updateMessage=new String("새로운 글 내용을 입력해주세요.");
        String content=ScannerUtil.nextLine(scanner, updateMessage);
        b.setContent(content);
        
        list.set(index, b);
        
        printOne(index);
    }
    
    //삭제 메소드
    private static void delete(int index) {
        String deleteMessage=new String("정말로 삭제하시겠습니까? Y/N");
        String yesNo=ScannerUtil.nextLine(scanner, deleteMessage);
        if(yesNo.equalsIgnoreCase("y")) {
            list.remove(index);
            printAll();
        }else {
            printOne(index);
        }
    }
    
    
    
    public static void main(String[] args) {
        showMenu();
    }
}
