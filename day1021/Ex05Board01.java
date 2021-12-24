package day1021;
// 게시판 프로그램을 작성하세요
// 게시판에는 글 번호, 글 제목, 글 작성자, 글 내용의 정보가 들어가야 합니다.
import java.util.Scanner;
public class Ex05Board01 {
    public static void main(String[] args) {
        final int WRITE_CODE=1;
        final int READ_CODE=2;
        final int EXIT_CODE=3;
        final int BOARD_SIZE=5;
        Scanner scanner=new Scanner(System.in);
        System.out.println("-------------게시판-------------");
        int nextIndex=0;
        String[] titleArray=new String[BOARD_SIZE];
        String[] nameArray=new String[BOARD_SIZE];
        String[] bodyArray=new String[BOARD_SIZE];
        while(true) {
            System.out.println("1. 글 입력 2. 게시판보기 3. 종료");
            System.out.print("> ");
            int userChoice=scanner.nextInt();
            scanner.nextLine();
            if(userChoice==WRITE_CODE) {
                if(nextIndex<BOARD_SIZE) {
                    System.out.print("제목: ");
                    titleArray[nextIndex]=scanner.nextLine();
                    System.out.print("작성자: ");
                    nameArray[nextIndex]=scanner.nextLine();
                    System.out.print("내용: ");
                    bodyArray[nextIndex]=scanner.nextLine();
                    nextIndex++;
                }else {
                    System.out.println("------------------------------\n");
                    System.out.println("더이상 작성하실 수 없습니다.");
                    System.out.println("\n------------------------------");
                }
            }else if(userChoice==READ_CODE) {
                System.out.println("================================");
                System.out.println("             게 시 판             ");
                System.out.println("================================");
                if(nextIndex>0) {
                    for(int i=0;i<nextIndex;i++) {
                        System.out.println("------------------------------------------");
                        System.out.println("글 번호: "+(i+1));
                        System.out.printf("제목: %s 작성자: %s\n",titleArray[i],nameArray[i]);
                        System.out.printf("글 내용: %s\n", bodyArray[i]);
                        System.out.println("------------------------------------------\n");
                    }
                }else {
                    System.out.println("아무 내용이 없습니다.");
                }
            }else if(userChoice==EXIT_CODE) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }  
            
        }
        /*강사님해답
         *  //상수
         *  //총 저장 가능한 글의 크기
         * final int SIZE=5;
         *  //변수
         * int[] idArray = new int[SIZE];
         * String[] titleArray = new String[SIZE];
         * String[] writerArray = new String[SIZE];
         * String[] contentArray = new String[SIZE];
         * int nextIndex=0;
         *  //다음 글번호를 저장할 nextId
         * int nextId=1;
         * while(true){
         *  System.out.println("1. 입력 2. 출력 3. 종료");
         *  System.out.print("> ");
         *  int userChoice = scanner.nextInt();
         *  
         *  if(userChoice==1){
         *   if(nextIndex<SIZE){
         *   // 배열에 빈칸이 남이있으므로 글 등록 시작
         *   System.out.println("제목을 입력해주세요.");
         *   System.out.print("> ");
         *   scanner.nextLine();
         *   titleArray[nextIndex]=scanner.nextLine();
         *   
         *   //System.out.println("글번호을 입력해주세요.");
         *   //System.out.print("> ");
         *   //idArray[nextIndex]=scanner.nextInt();
         *   idArray[nextIndex]=nextId++;
         *   
         *   System.out.println("작성자을 입력해주세요.");
         *   System.out.print("> ");
         *   //scanner.nextLine();
         *   writerArray[nextIndex]=scanner.nextLine();
         *   
         *   System.out.println("내용을 입력해주세요.");
         *   System.out.print("> ");
         *   contentArray[nextIndex]=scanner.nextLine();
         *   
         *   nextIndex++;
         *   }else{
         *    //배열에 빈칸이 없으므로 메시지만 출력
         *    System.out.println("더이상 글을 등록할 수 없습니다.");
         *    
         *   }
         *  }else if(userChoice==2){
         *   if(nextIndex>0){
         *   // 등록된 글이 존재하므로 글 출력 코드 구현
         *    for(int i=0;i<nextIndex;i++){
         *     System.out.println("-----------------------");
         *     System.out.println("글 번호: "+ idArray[i]);
         *     System.out.println("제목: "+titleArray[i]);
         *     System.out.println("작성자: "+writerArray[i]);
         *     System.out.println("-----------------------");
         *     System.out.println(contentArray[i]);
         *    }
         *   }else{
         *    //등록된 글이 존재하지 않으므로 메시지만 출력
         *    System.out.println("등록된 글이 존재하지 않습니다.");
         *   }
         *  
         *  }else if(userChoice==3){
         *   System.out.println("사용해주셔서 감사합니다.");
         *   break;
         *  }
         * }
         */
        scanner.close();
    }

}
