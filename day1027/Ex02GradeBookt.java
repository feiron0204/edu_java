package day1027;

import java.util.Scanner;
import util.ScannerUtil;

public class Ex02GradeBookt {
    // 상수
    public static final int STUDENT_SIZE = 5;
    public static final int SUBJECT_SIZE = 3;
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    public static final int INDEX_KOREAN = 0;
    public static final int INDEX_ENGLISH = 1;
    public static final int INDEX_MATH = 2;

    // 변수
    public static Scanner scanner = new Scanner(System.in);
    public static int[] idArray = new int[STUDENT_SIZE];
    public static String[] nameArray = new String[STUDENT_SIZE];
    public static int[][] scoreArray = new int[STUDENT_SIZE][SUBJECT_SIZE];
    public static int nextIndex = 0;

    // 메뉴를 담당하는 메소드
    public static void printMenu() {
        String massage = "1. 입력 2. 출력 3. 종료";

        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, massage, 1, 3);
            if (userChoice == 1) {
                addStudent();
            } else if (userChoice == 2) {
                printAll();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    // 입력을 담당하는 메소드
    public static void addStudent() {
        if (nextIndex < STUDENT_SIZE) {
            System.out.printf("[%d]번째 학생 정보 입력\n", nextIndex + 1);
            String message;

            message = "학생의 번호를 입력해주세요.";
            idArray[nextIndex] = ScannerUtil.nextInt(scanner, message);
            message = "학생의 이름를 입력해주세요.";
            nameArray[nextIndex] = ScannerUtil.nextLine(scanner, message);
            message = "학생의 국어 점수를 입력해주세요.";
            scoreArray[nextIndex][INDEX_KOREAN] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
            message = "학생의 영어 점수를 입력해주세요.";
            scoreArray[nextIndex][INDEX_ENGLISH] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
            message = "학생의 수학 점수를 입력해주세요.";
            scoreArray[nextIndex][INDEX_MATH] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
            nextIndex++;
        } else {
            System.out.println("더이상 등록하실 수 없습니다.");
        }
    }

    // 출력을 담당하는 메소드
    public static void printAll() {
        if (nextIndex == 0) {
            System.out.println("아직 등록된 학생의 정보가 존재하지 않습니다.");
        } else {
            for (int i = 0; i < nextIndex; i++) {
                int sum = scoreArray[i][INDEX_KOREAN] + scoreArray[i][INDEX_ENGLISH] + scoreArray[i][INDEX_MATH];
                double average = (double) sum / SUBJECT_SIZE;

                System.out.printf("번호: %d번 이름: %s\n", idArray[i], nameArray[i]);
                System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", scoreArray[i][INDEX_KOREAN],
                        scoreArray[i][INDEX_ENGLISH], scoreArray[i][INDEX_MATH]);
                System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);

            }
        }
    }

    // 메인메소드
    public static void main(String[] args) {
        printMenu();
    }
}
