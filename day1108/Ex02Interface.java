package day1108;
// 다형성

// 多形性
// -> 다양할 다, 모습 형, 성질 성
// -> 다양한 모습의 성질

public class Ex02Interface{
    public static void main(String[] args) {
        MiddleSchool m = new MiddleSchool();
        m.korean = 80;
        m.english = 81;
        m.math = 81;
        
        printInfo(m);
        
        HighSchool h = new HighSchool();
        h.korean = 90;
        h.english =91;
        h.math =91;
        h.biology =90;
        
        printInfo(h);
        
        
        /*
         * printInfo의 파라미터가 Student이나 
         * Student라는 인터페이스는 단지 학교의 종류와 합산메소드, 평균메소드를 가진 인터페이스
         * 각 메소드의 처리는 변수가 HighSchool이냐 MiddleSchool이냐에 따라 달라짐
         * 
         *  그래서 파라미터에 HighSchool 클래스 변수가 들어가면
         *  해당 합산, 평균 메소드를 처리할때 HighSchool 클래스의 메소드를 처리
         *  MiddleSchool의 경우 MiddleSchool의 클래스의 메소드를 처리
         */
    }

    public static void printInfo(Student s) {
        System.out.print("학생의 종류: ");
        s.showName();
        System.out.println("학생의 과목 총점: " + s.calculateSum());
        System.out.println("학생의 과목 평균: " + s.calculateAverage());
    }
}
