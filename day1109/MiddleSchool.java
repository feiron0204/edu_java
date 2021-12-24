package day1109;


// Comparator 인터페이스
// 만약 우리가 만든 클래스를
// 특정 기준을 사용하여 큰지 작은지를 비교해야할 경우,
// Comparator(x) 인터페이스를 상속받아서
// Comparable(o)
// comparaTo 메소드를 오버라이드 해야한다!

public class MiddleSchool implements Comparable<MiddleSchool>{
    int id;
    String name;
    
    public String toString() {
        return "{학생 번호: "+id+
                "번, 이름: "+name+"}";
    }
    public MiddleSchool(int id,String name) {
        this.id=id;
        this.name=name;
    }
    
    /*
     * 아래에 있는 @Override 더블체크해라 라는 표시임!
     */
//    @Override
    public int compareTo(MiddleSchool o1) {
        /*
         * 비교했을때 o1이 뒤쪽이면 ruturn 값이 +
         */
        return id-o1.id;
//        return name.compareTo(o1.name);
        /*
         * 요건 이름순정렬
         */
    }
}
