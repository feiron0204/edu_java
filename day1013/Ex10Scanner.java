package day1013;
// Scanner 클래스
// 자바에서 다양안 입력(키보드, 파일, 네트워크 등등)을 처리하는 클래스는 여러개가 있지만
// 우리는 그 중에서 가장 사용하기가 쉬운 Scanner 클래스를 사용하여 입력을 처리할 것이다.

// 단, 우리가 만드는 프로그램에서, 기본형 데이터타입 혹은 기본형 데이터타입을 클래스로 포장한
// 포장클래스가 아닌 다른 클래스를 사용할 때에는 반드시 우리 프로그램에 해당 클래스를 "수입"해와야 한다

// 외부 클래스를 수입할 때에는 다음과 같이 적어준다.
// import 패키지.클래스이름;

// 단, import는 public class ~~~ 이전에 해야한다.
// 또한 필요에 따라서는 여러개의 외부 클래스를 import할 수도 있다.

// Scanner 클래스는
// java.util 이라는 패키지 안에 있으므로
// 다음과 같이 import를 해야한다.
import java.util.Scanner;

public class Ex10Scanner {
    public static void main(String[] args) {
        // Scanner 클래스를 통해서 데이터입력을 받는 경우
        // 초기화단계에서 반드시 어디서 데이터를 읽어올지를 지정해야 한다.
        // 지정하는 방법은
        // 변수이름 = new Scanner(읽어올 위치) 가 된다.
        
        // Scanner 클래스 변수선언
        Scanner scanner;
        // Scanner 클래스 변수의 초기화
        // 키보드 입력을 받을 때에는 System.in 이라는 곳에서 데이터를 읽어오라고 지정해야한다.
        scanner = new Scanner(System.in);
        
        // 1. 사용자로부터 int 입력을 받을 때에는
        //    scanner의 nextInt()라는 메소드를 사용하면된다.
        System.out.println("정수를 입력해주세요.");
        System.out.print("> ");
        int num = scanner.nextInt();
        
        System.out.println("사용자가 입력한 정수: "+num);
   
        
        // 2. 사용자로부터 double 입력을 받을 때에는
        //    scanner의 nextDouble()라는 메소드를 사용하면된다.
        System.out.println("실수를 입력해주세요.");
        System.out.print("> ");
        double myDouble = scanner.nextDouble();
        
        System.out.println("사용자가 입력한 실수: "+myDouble);
        
        // 3. 사용자로부터 String 입력을 받을 때에는
        //    scanner의 nextLine()라는 메소드를 사용하면된다.
        System.out.println("이름을 입력해주세요.");
        System.out.print("> ");
        // nextInt() 나 nextDouble() 같이 숫자를 입력받는 메소드를 실행하면
        // 버퍼메모리에 엔터키가 남아있게 된다.
        // nextLine()은 모든 문자를 읽어와서 제일 마지막의 엔터키를 제거한 값을
        // 반환하도록 만들어져있는데
        // nextInt(), nextDouble() 후에 버퍼메모리에 남아있는 엔터키를 보고 
        // nextLine()은 입력이 종료되었다고 생각하여 "\n" 을 읽어온다.
        // 그런 후에 엔터키를 제거하면 아무런 내용이 없는 "" 스트링 값을 최종 결과값으로
        // 반환하게 된다.
        // 이러한 버그를 스캐너 버그라고 말하는데, 스캐너 버그를 해결하는 방법은
        // nextInt() nextDouble() 등을 실행한 후에 스트링 입력을 받을때에는
        // scanner.nextLine()을 한번 실행시켜서 버퍼메모리의 엔터키를 제거해주면 된다.
        // 단, 버퍼메모리에 이미 아무런 내용이 없는 상태일 경우에는 scanner.nextLine()을 
        // 두번 적어주면 안된다.
        scanner.nextLine();
        String name = scanner.nextLine();
        
        System.out.println("사용자 이름: "+name);
        
        // Scanner와 같이 데이터를 읽어오는 클래스 변수는
        // 곧장 지정된 위치에서 데이터를 읽어오는 것이 아니라
        // 버퍼메모리라는 임시 저장소에 저장된 데이터를 읽어온다.
        // 이렇게 버퍼메모리에서 데이터를 읽어오는 클래스 변수는
        // 사용이 끝난뒤에 버퍼메모리에서 그만 읽어오도록
        // close() 라는 메소드를 실행해 주는것이 좋다.
        scanner.close();
        System.out.println("프로그램 종료");
        
        
    }

}
