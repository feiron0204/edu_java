package object;

public class Board {
//    public int id;
//    public String title;
//    public String writer;
//    public String content;

    private int id;
    private String title;
    private String writer;
    private String content;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title=title;
    }
    
    public String getwriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer=writer;
    }
    
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content=content;
    }
    public void printInfo() {
        System.out.println("------------------게시판--------------");
        System.out.printf("글 번호: %d 글 작성자: %s\n",id,writer);
        System.out.printf("글 제목: %s\n", title);
        System.out.println("====================================");
        System.out.printf("%s\n", content);
        System.out.println("------------------------------------");
    }
    public Board() {
        id=-1;
        title="제목없음";
        writer="작성자없음";
        content="내용없음";
    }
    public Board(int id, String title, String writer, String content) {
        this.id=id;
        this.title=title;
        this.writer=writer;
        this.content=content;
    }
    public boolean equals(Object o) {
        /*
         * instanceof => 앞에있는변수가 뒤에있는클래스의 객체면 ture 아니면 false
         * 판별법은 해당 변수가 선언되고 초기화될때 해당 클래스의 생성자가 실행됬는지 확인함.
         */
        if(o instanceof Board) {
            Board s=(Board)o;
            
            return this.id==s.id;
        }
        
        return false;
    }
}
