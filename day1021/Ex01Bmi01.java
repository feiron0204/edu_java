package day1021;
// 숙제 1. 여러명의 BMI 정보를 차례대로 입력받고 차례대로 출력하는 프로그램을 작성하시오.
// 단, 총 몇명을 관리할지는 사용자로부터 입력을 받아서 결정하게 된다.
import java.util.Scanner;
public class Ex01Bmi01 {
    public static void main(String[] args) {
        // 상수
        // 1. 키 최대값
        final double MAX_HEIGHT = 2.72;
        // 2. 키 최소값
        final double MIN_HEIGHT = 0;
        // 3. 몸무게 최대값
        final double MAX_WEIGHT = 635;
        // 4. 몸무게 최소값
        final double MIN_WEIGHT = 0;
        // 5. 비만도 기준점1
        final double BMI_STANDARD1 = 18.5;
        // 6. 비만도 기준점2
        final double BMI_STANDARD2 = 23;
        // 7. 비만도 기준점3
        final double BMI_STANDARD3 = 25;
        
        Scanner scanner = new Scanner(System.in);
        
        // 1. 입력 받을 명수를 입력받는다.
        System.out.println("관리할 인원수를 입력해주세요.");
        System.out.print("> ");
        int size = scanner.nextInt();
        
        // 2. 정보를 저장할 배열을 만든다
        double[] heightArray = new double[size];
        double[] weightArray = new double[size];
        
        // 3. 배열에 각 칸에 정보를 입력한다.
        for(int i=0;i<heightArray.length;i++) {
            System.out.println("\n===============================");
            System.out.println((i+1)+"번 정보 입력");
            System.out.println("===============================\n");
            System.out.println("키를 입력해주세요.");
            System.out.print("> ");
            heightArray[i] = scanner.nextDouble();
            while(heightArray[i]<MIN_HEIGHT || heightArray[i]>MAX_HEIGHT) {
                System.out.println("잘못 입력하셧습니다.");
                System.out.println("키를 입력해주세요.");
                System.out.print("> ");
                heightArray[i] = scanner.nextDouble();
            }
            System.out.println("몸무게를 입력해주세요.");
            System.out.print("> ");
            weightArray[i] = scanner.nextDouble();
            while(weightArray[i]<MIN_WEIGHT || weightArray[i]>MAX_WEIGHT) {
                System.out.println("잘못 입력하셧습니다.");
                System.out.println("몸무게를 입력해주세요.");
                System.out.print("> ");
                weightArray[i] = scanner.nextDouble();
            }
            
            System.out.println("-------------------------------");
        }
        // 4. 배열을 출력한다.
        for(int i=0; i<size; i++) {
            double bmi = weightArray[i]/heightArray[i]/heightArray[i];
            String result="비만";
            
            if(bmi < BMI_STANDARD1) {
                result = "저체중";
            }else if(bmi < BMI_STANDARD2) {
                result ="정상";
            }else if(bmi <BMI_STANDARD3) {
                result ="과체중";
            }
            System.out.println("\n-------------------------------");
            System.out.println((i+1)+"번 정보");
            System.out.println("===============================\n");
            System.out.printf("키: %.2fM 몸무게: %.2fKG\n",heightArray[i],weightArray[i]);
            System.out.printf("BMI: %.2f 비만도: %s\n",bmi,result);
            System.out.println("-------------------------------\n");
            
        }
        
        
        
        
        scanner.close();
    }

}
