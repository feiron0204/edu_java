package day1014;
// printf()
// printf()는 출력할 내용을 %문자에 지정하여 출력할 수 있는데
// 이때 형식을 우리 필요에 따라서 특별하게 맞춰줄수 있다.
public class Ex03PrintF {
    public static void main(String[] args) {
        System.out.println("1. 10진법 정수('d'ecimal)");
        int num = 251;
        // A. 10진법 정수를 그대로 출력하라
        System.out.printf("1-A. [%d]\n", num);
        // B. 10진법 정수를 오른쪽 정렬 6자리로 출력하라
        System.out.printf("1-B. [%6d]\n", num);
        // C. 10진법 정수를 오른쪽 정렬 2자리로 출력하라
        //    단, 출력할 내용이 지정된 자릿수보다 많으면
        //    자릿수 지정은 무시된다.
        System.out.printf("1-C. [%2d]\n", num);
        // D. 10진법 정수를 왼쪽 정렬 6자리로 출력하라
        System.out.printf("1-D. [%-6d]\n", num);
        // E. 10진법 정수를 오른쪽 정렬 6자리로 출력하되
        //    왼쪽 빈 자리는 0으로 채워라
        System.out.printf("1-E. [%06d]\n", num);
        System.out.println("--------------------------");
        
        System.out.println("2. 16진법 정수(he'x'adecimal)");
        num = 159;
        // 159는 16진법으로 9F이다.
        // A. 16진법 정수를 그대로 출력하되, 알파벳이 존재하면
        //    소문자로 출력해라
        System.out.printf("2-A. [%x]\n", num);
        // B. 16진법 정수를 오른쪽 정렬 4자리로 출력하되
        //    알파벳이 존재하면 대문자로 출력해라
        System.out.printf("2-B. [%4X]\n", num);
        // C. 16진법 정수를 왼쪽정렬 4자리로 출력하되
        //    알파벳이 존재하면 소문자로 출력해라
        System.out.printf("2-C. [%-4x]\n", num);
        // D. 16진법 정수를 오른쪽 정렬 4자리로 출력하고
        //    왼쪽 빈자리는 0으로 채우고
        //    알파벳이 존재하면 대문자로 출력해라
        System.out.printf("2-D. [%04X]\n", num);
        
        System.out.println("--------------------------");
        
        System.out.println("3. 실수('f'loat)");
        // 실수의 경우, %f 라는 문자를 통해 형식을 맞추지만
        // 해당 자리에는 float 뿐만 아니라 double 데이터타입의 값도 들어갈 수 있다.
        double d = 12.3456789;
        /*
         *  printf 설정상 %f의  소수 6번째자리까지 나오게 설정되어있음
         */
        
        // A. 실수를 그대로 출력해라
        System.out.printf("3-A. [%f]\n", d);
        // B. 실수를 오른쪽 정렬 16자리로 출력해라
        System.out.printf("3-B. [%16f]\n", d);  
        // C. 실수를 왼쪽 정렬 6자리로 출력해라
        System.out.printf("3-C. [%-6f]\n", d);
        // D. 실수를 소숫점 세번째자리까지 출력해라
        System.out.printf("3-D. [%.3f]\n", d);
        // E. 실수를 오른쪽정렬 8자리로 맞추고
        //    소숫점은 세번째자리까지 출력하되
        //    왼쪽 빈자리는 0으로 채워서 출력해라
        System.out.printf("3-E. [%08f]\n", d);
        System.out.println("--------------------------");
        
        System.out.println("4. 스트링('s'tring)");
        String str =  "abcdEFGH";
        // A. String을 그대로 출력해라
        System.out.printf("4-A. [%s]\n", str);
        // B. String을 모두 대문자로만 출력해라
        System.out.printf("4-B. [%S]\n", str);
        /*
         * 오른쪽정렬하고 왼쪽에 0채우기 안됨
         */
        System.out.println("--------------------------");
        
        System.out.println("5. printf()를 사용할 때 주의할 점");
        // A. 유효하지 않은 %문자를 사용하면 에러가 발생한다.
        /*
         * System.out.printf("%z\n", num);
         */
        // B. %문자와 데이터타입이 맞지 않으면 에러가 발생한다.
        /*
         * System.out.printf("%d\n",d);
         * System.out.printf("%f\n",num);
         * 정수나 실수가 String에 들어갈때는 포장클래스에서 자동으로 변환해주므로 상관없따
         */
        // C. 만약 printf를 통해서 출력할 때, 문자로써의 %가 필요할때는
        //    %%라고 적어준다.
        System.out.printf("%d%%입니다.\n", 20);
        // D. 우리가 printf()를 사용할 때에는, 한개의 %문자만 사용하는 것이 아니라
        //    여러개의 %문자를 조합하여 우리가 원하는 방식으로 출력이 가능하다.
        //    단, 이렇게 여러개의 %문자를 사용하는 경우, 뒤의 나오는 값들이 %문자에 대응 가능해야 한다.
        System.out.printf("%d %f %d %s\n", 1,2.3,4,"ab");
        System.out.printf("%d %d %d\n", 1,2,3,4);
        /*
         * System.out.printf("%d %d %d", 1,2);
         */
        // E. 출력해야할 내용은 별개의 String에 저장하여 사용할 수도 있다.
        String format = "%d %d\n";
        System.out.printf(format,30,40);
        
        System.out.println("--------------------------");
        
        
    }

}
