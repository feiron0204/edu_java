package viewer;

import java.util.ArrayList;
import java.util.Scanner;

import controller.StudentController;
import model.StudentDTO;
import util.ScannerUtil;

public class StudentViewer {
    private final int SCORE_MIN=0;
    private final int SCORE_MAX=100;
    private final int SUBJECT_SIZE=3;
    private final int INPUT_CODE=1;
    private final int PRINT_CODE=2;
    private final int EXIT_CODE=3;
    private final int BACK_CODE=0;
    private final int UPDATE_CODE=1;
    private final int DELETE_CODE=2;
    
    private Scanner scanner;
    private StudentController studentController;
    
    public StudentViewer() {
        scanner = new Scanner(System.in);
        studentController=new StudentController();
    }
    
    public void showMenu() {
        String message=new String("1. 입력 2. 출력 3. 종료");
        while(true) {
            
            int userChoice=ScannerUtil.nextInt(scanner, message,INPUT_CODE,EXIT_CODE);
            if(userChoice==INPUT_CODE) {
                input();
            }else if (userChoice==PRINT_CODE) {
                printAll();
            }else if (userChoice==EXIT_CODE) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }
    
    private void input() {
        StudentDTO s = new StudentDTO();
        
        String message=new String("이름을 입력하세요.");
        s.setName(ScannerUtil.nextLine(scanner, message));
        
        message=new String("국어 점수를 입력하세요.");
        s.setKorean(ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX));
        message=new String("영어 점수를 입력하세요.");
        s.setEnglish(ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX));
        message=new String("수학 점수를 입력하세요.");
        s.setMath(ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX));
        
        studentController.insert(s);
        
    }
    
    private void printAll() {
        ArrayList<StudentDTO> list=studentController.selectAll();
        if(list.isEmpty()) {
            System.out.println("아직 입력된 학생정보가 없습니다.");
        }else {
            for(StudentDTO s : list) {
                
                System.out.printf("%d, %s\n",s.getId(),s.getName());
            }
        
            String message = new String("상세히 보시려면 번호를 뒤로 돌아가시려면 0을 입력해주세요.");
            int userChoice=ScannerUtil.nextInt(scanner, message);
            if(userChoice!=0) {
                printOne(userChoice);
            }
        }
    }
    
    private void printOne(int id) {
        StudentDTO s = studentController.selectOne(id);
        if(s==null) {
            System.out.println("해당 번호를 가진 학생이 없습니다.");
            printAll();
        }else {
            printDetail(s);
            String message = new String("1. 수정 2. 삭제 0. 뒤로가기");
            int userChoice=ScannerUtil.nextInt(scanner, message,BACK_CODE,DELETE_CODE);
            if(userChoice==UPDATE_CODE) {
                update(id);
            }else if(userChoice==DELETE_CODE) {
                delete(id);
            }else if(userChoice==BACK_CODE) {
                printAll();
            }
        }
        
    }
    private void update(int id) {
        StudentDTO s=studentController.selectOne(id);
        
        String message = new String("새로운 국어점수를 입력해주세요.");
        s.setKorean(ScannerUtil.nextInt(scanner, message));
        
        message = new String("새로운 영어점수을 입력해주세요");
        s.setEnglish(ScannerUtil.nextInt(scanner, message));
        
        message = new String("새로운 수학점수을 입력해주세요");
        s.setMath(ScannerUtil.nextInt(scanner, message));
        
        message = new String("정말로 수정하시겠습니까? Y/N");
        String yesNo = ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("y")) {
            studentController.update(s);
        }
        
        printOne(id);
    }
    private void delete(int id) {
        String message = new String("정말로 삭제하시겠습니까? Y/N");
        String yesNo=ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("y")) {
            studentController.delete(id);
            printAll();
        }else {
            printOne(id);
        }
    }
    
    private void printDetail(StudentDTO s) {
        int sum=s.getKorean()+s.getEnglish()+s.getMath();
        double average=(double)sum/SUBJECT_SIZE;
        System.out.printf("번호: %d 이름: %s\n", s.getId(),s.getName());
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",s.getKorean(),s.getEnglish(),s.getMath());
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum,average);
        
    }
}
