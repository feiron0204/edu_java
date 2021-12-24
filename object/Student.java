package object;
// 학생의 클래스화
public class Student {
    // 필드
    /*
     * 클래스내에서만 알아야하니 다 private
     */
//    public int id;
//    public String name;
//    public int korean;
//    public int english;
//    public int math;
//    public final int SUBJECT_SIZE=3;
    private int id;
    private String name;
    private int korean;
    private int english;
    private int math;
    private final int SUBJECT_SIZE=3;
    
    // 겟터/셋터 SUBJECT_SIZE는 상수로써 변하면 안되고 밖에서 알필요도없으니 안만듬
    public void setId(int id) {
        this.id=id;
    }
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    
    public void setKorean(int korean) {
        this.korean=korean;
    }
    public int getKorean() {
        return korean;
    }
    
    public void setEnglish(int english) {
        this.english=english;
    }
    public int getEnglish() {
        return english;
    }
    
    public void setMath(int math) {
        this.math=math;
    }
    public int getMath() {
        return math;
    }
    
    // 메소드
    /*
     * 요놈도 어차피 이 클래스 안에서만 쓰면됨
     */
//    public int calculateSum() {
    private int calculateSum() {
        return korean+english+math;
    }
//    public double calculateAverage() {
    private double calculateAverage() {
        return calculateSum()/(double)SUBJECT_SIZE;
    }
    /*
     * 얜 외부에서 호출해서 써먹어야됨==퍼블릭
     */
    public void printInfo() {
        System.out.printf("번호: %d번 이름: %s\n",id,name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",korean,english,math);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", calculateSum(),calculateAverage());
    }
    
    /*
     * 생성자 역시 외부에서 호출해서 만들어야하니 퍼블릭
     */
    public Student(int id, String name, int korean, int english, int math) {
//        id=id;
        // 위의 id=id 라는 코드의 의미는
        // 파라미터 id에 파라미터 id의 현재값을 저장해라
        // 즉 자기 자신에 자기자신의 현재값을 저정하란 의미가 되어버린다.
        // 우리가 생성자에 파라미터를 넣는 이유는
        // 해당 파라미터의 값으로 우리 필드의 값을 초기화 하기 위해서이다.
        // 따라서 이렇게 파라미터와 필드의 이름이 같을 때에
        // 필드를 지칭할 때에는"이 메소드를 실행시키는 객체의" 필드라는 것을 지칭해주어야 한다.
        // "이 메소드를 실행시키는 객체의" 필드라고 지칭할 때에는
        // 필드 이름앖에 this.를 붙여주면 된다.
        this.id=id;
        this.name=name;
        this.korean=korean;
        this.english=english;
        this.math=math;
    }
    public Student() {
        id=-1;
        name="아직 입력 안됨";
        korean=-1;
        english=-1;
        math=-1;
    }
    /*
     * 오버라이드 실습
     * java.lang 인 부모클래스에 equals 있는데 이건 ==비교임... 그래서 student에 맞게 equals 재정립
     */
    /*
     * Object는 뭐든 받을수있는 변수' 라고일단 생각하자
     */
    public boolean equals(Object o) {
        /*
         * instanceof => 앞에있는변수가 뒤에있는클래스의 객체면 ture 아니면 false
         * 판별법은 해당 변수가 선언되고 초기화될때 해당 클래스의 생성자가 실행됬는지 확인함.
         */
        if(o instanceof Student) {
            Student s=(Student)o;
            
            return this.id==s.id;
        }
        
        return false;
    }
    /*
     * println때 이상한게아니라 안에있는값을 제대로 불러오게하고싶당
     * toString()을 오버라이드!
     */
    public String toString() {
        return "Student (id: " +id +
                ", name: "+name+
                ", korean: "+korean+
                ", english: "+english+
                ", math: "+math+
                ")";
    }
}
