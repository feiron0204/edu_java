package model;
// 모델(model)
// 모델 이란, 여러가지 데이터를 묶어서 하나의 데이터 타입으로 만들어 주는 클래스로써,
// 클래스 안에는 필드, 겟터/셋터, java.lang.Object 의 오버라이드 메소드만 들어간다.

// 사용자가 입력한 값들을 묶어서 하나의 객체로 만들어주거나
// 데이터베이스의 응답을 객체로 묶는 책임만 진다.

// VO vs DTO
// 모델 클래스들은 항상 끝이 VO 혹은 DTO로 끝나는데, VO는 Value Object의 줄임말이고, DTO는 Data Transfer Object의 줄임말이다.
// 둘 중 무엇을 사용하더라도 크게 틀리지 않으나, VO는 주로, 데이터베이스의 응답을 뷰어로 전달하는 모델에만 붙여주고
// DTO는 양방향 모두 사용될 때 붙여주게 된다.
// 즉, DTO를 붙여주면 틀릴 일은 없다.

// POJO
// POJO란 Plain Old Java Object의 줄임말로써, 평범한 구식 자바 객체를 뜻한다.
// 평범한 구식 자바 객체란, 내부적으로 다른 클래스를 이것저것 모두다 임포트 하는것이 아니라
// 몇몇 기본 데이터타입들만 필드로 가지고 있는 형태의 클래스 이다.

/*
 * POJO -> 따른데서 사용할꺼다? 그대로 사용가능
 */

public class BoardDTO {
    private int id;
    private String title;
    private String writer;
    private String content;
    /*
     * 우클릭 소스 제네레이션 겟터셋터 하면 자동완성~
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    
    
    
    //오버라이드
    
    public boolean equals(Object o) {
        if(o instanceof BoardDTO) {
            BoardDTO b=(BoardDTO) o;
            return id==b.id;
        }
        return false;
    }
    
    
    
    //생성자
    
    
    public BoardDTO() {
        
    }
    
    public BoardDTO(BoardDTO b) {
        id = b.id;
        title = new String(b.title);
        writer=new String(b.writer);
        content=new String(b.content);
    }
}
