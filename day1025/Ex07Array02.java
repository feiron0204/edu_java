package day1025;

import java.util.Scanner;
import util.ScannerUtil;

public class Ex07Array02 {
    public static Scanner scanner = new Scanner(System.in);
    public static final int ARRAY_SIZE = 5;
    public static int[] numArray = new int[ARRAY_SIZE];
    public static int nextIndex = 0;

    // 입력해줄꺼
    public static void input() {
        // 꽉차있으면 한자리만들기
        if (nextIndex == ARRAY_SIZE) {
            for (int i = 0; i < numArray.length-1; i++) {
                numArray[i] = numArray[i + 1];
            }
            nextIndex--;
        }
        String message="저장할 숫자를 입력해주세요";
        numArray[nextIndex]=ScannerUtil.nextInt(scanner, message);
        nextIndex++;

    }

    //출력담당 메소드
    public static void printAll() {
        if(nextIndex>0) {
            for(int i=0;i<nextIndex;i++) {
                printOne(i);
            }
            System.out.println("\n---------------------------------");
        }else {
            System.out.println("저장된 숫자가 없습니다.");
        }
    }
    
    //개별출력담당 메소드
    public static void printOne(int i) {
        System.out.print(" "+numArray[i]+" ");
    }
    
    //메인메뉴메소드
    public static void printMenu() {
        while(true) {
            
            int userChoice=ScannerUtil.nextInt(scanner, "1. 입력 2. 출력 3. 종료",1,3);
            if(userChoice==1) {
                input(); 
            }else if(userChoice==2) {
                printAll();
            }else if(userChoice==3) {
                System.out.println("사용해주셔서 감사합니다");
                break;
            }
        }
    }
    //메인메소드
    public static void main(String[] args) {
        printMenu();
        scanner.close();
    }
}
