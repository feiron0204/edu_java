package day1022;

import java.util.Scanner;
import util.ScannerUtil;

public class HWInfo {
    public static void main(String[] args) {
        final int SUBJECT_SIZE=3;
        Scanner scanner = new Scanner(System.in);
        int id = ScannerUtil.nextInt(scanner, "학생의 번호를 입력해주세요");
        scanner.nextLine();
        String name = ScannerUtil.nextLine(scanner, "학생의 이름을 입력해주세요");
        int korean = ScannerUtil.nextInt(scanner, "국어 점수를 입력해주세요");
        int english = ScannerUtil.nextInt(scanner, "영어 점수를 입력해주세요");
        int math = ScannerUtil.nextInt(scanner, "수학 점수를 입력해주세요");

        int sum = korean + english + math;
        double average = (double) sum / SUBJECT_SIZE;
        System.out.printf("번호: %d 이름: %s\n", id, name);
        System.out.printf("국어: %03d 영어: %03d 수학: %03d\n", korean, english, math);
        System.out.printf("합계: %03d 평균: %06.2f\n", sum,average);
        
        
        scanner.close();
    }
}
