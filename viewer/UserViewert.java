package viewer;

import java.util.Scanner;
/*
 * Ctrl Shift O
 * 요것도 임포트 정리 단축키
 */
import controller.UserControllert;
import model.UserDTOt;
import util.ScannerUtil;

public class UserViewert {
    private UserControllert userControllert;
    private Scanner scanner;
    private UserDTOt logIn;

    public UserViewert() {
        scanner = new Scanner(System.in);
        userControllert = new UserControllert();
    }

    public void showIndex() {
        String message = new String("1. 로그인 2. 회원가입 3. 종료");
        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, message);

            if (userChoice == 1) {
                // 로그인 메소드 실행
                logIn();

                if (logIn != null) {
                    // 메뉴 메소드 실행
                    showMenu();
                }
            } else if (userChoice == 2) {
                // 회원가입 메소드 실행
                register();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }

    // 로그인 메소드
    private void logIn() {
        /*
         * 더 깔끔한 코드로 정리
         */
//        String message = new String("아이디를 입력해주세요.");
//        String username = ScannerUtil.nextLine(scanner, message);
//
//        message = new String("비밀번호를 입력해주세요.");
//        String password = ScannerUtil.nextLine(scanner, message);
//
//        UserDTOt u = userControllert.auth(username, password);
//        
//        while(u==null) {
//            System.out.println("잘못 입력하셨습니다.");
//            message = new String("아이디를 입력해주세요. 만약 뒤로 가실려면 X를 입력해주세요.");
//            username = ScannerUtil.nextLine(scanner, message);
//            /*
//             * x누르면 루프탈출!
//             * 근데 x라는 아이디를 못만드니까 검증컨트롤러에 x 추가
//             */
//            if(username.equalsIgnoreCase("x")) {
//                break;
//            }
//            
//            message = new String("비밀번호를 입력해주세요.");
//            password = ScannerUtil.nextLine(scanner, message);
//
//            u = userControllert.auth(username, password);
//        }

        /*
         * 지역변수 쓰기 전
         */
//        UserDTOt u = null;

//        while (u == null) {
        while (logIn == null) {
            String message = new String("아이디를 입력해주세요. 만약 뒤로가실려면x를 입력해주세요.");
            String username = ScannerUtil.nextLine(scanner, message);

            if (username.equalsIgnoreCase("x")) {
                break;
            }
            message = new String("비밀번호를 입력해주세요.");
            String password = ScannerUtil.nextLine(scanner, message);

//            u = userControllert.auth(username, password);
            logIn = userControllert.auth(username, password);

//            if(u==null) {
            if (logIn == null) {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    // 회원가입 메소드
    private void register() {
        String message;

        message = new String("사용하실 아이디를 입력해주세요.");
        String username = ScannerUtil.nextLine(scanner, message);

        while (userControllert.validateUsername(username)) {
            System.out.println("잘못 입력하셨습니다.");
            message = new String("사용하실 아이디를 입력해주시거나 뒤로 가실려면x를 입력해주세요.");
            username = ScannerUtil.nextLine(scanner, message);
            if (username.equalsIgnoreCase("x")) {
                break;
            }
        }

        if (!username.equalsIgnoreCase("x")) {
            message = new String("사용하실 비밀번호를 입력해주세요.");
            String password = ScannerUtil.nextLine(scanner, message);

            message = new String("사용하실 닉네임을 입력해주세요.");
            String nickname = ScannerUtil.nextLine(scanner, message);

            UserDTOt u = new UserDTOt();
            u.setUsername(username);
            u.setPassword(password);
            u.setNickname(nickname);

            userControllert.register(u);
        }
    }

    // 메뉴 메소드
    private void showMenu() {
        String message = new String("1. 회원 정보 수정 2. 회원 탈퇴 3. 로그아웃");
//        while (true) {
        while(logIn!=null) {
            printOne();
            int userChoice = ScannerUtil.nextInt(scanner, message);
            if (userChoice == 1) {
                // 회원 정보 수정 메소드 실행
                update(logIn.getId());
            } else if (userChoice == 2) {
                // 회원 탈퇴 메소드 실행
                delete(logIn.getId());
            } else if (userChoice == 3) {
                System.out.println("로그아웃 되셨습니다.");
                logIn = null;
            }
            
//            if(logIn==null) {
//                break;
//            }
        }
    }

    // 회원 정보 보여주는 메소드
    private void printOne() {
        System.out.printf("회원번호: %d\n", logIn.getId());
        System.out.printf("아이디: %s\n", logIn.getUsername());
        System.out.printf("닉네임: %s\n", logIn.getNickname());
    }

    // 회원 정보 수정 메소드
    private void update(int id) {
        UserDTOt u = userControllert.selectOne(id);

        String message = new String("새로운 비밀번호를 입력해주세요.");
        u.setPassword(ScannerUtil.nextLine(scanner, message));

        message = new String("새로운 닉네임을 입력해주세요.");
        u.setNickname(ScannerUtil.nextLine(scanner, message));
        
        message = new String("정말로 수정하시겠습니까? Y/N");
        String yesNo = ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("y")) {
            message = new String("기존 비밀번호를 입력해주세요.");
            String password = ScannerUtil.nextLine(scanner, message);
            if(logIn.getPassword().equals(password)) {
                userControllert.update(u);
                System.out.println("회원정보가 성공적으로 수정되었습니다.");
                logIn=u;
            }else {
                System.out.println("회원정보를 수정하지 못하였습니다.");
            }
        }
    }

    // 회원 탈퇴 메소드 실행
    private void delete(int id) {
        String message = new String("정말로 탈퇴하시겠습니까? Y/N");
        String yesNo=ScannerUtil.nextLine(scanner, message);
        if(yesNo.equalsIgnoreCase("y")) {
            message=new String("비밀번호를 입력해주세요.");
            String password = ScannerUtil.nextLine(scanner, message);
            
            if(logIn.getPassword().equals(password)) {
                userControllert.delete(id);
                System.out.println("회원 탈퇴가 성공적으로 진행되었습니다.");
                logIn=null;
            }else {
                System.out.println("비밀번호가 틀려 회원 탈퇴가 실패하였습니다.");
            }
        }
    }
}

