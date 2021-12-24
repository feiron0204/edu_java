package day1101;

// ArrayList
// 어레이리스트란 자바에서 기본적으로 제공해주는
// 동적할당이 되어있고, 중복 등록이 가능한 배열의 클래스 버젼이다.
import java.util.ArrayList;
import object.Student;
public class Ex03ArrayList {
    public static void main(String[] args) {
        // ArrayList 객체를 선언할 때에는
        // 반드시 해당 객체가 어떤 데이터타입의 모음집인지를
        // <> 안에 적어주어야 한다.
        // 이 때 <> 안에는 반드시 클래스 혹은 인터페이스만 적어줄 수 있다.
        // 만약 기본형 데이터타입의 어레이리스트가 필요하다면?
        // 그 때엔 해당 기본형 데이터타입을 클래스의 모습으로"포장한"
        // 포장 클래스(Wrapper Class)를 적어주면 된다!
        
        ArrayList<Student> list=new ArrayList<>();
        
        // 1. 해당 어레이리스트의 크기가 궁금할때에는?
        //    size()
        System.out.println("1. list.size(): "+list.size());
        // 2. 해당 어레이리스트가 비어있는지 궁금할 때에는?
        //    isEmpty()
        System.out.println("2. list.isEmpty(): "+list.isEmpty());
        
        Student s1=new Student(1,"이성호1",11,11,11);
        Student s2=new Student(2,"이성호2",11,11,11);
        Student s3=new Student(3,"이성호3",11,11,11);
        Student s4=new Student(4,"이성호4",11,11,11);
        Student s5=new Student(5,"이성호5",11,11,11);
        // 3. 어레이리스트 객체에 새로운 요소를 추가할 때에는?
        //    add(e)
        System.out.println("3. add()");
        System.out.println("add 전 list 크기: " + list.size());
        
        list.add(s1);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
        System.out.println("add 후 list 크기: " + list.size());
        
        // 4. 특정 인덱스에 저장된 객체를 호출할 때에는?
        //    get(인덱스)
        System.out.println("list.get(2).getName(): "+list.get(2).getName());
        
        // 5. 특정 인덱스에 새로운 객체를 끼어넣을려면?
        //    add(인덱스, 객체)
        System.out.println("add(인덱스, 객체) 전 list.get(1).getName(): "+list.get(1).getName());
        list.add(1, s2);
        System.out.println("add(인덱스, 객체) 후 list.get(1).getName(): "+list.get(1).getName());
        
        Student s44 = new Student(4, "조재영4",11,11,11);
        Student s55 = new Student(5, "조재영5",11,11,11);
        Student s6 = new Student(6, "조재영6",1,1,1);
        
        // 6. 특정 객체와 일치하는 객체가 리스트에 존재하는지 체크할 때에는?
        //    contains()
        System.out.println("list.contains(s3): "+list.contains(s3));
        System.out.println("list.contains(s44): "+list.contains(s44));
        System.out.println("list.contains(s6): "+list.contains(s6));
        
        // 7. 특정 객체와 일치하는 객체의 인덱스를 체크할 때에는?
        //    indexOf()
        System.out.println("list.indexOf(s3): "+list.indexOf(s3));
        System.out.println("list.indexOf(s44): "+list.indexOf(s44));
        System.out.println("list.indexOf(s6): "+list.indexOf(s6));
        
        // 8. 특정 객체와 일치하는 객체의 가장 마지막 인덱스를 체크할 때에는?
        //    lastIndexOf()
        System.out.println("list.lastIndexOf(s3): "+list.lastIndexOf(s3));
        System.out.println("list.lastIndexOf(s44): "+list.lastIndexOf(s44));
        System.out.println("list.lastIndexOf(s6): "+list.lastIndexOf(s6));
        
        // 9. 특정 인덱스의 객체를 삭제할 때에는/
        //    remove(인덱스)
        System.out.println("remove(인덱스) 전 list.get(0).getName(): "+list.get(0).getName());
        System.out.println("remove(인덱스) 전 list.size(): "+list.size());
        list.remove(0);
        System.out.println("remove(인덱스) 후 list.get(0).getName(): "+list.get(0).getName());
        System.out.println("remove(인덱스) 후 list.size(): "+list.size());
        
        // 10. 특정 객체를 삭제할 때에는?
        //     remove(객체)
        System.out.println("remove(s3) 전 list.indexOf(s3): "+list.indexOf(s3));
        list.remove(s3);
        System.out.println("remove(s3) 후 list.indexOf(s3): "+list.indexOf(s3));
        
        System.out.println("remove(s44) 전 list.indexOf(s44): "+list.indexOf(s44));
        list.remove(s44);
        System.out.println("remove(s44) 후 list.indexOf(s44): "+list.indexOf(s44));
        
        System.out.println("remove(s6) 전 list.indexOf(s6): "+list.indexOf(s6));
        list.remove(s6);
        System.out.println("remove(s6) 후 list.indexOf(s6): "+list.indexOf(s6));
        
        // 11. 어레이리스 객체의 내용을
        //     한번에 전부 삭제할 때에는?
        //     clear()
        System.out.println("clear() 전 list.isEmpty(): "+list.isEmpty());
        list.clear();
        System.out.println("clear() 후 list.isEmpty(): "+list.isEmpty());
        
    }
}
