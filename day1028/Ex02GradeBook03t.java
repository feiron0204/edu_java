package day1028;

import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;

import struct.Student;

public class Ex02GradeBook03t {
    // 상수
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    public static final int SUBJECT_SIZE = 3;

    // 변수
    public static Scanner scanner = new Scanner(System.in);
    public static Student[] array = new Student[0];
    public static int nextId = 1;

    // 메뉴 담당 메소드
    public static void showMenu() {
        String message = "1. 입력 2. 출력 3. 종료";
        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, message);

            if (userChoice == 1) {
                // 입력 담당 메소드 호출
                insert();
            } else if (userChoice == 2) {
                // 목록 출력 담당 메소드 호출
                printAll();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }

    // 입력 담당 메소드
    public static void insert() {
        Student s = new Student();

        s.id = nextId++;

        String message = "이름을 입력해주세요.";
        s.name = ScannerUtil.nextLine(scanner, message);
        message = "국어 점수을 입력해주세요.";
        s.korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        message = "영어 점수을 입력해주세요.";
        s.english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        message = "수학 점수을 입력해주세요.";
        s.math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        array = ArrayUtil.add(array, s);
    }

    // 목록 출력 담당 메소드
    public static void printAll() {
        if (ArrayUtil.isEmpty(array)) {
            System.out.println("아직 입력된 학생이 존재하지 않습니다.");
        } else {
            for (int i = 0; i < ArrayUtil.size(array); i++) {
                Student s = ArrayUtil.get(array, i);
                System.out.printf("%d번 %s\n", i + 1, s.name);
            }
            System.out.println("----------------------------");
            String message = "상세보기할 학생의 번호나 뒤로 가실려면 0을 입력해주세요.";
            int userChoice = ScannerUtil.nextInt(scanner, message, 0, ArrayUtil.size(array)) - 1;
            if (userChoice != -1) {

                printOne(userChoice);
            }
        }
    }

    // 개별 출력 메소드
    public static void printOne(int index) {
        Student s = ArrayUtil.get(array, index);

        int sum = s.korean + s.english + s.math;
        double average = (double) sum / SUBJECT_SIZE;
        System.out.printf("번호: %d번 이름: %s\n", s.id, s.name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", s.korean, s.english, s.math);
        System.out.printf("총점: %03d점 평균 %06.2f점\n", sum, average);
        System.out.println("---------------------------------\n");
        String message = "1. 수정 2. 삭제 3. 뒤로";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

        if (userChoice == 1) {
            // 수정 메소드 호출
            update(index);
        } else if (userChoice == 2) {
            // 삭제 메소드 호출
            delete(index);
        } else if (userChoice == 3) {
            printAll();
        }
    }

    // 수정 메소드
    public static void update(int index) {
        Student s = ArrayUtil.get(array, index);

        String message = "새로운 국어 점수를 입력해주세요.";
        s.korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        message = "새로운 영어 점수를 입력해주세요.";
        s.english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        message = "새로운 수학 점수를 입력해주세요.";
        s.math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

//        ArrayUtil.set(array, index, s);
        /*
         * 어차피 주소값에 있는 값이 바뀌기 때문에 굳이 set안해줘도 이미 바뀌어있음
         */
        printOne(index);
    }

    // 삭제 메소드
    public static void delete(int index) {
        String message = "정말로 삭제하시겠습니까? Y/N";
        String yesNo = ScannerUtil.nextLine(scanner, message);
        if(yesNo.equalsIgnoreCase("y")) {
            array=ArrayUtil.remove(array,index);
            printAll();
        }else {
            printOne(index);
        }
    }

    // 메인 메소드
    public static void main(String[] args) {
        showMenu();
    }
}
