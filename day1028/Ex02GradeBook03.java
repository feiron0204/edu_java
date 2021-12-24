package day1028;

//ver 3.0: ArrayUtil에 Student 배열을 동적할당하는 메소드를 만들고
//     그것을 사용하여 학생들을 관리하는 프로그램을 작성하시오.
//     이때에는 개별 수정, 삭제도 가능해야 합니다.

//숙제: 게시판을 구조체로 만들고 동적할당을 적용시켜서
// 관리하는 프로그램을 만드시오
import util.ScannerUtil;
import util.ArrayUtil;
import struct.Student;
import java.util.Scanner;

public class Ex02GradeBook03 {
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    public static final int SUBJECT_SIZE = 3;
    public static final int INPUT_CODE = 1;
    public static final int PRINT_CODE = 2;
    public static final int EXIT_CODE = 3;
    public static final int OVERWRITE_CODE = 1;
    public static final int DELETE_CODE = 2;
    public static final int BACK_CODE = 3;
    public static final int STUDENT_SIZE = 5;
    public static final int OVERWRITE_ALL_CODE = 1;
    public static final int OVERWRITE_SCORE_CODE = 2;
    
    public static Scanner scanner = new Scanner(System.in);
    public static Student[] student = new Student[0]; 

    // 메뉴선택화면
    public static void selectMenu() {
        String message;
        while(true) {
            
            message="1. 입력 2. 출력 3. 종료";
            int userChoice=ScannerUtil.nextInt(scanner, message,INPUT_CODE,EXIT_CODE);
            if(userChoice==INPUT_CODE) {
                input();
            }else if(userChoice==PRINT_CODE) {
                preview();
            }else if(userChoice==EXIT_CODE) {
                System.out.println("사용해 주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
        
    }
    // 점수입력화면
    public static void input() {
        String message;
        Student temp = new Student();
        message = "학생 번호를 입력해주세요.";
        temp.id = ScannerUtil.nextInt(scanner, message);
        message = "학생 이름를 입력해주세요.";
        temp.name = ScannerUtil.nextLine(scanner, message);
        message = "학생 국어 점수를 입력해주세요.";
        temp.korean = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        message = "학생 영어 점수를 입력해주세요.";
        temp.english = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        message = "학생 수학 점수를 입력해주세요.";
        temp.math = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        student=ArrayUtil.add(student, temp);
    }
    // 성적표 목록 보기
    public static void preview() {
        System.out.println("---------------------성적표 목록------------------------");
        if(ArrayUtil.size(student)==0) {
            System.out.println("아직 입력된 성적이 없습니다.");
            System.out.println("---------------------------------------------------");
        }else {
            for(int i=0;i<ArrayUtil.size(student);i++) {
                System.out.printf((i+1)+"번째 학생 - 번호: %3d번            이름: %5s\n",student[i].id,student[i].name);            
            }
            System.out.println("---------------------------------------------------");
            String message;
            message = "몇번째 학생을 확인하시겠습니까? \n(메뉴로 가시려면 0을 입력해주세요.)";
            int userChoice=ScannerUtil.nextInt(scanner, message,0,ArrayUtil.size(student))-1;
            if(userChoice!=-1) {
                printOne(userChoice);
                
            }
        }
    }
    // 확실하게보기
    public static void printOne(int i) {
        System.out.println("---------------------------------------------------");
        int sum = student[i].korean + student[i].english + student[i].math;
        double average = (double) sum / SUBJECT_SIZE;

        System.out.printf("번호: %d번 이름: %s\n", student[i].id, student[i].name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", student[i].korean, student[i].english, student[i].math);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
        System.out.println("---------------------------------------------------");
        
        printMenu(i);
    }
    // 수정삭제뒤로가기메뉴
    public static void printMenu(int i) {
        String message;
        message="1. 수정 2. 삭제 3. 뒤로가기";
        int userChoice=ScannerUtil.nextInt(scanner, message,OVERWRITE_CODE,BACK_CODE);
        if(userChoice==OVERWRITE_CODE) {
            overwrite(i);
        }else if(userChoice==DELETE_CODE) {
            delete(i);
        }else if(userChoice==BACK_CODE) {
            preview();
        }
    }
    // 수정 메소드
    public static void overwrite(int i) {
        String message;
        message="1. 전체수정 2. 점수수정 3. 뒤로가기";
        int userChoice=ScannerUtil.nextInt(scanner, message,OVERWRITE_ALL_CODE,BACK_CODE);
        if(userChoice==OVERWRITE_ALL_CODE) {
            overwriteAll(i);
        }else if(userChoice==OVERWRITE_SCORE_CODE) {
            overwriteScore(i);
        }else if(userChoice==BACK_CODE) {
            printOne(i);
        }
    }
    // 전체 수정 메소드
    public static void overwriteAll(int i) {
        Student temp=new Student();
        String message;
        message = "학생 번호를 입력해주세요.";
        
        temp.id = ScannerUtil.nextInt(scanner, message);
        message = "학생 이름를 입력해주세요.";
        temp.name = ScannerUtil.nextLine(scanner, message);
        message = "학생 국어 점수를 입력해주세요.";
        temp.korean = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        message = "학생 영어 점수를 입력해주세요.";
        temp.english = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        message = "학생 수학 점수를 입력해주세요.";
        temp.math = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        ArrayUtil.set(student, i, temp);
        printOne(i);
    }
    // 점수 수정 메소드
    public static void overwriteScore(int i) {
        
        String message;
        
        message = "학생 국어 점수를 입력해주세요.";
        int korean = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        message = "학생 영어 점수를 입력해주세요.";
        int english = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        message = "학생 수학 점수를 입력해주세요.";
        int math = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        ArrayUtil.set(student, i, korean,english,math);
        printOne(i);
    }
    // 삭제 메소드
    public static void delete(int i) {
        String message;
        message="정말로 삭제하시겠습니까? Y/N";
        String userChoice=ScannerUtil.nextLine(scanner, message);
        if(userChoice.equalsIgnoreCase("y")) {
            student=ArrayUtil.remove(student, student[i]);
            preview();
        }else {
            printOne(i);
        }
            
    }
    // 메인메소드
    public static void main(String[] args) {
        selectMenu();
    }

}
