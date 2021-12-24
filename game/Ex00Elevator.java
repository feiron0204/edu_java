package game;
/*
 * 문제 1. 일단 되긴하는데 같은 층수일경우 무조껀 A,B,C순서대로 움직이다보니 항상 A가 맨위 B가 두번째 C가 맨아래에있음
 *  -> 같은경우 둘중 아무나 하나 를 뽑아내는 메소드가 잇나??
 * 문제 2. 지하도 하고싶음데 지하는 어케해야되나... 위치기준이 지하는 그대로 지상은 +1층이 되다보니 표시숫자가 머리터짐
 * 
 */





// while 과 if 문을 이용하여 엘리베이터를 조작하는걸 해보쟈ㅑㅑㅑ

// 총3대의 엘리베이터를 운행
// 가장 가까운층에있던 엘리베이터가 호출한층으로 이동
// 가장 가까운층에 있는 엘리베이터가 2대 이상인 경우 1대만 이동
// 건물은 지하 3층부터 지상 5층까지 존재
import java.util.Scanner;
public class Ex00Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //운행종료싸인 0 입력시 종료
        final int STOP = 0;
        //각 엘리베이터의 층수, 내층수
        int aFloor, bFloor, cFloor, myFloor;
        //처음엔 다 1층
        aFloor=0;
        bFloor=0;
        cFloor=0;
        //빌딩의 높이 (1층이 0 이니 5층은 4)
        final int MIN_FLOOR = 0;
        final int MAX_FLOOR = 5;
        
        System.out.printf("현재 엘리베이터의 위치는 A:%d층 B:%d층 C:%d층 입니다.\n현재 층수를 눌러주세요.\n",aFloor+1,bFloor+1,cFloor+1);
        System.out.print("> ");
        //일단 운행 while로 계속 돌릴꺼임
        while(true) {
            //호출자의 위치
            myFloor = scanner.nextInt();
            //근데 0면 종료
            if(myFloor==STOP) {
                break;
            }
            //근데 지상층이면 -1 해줘야됨
            if(myFloor>0) {
                myFloor=myFloor-1;
            
            
            //층수 제대로 눌름? 그럼 운행 가즈아
            if(myFloor>=MIN_FLOOR&&myFloor<=MAX_FLOOR) {
                // 각 엘리베이터와의 차이
                int a=Math.abs(myFloor-aFloor);
                int b=Math.abs(myFloor-bFloor);
                int c=Math.abs(myFloor-cFloor);
                // 비교
                if(a<=b) {
                    if(a<=c) {
                        System.out.println("A엘리베이터를 호출합니다.");
                        aFloor=myFloor;
                    }
                    else if(b<=c) {
                        System.out.println("B엘리베이터를 호출합니다.");
                        bFloor=myFloor;
                        
                    }
                    else {
                        System.out.println("C엘리베이터를 호출합니다.");
                        cFloor=myFloor;
                    }
                   

                }else if(b<=c) {
                    System.out.println("B엘리베이터를 호출합니다.");
                    bFloor=myFloor;
                }else {
                    System.out.println("C엘리베이터를 호출합니다.");
                    cFloor=myFloor;
                    
                }
                
            }else {
                System.out.println("층수를 잘못 입력하셨습니다.");
            }
            //잘못누름? 혹은 탔음? 그럼 다시눌러
            System.out.printf("현재 엘리베이터의 위치는 A:%d층 B:%d층 C:%d층 입니다.다시 현재 층을 눌러주세요.(지상 5층)\n",aFloor+1,bFloor+1,cFloor+1);
            System.out.print("> ");
            }else {
                //와 지하다
                if(myFloor>=MIN_FLOOR&&myFloor<=MAX_FLOOR) {
                    // 각 엘리베이터와의 차이
                    int a=Math.abs(myFloor-aFloor);
                    int b=Math.abs(myFloor-bFloor);
                    int c=Math.abs(myFloor-cFloor);
                    // 비교
                    if(a<=b) {
                        if(a<=c) {
                            System.out.println("A엘리베이터를 호출합니다.");
                            aFloor=myFloor-1;
                        }
                        else if(b<=c) {
                            System.out.println("B엘리베이터를 호출합니다.");
                            bFloor=myFloor-1;
                            
                        }
                        else {
                            System.out.println("C엘리베이터를 호출합니다.");
                            cFloor=myFloor-1;
                        }
                       

                    }else if(b<=c) {
                        System.out.println("B엘리베이터를 호출합니다.");
                        bFloor=myFloor-1;
                    }else {
                        System.out.println("C엘리베이터를 호출합니다.");
                        cFloor=myFloor-1;
                        
                    }
                    
                }else {
                    System.out.println("층수를 잘못 입력하셨습니다.");
                }
                //잘못누름? 혹은 탔음? 그럼 다시눌러
                System.out.printf("현재 엘리베이터의 위치는 A:%d층 B:%d층 C:%d층 입니다.다시 현재 층을 눌러주세요.(지상 5층)\n",aFloor+1,bFloor+1,cFloor+1);
                System.out.print("> ");
                
            }
        }
        scanner.close();
    }

}
