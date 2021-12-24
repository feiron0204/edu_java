
import java.util.Scanner;

import java.util.*;
interface Main{static void main(String[]a){
    Scanner s=new Scanner(System.in);
    int k=s.nextInt(),i=k;
    for(String w;i-->0;)
        if((w=s.next().replaceAll("(.)\\1+","$1")).length()>w.chars().distinct().count()) {
            k--;
System.out.println(w);   
System.out.println(w.chars().distinct().count());
        }
    System.out.print(k);
    }
}

