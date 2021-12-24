package day1015;
// 검증(Validation)

// 검증이란 특정값이 유효한 값인지 확인하여
// 올바르지 않을 경우 추가적인 처리를 해주는 작업을 뜻한다.

// Ex04LetterGrade.java를 기준으로,
// 만약 사용자가 0보다 작거나, 100보다 큰 잘못된 점수를 입력하면,
// 우리 프로그램은 A 혹은 F의 잘못된 결과를 내놓게 된다.

// 만약 검증이 제대로 되어있다면,
// 그러한 잘못된 값에 대하여
// "잘못 입력하셨습니다."
// 등의 메세지가 출력되게 만들어 져야 한다!

// 우리는 이 프로그램에서 검증을 하는 다양한 방법 중
// 두가지를 알아보게 될 것이다!!

import java.util.Scanner;

public class Ex08Validation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력해주세요.");
        System.out.print("> ");
        int score = scanner.nextInt();
        System.out.println("----------------------------------");
        System.out.println("값 검증이 안되어있을 경우");
        System.out.println("----------------------------------");
        if (score >= 90) {
            System.out.println("A 입니다.");
        } else if (score >= 80) {
            System.out.println("B 입니다.");
        } else if (score >= 70) {
            System.out.println("C 입니다.");
        } else if (score >= 60) {
            System.out.println("D 입니다.");
        } else {
            System.out.println("F 입니다.");
        }

        System.out.println("----------------------------------\n");

        // 1. 각 결과의 정확한 범위를 설정해준다.
        // A의 경우, 그냥 90 이상 이라고 조건식을 만들어 주는것이 아니라
        // "90이상 100이하"로 정확하게 조건식을 만들어준다.
        // 이 검증 방법은, 올바른 값의 범위가 연속적이지 않을경우,
        // 사용하면 좋다.
        System.out.println("----------------------------------");
        System.out.println("정확한 범위 사용하기");
        System.out.println("----------------------------------");
        if (score >= 90 && score <= 100) {
            System.out.println("A 입니다.");
        } else if (score >= 80 && score < 90) {
            System.out.println("B 입니다.");
        } else if (score >= 70 && score < 80) {
            System.out.println("C 입니다.");
        } else if (score >= 60 && score < 70) {
            System.out.println("D 입니다.");
        } else if (score >= 0 && score < 60) {
            System.out.println("F 입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
        System.out.println("----------------------------------\n");

        // 2. 값 자체가 올바른 값의 전체 범위에 속하는지 확인한 후에
        // 올바른 범위에 속할 때에만 코드를 진행시킨다.
        // 이 방법은, 올바른 값의 전체 범위가 연결되어 있는 경우, 사용하면 좋다.
        System.out.println("----------------------------------");
        System.out.println("올바른 값 전체범위 먼저 확인하기");
        System.out.println("----------------------------------");

        if (score >= 0 && score <= 100) {
            // score에 올바른 범위의 점수가 저장되어있으므로
            // A, B, C, E, F 를출력하는 코드를 실행
            

            if (score >= 90) {
                System.out.println("A 입니다.");
            } else if (score >= 80) {
                System.out.println("B 입니다.");
            } else if (score >= 70) {
                System.out.println("C 입니다.");
            } else if (score >= 60) {
                System.out.println("D 입니다.");
            } else {
                System.out.println("F 입니다.");
            }
        }else {
            System.out.println("정수는 0~100이외에는 입력하실 수 없습니다.");
        }

        scanner.close();

    }

}
