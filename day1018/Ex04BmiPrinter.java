package day1018;
// 사용자로부터 키와 몸무게를 입력받아서
// BMI 값과 비만도를 알려주는 프로그램을 작성하시오
// 단, 사용자가 잘못된 키 혹은 몸무게를 입력하면
// 올바른 키나 몸무게를 입력할 때 까지 다시 입력을 받게 코드를 작성하시오.

// BMI 공식: 몸무게(kg) / 키(m) / 키(m)
// 비만도:
// ~18.5 미만 : 저체중
// ~23 미만 : 정상체중
// ~25 미만: 과체중
// 25 이상: 비만

// 기네스북에 따르면 가장 키가 컷던 사람은 2.72M 였습니다.
// 기네스북에 따르면 가장 몸무게가 무거웠떤 사람은 635KG 였습니다.
import java.util.Scanner;

public class Ex04BmiPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("키(m)를 입력해주세요: ");
        double height = scanner.nextDouble();
        System.out.print("몸무게(kg)를 입력해주세요: ");
        double weight = scanner.nextDouble();
        while((height<=0 || height>2.72)||(weight<=0 || weight>635)) {
            if(height<=0 || height>2.72) {
                System.out.print("키를 잘못입력하셨습니다.\n다시 입력해주세요: ");
                height = scanner.nextDouble();            
            }
            if(weight<=0 || weight>635) {
                System.out.print("몸무게를 잘못입력하셨습니다.\n다시 입력해주세요: ");
                weight = scanner.nextDouble();                
            }
        }
        
        double bmi = weight/height/height;
        String result = "저체중";
        if(bmi>=25) {
            result = "비만";            
        }else if(bmi >=23) {
            result = "과체중";
        }else if(bmi >=18.5) {
            result = "정상체중";
        }
            
        System.out.printf("당신의 BMI수치는 [%.2f]이며 [%s]입니다.\n", bmi, result);
        
        
        
        scanner.close();
        
        /*강사님해답
         * final double HEIGHT_MIN = 0;
         * final double HEIGHT_MAX = 2.72;
         * final double WEIGHT_MIN = 0;
         * final double WEIGHT_MAX = 635;
         * final double BMI_STANDARD1 = 18.5;
         * final double BMI_STANDARD2 = 23;
         * final double BMI_STANDARD3 = 25;
         * 
         * Scanner scanner = new Scanner(System.in);
         * 
         * System.out.println("키를 입력해주세요.");
         * System.out.print("> ");
         * double height = scanner.nextDouble();
         * 
         * while(height <= HEIGHT_MIN || height> HEIGHT_MAX){
         *  System.out.println("잘못 입력하셨습니다.");
         *  System.out.println("키를 입력해주세요.");
         *  System.out.print("> ");
         *  height = scanner.nextDouble();
         * }
         * 
         * System.out.println("몸무게를 입력해주세요.");
         * System.out.print("> ");
         * double weight = scanner.nextDouble();
         * 
         * while(weight <= WEIGHT_MIN || weight> WEIGHT_MAX){
         *  System.out.println("잘못 입력하셨습니다.");
         *  System.out.println("몸무게를 입력해주세요.");
         *  System.out.print("> ");
         *  weight = scanner.nextDouble();
         * }
         * 
         * String result = "비만";
         * double bmi = weight / height/ height;
         * 
         * if(bmi < BMI_STANDARD1){
         *  result = "저체중";
         * } else if (bmi < BMI_STANDARD2){
         *  result = "정상체중";
         * } else if (bmi < BMI_STANDARD3){
         *  result = "과체중";
         * }
         * 
         * System.out.printf("BMI: [%.2f] 결과: [%s]\n",bmi, result);
         * 
         * scanner.close();
         */
                
    }

}
