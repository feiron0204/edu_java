package day1015;
// 사용자로부터 키와 몸무게를 입력받아서,
// BMI 값과 비만도를 출력하는 프로그램을 작성하시오.
// 단, 키와 몸무게 순으로 입력받되, 잘못된 입력값이 들어올 경우
// 추가적인 입력 없이 프로그램이 종료가 되게 코드를 작성하시오

// 기네스북에 따르면 지금까지 키가 가장 컷던 사람의 키는 272cm 였습니다.
// 기네스북에 따르면 지금까지 몸무게가 가장 무거웠던 사람의 몸무게는 635kg 였습니다.

// 4시 50분까지
import java.util.Scanner;

public class Ex09BmiPrinter02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BMI측정기!!!!");
        //키 변수를 선언하고 입력받기
        System.out.println("당신의 키를 cm 단위로 입력해주세요.");
        System.out.print("> ");
        int height = scanner.nextInt();
        //키 검증하기
        if (height <= 0 || height > 272) {
            System.out.println("키를 잘못 입력하쎳습니다.");
        }else {
            //키는 잘입력하셧으니 m로 변환 몸무게 변수를 선언하고 입력받기
            double heightTrans=(double)height/100;
            System.out.println("당신의 몸무게를 kg 단위로 입력해주세요");
            System.out.print("> ");
            int weight = scanner.nextInt();
            //몸무게 검증하기
            if(weight<=0 ||weight>635) {
                System.out.println("몸무게를 잘못 입력하셨습니다.");
            }else {
                //키도 몸무게도 잘입력했음 그럼 BMI 계산
                double bmi=weight/heightTrans/heightTrans;
                String result="비만";
                //결과값처리
                if(bmi<18.5) {
                    result="저체중";
                }else if(bmi<23) {
                    result="정상체중";
                }else if(bmi<25) {
                    result="과체중";
                }
                // BMI출력
                System.out.printf("당신의 BMI값은 [%.2f]이며 '%s' 입니다.",bmi,result);
            }
        }
        /*
        강사님해답(매직넘버주의)
        // 상수
        // 키의 최소값
        final double HEIGHT_MIN=0;
        // 키의 최대값
        final double HEIGHT_MAX=2.72;
        // 몸무게의 최소값
        final double WEIGHT_MIN=0;
        // 몸무게의 최대값
        final double WEIGHT_MAX=635;
        // BMI 기준 1번
        final double BMI_STANDARD_1 = 18.5;
        // BMI 기준 2번
        final double BMI_STANDARD_2 = 23;
        // BMI 기준 3번
        final double BMI_STANDARD_3 = 25;
        System.out.println("키를 입력해주세요.");
        System.out.print("> ");
        double height = scanner.nextDouble();
        
        if(height>HEIGHT_MIN && height<=HEIGHT_MAX) {
            
            System.out.println("몸무게를 입력해주세요.");
            System.out.print("> ");
            double weight = scanner.nextDouble();
            
            if(weight>WEIGHT_MIN &&weight<=WEIGHT_MAX) {
                
                double bmi = weight/height/height;
                String result= "저체중";
                if(bmi>=BMI_STANDARD_3) {
                    result = "비만";
                }else if(bmi>=BMI_STANDARD_2) {
                    result = "과체중";
                }else if(bmi>=BMI_STANDARD_1) {
                    result = "정상";
                }
                System.out.printf("BMI: [%.2f] 비만도: %s\n", bmi,result);
                
            }else {
                System.out.println("잘못된 입력을 감지하여 프로그램을 종료합니다.");
            }
            
        }else {
            System.out.println("잘못된 입력을 감지하여 프로그램을 종료합니다.");
        }
        */
        
        scanner.close();
    }
    

}
