package day1108;

import java.util.Scanner;

import util.ScannerUtil;

public class Ex05ScannerUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = ScannerUtil.nextInt(scanner, "숫자를 입력해주세요.",0,3);

        System.out.printf("%d\n",i);
        scanner.close();
    }
}
