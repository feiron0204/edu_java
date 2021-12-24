package day1020;

// 별찍기 10번
import java.util.Scanner;

public class StarPrinter10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("별찍기 10번");
        System.out.println("------------------------------------\n");

        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = "";
            // 공백의 갯수를 저장할 int 변수
            int spaceWidth = 0;
            // 별의 갯수를 저장할 int 변수
            int starWidth = 0;

            if (i == 1 || i == 2 * userNumber - 1) {
                // 맨첫줄 혹은 맨 마지막줄은
                // 공백없이 별만 넣어준다.
                for (int j = 1; j <= 2 * userNumber - 1; j++) {
                    stars += "*";
                }
            } else if (i < userNumber) {
                // 윗부분의 변환된 i의 값을 저장할 int 변수
                int upperI = i - 1;
                starWidth = userNumber - upperI;
                spaceWidth = 2 * upperI - 1;
            } else {
                // 아래부분의 변환된 i의 값을 저장할 int 변수
                int lowerI = i - userNumber + 1;
                starWidth = lowerI;
                spaceWidth = 2 * userNumber - 1 - 2 * starWidth;
            }
            // 왼쪽 별을 담당하는 j for문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
            // 가운데 공백을 담당하는 j for문
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            // 오른쪽 별을 담당하는 j for문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);

        }

        scanner.close();

    }
}
