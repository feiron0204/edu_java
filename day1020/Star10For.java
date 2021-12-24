package day1020;

import java.util.Scanner;

public class Star10For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이쁜 별만들 숫자 입력해주세요~");
        System.out.print("> ");
        int star = scanner.nextInt();
/*ex star=5
 *   i           별for   공백for   별for    공백for   별for
   -0.5         star-1     0      1       0       star-1 
    0.5         star-1     1      0       0       star-1
    1.5         star-2     2      0       1       star-2
    2.5         star-3     3      0       2       star-3
    3.5         star-4     4      0       3       star-4
    4.5         star-5     5      0       4       star-5

                star-4     4      0       3       star-4
                star-3     3      0       2       star-3
                star-2     2      0       1       star-2
                star-1     1      0       0       star-1
                star-1     0      1       0       star-1

                 i를 음수 걸치게 3.5 2.5 1.5 0.5 -0.5
                 그럼 제곱하면 0.5 랑 -0.5는 같은게 나오니까 맨끝 조건식 가능
                 그리고 맨끝값이 음수니까 맨끝 중앙 별하나 가능
                 
                 사실 중앙공백 for 하나로도 될듯...
 */
        System.out.println("--------------10번---------------");
        for (double i = -0.5; i < star - 1; i ++) {
            for (int j = star - 1; j * j > i * i; j--) {
                System.out.print('*');
            }
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            for (double j=i; j < 0;j++) {
                
                System.out.print('*');
            }
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = star - 1; j * j > i * i; j--) {
                System.out.print('*');
            }
            System.out.println();

        }
        for (double i = star-2.5;i>-1;i--) {
            for (int j = star - 1; j * j > i * i; j--) {
                System.out.print('*');
            }
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            for (double j=i; j < 0;j++) {
                
                System.out.print('*');
            }
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = star - 1; j * j > i * i; j--) {
                System.out.print('*');
            }
            System.out.println();
            
        }
        System.out.println("-------------------------------\n");

        scanner.close();
    }
}
