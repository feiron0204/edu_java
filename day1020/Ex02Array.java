package day1020;
// 배열(Array)
// 배열이란 똑같은 데이터타입의 변수를 묶어서 하나의 변수처럼 다루게 하는 데이터타입이다.
// 예를 들어서, 우리가 Ex01GradeBook01.java에서
// 번호, 이름, 국어, 영어, 수학을 저장할 변수를 다섯개씩 총 25개의 변수를 따로따로 만들었지만,
// 배열을 사용하면 번호의 모음집, 이름의 모음집, 국어의 모음집, 영어의 모음집, 수학의 모음집 이런식으로
// 다섯개의 변수를 선언하고 사용하면 된다.

// 우리가 변수에 값을 저장하거나 저장된 값을 호출할때에는
// 변수의 이름을 그대로 써주면 됬었지만,
// 배열을 사용해서 값을 저장하거나 호출할 때에는
// 그 배열에 몇번째 칸인지를 지정하여 값을 저장하거나 호출하게 된다.
// 이렇게 해당 배열에 몇번째 칸인지를 지칭하는 숫자를 우리는 인덱스 라고 부른다.

// 즉, 똑같은 목적을 가진 변수를 여러개 만드는 것이 아니라
// 그 변수 모음집 그리고 거기서 몇번째 칸 이런식으로 우리가 지칭하게 되는 것이다.

// 배열의 선언과 초기화 방법
// 데이터타입[] 배열이름 = new 데이터타입[크기];
/*
 * 선언 초기화 따로해도됨
 * 
 * 지금 뭔가가 들어가있긴함
 */
// 배열을 초기화 할때에는 우리가 반드시 해당 배열이 총 몇개의 값을 저장가능한지를 
// 지정해야한다. 
// 단, 크기는 우리가 정수형 값을 넣어주거나 아니면 정수형 변수, 상수를 넣어주어야 한다.

// 배열의 특정 칸에 값 저장하기
// 배열이름[인덱스] = 값;
/*
 * 배열간 복붙 x for 돌려야됨
 * 배열내의 값이 어떤 인덱스인지 찾는거 x for돌려야됨 
 */

// 배열의 특정 칸에 저장된 값 호출하기
// 배열이름[인덱스]

// 단, 인덱스를 사용할 때, 한가지 주의할 점은
// 인덱스의 범위는 0부터 [크기 -1]까지 이다.
// 만약, 잘못된 인덱스를 사용하게 되면, ArrayIndexOutOfBoundsException이 발생한다.

// 또한, 크기처럼 인덱스를 지칭할 때에는 다른 정수형 변수/상수가 사용될 수도 있다.
/*
 * 배열을 만들면 배열이있는 주소값 부여
 * 각 인덱스에따라 다른주소값 또 부여
 * 값은 그 인덱스의 다른주소값에 들어감.
 */
public class Ex02Array {
    public static void main(String[] args) {
        // 크기가 4인 int 배열 numArray를 선언하고 초기화해보자
        int[] numArray=new int[4];
        //크기가 4인 int 배열 strArray를 선언하고 초기화해보자
        String[] strArray=new String[4];
//        double[] doubleArray=new double[4];
//        char[] charArray=new char[4];
//        boolean[] booleanArray=new boolean[4];
        // 배열의 경우, 기본형 데이터타입의 배열일 때에는 모든 칸은 0으로 초기화된다.
        System.out.println("numArray[2]: "+numArray[2]);
        // 참조형 데이터타입의 배열일 때에는 모든 칸은 null로 초기화된다.
        System.out.println("strArray[3]: "+strArray[3]);
        
        // 배열에 특정 인덱스에 값을 저장할 때에는
        // 배열이름[인덱스]=값; 으로 저장한다.
        numArray[0] = 7;
        numArray[1] = 12;
        numArray[2] = 18;
        numArray[3] = 25;
        
        // 배열의 특정 인덱스에 저장된 값을 불러올 때에는
        // 배열이름[인덱스] 로 불러온다.
        System.out.println("numArray[2]: "+numArray[2]);
        
        // 우리가 정수형 데이터타입의 공간을 사용해서 특정 인덱스를 지칭하거나
        // 배열을 초기화할때 크기로 지정가능하다.
        
        int num = 0;
        strArray[num]="가";
        num++;
        strArray[num]="나";
        num++;
        strArray[num]="다";
        num++;
        strArray[num]="라";
        
//        for(int i=0; i<4;i++) {
//            System.out.printf("strArray[%d]: %s\n",i,strArray[i]);
//        }
        
        //해당 배열의 크기를 호출할 때에는
        // 배열이름.length 라고 적으면 된다.
        for(int i=0; i<strArray.length;i++) {
            System.out.printf("strArray[%d]: %s\n",i,strArray[i]);
        }
        
//        System.out.println("charArray[3]: "+charArray+charArray[3]);
//        System.out.println("booleanArray[2]: "+booleanArray[2]);
//        System.out.println("doubleArray[2]: "+doubleArray[2]);
        
        /*
         * 배열불러와! 하면 주소값을 줘버림
         * 인덱스에있는거 불러와! 하면 값을줌
         * char 같은경우 스페이스바가아닌 "빈 공간"
         * boolean 은 0 = false
         */
        // 인덱스를 잘못 호출할 때
//        System.out.println(strArray[-3]);
//        System.out.println(strArray[15]);
        /*
         * 일단[정수형]이면 돌아가긴함. 근데 소수같은거 넣으면 돌리기전에 컷트
         */
    }
}
