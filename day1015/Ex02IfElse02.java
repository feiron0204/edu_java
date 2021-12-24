package day1015;
//1. 사용자로부터 나이를 입력받아서
//   미성년자일 경우 "미성년자입니다"가,
//   성인일 경우 "성인입니다"가 출력되게 코드를 작성하시오

//2. 사용자로부터 숫자를 입력받아서
//   50~59 사이일 경우
//   "50번대의 숫자입니다" 가,
//   그 외에는 "50번대의 숫자가 아닙니다"가 출력되게 코드를 작성하시오

//3. 사용자로부터 숫자를 입력받아서
//   byte의 범위가 아닐 경우에는
//   "byte의 범위가 아닙니다" 가,
//   byte의 범위에 속할 때에는
//   "byte의 범위입니다"가 출력되게 코드를 작성하시오

//4. 사용자로부터 username 과 password를 입력받아서
//   username이 "admin"이고 password가 "!Q@W3e4r"일 경우
//   "로그인 성공!!" 이,
//   그 외에는 "로그인 실패!!"가 출력되게 코드를 작성하시오.
//   단, username은 대소문자를 구분하지 않고, 앞뒤 공백을 자동으로 제거합니다.

// 11시 10분까지.
import java.util.Scanner;

public class Ex02IfElse02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //1번
        System.out.println("1번");
        //변수 선언 및 입력받기
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        //조건문설정
        if(age<19) {
            System.out.println("미성년자입니다");
        }else {
            System.out.println("성인입니다");
        }
        System.out.println("--------------------------");
        
        /*강사님해답
         * System.out.println("1번\n");
         * System.out.println("나이를 입력해주세요.");
         * System.out.print("> ");
         * 
         * int age = scanner.nextInt();
         * if(age<19){
         *     System.out.println("미성년자입니다");
         * } else {
         *     System.out.println("성인입니다");
         * }
         */
        
        
        //2번
        System.out.println("2번");
        //변수 선언 및 입력받기
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();
        //조건문 설정
        if(num>=50 && num<60) {
            System.out.println("50번대 숫자입니다");
        }else {
            System.out.println("50번대 숫자가 아닙니다");
        }
        System.out.println("--------------------------");
        
        /*강사님해답
         * System.out.println("2번\n");
         * System.out.println("숫자를 입력해주세요.");
         * System.out.print("> ");
         * int num = scanner.nextInt();
         * 
         * if(num >=50 && num<=59){
         *     System.out.println("50번째 숫자입니다.");
         * }else{
         *     System.out.println("50번재 숫자가 아닙니다.");
         * }
         */
        
        
        //3번
        System.out.println("3번");
        //변수 입력받기
        System.out.print("숫자를 입력하세요: ");
        num = scanner.nextInt();
        //조건문 설정
        if( !(num<=127&&num>-128)) {
            System.out.println("byte의 범위가 아닙니다");
        }else {
            System.out.println("byte의 범위입니다");
        }
        System.out.println("--------------------------");
        
        /*강사님해답
         * System.out.println("3번\n");
         * System.out.println("숫자를 입력해주세요.");
         * System.out.print("> ");
         * num = scanner.nextInt();
         * 
         * if( num >= -128 && num <= 127){
         *     System.out.println("byte의 범위입니다");
         * }else{
         *     System.out.println("byte의 범위가 아닙니다.");
         * }
         */
        
        
        //4번
        System.out.println("4번");
        //변수 선언 및 입력받기
        System.out.print("아이디를 입력하세요: ");
        scanner.nextLine();
        String temp = scanner.nextLine();
        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();
        //아이디 공백 제거
        String username = temp.trim();
        // 조건문설정(단 아이디는 대소문자 구분 x)
        if(username.equalsIgnoreCase("admin")&&password.equals("!Q@W3e4r")) {
            System.out.println("로그인 성공!!");
        }else {
            System.out.println("로그인 실패!!");
        }
        System.out.println("--------------------------");
        
        /*강사님해답
         * System.out.println("4번\n");
         * System.out.println("아이디를 입력해주세요.");
         * System.out.print("> ");
         * scanner.nextLine();
         * String temp = scanner.nextLine();
         * 
         * String username = temp.trim();
         * 
         * System.out.println("비밀번호를 입력해주세요.");
         * System.out.print("> ");
         * String password = scanner.nextLine();
         * 
         * if(username.equralsIgnoreCase("admin") && password.equals("!Q@W3e4r")){
         *     System.out.println("로그인 성공");
         * }else{
         *     System.out.println("로그인 실패");
         * }
         */
        
        
        scanner.close();
        
    }

}
