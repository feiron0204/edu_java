package day1015;
// 사용자로부터 기와 몬무게를 입력받아서
// BMI를 계산하여 결과를 출력하는 프로그램

// BMI공식 : 몸무게(kg 단위)/ 키(m 단위) / 키(m 단위)

// BMI와 비만도
// ~18.5: 저체중
// ~23: 정상체중
// ~25: 과체중
// 25~: 비만

// 쉬는시간 포함 12시 40분까지
import java.util.Scanner;
public class Ex05BmiPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---BMI 계산기---");
        // 키와 몸무게 변수 선언 및 입력받기
        System.out.print("키를 입력해 주세요(m): ");
        double m = scanner.nextDouble();
        
        System.out.print("몸무게를 입력해 주세요(kg): ");
        double kg = scanner.nextDouble();
        
        // BMI 계산
        double bmi = kg / m / m;
        
        // 조건식설정
        if(bmi>=25) {
            System.out.printf("BMI값은 %.2f 이므로 '비만'입니다.\n",bmi);
        }else if(bmi>23) {
            System.out.printf("BMI값은 %.2f 이므로 '과체중'입니다.\n",bmi);
        }else if(bmi>18.5) {
            System.out.printf("BMI값은 %.2f 이므로 '정상체중'입니다.\n",bmi);
        }else {
            System.out.printf("BMI값은 %.2f 이므로 '저체중'입니다.\n",bmi);
        }
        
        /*강사님해답
         * System.out.println("키를 입력해주세요.");
         * System.out.print("> ");
         * double height = scanner.nextDouble();
         * 
         * System.out.println("몸무게를 입력해주세요.");
         * System.out.print("> ");
         * double weight = scanner.nextDouble();
         * 
         * double bmi = weight / height / height;
         * 
         * String result;
         * 
         * if(bmi <18.5){
         *     result = "저체중";
         * } else if( bmi < 23) {
         *     result = "정상체중";
         * } else if( bmi < 25) {
         *     result = "과체중";
         * } else {
         *     result = "비만";
         * }
         * 
         * System.out.printf("BMI: [%.2f] 비만도: %s\n",bmi,result);
         */
        
        scanner.close();
        
    }

}
