package day1020;

// 별찍기 9번
import java.util.Scanner;

public class StarPrinter09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("별찍기 9번");
        System.out.println("------------------------------------\n");

        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = "";
            // i번째줄의 공백의 갯수를 저장할 int 변수
            int spaceWidth = 0;

            // i번재줄의 별의 갯수를 저장할 int 변수
            int starWidth = 0;

            // if-else 구조를 통하여
            // spaceWidth와 starWidth의 값을 결정한다.
            if (i < userNumber) {
                // 윗부분
                spaceWidth = userNumber - i;
                starWidth = 2 * i - 1;
            } else {
                int lowerI = 2 * userNumber - i;
                // 아랫부분
                spaceWidth = userNumber - lowerI;
                starWidth = 2 * lowerI - 1;
            }

            // spaceWidth번 반복하면서 stars에 공백을 추가하는 j for 문
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            // starWidth번 반복하면서 stars에 별을 추가하는 j for문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }

        scanner.close();
    }
}
