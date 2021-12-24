package day1109;

public class HighSchool extends Student{
    int korean;
    int english;
    int math;
    int biology;
    
    public int calculateSum() {
        return korean+english+math+biology;
    }
    
    public double calculateAverage() {
        return calculateSum()/4.0;
    }
}
