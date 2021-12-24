package day1020;
// 사용자가 입력한 숫자에 맞는 단수를
// 배열을 사용해서 출력하는 프로그램을 작성하시오
// 4시 45분까지
import java.util.Scanner;

public class Ex03Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("구구단 출력 프로그램.");
        //구구단 배열먼저 만들기
        int[] gugudan=new int[9];
        
        System.out.println("출력하실 단수를 입력하세요.");
        System.out.print("> ");
        int dan=scanner.nextInt();
        
        System.out.printf("-------%d단-------\n",dan);
        // 구구단결과 출력
        for(int i=0;i<gugudan.length;i++) {
            gugudan[i]=(i+1)*dan;
            System.out.printf("%2d 곱하기 %2d = %2d\n", dan, i+1, gugudan[i]);
        }
        
        /*강사님해답
         * int[] gugudan = new int[9];
         * System.out.println("출력할 단을 입력해주세요.");
         * System.out.print("> ");
         * int dan = scanner.nextInt();
         *  // 값을 저장하는 for 문
         * for(int i=0;i<gugudan.length;i++){
         *  gugudan[i] = dan *(i+1);
         * }
         * 
         *  // 저장된 값을 출력하는 for 문
         *  System.out.println("=========================");
         *  System.out.println(dan +" 단");
         *  System.out.println("=========================\n");
         * for(int i=0;i<gugudan.length;i++){
         *  System.out.printf("%d x %d = %d\n",dan,i+1,gugudan[i]);
         * }
         */
        scanner.close();
    }

}
