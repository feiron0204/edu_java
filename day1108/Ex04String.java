package day1108;
// String 클래스
public class Ex04String {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "DEF";
        
        
        // 1. charAt()
        System.out.println("str1.charAt(0): "+str1.charAt(0));
        // 2. compareTo()
        System.out.println("str1.compareTo(str2): "+str1.compareTo(str2));
        /* 
         * 글자마다 특정한 값이 있고 그 차이를 10진법으로 계산해서 보여줌.
         */
        // 3. endsWith()
        /*
         * 맨마지막글자가 파라미터로 들어온건지 체크(?)
         */
        System.out.println("str1.endWith(\"c\"): "+str1.endsWith("c"));
        System.out.println("str1.endWith(\"bc\"): "+str1.endsWith("bc"));
        // 4. indexOf()
        System.out.println("str1.indexOf(\"c\"): "+str1.indexOf("c"));
        /*
         * lastIndexOf. langth 다존재
         */
        str1 = str1.replace('b','D');
        System.out.println(str1);
        // 5. substring()
        System.out.println("str1.substring(1): "+str1.substring(1));
        System.out.println("str1.substring(1,2): "+str1.substring(1,2));
        // 6. toUpperCase()
        str1 = str1.toUpperCase();
        System.out.println("str1: "+str1);
        // 7. toLowerCase()
        str1 = str1.toLowerCase();
        System.out.println("str1: "+str1);
        // 8. concat()
        str1 = str1.concat("dddddd");
        System.out.println("str1: "+str1);
        // 9. trim()
        str1 = "                          \n\nd e   f\t\t\t\n";
        System.out.println("str1: "+str1);
        System.out.println("str1.trim(): "+str1.trim());
        
        // 정규표현식(Regular Expression or REGEX)
        // 정규표현식이란
        // 어떤 문자열이 그 표현식으로 표현 가능한지를 확인할 때 사용되는 기준점이 된다.
        
        // 예를 들어보자
        // 123456은 "숫자"로 표현 가능합니까?
        // 123ABCd는 "숫자"로 표현 가능합니까?
        // abcde는 "숫자"로 표현 가능합니까?
        
        // 해당 문자열이 숫자+알파벳@알파벳.알파벳 의 형태입니까?
        
        // 정규표현식은 우리가 여러 방법으로 조합이 가능한데 대표적으론 다음이 존재한다.
        // 1. 해당 String이 숫자로만 이루어져있습니까?
        // ^\\d$
        // ^: 문자열의 시작
        // \\d: 숫자로 이루어진 문자(0~9)
        // $: 문자열의 끝
        // 즉 위의 ^\\d$는 "숫자 1개로 이루어진 문자열"이라는 정규표현식이 된다.
        String regEx="^\\d$";
        System.out.println("1".matches(regEx));
        System.out.println("12345".matches(regEx));
        System.out.println("abcde".matches(regEx));
        System.out.println("123abc".matches(regEx));
        System.out.println("abc45".matches(regEx));
        
        // 만약 숫자로 이루어진 여러 글자의 문자열인지를 확인할 때에는?
        /*
         * []*는 0번이상 등장했는지!
         */
        // ^\\d*$
        regEx="^\\d*$";
        System.out.println("1".matches(regEx));
        System.out.println("12345".matches(regEx));
        System.out.println("abcde".matches(regEx));
        System.out.println("123abc".matches(regEx));
        System.out.println("abc45".matches(regEx));
        
        // 만약 시작하는 글자는 알파벳 그 후에 영대소문자, 숫자, @ 영대소문자, ., 영대소문자
        // 가 나왔는지 확인할려면?
        /*
         * []+ 이건 1번이상 등장했는지!
         * []{숫자} 이건 정확히 숫자 번 등장
         * []{숫자,} 이건 숫자번 이상 등장
         * []{숫자1,숫자2} 이건 숫자1이상 숫자2이하 번 등장
         * \\W: 알파벳대소문자, 숫자가 아닌경우
         * \\D: 숫자가 아닌경우
         * \\w: 알파벳대소문자,숫자만(?)
         */
        regEx="^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]+$";
        System.out.println("\"1\".matches(regEx): "+"1".matches(regEx));
        System.out.println("\"a\".matches(regEx): "+"a".matches(regEx));
        System.out.println("\"a2c\".matches(regEx): "+"a2c".matches(regEx));
        System.out.println("\"1@2\".matches(regEx): "+"1@2".matches(regEx));
        System.out.println("\"1@a.k\".matches(regEx): "+"1@a.k".matches(regEx));
        System.out.println("\"ab@a.k\".matches(regEx): "+"ab@a.k".matches(regEx));
        System.out.println("\"1ab@ab.kr\".matches(regEx): "+"1ab@ab.kr".matches(regEx));
        System.out.println("\"ab@a\".matches(regEx): " +"ab@a".matches(regEx));
        System.out.println("\"1@ab.kr\".matches(regEx): "+"1@ab.kr".matches(regEx));
        
    }
}
