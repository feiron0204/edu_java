package controller;

import java.util.ArrayList;

import model.UserDTOt;

public class UserControllert {
    private ArrayList<UserDTOt> list;
    private int nextId;
    
    public UserControllert() {
        list = new ArrayList<>();
        nextId = 1;
        
        for(int i=1; i<=3;i++) {
            UserDTOt u=new UserDTOt();
            u.setUsername("u"+i);
            u.setPassword("1");
            u.setNickname("사용자"+i);
            
            register(u);
        }
    }
    
    public void register(UserDTOt u) {
        u.setId(nextId++);
        list.add(u);
    }
    
    public boolean validateUsername(String username) {
        if(username.equalsIgnoreCase("x")) {
            return true;
        }
        for(UserDTOt u:list) {
            if(u.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }
    
    public void update(UserDTOt u) {
        int index=list.indexOf(u);
        
        list.set(index, u);
    }
    
    public UserDTOt auth(String username,String password) {
        for(UserDTOt u:list) {
            if(username.equalsIgnoreCase(u.getUsername())&&password.equals(u.getPassword())) {
//                UserDTOt temp=new UserDTOt(u);
//                return temp;
                /*
                 * 굳이?temp? 그냥 바로보내버렷
                 */
                return new UserDTOt(u);
            }
        }
        return null;
    }
    
    public UserDTOt selectOne(int id) {
        for(UserDTOt u:list) {
            if(id==u.getId()) {
                return new UserDTOt(u);
            }
        }
        
        return null;
    }
    
    public void delete(int id) {
        UserDTOt u=new UserDTOt();
        u.setId(id);
        
        list.remove(u);
    }
}
