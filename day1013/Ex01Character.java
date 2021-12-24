package day1013;
// 기본형 데이터타입03
// 문자형 데이터타입

// 문자형 데이터타입은
// char 라고 적는데,
// "차" 라고 읽는것이 아니라
// 문자 라는 영어단어인 "캐릭터"라고 읽어야 한다.

// char 타입의 경우, 우리가 문자 한개를 저장할 수 있다.
// 저장할 때에는 저장할 문자를 ''로 감싸야 한다.

// 숫자, 알파벳, 그리고 기본 특수문자의 경우에는
// ASCII 테이블이라는 특수한 문자표를 사용하여 
// 값이 저장되고, 저장된 값이 반환된다.

// 한글은 우리가 지정한 캐릭터 인코딩 표값에 따라서
// 제어된다.
public class Ex01Character {
    public static void main(String[] args) {
        // char 변수 myChar 선언
        char myChar;
        // myChar에 대문자 A를 저장해보자
        myChar = 'A';
        // 화면에 myChar에 현재 저장된 문자를 출력해보자
        System.out.println(myChar);
        
        // myChar에 10진법값 97을 저장해보자
        myChar = 97;
        // 화면에 myChar에 현재 저장된 문자를 출력해보자
        System.out.println(myChar);
        
        // char는 단점이 있는데, 한번에 한개의 글자만 제어가능하다라는 것이 단점이 된다.
        // 우리가 실질적으로 프로그램에서 출력하거나 입력을 받을때에는 한개의 글자만 출력/입력 받는 경우는 극히 드물다.
        // 그렇기때문에 우리는 문자와 관련된 값을 다룰 때에는 char 데이터타입을 사용하지 않는다.
        // 대신, 여러개의 char를 한꺼번에 저장하거나 저장된 값을 호출할 수 있는
        // String(문자열)이라는 데이터타입을 사용하게 된다.
        
        // String은 0개 이상의 글자를 저장할 수 있고
        // String 값은 ""로 감싸주게 된다.
        
        // String 변수 myStr을 선언해보자
        String myStr;
        // myStr에 "가나다라"를 저장해보자
        myStr = "가나다라";
        // myStr에 현재 저장된 값을 화면에 출력해보자
        System.out.println(myStr);
        
    }

}
