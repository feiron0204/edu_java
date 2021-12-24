package controller;

import java.util.ArrayList;
import model.BoardDTO;
// 원칙대로라면
// 컨트롤러는 뷰어와 데이터베이스 사이의 중간다리 역할을 맡는다.

// 하지만 우리가 데이터베이스가 따로 존재하지 않기 때문에,
// 임시로 우리가 컨트롤러 안에, 데이터베이스 역할을 대신해줄
// 어레이리스트 필드를 하나 만들되,
// 해당 어레이리스트 필드를 private 접근제한자를 적용시키고
// 겟터/셋터는 만들지 않아서 외부의 접근을 막는다.

// 얕은 복사와 깊은 복사
// 우리가 객체를 다른 객체에 복사할 때 두가지 방법이 가능하다.
// 얕은 복사(Shallow Copy)
// 얕은 복사는 원본 객체의 주소값을 복사본 객체에 그대로 넣어주는 방법이다.
// 얕은 복사를 사용하게 될 경우, 복사본의 값을 바꾸면 원본의 값도 바뀌게 된다.
// 깊은 복사(Deep Copy)
// 깊은 복사는 원본 객체의 필드 값을 따로 복사해서 복사본 객체의 필드에 일일이 다 넣어주는 방법이다.
// 비록 필드의 값들은 같지만, 실제로 위치한 곳은 다르기 때문에
// 복사본의 값을 바꾸더라도 원본의 값은 바뀌지 않는다.

public class BoardController {
    
    /*
     * 데이터베이스인척하는 어레이리스트
     */
    
    private ArrayList<BoardDTO> list;
    private int nextId;
    
    public BoardController() {
        list = new ArrayList<>();
        nextId =1;
    }
    
    // 1. 파라미터로 들어온 BoardDTO 객체를
    //    필드 list에 추가하는 insert()
    /*
     * 제목 작성자 내용은 입력된놈이 와서 번호만 받아서 데이터베이스에 들어가면됨.
     */
    public void insert(BoardDTO b) {
        b.setId(nextId++);
        list.add(b);
    }
    
    // 2. 게시글 목록을 깊은 복사 후에
    //    리턴해주는 selectAll()
    public ArrayList<BoardDTO> selectAll(){
        ArrayList<BoardDTO> temp = new ArrayList<>();
        for(int i=0;i<list.size();i++) {
            BoardDTO b=list.get(i);
            BoardDTO copy = new BoardDTO(b);
            
            temp.add(copy);
        }
        
        
        return temp;
    }
    
    // 3. 파라미터로 들어온 id 값을 가진 객체를
    //    깊은 복사후에 리턴하는 selectOne()
    public BoardDTO selectOne(int id) {
        for(int i=0;i<list.size();i++) {
            BoardDTO b=list.get(i);
            if(b.getId()==id) {
                BoardDTO copy = new BoardDTO(b);
                
                return copy;
            }
        }
        return null;
    }
    
    // 4. 파라미터로 들어온 BoardDTO 객체를
    //    기존 객체와 교체하는 update()
    public void update(BoardDTO b) {
        int index=list.indexOf(b);
        list.set(index, b);
    }
    
    // 5. 파라미터로 들어온 id 값을 가진 객체를
    //    필드 list에서 삭제하는 delete()
    public void delete(int id) {
        BoardDTO b=new BoardDTO();
        b.setId(id);
        
        list.remove(b);
    }
}
