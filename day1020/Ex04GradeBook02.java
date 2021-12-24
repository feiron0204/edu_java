package day1020;
// 다섯병의 학생 정보를 차례대로 입력 받고
// 차례대로 출력하는 프로그램을 작성하시오
// 쉬는시간 포함 5시 30분 까지
import java.util.Scanner;
public class Ex04GradeBook02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int STU_NUM=5;
        final int SUB_SIZE=3;
        int[] num=new int[STU_NUM];
        String[] name=new String[STU_NUM];
        int[] kor=new int[STU_NUM];
        int[] eng=new int[STU_NUM];
        int[] mat=new int[STU_NUM];
        
        for(int i=0;i<STU_NUM;i++) {
            System.out.println((i+1)+"번째 학생 번호를 입력해주세요");
            System.out.print("> ");
            num[i]=scanner.nextInt();
            System.out.println((i+1)+"번째 학생 이름를 입력해주세요");
            System.out.print("> ");
            scanner.nextLine();
            name[i]=scanner.nextLine();
            System.out.println((i+1)+"번째 학생 국어점수를 입력해주세요");
            System.out.print("> ");
            kor[i]=scanner.nextInt();
            System.out.println((i+1)+"번째 학생 영어점수를 입력해주세요");
            System.out.print("> ");
            eng[i]=scanner.nextInt();
            System.out.println((i+1)+"번째 학생 수학점수를 입력해주세요");
            System.out.print("> ");
            mat[i]=scanner.nextInt();
            
            
        }
        for(int i=0;i<STU_NUM;i++) {
            int sum=kor[i]+eng[i]+mat[i];
            double avg=(double)sum/SUB_SIZE;
            
            System.out.println((i+1)+"번째 학생 정보입니다.");
            System.out.printf("번호: %d 이름: %s\n",num[i],name[i]);
            System.out.printf("국어: %03d 영어: %03d 수학: %03d\n",kor[i],eng[i],mat[i]);
            System.out.printf("합계: %03d 평균: %06.2f\n",sum,avg);
            System.out.println("---------------------------------");
        }
        
        /*강사님해답
         *  // 상수
         *  // 1. 과목의 숫자
         * final int SUBJECT_SIZE=3;
         *  // 2. 관리할 학생의 숫자
         * final int STUDENT_SIZE=5;
         * 
         *  // 변수
         *  // 각 학생의 번호를 저장할 배열
         * int[] idArray = new int[STUDENT_SIZE];
         *  // 각 학생의 이름을 저장할 배열
         * String[] nameArray=new String[STUDENT_SIZE];
         *  // 각 학생의 국어 점수르 저장할 배열
         * int[] koreanArray = new int[STUDENT_SIZE];
         *  // 각 학생의 영어 점수를 저장할 배열
         * int[] englishArray = new int[STUDENT_SIZE];
         *  // 각 학생의 수학 점수를 저장할 배열
         * int[] mathArray = new int[STUDENT_SIZE];
         * 
         *  // 입력을 담당할 i for 문
         * for(int i=0; i<STUDENT_SIZE;i++){
         *  System.out.println("----------------------");
         *  System.out.println((i+1)+"번째 학생 정보 입력");
         *  System.out.println("======================");
         *  System.out.println("번호를 입력해주세요.");
         *  System.out.print("> ");
         *  idArray[i]=scanner.nextInt();
         *  System.out.println("이름를 입력해주세요.");
         *  System.out.print("> ");
         *  scanner.nextLine();
         *  nameArray[i]=scanner.nextLine();
         *  System.out.println("국어 점수를 입력해주세요.");
         *  System.out.print("> ");
         *  koreanArray[i]=scanner.nextInt();
         *  System.out.println("영어 점수를 입력해주세요.");
         *  System.out.print("> ");
         *  englishArray[i]=scanner.nextInt();
         *  System.out.println("수학 점수를 입력해주세요.");
         *  System.out.print("> ");
         *  mathArray[i]=scanner.nextInt();
         *  System.out.println("----------------------\n");
         *  
         * }
         *  // 출력을 담당할 i for 문
         * for(int i = 0; i< STUDENT_SIZE;i++){
         *  System.out.println("----------------------");
         *  System.out.pirntln((i+1)+"번째 학생 정보");
         *  System.out.println("======================");
         *  
         *  int id = idArray[i];
         *  String name= nameArray[i];
         *  int korean = koreanArray[i];
         *  int english = englishArray[i];
         *  int math = mathArray[i];
         *  
         *  int sum = korean + english + math;
         *  double average = (double)sum/SUBJEXT_SIZE;
         *  
         *  System.out.printf("번호: %d번 이름: %s\n",id,name);
         *  System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",korean,english,math);
         *  System.out.printf("총점: %03d점 평균: %06.2f점\n",sum,average);
         *  
         *  System.out.pirntln("----------------------\n");
         * }
         */
        
        scanner.close();
    }

}
