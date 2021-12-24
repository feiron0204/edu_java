package model;

public class UserDTOt {
    private int id;
    private String username;
    private String password;
    private String nickname;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public boolean equals(Object o) {
        if(o instanceof UserDTOt) {
            UserDTOt u=(UserDTOt) o;
            return id==u.id;
        }
        return false;
    }
    public UserDTOt() {
    /*
     * 파라미터없는 생성자 없으면 생성자쓸때 항상 파라미터 넣어줘야함...
     */
    }
    
    public UserDTOt(UserDTOt u) {
        id=u.id;
        username=new String(u.username);
        password=new String(u.password);
        nickname=new String(u.nickname);
    }
}
