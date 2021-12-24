package day1014;
// if문 예제

// 쉬는시간 포함 5시 50분까지
// 1. int 변수 num을 만들고 3을 초기화한 후에
//    num이 5보다 작으면
//    "5보다 작습니다" 가 출력되게 코드를 작성하시오

// 2. String 변수 name을 만들고 자기이름을 저장한 후에
//    name에 저장된 값이 자기 이름과 같으면
//    "나입니다" 가 출력되게 코드를 작성하시오

// 3. int 변수 num에 5를 저장한 후에
//    num이 홀수일 경우
//    "num은 홀수입니다." 가 출력되게 코드를 작성하시오

// 4. 사용자로부터 나이를 입력받아서 
//    미성년자일 경우 " 미성년자입니다" 가 출력되게 코드를 작성하시오

// 5. 사용자로부터 숫자를 입력받아서
//    50~59 사이일 경우
//    "50번대의 숫자입니다" 가 출력되게 코드를 작성하시오

// 6. 사용자로부터 숫자를 입력 받아서
//    byte의 범위가 아닐 경우에는
//    "byte의 범위가 아닙니다" 가 출력되게 코드를 작성하시오

// 7. 사용자로부터 username과 password를 입력받아서
//    username이 "admin"이고 password가 "!Q@W3e4r"일 경우
//    "로그인 성공!!" 이 출력되게 코드를 작성하시오

import java.util.Scanner;

public class Ex07If02 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        // 1번
        System.out.println("1번");
        // 변수만들고 초기화
        int num = 3;
        // 조건문설정
        if (num < 5) {
            System.out.println("\"5보다 작습니다.\"");
        }
        System.out.println("--------------");

        /* 강사님 해답
         * int num = 3;
         * if(num<5){
         *     System.out.println("5보다 작습니다.");
         * }
         */
        
        
        // 2번
        System.out.println("2번");
        // 변수만들고 초기화
        String name = "이성호";
        // 조건문설정
        if (name.equals("이성호")) {
            System.out.println("\"나입니다.\"");
        }
        System.out.println("--------------");

        /* 강사님 해답
         * String name = "조재영";
         * if(name.equals("조재영"){
         *     System.out.println("나입니다.");
         * }
         */
        
        
        // 3번
        System.out.println("3번");
        // 변수 초기화
        num = 5;
        // 조건문설정
        if (num % 2 == 1) {
            System.out.println(num + "\"은 홀수입니다.\"");
        }
        System.out.println("--------------");

        /*강사님해답
         * num = 5;
         * if(num%2==1){
         *     System.out.println("num은 홀수입니다.");
         * }
         */
        
        
        // 4번
        System.out.println("4번");
        // 변수입력받기
        System.out.println("나이를 입력해 주세요");
        System.out.print("> ");
        int age = scanner.nextInt();
        // 조건문설정
        if (age < 19 && age > 0) {
            System.out.println("\"미성년자입니다\"");
        }
        System.out.println("--------------");

        /*강사님해답
         * System.out.println("나이를 입력해주세요.");
         * System.out.print("> ");
         * int age = scanner.nextInt();
         * 
         * if(age < 19) {
         *     System.out.println("미성년자입니다.");
         * }
         */
        
        
        // 5번
        System.out.println("5번");
        // 변수입력받기
        System.out.println("숫자를 입력해 주세요");
        System.out.print("> ");
        num = scanner.nextInt();
        // 조건문설정
        if (num >= 50 && num < 60) {
            System.out.println("\"50번대의 숫자입니다\"");
        }
        System.out.println("--------------");

        /*강사님해답
         * System.out.println("숫자를 입력해주세요.");
         * System.out.print("> ");
         * num = scanner.nextInt();
         * 
         * if(num>=50 && num<=59){
         *     System.out.println("50번대의 숫자입니다.")
         * }
         */
        
        
        // 6번
        System.out.println("6번");
        // 변수입력받기
        System.out.println("숫자를 입력해 주세요");
        System.out.print("> ");
        num = scanner.nextInt();
        // 조건문설정
        if (num > 127 || num < -128) {
            System.out.println("\"byte의 범위가 아닙니다\"");
        }
        System.out.println("--------------");
     
        
        
        // 7번
        System.out.println("7번");
        // 변수선언 및 입력받기
        System.out.println("username를 입력해 주세요");
        System.out.print("> ");
        scanner.nextLine();
        String username = scanner.nextLine();
        System.out.println("password를 입력해 주세요");
        System.out.print("> ");
        String password = scanner.nextLine();
        // 조건문설정
        if (username.equals("admin") && password.equals("!Q@W3e4r")) {
            System.out.println("\"로그인 성공!!\"");
        }
        System.out.println("--------------");

        scanner.close();
    }

}
