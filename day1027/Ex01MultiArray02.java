package day1027;

public class Ex01MultiArray02 {
    public static void main(String[] args) {
        
        int[][] arr;
        
        // 우리가 2차원 배열 안에 각 배열의 크기를 특정 크기로 고정할 수도 있다.
        // 그때에는 다음과 같이 2차원 배열을 초기화해야한다.
        
        // "arr을 4칸짜리 1차원 int 배열 5개가 모여있는 2차원 배열로 초기화해라"
        arr = new int[5][4];
        
        // 하지만, 2차원 배열의 경우, 데이터타입만 맞으면
        // 각 1차원 배열의 크기를 특정 크기로 고정할 필요가 없다.
        // 즉, 우리가 사용할 때 1차원 배열을 초기화만 해주면
        // 각각 다른 크기의 배열로 초기화가 가능하다.
        // 이렇게 2차원 배열 안에 1차우너 배열의 크기가 다른 경우를
        // 가변형 배열이라고 한다.
        
        // "arr을 1차원 배열 3개가 모여있는 2차원 배열로 초기화해라"
        arr = new int[3][];
        
        // "arr의 0번째 배열을 크기가 4인 int 배열로 초기화해라"
        arr[0] = new int[4];
        // "arr의 1번째 배열을 크기가 6인 int 배열로 초기화해라"
        arr[1] = new int[6];
        // "arr의 2번째 배열을 크기가 3인 int 배열로 초기화해라"
        arr[2] = new int[3];
        
        //for문을 사용하여 각 배열의 크기를 출력해보자
        for(int i=0;i<arr.length; i++) {
            System.out.printf("%d번째 배열의 크기: %d\n", i, arr[i].length);
        }
        
        // 그렇다면 각 배열의 모든 칸을 출력하고 싶다면
        // 우리가 어떻게 적어주어야 할까?
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
        // 이중 for문을 사용하여
        // i for 문의 int변수 i로 arr 배열의 몇번째 배열을 사용할지 선택해주고
        // j for 문의 int변수 j로 arr 배열의 i번째 배열의 몇번째 칸을 사용할지 선택하면 된다!
        /*강사님해답
         * for(int i=0;i<arr.length;i++){
         *  System.out.println("----------------------");
         *  System.out.println(i+"번째 배열");
         *   for(int j=0;j<arr[i].length.j++){
         *    System.out.printf("arr[%d][%d]: %d\n",i,j,arr[i][j]);
         *   }
         *  System.out.println("----------------------");
         * }
         */
    }

}
