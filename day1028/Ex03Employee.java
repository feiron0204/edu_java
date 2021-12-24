package day1028;

import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;

import struct.Employee;

public class Ex03Employee {
    public static Scanner scanner = new Scanner(System.in);
    public static Employee[] array = new Employee[0];
    public static int nextId=1;
    
    // 메인 메소드
    public static void main(String[] args) {
        showMenu();
    }
    // 메뉴 메소드
    public static void showMenu() {
        String message = "1. 입력 2. 출력 3. 종료";
        while(true) {
            int userChoice=ScannerUtil.nextInt(scanner, message,1,3);
            
            if(userChoice==1) {
                insert();
            }else if(userChoice==2) {
                printAll();
            }else if(userChoice==3) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }
    // 입력 메소드
    public static void insert() {
        Employee e=new Employee();
        
        e.id=nextId++;
        
        String message;
        
        message="사원의 이름을 입력해주세요.";
        e.name=ScannerUtil.nextLine(scanner, message);
        
        message="사원의 부서를 입력해주세요.";
        e.department=ScannerUtil.nextLine(scanner, message);
        
        message="사원의 직급을 입력해주세요.";
        e.rank=ScannerUtil.nextLine(scanner, message);
        
        message="사원의 연봉을 입력해주세요.";
        e.salary=ScannerUtil.nextInt(scanner, message);
        
        message="사원의 입사년도를 입력해주세요.";
        e.year=ScannerUtil.nextInt(scanner, message);
        
        array=ArrayUtil.add(array, e);
    }
    
    // 목록 출력 메소드
    public static void printAll() {
        if(ArrayUtil.isEmpty(array)) {
            System.out.println("아직 등록된 사원 정보가 존재하지 않습니다.");
        }else {
            for(int i=0;i<ArrayUtil.size(array);i++) {
                Employee e=ArrayUtil.get(array,i);
                System.out.printf("%d. %s %s\n", e.id, e.name,e.rank);
            }
            String message = "상세보기할 사원의 번호나 뒤로가실려면 0을 입력해주세요.";
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            while(userChoice!=0&&findIndex(userChoice)==-1) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice=ScannerUtil.nextInt(scanner, message);
            }
            
            if(userChoice!=0) {
                printOne(userChoice);
            }
        }
    }
    
    // 입력된 번호를 토대로 배열의 인덱스를 찾는 메소드
    public static int findIndex(int id) {
        Employee e=new Employee();
        e.id=id;
        
        return ArrayUtil.indexOf(array, e);
    }
    
    // 개별 출력 메소드
    public static void printOne(int id) {
        int index=findIndex(id);
        Employee e=ArrayUtil.get(array, index);
        
        System.out.printf("사원번호: %d 이름: %s\n", e.id,e.name);
        System.out.printf("사원부서: %s 사원직급: %s\n", e.department,e.rank);
        System.out.printf("입사년도: %d 월급: %d원\n", e.year,e.salary);
        
        String message = "1. 수정 2. 삭제 3. 뒤로가기";
        int userChoice=ScannerUtil.nextInt(scanner, message,1,3);
        if(userChoice==1) {
            update(id);
        }else if(userChoice==2) {
            delete(id);
        }else if(userChoice==3) {
            printAll();
        }
    }
    // 수정 메소드
    public static void update(int id) {
        int index= findIndex(id);
        Employee e = ArrayUtil.get(array, index);
        
        String message = "새로운 부서를 입력해주세요.";
        e.department=ScannerUtil.nextLine(scanner, message);
        
        message ="새로운 직급을 입력해주세요.";
        e.rank=ScannerUtil.nextLine(scanner, message);
        
        message="새로운 월급을 입력해주세요.";
        e.salary=ScannerUtil.nextInt(scanner, message);
        
        printOne(id);
        
    }
    // 삭제 메소드
    public static void delete(int id) {
        int index=findIndex(id);
        String message = "정말로 삭제하시겠습니까? Y/N";
        String yesNo=ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("y")) {
            array=ArrayUtil.remove(array, index);
            printAll();
        }else {
            printOne(id);
        }
    }
    
}
