package day1019;
// 다음 for문 예제들을 푸시오.

// 1. 1~5까지 차례대로 출력하세요
// 2. 17~14까지 차례대로 출력하세요
// 3. 1~10까지의 홀수를 차례대로 출력하세요
// 4. 사용자로부터 숫자를 하나 입력 받아서
//    1부터 그 수까지 차례대로 출력하세요
//(1보다 작은 숫자 입력시 출력 x)
// 5. 사용자로부터 숫자를 두개 입력 받아서
//    더 작은수부터 더 큰수까지 차례대로 출력하세요
// 6. 사용자로부터 숫자를 하나 입력받아서
//    1부터 그수까지의 합을 구해서 출력하시오
// 7. 사용자로부터 숫자를 하나 입력받아서
//    1부터 그수까지의 곱을 구해서 출력하시오
//1시 5분까지

import java.util.Scanner;

public class Ex02For02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n----------------------------");
        System.out.println("1. 1~5까지 차례대로 출력하세요");
        for(int i=1; i<=5;i++) {
            System.out.println(i);
        }
        System.out.println("----------------------------\n");
        
        System.out.println("\n----------------------------");
        System.out.println("2. 17~14까지 차례대로 출력하세요");
        for(int i=17;i>=14;i--) {
            System.out.println(i);
        }
        System.out.println("----------------------------\n");
        
        System.out.println("\n----------------------------");
        System.out.println("3. 1~10까지 홀수를 차례대로 출력하세요");
        for(int i=1;i<=10;i++) {
            if(i%2==1) {
                System.out.println(i);
            }
        }
        System.out.println("----------------------------\n");
        
        System.out.println("\n----------------------------");
        System.out.println("4. 사용자로부터 숫자를 하나 입력받아서 1부터 그수까지 출력하세요");
        System.out.println("숫자를 하나 입력하세요.");
        System.out.print("> ");
        int q3Num=scanner.nextInt();
        for(int i=1;i<=q3Num;i++) {
            System.out.println(i);
        }
        System.out.println("----------------------------\n");
        
        System.out.println("\n----------------------------");
        System.out.println("5. 사용자로부터 숫자를 두개 입력 받아서 더작은수~큰수출력");
        System.out.println("첫번째 숫자를 입력하세요.");
        System.out.print("> ");
        int q5Num1=scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요.");
        System.out.print("> ");
        int q5Num2=scanner.nextInt();
        if(q5Num1<=q5Num2) {
            for(int i = q5Num1;i<=q5Num2;i++) {
                System.out.println(i);
            }
        }else {
            for(int i = q5Num2;i<=q5Num1;i++) {
                System.out.println(i);
            }
        }
        System.out.println("----------------------------\n");
        
        System.out.println("\n----------------------------");
        System.out.println("6. 사용자로부터 숫자를 입력 1부터 그수까지의 합");
        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int q6Num=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=q6Num;i++) {
            sum=sum+i;
        }
        System.out.println("1부터 "+q6Num+"까지의 합은 " +sum+"입니다.");
        System.out.println("----------------------------\n");
        
        System.out.println("\n----------------------------");
        System.out.println("7. 사용자로부터 숫자를 입력 1부터 곱");
        System.out.println("숫자를 입력하세요.");
        System.out.print("> ");
        int q7Num=scanner.nextInt();
        int mult=1;
        for(int i=1;i<=q7Num;i++) {
            mult=mult*i;
        }
        System.out.println("1부터 "+q7Num+"까지의 곱은 " +mult+"입니다.");
        System.out.println("----------------------------\n");
        
        
        /*강사님해답
         * System.out.println("--------------1번--------------");
         * for(int i=1; i<=5;i++){
         * System.out.println(i);
         * }
         * System.out.println("------------------------------\n");
         * System.out.println("--------------2번--------------");
         * for(int i=17; i>=14;i--){
         * System.out.println(i);
         * }
         * System.out.println("------------------------------\n");
         * System.out.println("--------------3번--------------");
         * for(int = i=1; i<=10;i++){
         * if(i%2==1){
         * System.out.println(i);
         * }
         * }
         * System.out.println("------------------------------\n");
         * System.out.println("--------------4번--------------");
         * System.out.println("숫자를 하나 입력해주세요");
         * System.out.print("> ");
         * int number = scanner.nextInt();
         * for(int i = 1; i<=number;i++){
         * System.out.println(i);
         * }
         * System.out.println("------------------------------\n");
         * System.out.println("--------------5번--------------");
         * System.out.println("첫번재 숫자를 입력해주세요.");
         * System.out.print("> ");
         * number = scanner.nextInt();
         * System.out.println("두번째 숫자를 입력해주세요.");
         * System.out.print("> ");
         * int number2 = scanner.nextInt();
         * int start =0;
         * int end = 0;
         * if(number<number2){
         * start=number;
         * end=number2;
         * }else{
         * start=number2;
         * end=number;
         * }
         * for(int i = start; i <= end; i++){
         * System.out.println(i);
         * }
         * System.out.println("------------------------------\n");
         * System.out.println("--------------6번--------------");
         * 
         * int sum=0;
         * System.out.println("숫자를 입력해주세요.");
         * System.out.print("> ");
         * number = scanner.nextInt();
         * 
         * for(int i=1; i<=number;i++){
         * sum+=i;
         * }
         * System.out.printf("1부터 %d까지의 합: %d\n",number,sum);
         * 
         * System.out.println("------------------------------\n");
         * System.out.println("--------------7번--------------");
         * 
         * int result=1;
         * System.out.println("숫자를 입력해주세요.");
         * System.out.print("> ");
         * number = scanner.nextInt();
         * 
         * for(int i=1; i<=number;i++){
         * sum*=i;
         * }
         * System.out.printf("1부터 %d까지의 곱: %d\n",number,result);
         * 
         * System.out.println("------------------------------\n");
         */
        
        scanner.close();
    }

}
