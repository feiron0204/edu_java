package day1019;
// 중첩 for문
// 중첩 for문은 for문 안에 다른 for 문이 있는 구조를
// 중첩 for 문이라고 한다.

// 중첩 for문의 가장 큰 특징은
// 바깥쪽 for문이 한번 실행될 동안
// 안쪽 for 문은 여러번 반복되는 구조가 된다.
public class Ex03NestedFor {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++) {
            for(int j =101; j<=104;j++) {
                System.out.printf("i: [%3d] j: [%3d]\n",i,j);
            }
            System.out.println("---------------------------------\n");
        }
    }

}
