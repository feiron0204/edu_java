package day1013;
// 11시 45분까지
// 다음과 같이 출력이 되게
// 변수를 만들고 값을 저장해서
// 출력해보세요
// 예시)
// 학생 이름
// ###
// 학생 번호
// ###
// 국어 점수
// ###
// 영어 점수
// ###
// 수학 점수
// ###
// 총점
// ###
// 평균
// ##.#####
public class Ex04GradeBook {
    public static void main(String[] args) {
        // 변수선언
        String stName;
        int stNumber;
        int koGrade;
        int enGrade;
        int maGrade;
        int sumGrade;
        double avGrade;
        
        // 변수초기화
        stName = "이성호";
        stNumber = 11;
        koGrade = 88;
        enGrade = 30;
        maGrade = 100;
        sumGrade = 218;
        avGrade = 72.666667;
        
        // 출력
        System.out.println("학생 이름");
        System.out.println(stName);
        System.out.println("학생 번호");
        System.out.println(stNumber);
        System.out.println("국어 점수");
        System.out.println(koGrade);
        System.out.println("영어 점수");
        System.out.println(enGrade);
        System.out.println("수학 점수");
        System.out.println(maGrade);
        System.out.println("총점");
        System.out.println(sumGrade);
        System.out.println("평균");
        System.out.println(avGrade);
    }

}
