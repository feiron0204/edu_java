package day1015;
//사용자로부터 성별, 나이, 신체등급을 입력받아서 현역, 공익, 면제 중 한가지를 출력하는 프로그램.

// 단, 여성일 경우, 추가적인 입력 없이 " 여성에게는 국방의 의무가 부여되지 않습니다." 가 출력되게 코드를 작성하시오
// 단, 남성이지만 미성년자일 경우, 추가적인 입력 없이 "아직 미성년자에게는 신체등급이 존재하지 않습니다."가 출력되게 코드를 작성하시오

// 성별의 경우, 1이면 남성, 2이면 여성으로 판단합니다(=int 값으로 입력을 받으세요)
// 신체등급에 따른 복무표
// 1~3: 현역
// 4: 공익
// 그외: 면제
import java.util.Scanner;

public class Ex07Military {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 성별입력받기
        System.out.println("성별을입력해주세요. (남성일경우 1, 여성일경우 2)");
        System.out.print("> ");
        int sex = scanner.nextInt();
        // 조건
        if (sex == 2) {
            // 여성의경우 의무없음
            System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
        } else {
            //나이입력받기
            System.out.print("나이를 입력해 주세요: ");
            int age = scanner.nextInt();
            if (age < 19) {
                //미성년자의 경우 등급없음
                System.out.println("아직 미성년자에게는 신체등급이 존재하지 않습니다.");
            } else {
                //등급입력받기
                System.out.print("신체등급을 입력해 주세요: ");
                int grade = scanner.nextInt();
                String military;
                //어서오세요 등급판정
                if (grade >= 1 && grade <= 3) {
                    military = "현역";
                } else if (grade == 4) {
                    military = "공익";
                } else {
                    military = "면제";
                }
                //팡파레~
                System.out.printf("축하합니다 [%s]이십니다.", military);

            }

        }
        /*강사님해답
         * 1. 성별을 입력받는다
         * 2. 남성을경우 나이를 입력받는다
         * 3. 성인일경우 등급을 입력받는다
         * 4. 출력받는다.
         * 
         * System.out.println("성별을 입력해주세요. (1: 남성 2: 여성)");
         * System.out.print("> ");
         * int gender = scanner.nextInt();
         * 
         * if(gender ==1){
         * 남성이므로 나이를 입력받는다
         * 
         * System.out.println("나이를 입력해주세요.");
         * System.out.print("> ");
         * int age = scanner.nextInt();
         * if(age >= 19){
         * 남성 성인이므로 신체 등급을 입력받는다.
         * System.out.println("신체 등급을 입력해주세요.");
         * System.out.print("> ");
         * int category = scanner.nextInt();
         * 
         * String result = "면제";
         * 
         * if(category >=1 && category <=3){
         * result = "현역";
         * }else if(category ==4){
         * result="공익";
         * }
         * System.out.println(result);
         * }else{
         * 남성 미성년자이므로 경고 메세지만 출력
         * System.out.println("미성년자에게는 아직 신체등급이 존재하지 않습니다.");
         * }
         * }else{
         * 여성이므로 경고메세지만 출력
         * System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
         * }
         */

        scanner.close();
    }

}
