package controller;

import java.util.ArrayList;

import model.UserDTO;
import java.util.Random;
public class UserController {
//데이터베이스 인척하는놈 구현
    private ArrayList<UserDTO> list;
    private Random random;
    
    public UserController() {
        list=new ArrayList<>();
        random=new Random();
    }
    
    // 데이터베이스에 입력해주는애
    public void insert(UserDTO u) {
        UserDTO temp=u;
        temp.setNum(random.nextInt(9999)+1);
        while(list.contains(temp)) {
            temp.setNum(random.nextInt(9999)+1);
        }
        list.add(temp);
    }
    
    // 아이디 있는지 확인해주는애
    public boolean overlab(String id) {
        UserDTO u = new UserDTO();
        u.setId(id);
        if(list.contains(u)) {
            return true;
        }
        return false;
    }
    
    // 전체 출력을 도와주는 애..... 는 필요없지
    
    // 상세 출력을 도와주는 애
    public UserDTO selectOne(String id) {
        for(UserDTO u:list) {
            if(u.getId().equals(id)) {
                UserDTO temp=new UserDTO(u);
                return temp;
            }
        }
        return null;
    }
    // 수정하는거?
    public void update(UserDTO u) {
        int index=list.indexOf(u);
        list.set(index, u);
    }
    
    // 삭제하는거?
    public void delete(String id) {
        UserDTO u =new UserDTO();
        u.setId(id);
                
        list.remove(u);
    }
    
}
