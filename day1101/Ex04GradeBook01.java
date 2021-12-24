package day1101;
// 5시 45분까지 
// ArrayList와 object.Student를 사용하여
// 학생관리 프로그램을 작성하시오
// 단, 모든 단계가 메소드로 이루어져있어야 하고
// 개별학생 수정, 삭제 또한 구현이 되어야 합니다.

import java.util.ArrayList;
import object.Student;
import java.util.Scanner;
import util.ScannerUtil;

public class Ex04GradeBook01 {
    private static final int INPUT_CODE=1;
    private static final int PRINT_CODE=2;
    private static final int EXIT_CODE=3;
    private static final int SCORE_MAX=100;
    private static final int SCORE_MIN=0;
    private static final int UPDATE_CODE=1;
    private static final int DELETE_CODE=2;
    private static final int BACK_CODE=0;
    
    private static Scanner scanner=new Scanner(System.in);
    private static ArrayList<Student> list=new ArrayList<>();
    
    //메인메뉴 메소드
    private static void printMenu() {
        while(true) {
            String menuMessage;
            menuMessage="1. 입력 2. 출력 3. 종료";
            int userChoice=ScannerUtil.nextInt(scanner, menuMessage,INPUT_CODE,EXIT_CODE);
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
    
    //입력하는 메소드
    private static void input() {
        String inputMessage;
        Student s=new Student();
        inputMessage="학생의 번호를 입력해주세요.";
        int id=ScannerUtil.nextInt(scanner, inputMessage);
        s.setId(id);
        inputMessage="학생의 이름를 입력해주세요.";
        String name=ScannerUtil.nextLine(scanner, inputMessage);
        s.setName(name);
        inputMessage="학생의 국어 점수를 입력해주세요.";
        int korean=ScannerUtil.nextInt(scanner, inputMessage);
        s.setKorean(korean);
        inputMessage="학생의 영어 점수를 입력해주세요.";
        int english=ScannerUtil.nextInt(scanner, inputMessage);
        s.setEnglish(english);
        inputMessage="학생의 수학 점수를 입력해주세요.";
        int math=ScannerUtil.nextInt(scanner, inputMessage);
        s.setMath(math);
        if(list.contains(s)) {
            System.out.println("이미 입력되있는 학생입니다.");
        }else {
            list.add(s);
        }
    }
    
    //전체를 출력하는 메소드
    private static void printAll() {
        if(list.isEmpty()) {
            System.out.println("입력된 학생 정보가 없습니다.");
        }else {
            System.out.println("--------현재 입력되어있는 학생의 정보입니다.--------");
            for(int i=0;i<list.size();i++) {
                System.out.printf("번호: %d 이름 %s\n", list.get(i).getId(),list.get(i).getName());
            }
            System.out.println("-----------------------------------------");
            String printAllMessage;
            printAllMessage="상세히 보시려면 학생의 번호를, 뒤로 돌아가시려면 0을 입력해주세요.";
            int userChoice=ScannerUtil.nextInt(scanner, printAllMessage);
            Student s=new Student();
            s.setId(userChoice);
            if(userChoice==BACK_CODE) {
                
            }else if(list.contains(s)) {
                printOne(s);
            }else {
                System.out.println("존재하지 않는 학생의 번호입니다.");
                printAll();
            }
                
                
        }
    }
    
    //상세한 내용을 출력하는 메소드
    private static void printOne(Student s) {
        s=list.get(list.indexOf(s));
        s.printInfo();
        
        String printOneMessage;
        printOneMessage="0. 뒤로가기 1. 수정 2. 삭제";
        int userChoice=ScannerUtil.nextInt(scanner, printOneMessage,BACK_CODE,DELETE_CODE);
        if(userChoice==UPDATE_CODE) {
            update(s);
        }else if(userChoice==DELETE_CODE) {
            delete(s);
        }else if(userChoice==BACK_CODE) {
            printAll();
        }
    }
    
    //수정을 담당하는 메소드
    private static void update(Student s) {
        Student temp=s;
        String updateMessage=new String("새로운 국어 점수를 입력해주세요.");
        int korean=ScannerUtil.nextInt(scanner, updateMessage,SCORE_MIN,SCORE_MAX);
        temp.setKorean(korean);
        
        updateMessage=new String("새로운 영어 점수를 입력해주세요.");
        int english=ScannerUtil.nextInt(scanner, updateMessage,SCORE_MIN,SCORE_MAX);
        temp.setEnglish(english);
        
        updateMessage=new String("새로운 수학 점수를 입력해주세요.");
        int math=ScannerUtil.nextInt(scanner, updateMessage,SCORE_MIN,SCORE_MAX);
        temp.setMath(math);
        
        
        list.set(list.indexOf(s), temp);
        /*
         * set안해줘도 주소내의 값이변해서 안넣어줘도된다ㅣ 라는데 약간이해앙감
         */
        printOne(temp);
    }
    
    //삭제를 담당하는 메소드
    private static void delete(Student s) {
        String deleteMessage=new String("정말로 삭제하시겠습니까? Y/N");
        String yesNo=ScannerUtil.nextLine(scanner, deleteMessage);
        if(yesNo.equalsIgnoreCase("y")) {
            list.remove(s);
            printAll();
        }else {
            printOne(s);
        }
    }
    
    
    public static void main(String[] args) {
        // 메인 메뉴 호출
        printMenu();
    }
}
