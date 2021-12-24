package controller;

import java.util.ArrayList;

import model.StudentDTO;

public class StudentController {
    private ArrayList<StudentDTO> list;
    private int nextId;
    
    
    public StudentController(){
        list = new ArrayList<>();
        nextId = 1;
    }
    
    // 파라미터로 들어온거 리스트에 넣는메소드
    public void insert(StudentDTO s) {
        s.setId(nextId++);
        list.add(s);
    }
    
    // 리스트 복사해서 리턴해주기
    public ArrayList<StudentDTO> selectAll(){
        ArrayList<StudentDTO> temp = new ArrayList<>();
        for(int i=0;i<list.size();i++) {
            StudentDTO b=list.get(i);
            StudentDTO copy = new StudentDTO(b);
            
            temp.add(copy);
        }
        
        
        return temp;
    }
    
    // 하나 복사해서 리턴해주기
    public StudentDTO selectOne(int id) {
        for(int i=0;i<list.size();i++) {
            StudentDTO s=list.get(i);
            if(s.getId()==id) {
                StudentDTO copy = new StudentDTO(s);
                
                return copy;
            }
        }
        return null;
    }
    // 수정해주기
    public void update(StudentDTO s) {
        int index=list.indexOf(s);
        list.set(index, s);
    }
    
    // 5. 파라미터로 들어온 id 값을 가진 객체를
    //    필드 list에서 삭제하는 delete()
    public void delete(int id) {
        StudentDTO s=new StudentDTO();
        s.setId(id);
        
        list.remove(s);
    }
}
