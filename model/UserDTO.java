package model;
//회원 정보가 될 모델
public class UserDTO {
    private int num;
    private String id;
    private String pw;
    private String name;
    
    
    
    
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public UserDTO() {
        
    }
    
    public UserDTO(UserDTO u) {
        num=u.num;
        id=new String(u.id);
        pw=new String(u.pw);
        name=new String(u.name);
    }
    
    public boolean equals(Object o) {
        if(o instanceof UserDTO) {
            UserDTO u=(UserDTO)o;
            return u.num==num||id.equalsIgnoreCase(u.id);
        }
        return false;
    }
    
    
}
