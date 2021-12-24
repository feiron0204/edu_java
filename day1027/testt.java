package day1027;

import util.ArrayUtil;
import struct.Student;

public class testt {
    public static void main(String[] args) {
        System.out.println("2. String[]");
        Student[] arr=new Student[0];
        System.out.println(" A. size()");
        System.out.println("  ArrayUtil.size(arr): "+ArrayUtil.size(arr));
        
        System.out.println(" B. isEmpty()");
        System.out.println("  ArrayUtil.isEmpty(arr): "+ArrayUtil.isEmpty(arr));
//        
        // ArrayUtil.add()
        Student temp1=new Student();
        Student temp2=new Student();
        temp2.id=1;
        temp2.name="1";
        temp2.korean=1;
        temp2.math=1;
        temp2.english=1;
        Student temp3=new Student();
        temp3.id=2;
        temp3.name="2";
        temp3.korean=2;
        temp3.math=2;
        temp3.english=2;
        arr = ArrayUtil.add(arr, temp1);
        arr = ArrayUtil.add(arr, temp2);
        arr=ArrayUtil.add(arr, temp3);
        
        System.out.println(" C. get()");
        System.out.println("  ArrayUtil.get(arr,2): "+ArrayUtil.get(arr, 1).id);
        System.out.println(" A. size()");
        System.out.println("  ArrayUtil.size(arr): "+ArrayUtil.size(arr));
//        
//        System.out.println(" D. contains()");
//        System.out.println("  ArrayUtil.contains(arr,\"나\"): "+ArrayUtil.contains(arr, "나"));
//        System.out.println("  ArrayUtil.contains(arr,\"마\"): "+ArrayUtil.contains(arr, "마"));
//        
//        System.out.println(" E. indexOf()");
//        System.out.println("  ArrayUtil.indexOf(arr,\"나\"): "+ArrayUtil.indexOf(arr, "나"));
//        System.out.println("  ArrayUtil.indexOf(arr,\"마\"): "+ArrayUtil.indexOf(arr, "마"));
//        
//        System.out.println(" F. lastIndexOf()");
//        System.out.println("  ArrayUtil.lastIndexOf(arr,\"나\"): "+ArrayUtil.lastIndexOf(arr, "나"));
//        System.out.println("  ArrayUtil.LastIndexOf(arr,\"마\"): "+ArrayUtil.lastIndexOf(arr, "마"));
//        
//        System.out.println(" G. add(index)");
//        System.out.println("  ArrayUtil.add(index) 전 ArrayUtil.get(arr,2): "+ArrayUtil.get(arr, 2));
//        System.out.println("  ArrayUtil.add(index) 전 ArrayUtil.size(arr): "+ArrayUtil.size(arr));
//        arr=ArrayUtil.add(arr, 2,"라");
//        System.out.println("  ArrayUtil.add(index) 후 ArrayUtil.get(arr,2): "+ArrayUtil.get(arr, 2));
//        System.out.println("  ArrayUtil.add(index) 후 ArrayUtil.size(arr): "+ArrayUtil.size(arr));
//        
//        System.out.println(" H. set()");
//        System.out.println("  ArrayUtil.set(arr, 3, \"바\") 전 ArrayUtil.get(arr,3): "+ArrayUtil.get(arr, 3));
//        String temp = ArrayUtil.set(arr, 3, "바");
//        System.out.println("  ArrayUtil.set(arr, 3, \"바\") 후 ArrayUtil.get(arr,3): "+ArrayUtil.get(arr, 3));
//        System.out.println("  원래 3번 인덱스에 존재하던 값: "+temp);
//        
//        System.out.println(" I. removeByIndex()");
//        System.out.println("  ArrayUtil.removeByIndex(arr, 2) 전 ArrayUtil.size(arr): "+ArrayUtil.size(arr));
//        System.out.println("  ArrayUtil.removeByIndex(arr, 2) 전 ArrayUtil.get(arr,2): "+ArrayUtil.get(arr, 2));
//        arr = ArrayUtil.remove(arr, 2);
//        System.out.println("  ArrayUtil.removeByIndex(arr, 2) 후 ArrayUtil.size(arr): "+ArrayUtil.size(arr));
//        System.out.println("  ArrayUtil.removeByIndex(arr, 2) 후 ArrayUtil.get(arr,2): "+ArrayUtil.get(arr, 2));
//        arr = ArrayUtil.remove(arr, 300);
//        System.out.println("  ArrayUtil.removeByIndex(arr, 300) 후 ArrayUtil.size(arr): "+ArrayUtil.size(arr));
//        System.out.println("  ArrayUtil.removeByIndex(arr, 300) 후 ArrayUtil.get(arr,2): "+ArrayUtil.get(arr, 2));
//        
        System.out.println(" J. removeByElement()");
        System.out.println("  ArrayUtil.removeByElement(arr, \"바\") 전 ArrayUtil.contains(arr, \"바\"): "+ArrayUtil.get(arr, 0).id);
        arr=ArrayUtil.remove(arr, 0);
        System.out.println("  ArrayUtil.removeByElement(arr, \"바\") 후 ArrayUtil.contains(arr, \"바\"): "+ArrayUtil.get(arr, 0).id);
        System.out.println("------------------------------------------------------------\n");
    }
}