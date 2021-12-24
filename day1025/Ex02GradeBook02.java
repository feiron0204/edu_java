package day1025;

// 배열을 사용하여
// 5명의 학생정보를 관리하는 프로그램을 작성하시오
// 10시 40분 까지
import java.util.Scanner;
import util.ScannerUtil;

public class Ex02GradeBook02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int STUDENT_SIZE = 5;
        final int SCORE_MAX = 100;
        final int SCORE_MIN = 0;
        final int SUBJECT_SIZE = 3;
        int[] idArray = new int[STUDENT_SIZE];
        String[] nameArray = new String[STUDENT_SIZE];
        int[] koreanArray = new int[STUDENT_SIZE];
        int[] englishArray = new int[STUDENT_SIZE];
        int[] mathArray = new int[STUDENT_SIZE];
        boolean inputSwitch = false;
//      int count=0;
        int[] count = {0};
        while (true) {
            int userChoice = 0;
            userChoice = ScannerUtil.nextInt(scanner, "1. 입력 2. 출력 3. 종료");
            if (userChoice == 1) {
                ScannerUtil.inputInfo(scanner, count, idArray, nameArray, koreanArray, englishArray, mathArray,
                        STUDENT_SIZE, SCORE_MIN, SCORE_MAX);
                

                inputSwitch = true;
//                if (count < 5) {
//                    idArray[count] = ScannerUtil.nextInt(scanner, "번호를 입력하세요");
//                    nameArray[count] = ScannerUtil.nextLine(scanner, "이름을 입력하세요");
//                    koreanArray[count] = ScannerUtil.nextInt(scanner, "국어 점수를 입력하세요", SCORE_MIN, SCORE_MAX);
//                    englishArray[count] = ScannerUtil.nextInt(scanner, "영어 점수를 입력하세요", SCORE_MIN, SCORE_MAX);
//                    mathArray[count] = ScannerUtil.nextInt(scanner, "수학 점수를 입력하세요", SCORE_MIN, SCORE_MAX);
//                    count++;
//                    inputSwitch = true;
//                } else {
//                    System.out.println("더이상 입력하실수 없습니다.");
//                }
            } else if (userChoice == 2) {
                if (inputSwitch) {
//                  for (int i=0;i<count;i++){
                    for (int i = 0; i < count[0]; i++) {
                        ScannerUtil.printInfo(idArray[i], nameArray[i], koreanArray[i], englishArray[i], mathArray[i],
                                SUBJECT_SIZE);
//
//                        System.out.printf("번호: %d번 이름: %s\n", idArray[i], nameArray[i]);
//                        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", koreanArray[i], englishArray[i], mathArray[i]);
//                        int sum = koreanArray[i] + englishArray[i] + mathArray[i];
//                        double average = (double) sum / SUBJECT_SIZE;
//                        System.out.printf("종점: %03d점 평균: %06.2f점\n", sum, average);
                    }
                }else {
                    System.out.println("입력값이 없습니다.");
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }

        }
        /*
         * 강사님해답 final int STUDENT_SIZE=5; final int SUBJECT_SIZE=3; final int
         * SCORE_MIN=0; final int SCORE_MAX=100;
         * 
         * int[] idArray = new int[STUDENT_SIZE]; String[] nameArray=new
         * String[STUDENT_SIZE]; int[] koreanArray = new int[STUDENT_SIZE]; int[]
         * englishArray = new int[STUDENT_SIZE]; int[] mathArray = new
         * int[STUDENT_SIZE]; int nextIdx=0;
         * 
         * while(true){ String message="1. 입력 2. 출력 3. 종료"; int userChoice =
         * ScannerUtil.nextInt(scanner,message,1,3); if(userChoice ==1){
         * if(nextIdx<STUDENT_SIZE){ message = "번호를 입력해 주세요.";
         * 
         * idArray[nextIdx]=ScannerUtil.nextInt(scanner,message); message =
         * "이름을 입력해 주세요."; nameArray[nextIdx]=ScannerUtil.nextLine(scanner,message);
         * message = "국어 점수를 입력해 주세요.";
         * koreanArray[nextIdx]=ScannerUtil.nextInt(scanner,message,SCORE_MIN,SCORE_MAX)
         * ; message = "영어 점수를 입력해 주세요.";
         * englishArray[nextIdx]=ScannerUtil.nextInt(scanner,message,SCORE_MIN,SCORE_MAX
         * ); message = "수학 점수를 입력해 주세요.";
         * mathArray[nextIdx]=ScannerUtil.nextInt(scanner,message,SCORE_MIN,SCORE_MAX);
         * 
         * nextIdx++;
         * }else{ System.out.println("더이상 입력하실 수 없습니다."); } }else if (userChoice==2){
         * if(nextIdx>0){ for(int i=0; i<nextIdx;i++){ int sum =
         * koreanArray[i]+englishArray[i]+mathArray[i] double average =
         * (double)sum/SUBJECT_SIZE;
         * 
         * System.out.printf("번호: %d번 이름: %s\n", idArray[i], nameArray[i]);
         * System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",
         * koreanArray[i],englishArray[i],mathArray[i]);
         * System.out.printf("총점: %03d점 평균: %06.2f점\n",sum,average); } }else{
         * System.out.println("아직 입력된 학생이 존재하지 않습니다.");
         * 
         * } }else if(user Choice==3){ System.out.println("사용해주셔서 감사합니다."); break; } }
         */

        scanner.close();
    }

}
