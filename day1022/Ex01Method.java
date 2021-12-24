package day1022;
// 메소드

// 메소드란, 반복적으로 사용되는 여러줄의 코드를
// 귀찮게 계속 다 적어주는 것이 아니라,
// 우리가 그 코드 뭉치를 합쳐서
// 줄임말로 만들어주는 것이다.

// 메소드는 우리가 반드시 선언과 구현을 해야 
// 해당 메소드를 사용할 수 있다.

// 메소드는 다음과 같은 구조를 가진다.

// 접근제한자 static 리턴타입 메소드이름(파라미터){
//    메소드가 실행되면 실행할 코드
// }

// 접근제한자 (Access Modifier)

// 접근제한자란, 해당 메소드를 다른 클래스의 위치에 따라서 접근이 가능한지 아닌지를
// 결정해주는 키워드이다.
// 접근제한자에는 다음과 같이 있다.
// public: 퍼블릭 접근제한자는, 해당 메소드를 외부 클래스가 어디에 있던간에
//         호출 가능하게 설정한다.
// protected: 프로텍티드 접근제한자는, 다른 패키지에 있는 클래스가 해당 메소드를
//            호출하려면, 반드시 상속관계여야 한다.
//            상속관계가 아닌 다른 패키지의 클래스일 경우, 해당 메소드를 사용할 수 없다.
// default: 디폴트 접근제한자는 같은 패키지에 있는 클래스면 상관없지만,
//          다른 패키지에 있는 모든 클래스들은 해당 메소드를 호출할 수 없다.
//          그래서 디폴트 접근제한자는"패키지"접근제한자라고도 하는데,
//          default와 package 모두 이미 다른곳에서 사용중인 키워드이다.
//          그렇기때문에, 우리가 아무런 접근제한자를 적어주지 않으면
//          자동으로 디폴트 접근제한이 걸리게 된다.
// private: 프라이빗 접근제한자는 이 클래스가 아닌 모든 다른 클래스는 
//          해당 메소드를 호출할 수 없다.

// static
// 스테틱 키워드는 특수한 키워드로써, 해당 메소드를 클래스 변수 선언 없이 메소드만 호출하겠다 라는 설정을 하게된다.
/*
 * Ex09Lotto04 e = new Ex09Lotto04();
 * e.main(args);
 * 이런거 안해줘도됨
 */
// 주의할 점은, 클래스 안에 static 메소드가 다른 메소드를 사용 할 때에는 그 다른 메소드에도 반드시 static이 붙어야 한다.

// 리턴타입
// 리턴 타입이란, 해당 메소드가 종료될 때, 그 메소드를 호출한 곳을 보내줄 값의 데이터 타입을 뜻한다.
// 만약, 해당 메소드가 호출된 곳으로 아무 값도 보내주지 않을때에는 void 라고 적어준다.
// 만약 리턴 타입이 존재할 시(즉 void가 아닐 경우), 반드시 해당 메소드는 내부에서 return이라는 키워드를 사용해서
// 리턴 타입과 같은 데이터타입을 가진 값을 리턴해야 한다.
// void는 return을 사용하면 에러가 발생한다.

// 메소드이름
// 소문자로 시작하고 낙타등 표기법을 사용하는 동사

// 파라미터
// 파라미터란, 해당 메소드를 실행시킬 때, 외부로부터 받아오는 값이다.
// 우리가 파라미터를 한국말로 표현할 때에는" 매개 변수" 라고도 하는데.
// 실제 해당 메소드가 유효범위인 변수로 취급이 된다.
// 또한, 파라미터는 필요에 따라서는 여러개가 나올 수도 있는데,
// 이때에는 각각 ,로 구분이 된다.
// 파라미터의 경우, 우리가 설정한 파라미터가 존재하면
// 메소드를 호출할 때에도 거기에 맞춰서 값을 보내주어야 한다.
// 단, 이때에는 별도의 이름이 동일한 변수를 따로 만들어서 보내주지않고
// 데이터타입이 일치하는 값만 보내줘도 된다.
// 또한, 파라미터가 중요한 이유는 오버로딩 이라는 기법과 연결이 되기 때문이다.

// 오버로딩
// 오버로딩이란, 똑같은 목적을 가진 메소드들의 경우,
// 이름을 다 다르게 하는 것이 아니라
// 파라미터만 바꾸고 이름은 똑같이 통일시켜서
// 해당 목적을 가진 메소드들을 좀더 쉽게 알아 볼수 있게 만들어주는 기법이다.
/*
 * import day1021.Ex09Lotto04
 */

/* !!!!!!!!!!!!!!!!!!!!!!!!!!숙제!!!!!!!!!!!!!!!!!!!!!
 *  메소드호출은 2가지가있따(파라미터관련)
 *  값에의한호출
 *  주소값에의한호출
 *  
 *  찾아 읽어오기
 */

/*
 * 다음중 (int a, int b)와 파라미터가 같은거
 * (int ~, int ~) 써있으면 같은거임
 * 
 */

/* 3출력됨.
 * public class Ex01Method {
    public static void main(String[] args) {
     a(1,2);   
    }
    public static void a(int a, int b) {
        System.out.println(a+b);
    }
}
 */
public class Ex01Method {

    public static void main(String[] args) {
        printNumber();
        printNumber();
        printNumber();

//        int number = 4;
//        System.out.println("number > 0: " + (number > 0));
//        if (number > 0) {
//            System.out.println("number는 0보다 큽니다.");
//            System.out.println("따라서 number는 양의 정수입니다.");
//        } else {
//            System.out.println("number는 0보다 작거나 같습니다.");
//            System.out.println("따라서 number는 양의 정수가 아닙니다.");
//
//        }
//        number = 0;
//        System.out.println("number > 0: " + (number > 0));
//        if (number > 0) {
//            System.out.println("number는 0보다 큽니다.");
//            System.out.println("따라서 number는 양의 정수입니다.");
//        } else {
//            System.out.println("number는 0보다 작거나 같습니다.");
//            System.out.println("따라서 number는 양의 정수가 아닙니다.");
//
//        }
//        number = -4;
//        System.out.println("number > 0: " + (number > 0));
//        if (number > 0) {
//            System.out.println("number는 0보다 큽니다.");
//            System.out.println("따라서 number는 양의 정수입니다.");
//        } else {
//            System.out.println("number는 0보다 작거나 같습니다.");
//            System.out.println("따라서 number는 양의 정수가 아닙니다.");
//
//        }
        int number = 4;
        checkPos(number);
        number = 0;
        checkPos(number);
        number = -1;
        checkPos(number);

        String self;
        self = showSelfIntro();

        System.out.println(self);

        String self2;

        self2 = showSelfIntro();

        System.out.println(self2);

        String self3;

        self3 = showSelfIntro();

        System.out.println(self3);

        int[] arr = { -1, -2, -4, -3, -4, -4, -5 };
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (max <= arr[i]) {
//                max = arr[i];
//            }
//        }
        int max=findMax(arr);
        System.out.println("arr의 최대 값: " + max);
        int[] arr2 = { 10, 200, 3000, 400, 50 };
////        max = arr2[0];
////
////        for (int i = 1; i < arr2.length; i++) {
////            if (max <= arr2[i]) {
////                max = arr2[i];
////            }
//        }
         max=findMax(arr2);
        System.out.println("arr2의 최대 값: " + max);

        int[] arr3 = { 23, 12, 910, 12, 2819 };
//        max = arr3[0];
//
//        for (int i = 1; i < arr3.length; i++) {
//            if (max <= arr3[i]) {
//                max = arr3[i];
//            }
//        }
        max=findMax(arr3);
        System.out.println("arr3의 최대 값: " + max);

    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        
        return max;
    }

    private static void printNumber() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

    }

    private static void checkPos(int num) {

        System.out.println("num > 0: " + (num > 0));
        if (num > 0) {
            System.out.println("num는 0보다 큽니다.");
            System.out.println("따라서 num는 양의 정수입니다.");
        } else {
            System.out.println("num는 0보다 작거나 같습니다.");
            System.out.println("따라서 num는 양의 정수가 아닙니다.");

        }
    }

    public static String showSelfIntro() {
        String temp = "이름: 이성호";
        temp = temp + ", 학년: 1학년";
        temp = temp + ", 국어: 030점";
        temp += ", 영어: 040점";
        temp += ", 수학: 80점";
        return temp;
    }

}
