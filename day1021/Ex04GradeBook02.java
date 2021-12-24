package day1021;
// 입력과 출력이 분리된 학생 관리 프로그램

// 우리가 입력을 선택하면 "한명의 정보"를 저장한다.
// 우리가 출력을 선택하면 "현재 입력된" 학생 전체가 출력된다.
// Ex03GradeBook01.java 보다 코드가 조금더 간략화 된다.
import java.util.Scanner;
public class Ex04GradeBook02 {
    public static void main(String[] args) {
        // 상수
        // 1. 최대 관리 가능한 학생 수
        final int STUDENT_SIZE= 5;
        // 2. 가능한 최저점수
        final int SCORE_MIN =0;
        // 3. 가능한 최고점수
        final int SCORE_MAX=100;
        // 4. 관리하는 과목수
        final int SUBJECT_SIZE =3;
        
        Scanner scanner = new Scanner(System.in);
        // 변수
        int[] idArray = new int[STUDENT_SIZE];
        String[] nameArray = new String[STUDENT_SIZE];
        int[] koreanArray=new int[STUDENT_SIZE];
        int[] englishArray=new int[STUDENT_SIZE];
        int[] mathArray=new int[STUDENT_SIZE];
        // 다음 입력할 인덱스를 저장할 int 변수
        int nextIndex=0;
        
        while(true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            if(userChoice ==1) {
                // 입력 코드 구현
                
                // 만약 다음 입력할 인덱스가 유효한 인덱스이면 입력을 실행하고
                // 그러지 않다면 경고 메시지를 출력해주자
                
                if(nextIndex>=0 && nextIndex<nameArray.length) {
                    System.out.println("\n------------------------------------------");
                    System.out.println((nextIndex+1)+"번 학생 정보 입력");
                    System.out.println("------------------------------------------\n");
                    
                    System.out.println("번호를 입력해주세요");
                    System.out.print("> ");
                    idArray[nextIndex]=scanner.nextInt();
                    System.out.println("이름를 입력해주세요");
                    System.out.print("> ");
                    scanner.nextLine();
                    nameArray[nextIndex]=scanner.nextLine();
                    System.out.println("영어 점수를 입력해주세요");
                    System.out.print("> ");
                    englishArray[nextIndex]=scanner.nextInt();
                    while(englishArray[nextIndex]<SCORE_MIN||englishArray[nextIndex]>SCORE_MAX) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.println("영어 점수를 입력해주세요");
                        System.out.print("> ");
                        englishArray[nextIndex]=scanner.nextInt();
                    }
                    System.out.println("국어 점수를 입력해주세요");
                    System.out.print("> ");
                    koreanArray[nextIndex]=scanner.nextInt();
                    while(koreanArray[nextIndex]<SCORE_MIN||koreanArray[nextIndex]>SCORE_MAX) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.println("국어 점수를 입력해주세요");
                        System.out.print("> ");
                        koreanArray[nextIndex]=scanner.nextInt();
                    }
                    System.out.println("수학 점수를 입력해주세요");
                    System.out.print("> ");
                    mathArray[nextIndex]=scanner.nextInt();
                    while(mathArray[nextIndex]<SCORE_MIN||mathArray[nextIndex]>SCORE_MAX) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.println("수학 점수를 입력해주세요");
                        System.out.print("> ");
                        mathArray[nextIndex]=scanner.nextInt();
                    }
                    nextIndex++;
                }else {
                    System.out.println("\n----------------------------------------\n");
                    System.out.println("더이상 입력하실 수 없습니다.");
                    System.out.println("\n----------------------------------------\n");
                }
            }else if(userChoice==2) {
                // 출력 코드 구현
                
                // 만약 다음 입력할 인덱스를 저장한 변수
                // nextIndex가 0보다 크면 출력을 하고
                // 그렇지않다면 경고 메시지만 출력한다.
               
                if(nextIndex>0) {
                    for(int i=0;i<nextIndex;i++) {
                        int sum = koreanArray[i]+englishArray[i]+mathArray[i];
                        double average = (double)sum/SUBJECT_SIZE;
                        
                        System.out.println("\n========================================");
                        System.out.println(nameArray[i]+" 학생의 정보");
                        System.out.println("========================================\n");
                        System.out.printf("번호: %d번 이름: %s\n", idArray[i], nameArray[i]);
                        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",koreanArray[i],englishArray[i],mathArray[i]);
                        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum,average);
                        System.out.println("----------------------------------------");
                    }
                }else {
                    System.out.println("\n----------------------------------------\n");
                    System.out.println("아직 입력된 학생이 존재하지 않습니다.");
                    System.out.println("\n----------------------------------------\n");
                }
            }else if(userChoice==3) {
                // 메세지 출력 후 종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }else {
                System.out.println("다시입력해주세요");
            }
                
        }
        
        
        scanner.close();
    }
}
