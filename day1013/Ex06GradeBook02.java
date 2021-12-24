package day1013;
// 다음과 같은 형식으로 프로그램이 출력되게
// 코드를 작성하시오

// 이름: ###
// 번호: ###번
// 국어: ###점
// 영어: ###점
// 수학: ###점
// 총점: ###점
// 평균: ##.####점


public class Ex06GradeBook02 {
    public static void main(String[] args) {
        //변수선언
        String name;
        int num, kor, mat, eng;
        
        //값저장
        name = "이성호";
        num = 11;
        kor = 88;
        mat = 100;
        eng = 30;
        
        
        //출력
        System.out.println("이름: "+name);
        System.out.println("번호: "+num+"번");
        System.out.println("국어: "+kor+"점");
        System.out.println("영어: "+eng+"점");
        System.out.println("수학: "+mat+"점");
        System.out.println("총점: " + (kor+eng+mat)+"점");
        System.out.println("평균: " + (kor+eng+mat)/3.0+"점");
    }

}
