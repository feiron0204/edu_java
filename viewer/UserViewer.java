package viewer;

import java.util.Scanner;

import controller.UserController;
import model.UserDTO;
import util.ScannerUtil;

public class UserViewer {
    private final int LOGIN_CODE = 1;
    private final int JOIN_CODE = 2;
    private final int EXIT_CODE = 3;
//    private final int SEARCH_CODE = 1;
    private final int UPDATE_CODE = 1;
    private final int DELETE_CODE = 2;
    private final int LOGOUT_CODE = 3;

    private UserController userController;
    private Scanner scanner;

    public UserViewer() {
        userController = new UserController();
        scanner = new Scanner(System.in);
    }

    public void mainMenu() {
        String message = new String("1. 로그인 2. 회원가입 3. 종료");
        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, message, LOGIN_CODE, EXIT_CODE);
            if (userChoice == LOGIN_CODE) {
                loginPage();
            } else if (userChoice == JOIN_CODE) {
                joinPage();
            } else if (userChoice == EXIT_CODE) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }

        }
    }

    private void joinPage() {
        UserDTO u = new UserDTO();
        String message = new String("원하시는 아이디를 입력해주세요.");
        while (true) {
            String id = ScannerUtil.nextLine(scanner, message);
            u.setId(id);
            if (!userController.overlab(id)) {
                break;
            }
            System.out.println("이미 사용중인 아이디입니다.\n");
        }

        while (true) {
            message = new String("원하시는 비밀번호를 입력해주세요.");
            String pw1 = ScannerUtil.nextLine(scanner, message);

            message = new String("비밀번호를 한번 더 입력해주세요.");
            String pw2 = ScannerUtil.nextLine(scanner, message);

            if (pw1.equals(pw2)) {
                u.setPw(pw2);
                break;
            }
            System.out.println("입력한 비밀번호가 서로 다릅니다.\n");
        }

        message = new String("원하시는 닉네임을 설정해주세요.");
        u.setName(ScannerUtil.nextLine(scanner, message));

        userController.insert(u);
    }

    private void loginPage() {
        String message;
        message = new String("아이디를 입력해주세요.");
        String id = ScannerUtil.nextLine(scanner, message);
        message = new String("비밀번호를 입력해주세요.");
        String pw = ScannerUtil.nextLine(scanner, message);

        if (userController.overlab(id)) {
            UserDTO u = userController.selectOne(id);
            if (u.getPw().equals(pw)) {
                printInfo(id);
            } else {
                System.out.println("비밀번호가 틀렸습니다.\n");
            }
        } else {
            System.out.println("입력된 회원정보가 존재하지 않습니다.\n");
        }
    }

    private void printInfo(String id) {
        UserDTO u = userController.selectOne(id);
        String pwStar = "";
        for (int i = 0; i < u.getPw().length(); i++) {
            pwStar += "*";
        }

        System.out.printf("회원번호: %04d 아이디: %s 비밀번호: %s 닉네임: %s\n", u.getNum(), u.getId(), pwStar, u.getName());
        String message = new String("1. 회원정보 수정 2. 회원정보 삭제 3. 로그아웃");
        int userChoice = ScannerUtil.nextInt(scanner, message, UPDATE_CODE, LOGOUT_CODE);
        if (userChoice == UPDATE_CODE) {
            update(id);
        } else if (userChoice == DELETE_CODE) {
            delete(id);
        } else if (userChoice == LOGOUT_CODE) {
            System.out.println("로그아웃되였습니다.");
        }
        
        /*
         * 친구찾기기능.....닉네임이나 아이디 회원번호로 으쌰으쌰...
         * 근데 닉네임은 중복이니 목록을 보여줘야함-> day1028.Ex00Employee 보고와라...고통임
         * 그리고 친구찾기넣는순간 리스트도 수정해야할꺼같고...찾는거도수정해야할꺼같고...몰라 일단은 킵
         */
//        String message = new String("1. 친구찾기 2. 회원정보 수정 3. 회원정보 삭제 4. 로그아웃");
//        int userChoice = ScannerUtil.nextInt(scanner, message, SEARCH_CODE, LOGOUT_CODE);
//        if (userChoice == UPDATE_CODE) {
//            update(id);
//        } else if (userChoice == DELETE_CODE) {
//            delete(id);
//        } else if (userChoice == LOGOUT_CODE) {
//            System.out.println("로그아웃되였습니다.");
//        } else if(userChoice==SEARCH_CODE) {
//            search(id);
//        }
    }
//    private void search(String id) {
//        String message = new String("회원번호로 찾으시려면 1, 아이디로 찾으시려면 2를 입력해주세요\n(돌아가시려면 0을 입력해주세요)");
//        int userChoice = ScannerUtil.nextInt(scanner, message,0,2);
//        if(userChoice==0) {
//            printInfo(id);
//        }else if(userChoice==1) {
//            message = new String("찾으시는 친구의 회원번호를 입력해주세요");
//            int friendNum=ScannerUtil.nextInt(scanner, message);
//            
//        }else if(userChoice==2) {
//            message = new String("찾으시는 친구의 아이디를 입력해주세요");
//            String friendId=ScannerUtil.nextLine(scanner, message);
//            
//            
//        }
//    }

    private void update(String id) {
        String message = new String("비밀번호를 한번 더 입력해주세요.");
        String pw = ScannerUtil.nextLine(scanner, message);
        UserDTO u = userController.selectOne(id);
        if (u.getPw().equals(pw)) {
            message = new String("변경하실 닉네임을 입력해주세요.");
            u.setName(ScannerUtil.nextLine(scanner, message));

            while (true) {
                message = new String("새로운 비밀번호를 입력해주세요.");
                String pw1 = ScannerUtil.nextLine(scanner, message);

                message = new String("비밀번호를 한번 더 입력해주세요.");
                String pw2 = ScannerUtil.nextLine(scanner, message);

                if (pw1.equals(pw2)) {
                    u.setPw(pw2);
                    break;
                }
                System.out.println("입력한 비밀번호가 서로 다릅니다.\n");
            }
            userController.update(u);
            printInfo(id);
        } else {
            System.out.println("비밀번호가 다릅니다.");
            printInfo(id);
        }
    }

    private void delete(String id) {
        String message = new String("비밀번호를 한번 더 입력해주세요.");
        String pw = ScannerUtil.nextLine(scanner, message);
        UserDTO u = userController.selectOne(id);
        if (u.getPw().equals(pw)) {
            message = new String("정말 삭제하시겠습니까? Y/N");
            String yesNo = ScannerUtil.nextLine(scanner, message);
            if (yesNo.equalsIgnoreCase("y")) {
                userController.delete(id);
            } else {
                printInfo(id);
            }

        } else {
            System.out.println("비밀번호가 다릅니다.\n");
            printInfo(id);
        }
    }

}
