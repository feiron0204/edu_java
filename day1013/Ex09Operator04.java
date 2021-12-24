package day1013;
// 논리 연산자(Logical Operator)
// 논리 연산자는 boolean 값에 대한 연산 결과값을 구해준다.
// AND 연산자, OR 연산자, NOT 연산자 3종류가 있다.

// 1. AND 연산자(&&)
// 왼쪽과 오른쪽의 boolean 값이 모두 true일 때에만 true가 나온다.

// 2. OR 연산자 (||)
// 왼쪽과 오른쪽의 boolean 값 중 한개라도 true이면 true가 나온다.

// 3. NOT 연산자 (!)
// 오른쪽 boolean 값을 반대로 연산한다.

public class Ex09Operator04 {
    public static void main(String[] args) {
        System.out.println("1. AND 연산자");
        System.out.println("true && true: " + (true&&true));
        System.out.println("true && false: " + (true&&false));
        System.out.println("false && true: " + (false&&true));
        System.out.println("false && false: " + (false&&false));
        System.out.println("--------------------------");
        /*
         *  경고표시 왜나오냐? 
         *  둘중 하나만 false 면 false 인데 이미 왼쪽 false써놓고 뭐하려고? 
         *  라는뜻(dead code)
         */
        
        System.out.println("2. OR 연산자");
        System.out.println("true || true: " + (true||true));
        System.out.println("true || false: " + (true||false));
        System.out.println("false || true: " + (false||true));
        System.out.println("false || false: " + (false||false));
        System.out.println("--------------------------");
        /*
         * 경고표시는 위의 경우와 동일
         */
        
        System.out.println("3. NOT 연산자");
        boolean b = true;
        System.out.println("b의 현재 값: " + b);
        System.out.println("!b: " + !b);
        System.out.println("b의 현재 값: " + b);
        System.out.println("--------------------------");
        
        System.out.println("4. 특정 변수의 현재 값이 특정 범위에 속하는지 체크하는 방법");
        
        int num = 50;
        System.out.println("num >= 0 && num <= 10: " + (num>=0 && num<=10));
        
        System.out.println("--------------------------");
        
        System.out.println("5. 특정 변수의 현재 값이 특정 범위에 안속하는지 체크하는 방법");
        num = 15;
        System.out.println("num < 0 || num > 10: " + (num<0 || num>10));
        System.out.println("!(num >= 0 && num <= 10): " + !(num>=0 && num<=10));
        System.out.println("--------------------------");
        
    }

}
