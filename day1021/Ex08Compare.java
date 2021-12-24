package day1021;
// 2개의 배열 안의 값을 비교하여
// 일치하는 갯수가 몃개인지 찾아서 출력하는 프로그램
public class Ex08Compare {
    public static void main(String[] args) {
        // 만약 우리가 값이 정해져 있는 배열을 만들 필요가 있을 경우에는
        // 데이터타입[] 배열이름={값1, 값2, .... 값}
        // 으로 초기화하면, 자동으로 그 내용이 들어가있고, 값의 갯수의 크기를 가진 배열이 만들어진다.
        int[] a= {1,2,3,4,5,6};
        int[] b= {0,1,3,5,6,7};
        
        // 두 배열의 똑같은 값의 갯수를 저장할 int 변수
        int count=0;
        
        // 만약 우리가 i for 문만 이용해서 비교하게 될 경우,
        // 똑같은 칸에 똑같은 값이 있어야지만 같다고 판정된다.
        // 즉, 똑같은 갯수가 부정확하게 나온다.
        for(int i=0;i<a.length;i++) {
            if(a[i]==b[i]) {
                count++;
            }
        }
        System.out.println("i for 문만 사용해서 비교할 경우: "+count+"개가 일치");
        
        // 하지만 우리가 중첩 for문을 사용해서
        // a 배열의 i번째 인덱스 값과 b 배열 전체를 비교해서
        // 같은게 있을때마다 count를 1 증가시키게 코드를 만들면.
        // 비로소 우리가 원하는 같은 갯수를 정확하게 찾을 수 있다.
        
        count=0;
        
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<b.length;j++) {
                if(a[i]==b[j]) {
                    count++;
                }
            }
        }
        System.out.println("중첩for문을 사용해서 비교할 경우: "+count+"개가 일치");
    }
}
