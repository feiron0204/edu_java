package day1020;
// 1~45까지의 범위의 랜덤 숫자 6개를 뽑아서 배열에 저장하고 출력하는 프로그램을 작성하시오
// 중복도 허용 정렬안되도 괸츈
import java.util.Random;
public class HWlotto {
    public static void main(String[] args) {
        final int NUMBER_SIZE=45;
        final int ARRAY_SIZE=6;
        Random random=new Random();
        int[] lotto=new int[ARRAY_SIZE];
        System.out.println("1~45 중 무작위 6개 뽑은 결과!");
        for(int i=0;i<lotto.length;i++) {
            lotto[i]=random.nextInt(NUMBER_SIZE)+1;
        }
        for(int i=0;i<lotto.length;i++) {
            System.out.print(lotto[i]+" ");
        }
        System.out.println("\n");
        
        
        //중복 가려보자아ㅏㅏ
        boolean sameNumSwitch=true;
        while(sameNumSwitch) {
            sameNumSwitch=false;
            for(int i=0;i<lotto.length;i++) {
                for(int j=i+1;j<lotto.length;j++) {
                    if(lotto[i]==lotto[j]) {
                        lotto[i]=random.nextInt(NUMBER_SIZE)+1;
                        sameNumSwitch=true;
                    }
                }
            }
            
        }
        System.out.println("그중에서 중복제거!");
        for(int i=0;i<lotto.length;i++) {
            System.out.print(lotto[i]+" ");
        }
        System.out.println("\n");
        
        
        //순서도 재배열해보자~~
        boolean listSwitch=true;
        while(listSwitch) {
            listSwitch=false;
            for(int i=0;i<lotto.length;i++) {
                for(int j=i+1;j<lotto.length;j++) {
                    if(lotto[i]>lotto[j]) {
                        int temp=lotto[i];
                        lotto[i]=lotto[j];
                        lotto[j]=temp;
                        listSwitch=true;
                    }
                }
            }
        }
        System.out.println("그리고 작은수부터 정렬!");
        for(int i=0;i<lotto.length;i++) {
            System.out.print(lotto[i]+" ");
        }
    }

}
