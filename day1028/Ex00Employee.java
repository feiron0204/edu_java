package day1028;

import java.util.Random;
import java.util.Scanner;
import util.ArrayUtil;
import util.ScannerUtil;
import struct.Staff;

public class Ex00Employee {
    // 상수
    public static final int STAFF_MAX = 9999;
    public static final int INPUT_CODE = 1;
    public static final int PRINT_MENU_CODE = 2;
    public static final int EXIT_CODE = 3;
    public static final int PRINT_ALL_CODE = 1;
    public static final int PRINT_PART_CODE = 2;
    public static final int SEARCH_ID_CODE = 1;
    public static final int SEARCH_ANOTHER_CODE = 2;
    public static final int SEARCH_YEAR_CODE=3;
    public static final int BACK_CODE = 3;
    public static final int SEARCH_BACK_CODE=4;
    public static final int OVERWRITE_CODE = 1;
    public static final int DELETE_CODE = 2;

    // 변수
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static Staff[] staff = new Staff[0];

    // 메인메뉴
    public static void showMenu() {
        while (true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message, INPUT_CODE, EXIT_CODE);
            if (userChoice == INPUT_CODE) {
                input();
            } else if (userChoice == PRINT_MENU_CODE) {
                printMenu();
            } else if (userChoice == EXIT_CODE) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }

        }
    }

    // 입력화면
    public static void input() {
        String message;

        Staff s = new Staff();

        message = "이름을 입력해주세요";
        s.name = ScannerUtil.nextLine(scanner, message);
        message = "입사년도을 입력해주세요";
        s.year = ScannerUtil.nextInt(scanner, message);
        message = "직급을 입력해주세요\n(사장/임원/부장/사원/기타)";
        String position = ScannerUtil.nextLine(scanner, message);
        if (position.equals("사장")) {
            s.position = 'a';
        } else if (position.equals("임원")) {
            s.position = 'b';
        } else if (position.equals("부장")) {
            s.position = 'c';
        } else if (position.equals("사원")) {
            s.position = 'd';
        } else {
            s.position = 'e';
        }
        message = "부서를 입력해주세요";
        s.team = ScannerUtil.nextLine(scanner, message);
        while (true) {
            s.id = random.nextInt(STAFF_MAX) + 1;
            if (s.position == 'a') {
                s.id = 0;
            }
            if (!ArrayUtil.contains(staff, s)) {
                break;
            }
        }
        staff = ArrayUtil.add(staff, s);
    }

    // 출력 메뉴 화면
    public static void printMenu() {
        String message = "1. 전체 목록 출력 2. 검색 후 목록 출력 3. 뒤로가기";
        int userChoice = ScannerUtil.nextInt(scanner, message, PRINT_ALL_CODE, BACK_CODE);
        if (userChoice == PRINT_ALL_CODE) {
            printAll();
        } else if (userChoice == PRINT_PART_CODE) {
            selectList();
        } else if (userChoice == BACK_CODE) {
            
        }

    }

    // 전체출력화면
    public static void printAll() {
        if (ArrayUtil.isEmpty(staff)) {
            System.out.println("아직 입력된 사원의 정보가 없습니다.");
        } else {
            System.out.println("-----------------사원 목록-------------------");
            System.out.println("-------------------------------------------");
            System.out.println("-------id.No------------Name---------------");
            for (int i = 0; i < ArrayUtil.size(staff); i++) {
                System.out.printf("       %04d             %s\n", staff[i].id, staff[i].name);

            }
            System.out.println("-------------------------------------------");
            String message = "상세히 보실 인원의 id를 입력해주세요.\n(돌아가시려면 0을 눌러주세요)";
            Staff s = new Staff();
            s.id = ScannerUtil.nextInt(scanner, message, 0, STAFF_MAX);
            if (s.id == 0) {
                printMenu();
            } else {

                printOne(s, 1);

            }
        }

    }

    // 개별출력화면
    public static void printOne(Staff s, int where) {
        if (ArrayUtil.contains(staff, s)) {

            Staff temp = new Staff();
            int index = ArrayUtil.indexOf(staff, s);
            temp = staff[index];
            System.out.printf("사원번호: %04d 이름: %s\n", temp.id, temp.name);
            String position = "";
            if (temp.position == 'a') {
                position = "사장";
            } else if (temp.position == 'b') {
                position = "임원";
            } else if (temp.position == 'c') {
                position = "부장";
            } else if (temp.position == 'd') {
                position = "사원";
            } else if (temp.position == 'e') {
                position = "기타";
            }
            System.out.printf("현재부서: %s 입사년도: %d 직급: %s\n", temp.team, temp.year, position);
            System.out.println("-------------------------------\n");
            String message;

            message = "1. 수정 2. 삭제 3. 돌아가기";
            int userChoice = ScannerUtil.nextInt(scanner, message, OVERWRITE_CODE, BACK_CODE);
            if (userChoice == OVERWRITE_CODE) {
                overwrite(temp, where);
            } else if (userChoice == DELETE_CODE) {
                delete(temp, where);
            } else if (userChoice == BACK_CODE) {

                if (where == 1) {
                    printAll();
                } else if (where == 2) {
                    printPart();
                } else if (where == 3) {
                    selectList();
                } else if (where==4) {
                    printPart2();
                }
            }
        } else {
            System.out.println("해당 정보의 사원이 등록되어있지 않습니다");
            if (where == 1) {
                printAll();
            } else if (where == 2) {
                selectList();
            } else if (where == 3) {
                selectList();
            } else if (where==4) {
                selectList();
            }
        }

    }

    // 수정 메뉴 화면
    public static void overwrite(Staff s, int where) {

        String message = "이름을 입력해주세요";
        s.name = ScannerUtil.nextLine(scanner, message);
        message = "입사년도을 입력해주세요";
        s.year = ScannerUtil.nextInt(scanner, message);
        message = "직급을 입력해주세요\n(사장/임원/부장/사원/기타)";
        String position = ScannerUtil.nextLine(scanner, message);
        if (position.equals("사장")) {
            s.position = 'a';
        } else if (position.equals("임원")) {
            s.position = 'b';
        } else if (position.equals("부장")) {
            s.position = 'c';
        } else if (position.equals("사원")) {
            s.position = 'd';
        } else {
            s.position = 'e';
        }
        message = "부서를 입력해주세요";
        s.team = ScannerUtil.nextLine(scanner, message);

        printOne(s, where);

    }

    // 삭제 메뉴 화면
    public static void delete(Staff s, int where) {
        String message = "정말로 삭제하시겠습니까? Y/N";
        String yesNo = ScannerUtil.nextLine(scanner, message);
        if (yesNo.equalsIgnoreCase("y")) {
            staff = ArrayUtil.remove(staff, ArrayUtil.indexOf(staff, s));
        }
        printMenu();
    }

    // 검색 메뉴 화면
    public static void selectList() {
        String message = "1. 사원번호 검색 2. 이름/부서/직급검색 3. 입사년도검색 4. 돌아가기";
        int userChoice = ScannerUtil.nextInt(scanner, message, SEARCH_ID_CODE, SEARCH_BACK_CODE);
        Staff s = new Staff();
        if (userChoice == SEARCH_ID_CODE) {
            message = "사원 번호를 입력해주세요.";
            s.id = ScannerUtil.nextInt(scanner, message);
            printOne(s, 3);
        } else if (userChoice == SEARCH_ANOTHER_CODE) {
            printPart();

        } else if (userChoice == SEARCH_BACK_CODE) {
            printMenu();
        } else if(userChoice==SEARCH_YEAR_CODE) {
            printPart2();
        }
    }

    public static void printPart2() {
        String message="검색하실 입사년도를 입력해주세요";
        int search=ScannerUtil.nextInt(scanner, message);
        if (ArrayUtil.contains(staff, search)) {
            
            int[] index = new int[0];
            index = ArrayUtil.indexOf(staff, search);
            Staff[] searchResult = new Staff[0];
            for (int i = 0; i < ArrayUtil.size(index); i++) {
                
                searchResult = ArrayUtil.add(searchResult, staff[index[i]]);
            }
            System.out.println("-----------------사원 목록-------------------");
            System.out.println("-------------------------------------------");
            System.out.println("-------id.No------------Name---------------");
            for (int i = 0; i < ArrayUtil.size(searchResult); i++) {
                System.out.printf("       %04d             %s\n", searchResult[i].id, searchResult[i].name);
                
            }
            System.out.println("-------------------------------------------");
            message = "상세히 보실 인원의 id를 입력해주세요.\n(돌아가시려면 0을 눌러주세요)";
            Staff s = new Staff();
            s.id = ScannerUtil.nextInt(scanner, message, 0, STAFF_MAX);
            if (s.id == 0) {
                printMenu();
            } else {
                
                printOne(s, 4);
                
            }
        }else {
            System.out.println("입력하신 정보의 사원이 없습니다.");
            selectList();
        }
    
    }
    // 검색후 부분출력화면
    public static void printPart() {
        Staff s = new Staff();
        String message = "(이름)\n(부서명)\n(사장/임원/부장/사원/기타) 중 1가지를 입력해주세요.";
        String search = ScannerUtil.nextLine(scanner, message);
        s.position = '0';

        if (search.equals("사장")) {
            s.position = 'a';
        } else if (search.equals("임원")) {
            s.position = 'b';
        } else if (search.equals("부장")) {
            s.position = 'c';
        } else if (search.equals("사원")) {
            s.position = 'd';
        } else if (search.equals("기타")){
            s.position = 'e';
        }
        if (s.position=='0') {
        
            if (ArrayUtil.contains(staff, search)) {

                int[] index = new int[0];
                index = ArrayUtil.indexOf(staff, search);
                Staff[] searchResult = new Staff[0];
                for (int i = 0; i < ArrayUtil.size(index); i++) {
                   

                    searchResult = ArrayUtil.add(searchResult, staff[index[i]]);
                }
                System.out.println("-----------------사원 목록-------------------");
                System.out.println("-------------------------------------------");
                System.out.println("-------id.No------------Name---------------");
                for (int i = 0; i < ArrayUtil.size(searchResult); i++) {
                    System.out.printf("       %04d             %s\n", searchResult[i].id, searchResult[i].name);

                }
                System.out.println("-------------------------------------------");
                message = "상세히 보실 인원의 id를 입력해주세요.\n(돌아가시려면 0을 눌러주세요)";
                s = new Staff();
                s.id = ScannerUtil.nextInt(scanner, message, 0, STAFF_MAX);
                if (s.id == 0) {
                    printMenu();
                } else {

                    printOne(s, 2);

                }
            } else {
                System.out.println("해당 정보의 사원이 등록되어있지 않습니다");
                selectList();
            }

        } else {
            if (ArrayUtil.contains(staff, s.position)) {

                int[] index = new int[0];
                index = ArrayUtil.indexOf(staff, s.position);
                Staff[] searchResult = new Staff[0];
                for (int i = 0; i < ArrayUtil.size(index); i++) {

                    searchResult = ArrayUtil.add(searchResult, staff[index[i]]);
                }
                System.out.println("-----------------사원 목록-------------------");
                System.out.println("-------------------------------------------");
                System.out.println("-------id.No------------Name---------------");
                for (int i = 0; i < ArrayUtil.size(searchResult); i++) {
                    System.out.printf("       %04d             %s\n", searchResult[i].id, searchResult[i].name);

                }
                System.out.println("-------------------------------------------");
                message = "상세히 보실 인원의 id를 입력해주세요.\n(돌아가시려면 0을 눌러주세요)";
                s = new Staff();
                s.id = ScannerUtil.nextInt(scanner, message, 0, STAFF_MAX);
                if (s.id == 0) {
                    printMenu();
                } else {

                    printOne(s, 2);

                }

            } else {
                System.out.println("해당 정보의 사원이 등록되어있지 않습니다");
                selectList();
            }
        }

    }

    // 메인메소드
    public static void main(String[] args) {
        showMenu();
    }
}
