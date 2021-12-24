package day1019;
// 1부터 100까지 소수를 구하는 프로그램

// 1. 소수란 무엇인가?
//    1과 자기 자신만이 약수인 숫자
//    = 약수의 갯수가 2개인 숫자

// 2. 약수란 무엇인가?
//    어떤수를 나눴을 때 나눠 떨어지는수
//    = A를 B로 나눠서 나눠 떨어지면 B는 A의 약수이다.
//    = A를 B로 나눠서 나머지가 0이면 B는 A의 약수이다.

// 3. 어떤 수의 가장 큰 약수는?
//    자기 자신

public class Ex04PrimeNumber {
    public static void main(String[] args) {
        System.out.println("1~100까지 소수는");
        for(int i=0; i<=100;i++) {
            int divisor=0;
            for(int j=1; j<=i; j++) {
                if(i%j==0) {
                    divisor++;
                }
            }
            if(divisor==2) {
                
                System.out.printf("%2d ",i);
            }
            
        }
        System.out.println("입니다.");
        
        /*강사님해답
         *  //ifor문의 i값은 소수인지 아닌지 검사할 대상 숫자가 된다.
         *  //따라서 i는 1로 초기화하고
         *  // 100보다 작거나 같을 동안 1씩 증가되면서검사를 받게된다.
         * for(int i=1; i<=100; i++){
         * int count = 0;
         *   
         *   // j for문의 j는 i의 약수인지 아닌지를 검사할 숫자가 된다.
         *   // 그렇다면 j의 초기화식은?
         *   // j=1;
         *   // j의 반복조건식은?
         *   // j<=i;
         *   
         *   for(int j =1; j<=i;j++){
         *   if(i%j==0){
         *   count++;
         *   }
         *   }
         *   
         *   if(count==2){
         *   System.out.println(i+"은 소수입니다.");
         *   }
         * }
         */
    }

}
