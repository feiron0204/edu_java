package day1021;
// 로또 번호 제작기 2

// 중복된 숫자가 있으면 
// 제거하고 새로운 숫자를 저장하는 버전

// 중복이란?
// 인덱스는 다르지만 해당 인덱스에 저장된 값들이 같은 경우를 중복이라고 한다.

import java.util.Random;

public class Ex06Lotto02 {
    public static void main(String[] args) {

        final int NUMBER_MIN = 1;
        final int NUMBER_MAX = 45;
        final int SIZE = 6;

        Random random = new Random();

        int[] numbers = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            numbers[i] = random.nextInt(NUMBER_MAX - NUMBER_MIN + 1) + NUMBER_MIN;
        }

        System.out.println("중복제거전");

        System.out.print("[");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%2d", numbers[i]);
            if (i < SIZE - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
        System.out.println("----------------------------------\n");
//        int a=1;
//        int b=2;
//        a=b=a;
//        System.out.println(a);       
//        System.out.println(b);

//        int a=1;
//        a=a++;
//        System.out.println(a);
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length;) {
                if (i != j && numbers[i] == numbers[j]) {
                    numbers[i] = random.nextInt(NUMBER_MAX - NUMBER_MIN + 1) + NUMBER_MIN;
                    j = 0;
                } else {
                    j++;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%2d", numbers[i]);
            if (i < SIZE - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
        System.out.println("----------------------------------\n");
        
    }

}
