package day1020;
// 여러명의 BMI정보를 차례대로 입력받고 차례대로 출력하는 프로그램을 작성하시오 
// 단, 총 몇명을 관리할지는 사용자로부터 입력을 받아서 결정하게 됩니다.
import java.util.Scanner;
public class HWBmiPrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("---------BMI측정기-----------");
        //몇명할지 골라주십셔
        System.out.println("측정할 총 인원수를 입력해주세요.");
        System.out.print("> ");
        final int PEOPLE_SIZE=scanner.nextInt();
        //bmi기준
        final double HEIGHT_MIN = 0;
        final double HEIGHT_MAX = 2.72;
        final double WEIGHT_MIN = 0;
        final double WEIGHT_MAX = 635;
        final double BMI_STANDARD1 = 18.5;
        final double BMI_STANDARD2 = 23;
        final double BMI_STANDARD3 = 25;
        double[] height=new double[PEOPLE_SIZE];
        int[] weight=new int[PEOPLE_SIZE];
        //입력받기
        for(int i=0;i<PEOPLE_SIZE;i++) {
            System.out.println("----------------------");
            System.out.println((i+1)+"번째 인원 정보");
            System.out.println("======================");
            System.out.println("키(m)를 입력해주세요");
            System.out.print("> ");
            height[i]=scanner.nextDouble();
            while(height[i]>HEIGHT_MAX||height[i]<HEIGHT_MIN) {
                System.out.println("잘못된 정보입니다.");
                System.out.println("정확한 키(m)를 입력해주세요");
                System.out.print("> ");
                height[i]=scanner.nextDouble();
                }
            System.out.println("몸무게(kg)를 입력해주세요");
            System.out.print("> ");
            weight[i]=scanner.nextInt();
            while(weight[i]>WEIGHT_MAX||weight[i]<WEIGHT_MIN) {
                System.out.println("잘못된 정보입니다.");
                System.out.println("정확한 몸무게(kg)를 입력해주세요");
                System.out.print("> ");
                weight[i]=scanner.nextInt();
                }
            System.out.println("----------------------\n");
            
        }
        System.out.println("===========결과창============");
        //출력하기
        for(int i=0;i<PEOPLE_SIZE;i++) {
            double bmi=weight[i]/height[i]/height[i];
            String result="비만";
            if(bmi<BMI_STANDARD1) {
                result="저체중";
            }else if(bmi<BMI_STANDARD2) {
                result="정상체중";
            }else if(bmi<BMI_STANDARD3) {
                result="과체중";
            }
            System.out.printf((i+1)+"번째 입력한 인원-> BMI: %5.2f, %s입니다.\n",bmi,result);
        }
        
        System.out.println("===========================");
        scanner.close();
        
        
    }

}
