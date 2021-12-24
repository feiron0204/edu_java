package day1101;

import java.util.ArrayList;
import java.util.Scanner;
import util.ScannerUtil;
import object.Student;

public class Ex04GradeBook01t {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> list = new ArrayList<>();
    private static int nextId=1;
    private static final int SCORE_MIN=0;
    private static final int SCORE_MAX=100;
    
    public static void main(String[] args) {
        showMenu();
    }
    
    private static void showMenu() {
        String message =new String("1. 입력 2. 출력 3. 종료");
        
        while(true) {
            int userChoice=ScannerUtil.nextInt(scanner, message);
            
            if(userChoice==1) {
                insert();
            }else if(userChoice==2) {
                printList();
            }else if(userChoice==3) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }
    
    private static void insert() {
        Student s = new Student();
        s.setId(nextId++);
        
        String message;
        
        message = new String("학생의 이름을 입력해주세요.");
        String name=ScannerUtil.nextLine(scanner, message);
        s.setName(name);
        
        message = new String("학생의 국어 점수를 입력해주세요.");
        int korean = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        s.setKorean(korean);
        
        message = new String("학생의 영어 점수를 입력해주세요.");
        int english = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        s.setEnglish(english);
        
        message = new String("학생의 수학 점수를 입력해주세요.");
        int math = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        s.setMath(math);
        
        
        list.add(s);
    }
    private static void printList() {
        if(list.isEmpty()) {
            System.out.println("아직 등록된 학생이 존재하지 않습니다.");
        }else {
            for(int i=0; i<list.size();i++) {
                System.out.printf("%d. %s\n", list.get(i).getId(),list.get(i).getName());
            }
            String message = new String("상세보기할번호나 뒤로가시려면 0을 입력해주세요.");
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            /*
             * 아래에 selectById 만들기 전에 사용한거
             */
            
//            Student s = new Student();
//            s.setId(userChoice);
//            while(userChoice !=0 && !list.contains(s)) {
//                System.out.println("잘못 입력하셨습니다.");
//                userChoice = ScannerUtil.nextInt(scanner, message);
//                s.setId(userChoice);
//                
//            }
            while(userChoice !=0 && selectById(userChoice)==null) {
                System.out.println("잘못 입력하셧습니다.");
                userChoice=ScannerUtil.nextInt(scanner, message);
            }
            if(userChoice !=0) {
                printOne(userChoice);
            }
            
        }
        
    }
    private static void printOne(int id) {
        Student s = selectById(id);
        
        s.printInfo();
        
        String message ="1. 수정 2. 삭제 3. 뒤로가기";
        int userChoice = ScannerUtil.nextInt(scanner, message,1,3);
        if(userChoice==1) {
            update(id);
        }else if(userChoice==2) {
            delete(id);
        }else if(userChoice==3) {
            printList();
        }
        
    }
    private static Student selectById(int id) {
        Student s=new Student();
        s.setId(id);
        
        if(list.contains(s)) {
            int index=list.indexOf(s);
            return list.get(index);
        }
        
        return null;
    }
    
    private static void update(int id) {
        Student s = selectById(id);
        
        String message;
        
        message = new String("새로운 국어 점수를 입력해주세요.");
        s.setKorean(ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX));
        message = new String("새로운 영어 점수를 입력해주세요.");
        s.setEnglish(ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX));
        message = new String("새로운 수학 점수를 입력해주세요.");
        s.setMath(ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX));
        
        printOne(id);
    }
    
    private static void delete(int id) {
        Student s = selectById(id);
        
        String message = new String("정말로 삭제하시겠습니까? Y/N");
        String yesNo=ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("y")) {
            list.remove(s);
            printList();
        }else {
            printOne(id);
        }
    }
}
