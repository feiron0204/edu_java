package day1026;
// 우리가 util 패키지에 만든 ArrayUtil 클래스를 테스트하는 곳

import util.ArrayUtil;

public class Ex01ArrayUtil {
    public static void main(String[] args) {
        System.out.println("1. int[]");
        int[] arr=new int[0];
        System.out.println(" A. size()");
        System.out.println("  ArrayUtil.size(arr): "+ArrayUtil.size(arr));
        
        System.out.println(" B. isEmpty()");
        System.out.println("  ArrayUtil.isEmpty(arr): "+ArrayUtil.isEmpty(arr));
        
        // ArrayUtil.add()
        arr = ArrayUtil.add(arr, 3);
        arr = ArrayUtil.add(arr, 6);
        arr = ArrayUtil.add(arr, 9);
        arr = ArrayUtil.add(arr, 6);
        arr = ArrayUtil.add(arr, 3);
        
        System.out.println(" C. get()");
        System.out.println("  ArrayUtil.get(arr,2): "+ArrayUtil.get(arr, 2));
        
        System.out.println(" D. contains()");
        System.out.println("  ArrayUtil.contains(arr,6): "+ArrayUtil.contains(arr, 6));
        System.out.println("  ArrayUtil.contains(arr,15): "+ArrayUtil.contains(arr, 15));
        
        System.out.println(" E. indexOf()");
        System.out.println("  ArrayUtil.indexOf(arr,6): "+ArrayUtil.indexOf(arr, 6));
        System.out.println("  ArrayUtil.indexOf(arr,15): "+ArrayUtil.indexOf(arr, 15));
        
        System.out.println(" F. lastIndexOf()");
        System.out.println("  ArrayUtil.lastIndexOf(arr,6): "+ArrayUtil.lastIndexOf(arr, 6));
        System.out.println("  ArrayUtil.LastIndexOf(arr,15): "+ArrayUtil.lastIndexOf(arr, 15));
        
        System.out.println(" G. add(index)");
        System.out.println("  ArrayUtil.add(index) 전 ArrayUtil.get(arr,2): "+ArrayUtil.get(arr, 2));
        System.out.println("  ArrayUtil.add(index) 전 ArrayUtil.size(arr): "+ArrayUtil.size(arr));
        arr=ArrayUtil.add(arr, 2,30);
        System.out.println("  ArrayUtil.add(index) 후 ArrayUtil.get(arr,2): "+ArrayUtil.get(arr, 2));
        System.out.println("  ArrayUtil.add(index) 후 ArrayUtil.size(arr): "+ArrayUtil.size(arr));
        
        System.out.println(" H. set()");
        System.out.println("  ArrayUtil.set(arr, 3, 40) 전 ArrayUtil.get(arr,3): "+ArrayUtil.get(arr, 3));
        int temp = ArrayUtil.set(arr, 3, 40);
        System.out.println("  ArrayUtil.set(arr, 3, 40) 후 ArrayUtil.get(arr,3): "+ArrayUtil.get(arr, 3));
        System.out.println("  원래 3번 인덱스에 존재하던 값: "+temp);
        
        System.out.println(" I. removeByIndex()");
        System.out.println("  ArrayUtil.removeByIndex(arr, 2) 전 ArrayUtil.size(arr): "+ArrayUtil.size(arr));
        System.out.println("  ArrayUtil.removeByIndex(arr, 2) 전 ArrayUtil.get(arr,2): "+ArrayUtil.get(arr, 2));
        arr = ArrayUtil.removeByIndex(arr, 2);
        System.out.println("  ArrayUtil.removeByIndex(arr, 2) 후 ArrayUtil.size(arr): "+ArrayUtil.size(arr));
        System.out.println("  ArrayUtil.removeByIndex(arr, 2) 후 ArrayUtil.get(arr,2): "+ArrayUtil.get(arr, 2));
        arr = ArrayUtil.removeByIndex(arr, 300);
        System.out.println("  ArrayUtil.removeByIndex(arr, 300) 후 ArrayUtil.size(arr): "+ArrayUtil.size(arr));
        System.out.println("  ArrayUtil.removeByIndex(arr, 300) 후 ArrayUtil.get(arr,2): "+ArrayUtil.get(arr, 2));
        
        System.out.println(" J. removeByElement()");
        System.out.println("  ArrayUtil.removeByElement(arr, 40) 전 ArrayUtil.contains(arr, 40): "+ArrayUtil.contains(arr, 40));
        arr=ArrayUtil.removeByElement(arr, 40);
        System.out.println("  ArrayUtil.removeByElement(arr, 40) 후 ArrayUtil.contains(arr, 40): "+ArrayUtil.contains(arr, 40));
        System.out.println("------------------------------------------------------------\n");
    }
}
