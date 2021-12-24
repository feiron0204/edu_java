package day1021;
// 로또 번호 제작기 3
// 정렬이 된 로또 번호 제작하기

import java.util.Random;

public class Ex07Lotto03 {
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
        System.out.println("중복제거 후 정렬 전");
        System.out.print("[");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%2d", numbers[i]);
            if (i < SIZE - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
        System.out.println("----------------------------------\n");
        System.out.println("정렬 후");
        for(int i=0;i<numbers.length-1;i++) {
            if(numbers[i]>numbers[i+1]) {
                int temp=numbers[i];
                numbers[i]=numbers[i+1];
                numbers[i+1]=temp;
                i=-1;
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
