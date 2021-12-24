package day1014;
// 자바 콘솔화면에 출력하는 3가지 방법 + 이스케이프 문자

// 자바 콘솔화면에 출력하는 방법은 크게 3가지가 있따.

// 1. print()
//    print()는 가장 기본적인 출력 방법으로써, () 안의 내용을 출력하고
//    만약 그 다음에 출력할 내용이 있으면 바로 오른쪽칸부터 출력이 시작된다.

// 2. println()
//    println()은 print a line 의 줄임말로써 () 안의 내용을 출력하고
//    만약 그 다음에 출력할 내용이 있으면 출력된 내용의 다음줄 철번째칸부터 출력이 시작된다.

// 3. printf()
//    printf()는 print in format의 줄임말로써, () 안의 내용을 형식에 맞추어 출력하고,
//    만약 그 다음에 출력할 내용이 있으면 출력된 내용의 오른쪽칸부터 출력이 시작된다.

// 이스케이프 문자
// 이스케이프 문자란, 공백이나 문장기호와 같이 특수한 문자를 코드에 입력할 때 쓰는 
// 특수한 문자이다.
// \와 조합되며, 우리가 적을 때에는 두 글자로 적지만, 실제론 한개의 문자로 취급이된다.
// 대표적으로, 탭 공백을 뜻하는 \t, 새로운 줄을 바꾸라는 의미의 개행문자를 뜻하는 \n
// 스트링 값의 시작 혹은 끝을 뜻하는 것이 아니라 문장 부호로써의 쌍따옴표를 뜻하는 \" 등이 있다.

public class Ex02Print {
    public static void main(String[] args) {
        // 출력할 내용을 담은 String 변수 2개
        String str1 = "abcd";
        String str2 = "EFGH";
        
        System.out.println("1. print()");
        System.out.print(str1);
        System.out.print(str2);
                      
        System.out.println("-----------------------");
        
        
        System.out.println("2. println() ");
        System.out.println(str1);
        System.out.println(str2);
        
        System.out.println("-----------------------");
        
        
        System.out.println("3. printf() ");
        System.out.printf("%s",str1);
        System.out.printf("%s",str2);
        
        System.out.println("-----------------------");
        
        
        System.out.println("4. 이스케이프 문자");
        
        System.out.println("1. \\를 출력해야 하는 경우");
        System.out.println("\\");
        System.out.println("2. 탭 공백(\\t)");
        System.out.println(str1+"\t"+str2);
        System.out.println("3. 개행 문자(\\n)");
        System.out.println(str1+"\n"+str2);
        // 즉, println()은 print("\n") 과 같다.
        System.out.println("4. char 문자(\\')");
        System.out.println('\'');
        // char 의경우 '로 감싸주는데 이스케이프문자는 1개로 처리되어 가능
        System.out.println("5. 쌍따옴표 문자(\\\")");
        System.out.println("\"내 사전에 불가능은 없다!\"-나폴레옹");
        
        System.out.println("-----------------------");
    }

}
