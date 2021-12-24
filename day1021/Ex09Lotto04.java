package day1021;
// 로또 게임 4번
// 실제로 우리가 직접 로또를 진행해보자
// 사용자는 자동을 선택해서
// 로또 번호를 뽑을 수 있다.
// 그리고 컴퓨터가 뽑은 숫자와 사용자의 숫자를 출력하고
// 비교해서 몇개를 맞췄는지 보여주는 프로그램

// 단, 두 배열 모두 정렬이 되어야하고,
// 당연히 중복은 허용되지 않는다.

// 심화: 사용자가 수동도 선택 가능하게 프로그램 코드를 작성해보시오.
//      단, 1부터 45까지만 입력 간으하고 당연히 중복도 허용되지 않습니다.

// 심화2: 반자동 기능을 구현하시오
import java.util.Random;
import java.util.Scanner;
public class Ex09Lotto04 {
    public static void main(String[] args) {
        
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        final int NUMBER_SIZE=6;
        final int NUMBER_MIN=1;
        final int NUMBER_MAX=45;
        final int AUTO_CODE=1;
        final int SEMI_AUTO_CODE=2;
        final int MANUAL_CODE=3;
        
        System.out.println("------------로또게임!!------------");
        System.out.println("번호선택 방식을 결정해 주세요~\n");
        System.out.println("   1. 자동 2. 반자동 3. 수동");
        System.out.print("> ");
//        int[] computerNum=new int[NUMBER_SIZE];
        int[] playerNum=new int[NUMBER_SIZE];
        
        int userChoice=scanner.nextInt();
        if(userChoice==AUTO_CODE) {
            // 자 번호만들자~~
//            for(int i=0;i<NUMBER_SIZE;i++) {
//                computerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
//            }
//            // 중복확인좀 하즈아
//            for(int i=0; i<NUMBER_SIZE;i++) {
//                for(int j=0;j<NUMBER_SIZE;) {
//                    if(i != j && computerNum[i]== computerNum[j]) {
//                        computerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
//                        j=0;
//                    }else {
//                        j++;
//                    }
//                }
//            }
//            // 배열도 해버리자~~~
//            for(int i=0;i<NUMBER_SIZE-1;i++) {
//                if(computerNum[i]>computerNum[i+1]) {
//                    int temp=computerNum[i];
//                    computerNum[i]=computerNum[i+1];
//                    computerNum[i+1]=temp;
//                    i=-1;
//                }
//            }
//            
            // 당첨번호 정렬 및 선정 완료됨..
            
            // 이제 사용자 번호 만들어보자(위와동일)
            for(int i=0;i<NUMBER_SIZE;i++) {
                playerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
            }
            // 중복확인좀 하즈아
            for(int i=0; i<NUMBER_SIZE;i++) {
                for(int j=0;j<NUMBER_SIZE;) {
                    if(i != j && playerNum[i]== playerNum[j]) {
                        playerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
                        j=0;
                    }else {
                        j++;
                    }
                }
            }
            // 배열도 해버리자~~~
//            for(int i=0;i<NUMBER_SIZE-1;i++) {
//                if(playerNum[i]>playerNum[i+1]) {
//                    int temp=playerNum[i];
//                    playerNum[i]=playerNum[i+1];
//                    playerNum[i+1]=temp;
//                    i=-1;
//                }
//            }
//            
            // 사용자 번호도 선택 완.
        }else if(userChoice==SEMI_AUTO_CODE) {
            //컴번호 등장!!
            // 자 번호만들자~~
//            for(int i=0;i<NUMBER_SIZE;i++) {
//                computerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
//            }
//            // 중복확인좀 하즈아
//            for(int i=0; i<NUMBER_SIZE;i++) {
//                for(int j=0;j<NUMBER_SIZE;) {
//                    if(i != j && computerNum[i]== computerNum[j]) {
//                        computerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
//                        j=0;
//                    }else {
//                        j++;
//                    }
//                }
//            }
//            // 배열도 해버리자~~~
//            for(int i=0;i<NUMBER_SIZE-1;i++) {
//                if(computerNum[i]>computerNum[i+1]) {
//                    int temp=computerNum[i];
//                    computerNum[i]=computerNum[i+1];
//                    computerNum[i+1]=temp;
//                    i=-1;
//                }
//            }
            
            // 당첨번호 정렬 및 선정 완료됨..
            
            // 반자동이니까 몇개 숫자를 선택할지 골라야겟지?
            System.out.println("수동으로 선택하실 숫자의 갯수를 말씀해주세요.");
            System.out.print("> ");
            int manualNum=scanner.nextInt();
            while(!(manualNum>0&&manualNum<NUMBER_SIZE)) {
                // 에이 적어도 1개는 입력하고 1개는 자동으로 받으셔야지..
                System.out.println("1~"+(NUMBER_SIZE-1)+" 까지의 번호를 선택해 주세요.");
                System.out.print("> ");
                manualNum=scanner.nextInt();
            }
            
            // 흠 선택을 하셧군...
            // 그럼 일단 선택번호 부터 받기
            for(int i=0;i<manualNum;i++) {
                System.out.println((i+1)+"번째 번호를 선택해주세요.");
                System.out.print("> ");
                playerNum[i]=scanner.nextInt();
                //아니 1~45까지 입력해야지!!!
                while(playerNum[i]<NUMBER_MIN||playerNum[i]>NUMBER_MAX) {
                    System.out.println(NUMBER_MIN+"~"+NUMBER_MAX+"사이의 번호를 선택해주세요");
                    System.out.print("> ");
                    playerNum[i]=scanner.nextInt();
                }
                //설마 중복숫자입력을??
                for(int j=0;j<i;) {
                    if(playerNum[i]==playerNum[j]) {
                        System.out.println("이미 선택한 번호입니다. 다른 번호를 입력해주세요");
                        System.out.print("> ");
                        playerNum[i]=scanner.nextInt();
                      //아니 1~45까지 입력해야지!!!
                        while(playerNum[i]<NUMBER_MIN||playerNum[i]>NUMBER_MAX) {
                            System.out.println(NUMBER_MIN+"~"+NUMBER_MAX+"사이의 번호를 선택해주세요");
                            System.out.print("> ");
                            playerNum[i]=scanner.nextInt();
                        }
                        j=0;
                        
                    }else {
                        j++;
                    }
                }
            }
            //사용자 수동설정 완료 나머지 자리는 자동이 채운다!
            for(int i=manualNum;i<NUMBER_SIZE;i++) {
                playerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
            }
            //중복검사 근데 컴퓨터가 채운 부분만
            for(int i=manualNum; i<NUMBER_SIZE;i++) {
                for(int j=0;j<NUMBER_SIZE;) {
                    if(i != j && playerNum[i]== playerNum[j]) {
                        playerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
                        j=0;
                    }else {
                        j++;
                    }
                }
            }
            //자동된 부분만 재설정됨 그럼이제 배열
//            for(int i=0;i<NUMBER_SIZE-1;i++) {
//                if(playerNum[i]>playerNum[i+1]) {
//                    int temp=playerNum[i];
//                    playerNum[i]=playerNum[i+1];
//                    playerNum[i+1]=temp;
//                    i=-1;
//                }
//            }
            
            //반자동 끘~~~
        }else if(userChoice==MANUAL_CODE) {
            //이걸 다 수동하네! 반자동코드에서 몇개만 수정하자
          //컴번호 등장!!
            // 자 번호만들자~~
//            for(int i=0;i<NUMBER_SIZE;i++) {
//                computerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
//            }
//          
//            // 중복확인좀 하즈아
//            for(int i=0; i<NUMBER_SIZE;i++) {
//                for(int j=0;j<NUMBER_SIZE;) {
//                    if(i != j && computerNum[i]== computerNum[j]) {
//                        computerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
//                        j=0;
//                    }else {
//                        j++;
//                    }
//                }
//            }
//            // 배열도 해버리자~~~
//            for(int i=0;i<NUMBER_SIZE-1;i++) {
//                if(computerNum[i]>computerNum[i+1]) {
//                    int temp=computerNum[i];
//                    computerNum[i]=computerNum[i+1];
//                    computerNum[i+1]=temp;
//                    i=-1;
//                }
//            }
            
            // 당첨번호 정렬 및 선정 완료됨..
            
            // 반자동이니까 몇개 숫자를 선택할지 골라야겟지?(all수동이니 패스)
//            System.out.println("수동으로 선택하실 숫자의 갯수를 말씀해주세요.");
//            System.out.print("> ");
//            int manualNum=scanner.nextInt();
//            while(!(manualNum>0&&manualNum<NUMBER_SIZE)) {
//                // 에이 적어도 1개는 입력하고 1개는 자동으로 받으셔야지..
//                System.out.println("1~"+(NUMBER_SIZE-1)+" 까지의 숫자를 선택해 주세요.");
//                System.out.print("> ");
//                manualNum=scanner.nextInt();
//            }
//            
            // 흠 선택을 하셧군...
            // 그럼 일단 선택번호 부터 받기(all 수동이니 NUMBER_SIZE 다받기)
            for(int i=0;i<NUMBER_SIZE;i++) {
                System.out.println((i+1)+"번째 번호를 선택해주세요.");
                System.out.print("> ");
                playerNum[i]=scanner.nextInt();
              //아니 1~45까지 입력해야지!!!
                while(playerNum[i]<NUMBER_MIN||playerNum[i]>NUMBER_MAX) {
                    System.out.println(NUMBER_MIN+"~"+NUMBER_MAX+"사이의 번호를 선택해주세요");
                    System.out.print("> ");
                    playerNum[i]=scanner.nextInt();
                    //설마 중복숫자입력을??
                }
                for(int j=0;j<i;) {
                    if(playerNum[i]==playerNum[j]) {
                        System.out.println("이미 선택한 번호입니다. 다른 번호를 입력해주세요");
                        System.out.print("> ");
                        playerNum[i]=scanner.nextInt();
                      //아니 1~45까지 입력해야지!!!
                        while(playerNum[i]<NUMBER_MIN||playerNum[i]>NUMBER_MAX) {
                            System.out.println(NUMBER_MIN+"~"+NUMBER_MAX+"사이의 번호를 선택해주세요");
                            System.out.print("> ");
                            playerNum[i]=scanner.nextInt();
                        }
                        j=0;
                    }else {
                        j++;
                    }
                }
            }
            //사용자 수동설정 완료 나머지 자리는 자동이 채운다!(응 채울곳없어)
//            for(int i=manualNum;i<NUMBER_SIZE;i++) {
//                playerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
//            }
            //중복검사 근데 컴퓨터가 채운 부분만(받을때 이미 검사했어~)
//            for(int i=manualNum; i<NUMBER_SIZE;i++) {
//                for(int j=0;j<NUMBER_SIZE;) {
//                    if(i != j && playerNum[i]== playerNum[j]) {
//                        playerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
//                        j=0;
//                    }else {
//                        j++;
//                    }
//                }
//            }
            //자동된 부분만 재설정됨 그럼이제 배열
//            for(int i=0;i<NUMBER_SIZE-1;i++) {
//                if(playerNum[i]>playerNum[i+1]) {
//                    int temp=playerNum[i];
//                    playerNum[i]=playerNum[i+1];
//                    playerNum[i+1]=temp;
//                    i=-1;
//                }
//            }
            //다끘?
            
        }else {
            System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
        }
        // 비교및 결과 출력창 
        if (userChoice==AUTO_CODE||userChoice==SEMI_AUTO_CODE||userChoice==MANUAL_CODE) {
            int[] computerNum=new int[NUMBER_SIZE];
            for(int i=0;i<NUMBER_SIZE;i++) {
                computerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
            }
          
            // 중복확인좀 하즈아
            for(int i=0; i<NUMBER_SIZE;i++) {
                for(int j=0;j<NUMBER_SIZE;) {
                    if(i != j && computerNum[i]== computerNum[j]) {
                        computerNum[i]=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
                        j=0;
                    }else {
                        j++;
                    }
                }
            }
            // 배열도 해버리자~~~
            for(int i=0;i<NUMBER_SIZE-1;i++) {
                if(computerNum[i]>computerNum[i+1]) {
                    int temp=computerNum[i];
                    computerNum[i]=computerNum[i+1];
                    computerNum[i+1]=temp;
                    i=-1;
                }
            }
            for(int i=0;i<NUMBER_SIZE-1;i++) {
                if(playerNum[i]>playerNum[i+1]) {
                    int temp=playerNum[i];
                    playerNum[i]=playerNum[i+1];
                    playerNum[i+1]=temp;
                    i=-1;
                }
            }
            // for문 두개돌려서 맞은숫자 확인해~~~
            int count=0;
            for(int i=0;i<NUMBER_SIZE;i++) {
                for(int j=0;j<NUMBER_SIZE;j++) {
                    if(playerNum[i]==computerNum[j]) {
                        count++;
                    }
                }
            }
            System.out.println("================결과확인=================\n");
            System.out.printf("행운의 당첨번호: [");
            for(int i=0;i<NUMBER_SIZE;i++) {
                System.out.printf(" %2d ",computerNum[i]);   
            }
            System.out.println("]");
            System.out.printf("사용자 선택번호: [");
            for(int i=0;i<NUMBER_SIZE;i++) {
                System.out.printf(" %2d ",playerNum[i]);   
            }
            System.out.println("]\n");
            System.out.println("--------------------------------------");
            System.out.println("총 "+count+"개를 맞추셨습니다.");
        }
        
        /*강사님해답
         *  //상수
         *  // 뽑을 수 있는 최소수
         * final int NUMBER_MIN=1;
         *  // 뽑을 수 있는 최대수
         * final int NUMBER_MAX=45;
         *  // 각 배열의 크기
         * final int SIZE=6;
         * Scanner scanner = new Scanner(System.in);
         * Random random= new Random();
         *  
         * int[] userNumbers=new int[SIZE];
         * int[] compuberNumbers=new int[SIZE];
         * 
         * System.out.println("1. 자동 2. 수동");
         * System.out.print("> ");
         * int userChoice=scanner.nextInt();
         * 
         * if(userChoice==1){
         *  // 사용자 자동 코드 구현
         *  for(int i=0;i<SIZE;){
         *   // 배열에 추가할 랜덤숫자
         *   int randomNumber=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
         *   // 위의 randomNumber가 배열에 있으면 false 없으면 true라는 값을 가질 boolean변수
         *   boolean numberSwitch = true;
         *   
         *   // for문을 사용하여 해당 배열에 randomNumber와 같은 값을 가진 인덱스 칸이 존재하는지 체크한다.
         *   // j<i 까지 하는게 효율적이긴함
         *   for(int j=0; j<SIZE;j++){
         *    if(userNumbers[j]==randomNumber){
         *     numberSwitch = false;
         *    }
         *   }
         *   //위의 j for문이 종료되었을 때,
         *   //만약 userNumbers 배열에 중복 숫자가 존재하면
         *   // numberSwitch의 값은 false가 된다.
         *   // 중복 숫자가 존재하지 않으면, numberSwitch는 true란 값이 그대로 남아있게 된다.
         *   // 따라서 우리는 numberSwitch가 true이면, randomNumber를
         *   // userNumbers의 i번째 칸에 넣어주고
         *   // i를 1 증가 시키면 된다.
         *   if(numberSwitch){
         *    userNumbers[i]=randomNumber;
         *    i++;
         *   }
         *  }
         * }else if(userChoice==2){
         *  // 수동 숫자 지정 코드 구현
         *  for(int i=0;i<userNumbers.length;){
         *   System.out.println((i+1)+"번째 숫자를 입력해주세요. 만약 해당 숫자를 자동으로 입력하실려면 0을 입력해 주세요.");
         *   System.out.print("> ");
         *   int number = scanner.nextInt();
         *   
         *   while((number<NUMBER_MIN||number>NUMBER_MAX)&&number!=0){
         *    System.out.println("잘못입력하셨습니다.\n");
         *    System.out.println((i+1)+"번째 숫자를 입력해주세요.");
         *    System.out.print("> ");
         *    number = scanner.nextInt();
         *   }
         *   boolean numberSwitch = true;
         *   if(number==0){
         *    int randomNumber=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
         *    for(int j=0;j<userNumbers.length;j++){
         *     if(userNumbers[j]==randomNumber){
         *      numberSwitch = false;
         *     }
         *    }
         *    while(!numberSwitch){
         *     randomNumber= random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUBMER_MIN;
         *     numberSwitch = true;
         *     for(int j = 0;j<userNumbers.length;j++){
         *      if(userNumbers[j]==randomNumber){
         *       numberSwitch=false;
         *      }
         *     }
         *    }
         *    System.out.println("자동으로 부여된 수: "+randomNumber);
         *    
         *    number = randomNumber;
         *   }else{
         *   //else 없어도됨 randomNumber받았을땐 실행 안시켜도됨.
         *    for(int j=0; j< userNuber.length;j++){
         *     if(userNumber[j]==number){
         *      numberSwitch=false;
         *     }
         *    }
         *   }
         *   if(numberSwitch){
         *    userNumbers[i]=number;
         *    i++;
         *   }else{
         *    System.out.println("잘못 입력하셨습니다.");
         *    System.out.println("해당 숫자는 중복입니다.\n);
         *   }
         *  }
         * }
         * for(int i=0;i<userNumbers.length-1;i++) {
            if(userNumbers[i]>userNumbers[i+1]) {
             int temp=userNumbers[i];
             userNumbers[i]=userNumbers[i+1];
             userNumbers[i+1]=temp;
             i=-1;
            }
           }
         *  // 사용자 숫자 출력
         * System.out.println("사용자 번호");
         * System.out.println("-------------------------"); 
         * for(int i=0; i < userNumbers.length;i++){
         *  System.out.printf("%d",userNumbers[i]);
         *  if(i <userNumber.length-1){
         *   System.out.print(", ");
         *  }
         * }
         * System.out.println();
         * 
         *  // 컴퓨터 숫자 결정 후 출력
         *  
         * for(int i=0;i<computerNumbers.length;){
         *   int randomNumber=random.nextInt(NUMBER_MAX-NUMBER_MIN+1)+NUMBER_MIN;
         *   boolean numberSwitch = true;
         *   
         *   for(int j=0; j<computerNumbers.length;j++){
         *    if(computerNumbers[j]==randomNumber){
         *     numberSwitch = false;
         *    }
         *   }
         *   if(numberSwitch){
         *    computerNumbers[i]=randomNumber;
         *    i++;
         *   }
         *  }
         * for(int = 0; i<computerNumbers.length-1;i++){
         *  if(computerNumber[i]>computerNumbers[i=1]){
         *   int temp = computerNumbers[i];
         *   computerNumbers[i]=computerNumbers[i+1];
         *   computerNumbers[i+1]=temp;
         *   i=-1;
         *  }
         * }
         * System.out.println("컴퓨터 번호");
         * System.out.println("-------------------------"); 
         * for(int i=0; i < computerNumbers.length;i++){
         *  System.out.printf("%d",computerNumbers[i]);
         *  if(i <computerNumber.length-1){
         *   System.out.print(", ");
         *  }
         * }
         * System.out.println();
         *  // 컴퓨터와 사용자 숫자들을 비교해서 몇개가 같은지 출력
         * int count = 0;
         * for(int i=0; i<computerNumbers.length;i++){
         *  for(int j=0;j<userNumbers.length;j++){
         *   if(computerNumbers[i]==userNumbers[j]){
         *    count++;
         *   }
         *  }
         * }
         * 
         * System.out.println("--------------------------");
         * System.out.println("총 맞은 갯수: "+count);
         * scanner.close();
         */
        scanner.close();
    }
}
