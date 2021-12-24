package day1026;
// day1020 패키지의 Ex02Array.java를 보면
// 배열의 정의는
// "배열이란 똑같은 데이터타입의 변수를 묶어서 하나의 변수처럼 다루게 하는 데이터타입이다."이다.
// 즉 배열도 하나의 데이터타입이라는 것인데,
// 그렇다면 우리가 배열을 모아둔 배열을 만들 수 있지 않을까?
// 더 나아가 배열을 모아둔 배열을 모아둔 배열도 만들수 있지 않을까?
// 이렇게 배열을 모아둔 배열을 우리는 다차원 배열이라고 한다.

// 우리는 2차원 배열까지만 배울것인데
// 2차원 배열은 다음과 같이 선언하고 초기화한다.
// 데이터타입[][] 배열이름 = new 데이터타입[크기1][크기2]
// 크기1: 해당 배열에 모여있는 배열의 총 갯수
// 크기2: 각 배열의 칸의 총 갯수

// 그렇다면
// int[][] arr =new int[3][4]라고 하였을 시에
// 해당 배열은 int배열이 몇개가 모여있는가
// 답: 3개
// 각 배열은 몇칸짜리 배열입니까
// 답: 4칸

// 각 배열의 칸 수는 우리가 초기화할때 꼭 넣어줄 필요는 없지만
// 총 배열의 갯수는 반드시 초기화 단계에서 넣어주어야 한다.

// 이번 예제에서는 우리가
// 사용자로부터 로또 게임을 총 몇번할지 입력을 받아서
// 각 게임마다 자동 혹은 수동을 입력받아서
// 거기에 알맞게 처리를 하고
// 정렬을하고
// 마지막으로 컴퓨터의 숫자와 비교해서
// 각 게임이 총 몇개씩 맞았는지를 보여주는 프로그램을 작성해보게 된다.
import java.util.Scanner;
import java.util.Random;
import util.ArrayUtil;
import util.ScannerUtil;

public class Ex04MultiArray {
    // 전역상수
    public static final int SIZE=6;
    public static final int NUMBER_MIN=1;
    public static final int NUMBER_MAX=45;
    
    // 전역변수
    public static Scanner scanner=new Scanner(System.in);
    public static int[][] userNumbers;
    public static int[] computerNumbers = new int[0];
    
    // 사용자 배열을 초기화하는 메소드
    public static void initUserNumbers() {
        String message="총 몇게임 하시겠습니까?";
        int gameSize=ScannerUtil.nextInt(scanner, message);
        userNumbers=new int[gameSize][0];
    }
    
    // 1~45까지 중복되지 않는 숫자 6개가 저장된 배열을 리턴하는 메소드
    public static int[] setAutoNum() {
        int[] temp=new int[0];
        Random random=new Random();
        while(ArrayUtil.size(temp)<SIZE) {
            int num = random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
            if(!ArrayUtil.contains(temp, num)) {
                temp = ArrayUtil.add(temp, num);
            }
        }
        sort(temp);
        return temp;
    }
    // 파라미터로 들어온 int배열을 오름차순 정렬하는 메소드
    public static void sort(int[] array) {
        for(int i=0; i<ArrayUtil.size(array)-1;i++) {
            if(ArrayUtil.get(array,i)>ArrayUtil.get(array, i+1)) {
                int temp = ArrayUtil.set(array, i, ArrayUtil.get(array, i+1));
                ArrayUtil.set(array, i+1, temp);
                i=-1;
            }
        }
    }
    
    // 숙제: 사용자로부터 중복되지 않는 숫자 6개를 입력받아서 배열에 담아 리턴하는 메소드를 작성하시오
    public static int[] setManualNum() {
        int[] temp=new int[0];
        String message;
        message="1부터 45사이의숫자를 입력해주세요.";
        while(ArrayUtil.size(temp)<SIZE) {
            System.out.println((ArrayUtil.size(temp)+1)+"번째 숫자");        
            int num=ScannerUtil.nextInt(scanner, message,NUMBER_MIN,NUMBER_MAX);
            if(ArrayUtil.contains(temp, num)) {
                System.out.println("중복된 숫자는 입력하실 수 없습니다.");
            }else {
                temp=ArrayUtil.add(temp, num);
            }
        }
        sort(temp);
        
        return temp;
        
    }
    
    public static int countSameNum(int[] arr1, int[] arr2) {
        int count=0;
//        for(int i=0;i<ArrayUtil.size(arr1);i++) {
//            for(int j=0;j<ArrayUtil.size(arr2);j++) {
//                if(arr1[i]==arr2[j]) {
//                    if(i!=j) {
//                        count++;
//                    }
//                }
//            }
//        }
        for(int i=0;i<ArrayUtil.size(arr1);i++) {
            int num = ArrayUtil.get(arr1,i);
            if(ArrayUtil.contains(arr2, num)) {
                count++;
            }
        }
        return count;
    }
    
    public static void setMode() {
        String message="1. 자동 2. 수동";
        for(int i=0; i<userNumbers.length;i++) {
            System.out.println((i+1)+"번 게임");
            int userChoice = ScannerUtil.nextInt(scanner, message,1,2);
            
            if(userChoice==1) {
                userNumbers[i]=setAutoNum();
            } else {
                userNumbers[i]=setManualNum();
            }
        }
    }
    public static void setComputerNum() {
        computerNumbers=setAutoNum();
    }
    
    public static void printNumber(int[] arr) {
        System.out.print("[");
        for(int i=0;i<ArrayUtil.size(arr);i++) {
            System.out.printf("%d", ArrayUtil.get(arr,i));
            
            if(i <ArrayUtil.size(arr)-1) {
                System.out.print(" ");
            }
        }
        System.out.print("]");
    }
    
    public static void printResult() {
        // 1. 컴퓨터 숫자 출력
        System.out.println("--------------------------------");
        System.out.println("컴퓨터 숫자");
        System.out.println("--------------------------------");
        printNumber(computerNumbers);
        System.out.println();
        // 2. 사용자가 각 게임 출력하면서 맞은 갯수 출력
        System.out.println("--------------------------------");
        System.out.println("사용자 숫자");
        System.out.println("--------------------------------");
        for(int i=0;i<userNumbers.length;i++) {
            System.out.println((i+1)+"번 게임");
            printNumber(userNumbers[i]);
            System.out.printf(" - %d개\n", countSameNum(computerNumbers,userNumbers[i]));
            
        }
        
    }
    
    public static void main(String[] args) {
        // 1. 사용자로부터 총 몇게임 할지 입력받는다.
        initUserNumbers();
        // 2. 컴퓨터의 숫자를 결정한다.
        setComputerNum();
        // 3. 사용자의 각 게임의 자동/수동 여부를 입력받아 처리한다.
        setMode();
        // 4. 결과를 출력한다.
        printResult();
    }
}
