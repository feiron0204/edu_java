package day1025;
// 배열의 정적할당과 동적할당

// 배열의 경우, 우리가 맨 처음 크기를 고정시켜놓고 사용한다 라는 문제점이 존재한다.
// 만약 우리가 배열의 크기 제한을 풀려고 한다면 어떻게 해야할까?

// 배열의 정적할당: 미리 크기를 고정 시킨 배열을 끝까지 크기를 유지시켜서 사용함.
// 배열의 동적할당: 크기가 자유롭게 변경되는 배열

// 우리가 util 패키지 안에 ArrayUtil이라는 클래스를 만들어서
// 그 안에, 배열을 사용할 때 도움이 되는 다양한 메소드들을 구현을 해볼 것이다.
import util.ArrayUtil;
public class Ex07Array02t {
    public static void main(String[] args) {
        int[] arr=new int[0];
        System.out.println("1. int[]");
        System.out.println("A. isEmpty()");
        System.out.println("ArrayUtil.isEmpty(arr): "+ArrayUtil.isEmpty(arr));
        
        System.out.println("ArrayUtil.add() 전 size(): "+ArrayUtil.size(arr));
        arr=ArrayUtil.add(arr, 11);
        System.out.println("ArrayUtil.add() 후 size(): "+ArrayUtil.size(arr));
        
        System.out.println("ArrayUtil.contains(arr,11): "+ArrayUtil.contains(arr, 11));
        System.out.println("ArrayUtil.contains(arr,11): "+ArrayUtil.contains(arr, 31));
        
        arr = ArrayUtil.add(arr, 21);
        arr = ArrayUtil.add(arr, 11);
        
        System.out.println("ArrayUtil.indexOf(arr.11): "+ArrayUtil.indexOf(arr, 11));
        System.out.println("ArrayUtil.indexOf(arr.21): "+ArrayUtil.indexOf(arr, 21));
        System.out.println("ArrayUtil.indexOf(arr.31): "+ArrayUtil.indexOf(arr, 31));
        
        System.out.println("ArrayUtil.lastindexOf(arr.11): "+ArrayUtil.lastIndexOf(arr, 11));
        System.out.println("ArrayUtil.lastindexOf(arr.21): "+ArrayUtil.lastIndexOf(arr, 21));
        System.out.println("ArrayUtil.lastindexOf(arr.31): "+ArrayUtil.lastIndexOf(arr, 31));
        
        
    }
}
