package day1020;
// 5명의 번호, 이름, 국어, 영어, 수학 점수를 차례대로 입력받고
// 차례대로 출력하는 프로그램을 작성하시오
import java.util.Scanner;
public class Ex01GradeBook01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int STU_NUM=5;
        final int SUB_NUM=3;
        String name="", name1="", name2="", name3="", name4="", name5="";
        int num=0, num1=0, num2=0, num3=0, num4=0, num5=0;
        int kor=0, kor1=0, kor2=0, kor3=0, kor4=0, kor5=0;
        int eng=0, eng1=0, eng2=0, eng3=0, eng4=0, eng5=0;
        int mat=0, mat1=0, mat2=0, mat3=0, mat4=0, mat5=0;
        
//        String name, name1, name2, name3, name4, name5;
//        int num, num1, num2, num3, num4, num5;
//        int kor, kor1, kor2, kor3, kor4, kor5;
//        int eng, eng1, eng2, eng3, eng4, eng5;
//        int mat, mat1, mat2, mat3, mat4, mat5;
        int sum;
        double avg;
        for(int i=1;i<=STU_NUM;i++) {
            System.out.println(i+"번째 학생의 번호를 입력하세요");
            System.out.print("> ");
            num=scanner.nextInt();
            
            System.out.println(i+"번째 학생의 이름을 입력하세요");
            System.out.print("> ");
            scanner.nextLine();
            name=scanner.nextLine();
            
            System.out.println(i+"번째 학생의 국어점수를 입력하세요");
            System.out.print("> ");
            kor=scanner.nextInt();
            System.out.println(i+"번째 학생의 영어점수를 입력하세요");
            System.out.print("> ");
            eng=scanner.nextInt();
            System.out.println(i+"번째 학생의 수학점수를 입력하세요");
            System.out.print("> ");
            mat=scanner.nextInt();
            if(i==1) {
                num1=num;
                name1=name;
                kor1=kor;
                eng1=eng;
                mat1=mat;
            }else if(i==2) {
                num2=num;
                name2=name;
                kor2=kor;
                eng2=eng;
                mat2=mat;
            }else if(i==3) {
                num3=num;
                name3=name;
                kor3=kor;
                eng3=eng;
                mat3=mat;
            }else if(i==4) {
                num4=num;
                name4=name;
                kor4=kor;
                eng4=eng;
                mat4=mat;
            }else if(i==5) {
                num5=num;
                name5=name;
                kor5=kor;
                eng5=eng;
                mat5=mat;
            }else {
                break;
            }
//            switch(i) {
//            case 1:
//                num1=num;
//                name1=name;
//                kor1=kor;
//                eng1=eng;
//                mat1=mat;
//                break;
//            case 2:
//                num2=num;
//                name2=name;
//                kor2=kor;
//                eng2=eng;
//                mat2=mat;
//                break;
//            case 3:
//                num3=num;
//                name3=name;
//                kor3=kor;
//                eng3=eng;
//                mat3=mat;
//                break;
//            case 4:
//                num4=num;
//                name4=name;
//                kor4=kor;
//                eng4=eng;
//                mat4=mat;
//                break;
//            case 5:
//                num5=num;
//                name5=name;
//                kor5=kor;
//                eng5=eng;
//                mat5=mat;
//                break;
//            default:
//                name1=name2=name3=name4=name5="";
//                num1=num2=num3=num4=num5=0;
//                //의미없음
//                break;
//                }
        }
        // 출력
        System.out.println("1 번째학생");
        System.out.println("번호: "+num1+" 이름: "+name1);
        System.out.println("국어점수: "+kor1+" 영어점수: "+eng1+" 수학점수: "+mat1);
        sum=mat1+eng1+kor1/SUB_NUM; 
        avg=(double)sum/SUB_NUM;
        System.out.printf("합계: %d 평균: %.2f\n\n",sum,avg);
        
        System.out.println("2 번째학생");
        System.out.println("번호: "+num2+" 이름: "+name2);
        System.out.println("국어점수: "+kor2+" 영어점수: "+eng2+" 수학점수: "+mat2);
        sum=mat2+eng2+kor2/SUB_NUM; 
        avg=(double)sum/SUB_NUM;
        System.out.printf("합계: %d 평균: %.2f\n\n",sum,avg);
        
        System.out.println("3 번째학생");
        System.out.println("번호: "+num3+" 이름: "+name3);
        System.out.println("국어점수: "+kor3+" 영어점수: "+eng3+" 수학점수: "+mat3);
        sum=mat3+eng3+kor3/SUB_NUM; 
        avg=(double)sum/SUB_NUM;
        System.out.printf("합계: %d 평균: %.2f\n\n",sum,avg);
        
        System.out.println("4 번째학생");
        System.out.println("번호: "+num4+" 이름: "+name4);
        System.out.println("국어점수: "+kor4+" 영어점수: "+eng4+" 수학점수: "+mat4);
        sum=mat4+eng4+kor4/SUB_NUM; 
        avg=(double)sum/SUB_NUM;
        System.out.printf("합계: %d 평균: %.2f\n\n",sum,avg);
        
        System.out.println("5 번째학생");
        System.out.println("번호: "+num5+" 이름: "+name5);
        System.out.println("국어점수: "+kor5+" 영어점수: "+eng5+" 수학점수: "+mat5);
        sum=mat5+eng5+kor5/SUB_NUM; 
        avg=(double)sum/SUB_NUM;
        System.out.printf("합계: %d 평균: %.2f\n\n",sum,avg);
        
        
        
        
        
        /*강사님 해답
         * final int SUBJECT_SIZE = 3;
         *  //변수
         * Scanner scanner = new Scanner(System.in);
         *  // 번호를 담당할 int 변수들
         * int id1, id2, id3, id4, id5;
         *  // 이름를 담당할 String 변수들
         * String name1, name2, name3, name4, name5;
         * // 국어점수를 담당할 int 변수들
         * int korean1, korean2, korean3, korean4, korean5;
         * // 영어점수를 담당할 int 변수들
         * int english1, english2, english3, english4, english5;
         * // 수학점수를 담당할 int 변수들
         * int math1, math2, math3, math4, math5;
         * 
         *  // 첫번째 학생 정보 입력
         * System.out.println("첫번째 학생 정보 입력");
         * System.out.println("-------------------------------\n");
         * System.out.println("번호를 입력해주세요.");
         * System.out.print("> ");
         * id1 = scanner.nextInt();
         * 
         * System.out.println("이름을 입력해 주세요.");
         * System.out.print("> ");
         * scanner.nextLine();
         * name1 = scanner.nextLine();
         * 
         * System.out.println("국어 점수를 입력해주세요.");
         * System.out.print("> ");
         * korean1=scanner.nextInt();
         * 
         * System.out.println("영어 점수를 입력해주세요.");
         * System.out.print("> ");
         * english1=scanner.nextInt();
         * 
         * System.out.println("수학 점수를 입력해주세요.");
         * System.out.print("> ");
         * math1=scanner.nextInt();
         * 
         *  // 두번째 학생 정보 입력
         * System.out.println("두번째 학생 정보 입력");
         * System.out.println("-------------------------------\n");
         * System.out.println("번호를 입력해주세요.");
         * System.out.print("> ");
         * id2 = scanner.nextInt();
         * 
         * System.out.println("이름을 입력해 주세요.");
         * System.out.print("> ");
         * scanner.nextLine();
         * name2 = scanner.nextLine();
         * 
         * System.out.println("국어 점수를 입력해주세요.");
         * System.out.print("> ");
         * korean2=scanner.nextInt();
         * 
         * System.out.println("영어 점수를 입력해주세요.");
         * System.out.print("> ");
         * english2=scanner.nextInt();
         * 
         * System.out.println("수학 점수를 입력해주세요.");
         * System.out.print("> ");
         * math2=scanner.nextInt();
         * 
         *  // 세번째 학생 정보 입력
         * System.out.println("세번째 학생 정보 입력");
         * System.out.println("-------------------------------\n");
         * System.out.println("번호를 입력해주세요.");
         * System.out.print("> ");
         * id3 = scanner.nextInt();
         * 
         * System.out.println("이름을 입력해 주세요.");
         * System.out.print("> ");
         * scanner.nextLine();
         * name3 = scanner.nextLine();
         * 
         * System.out.println("국어 점수를 입력해주세요.");
         * System.out.print("> ");
         * korean3=scanner.nextInt();
         * 
         * System.out.println("영어 점수를 입력해주세요.");
         * System.out.print("> ");
         * english3=scanner.nextInt();
         * 
         * System.out.println("수학 점수를 입력해주세요.");
         * System.out.print("> ");
         * math3=scanner.nextInt();
         * 
         *  // 네번째 학생 정보 입력
         * System.out.println("네번째 학생 정보 입력");
         * System.out.println("-------------------------------\n");
         * System.out.println("번호를 입력해주세요.");
         * System.out.print("> ");
         * id4 = scanner.nextInt();
         * 
         * System.out.println("이름을 입력해 주세요.");
         * System.out.print("> ");
         * scanner.nextLine();
         * name4 = scanner.nextLine();
         * 
         * System.out.println("국어 점수를 입력해주세요.");
         * System.out.print("> ");
         * korean4=scanner.nextInt();
         * 
         * System.out.println("영어 점수를 입력해주세요.");
         * System.out.print("> ");
         * english4=scanner.nextInt();
         * 
         * System.out.println("수학 점수를 입력해주세요.");
         * System.out.print("> ");
         * math4=scanner.nextInt();
         * 
         *  // 다섯번째 학생 정보 입력
         * System.out.println("다섯번째 학생 정보 입력");
         * System.out.println("-------------------------------\n");
         * System.out.println("번호를 입력해주세요.");
         * System.out.print("> ");
         * id5 = scanner.nextInt();
         * 
         * System.out.println("이름을 입력해 주세요.");
         * System.out.print("> ");
         * scanner.nextLine();
         * name5 = scanner.nextLine();
         * 
         * System.out.println("국어 점수를 입력해주세요.");
         * System.out.print("> ");
         * korean5=scanner.nextInt();
         * 
         * System.out.println("영어 점수를 입력해주세요.");
         * System.out.print("> ");
         * english5=scanner.nextInt();
         * 
         * System.out.println("수학 점수를 입력해주세요.");
         * System.out.print("> ");
         * math5=scanner.nextInt();
         * 
         *  // 다섯병의 정보를 출력하는 코드
         *  
         * int sum =0;
         * double average = 0;
         * 
         * System.out.println("\n---------------------------\n");
         * System.out.println("첫번째 학생 정보");
         * sum = korean1 + english1 + math1;
         * average = (double)sum/SUBJECT_SIZE;
         * System.out.printf("번호: %d번 이름: %s\n",id1,name1);
         * System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",korean1, english1, math1);
         * System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
         * 
         * System.out.println("\n---------------------------\n");
         * System.out.println("두번째 학생 정보");
         * sum = korean2 + english2 + math2;
         * average = (double)sum/SUBJECT_SIZE;
         * System.out.printf("번호: %d번 이름: %s\n",id2,name2);
         * System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",korean2, english2, math2);
         * System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
         * 
         * System.out.println("\n---------------------------\n");
         * System.out.println("세번째 학생 정보");
         * sum = korean3 + english3 + math3;
         * average = (double)sum/SUBJECT_SIZE;
         * System.out.printf("번호: %d번 이름: %s\n",id3,name3);
         * System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",korean3, english3, math3);
         * System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
         * 
         * System.out.println("\n---------------------------\n");
         * System.out.println("네번째 학생 정보");
         * sum = korean4 + english4 + math4;
         * average = (double)sum/SUBJECT_SIZE;
         * System.out.printf("번호: %d번 이름: %s\n",id4,name4);
         * System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",korean4, english4, math4);
         * System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
         * 
         * System.out.println("\n---------------------------\n");
         * System.out.println("다섯번째 학생 정보");
         * sum = korean5 + english5 + math5;
         * average = (double)sum/SUBJECT_SIZE;
         * System.out.printf("번호: %d번 이름: %s\n",id5,name5);
         * System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",korean5, english5, math5);
         * System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
         * 
         * scanner.close();
         */
        scanner.close();
    }

}
