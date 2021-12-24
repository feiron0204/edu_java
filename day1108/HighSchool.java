package day1108;

public class HighSchool implements Student{
    public int korean;
    public int english;
    public int math;
    public int biology;
    
    public void showName() {
        System.out.println("고등학생입니다.");
    }
    public int calculateSum() {
        return korean+english+math+biology;
    }
    public double calculateAverage() {
        return calculateSum()/4.0;
    }
}
