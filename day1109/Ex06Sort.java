package day1109;

import java.util.ArrayList;
import java.util.Collections;

public class Ex06Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(4);
        list1.add(78);
        list1.add(3);
        list1.add(66);
        list1.add(1);
        
        Collections.sort(list1);
        
        System.out.println(list1);
        
        ArrayList<MiddleSchool> list2=new ArrayList<>();
        MiddleSchool m1 = new MiddleSchool(3,"ccc");
        MiddleSchool m2 = new MiddleSchool(1,"c");
        MiddleSchool m3 = new MiddleSchool(66,"zzz");
        MiddleSchool m4 = new MiddleSchool(753,"qwer");
        MiddleSchool m5 = new MiddleSchool(7,"asd");
        
        list2.add(m1);
        list2.add(m2);
        list2.add(m3);
        list2.add(m4);
        list2.add(m5);
        /*
         * 비교를위한 인터페이스가 잡혀있음
         * 뭐가 앞인지 뒤인지 모름 우리가 만든객체라서
         * 따라서 비교자(Con.....어쩌구)인터페이스가 있어야함
         */
        Collections.sort(list2);
        
        
        System.out.println(list2);
    }
}
