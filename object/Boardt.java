package object;
// 게시판 클래스
import java.util.Scanner;
import java.util.ArrayList;
import util.ScannerUtil;

public class Boardt {
    //필드
    /*
     * getter setter 전
     */
//    public int id;
//    public String title;
//    public String writer;
//    public String content;
    /*
     * 후
     */
    private int id;
    private String title;
    private String writer;
    private String content;
    private Scanner scanner;
    private ArrayList<Boardt> list;
    private int nextId;
    
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
    
    public Boardt() {
        id =-1;
        title ="아직 입력 안됨";
        writer="아직 입력 안됨";
        content="아직 입력 안됨";
        scanner = new Scanner(System.in);
        list = new ArrayList<>();
        nextId = 1;
    }
    
    public Boardt(int id, String title, String writer, String content) {
        this.id=id;
        this.title=title;
        this.writer=writer;
        this.content=content;
    }
    
    public void showMenu() {
        String message = new String("1. 입력 2. 출력 3. 종료");
        while(true) {
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            if(userChoice ==1) {
                insert();
            }else if(userChoice==2) {
                printList();
            }else if(userChoice==3) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }
    
    private void insert() {
        Boardt b=new Boardt();
        b.setId(nextId++);
        
        String message;
        
        message = new String("글의 제목을 입력해주세요.");
        b.setTitle(ScannerUtil.nextLine(scanner, message));
        
        message = new String("글의 작성자을 입력해주세요.");
        b.setWriter(ScannerUtil.nextLine(scanner, message));
        
        message = new String("글의 내용을 입력해주세요.");
        b.setContent(ScannerUtil.nextLine(scanner, message));
        
        list.add(b);
    }
    
    private void printList() {
        if(list.isEmpty()) {
            System.out.println("아직 등록된 글이 존재하지 않습니다.");
        }else {
            for(int i=0;i<list.size();i++) {
                System.out.printf("%d. %s by %s\n", list.get(i).getId(),list.get(i).getTitle(),list.get(i).getwriter());
            }
            String message = new String("상세보기할 글의 번호나 뒤로 가실려면 0을 입력해주세요.");
            int userChoice=ScannerUtil.nextInt(scanner, message);
            
            while(userChoice != 0 && selectById(userChoice)==null) {
                System.out.println("잘못 입력하셧습니다.");
                userChoice = ScannerUtil.nextInt(scanner, message);
            }
            if(userChoice!=0) {
                printOne(userChoice);
            }
        }
    }
    
    private void printOne(int id) {
        Boardt b = selectById(id);
        b.print();
        
        String message = new String("1. 수정 2. 삭제 3. 뒤로 가기");
        int userChoice = ScannerUtil.nextInt(scanner, message,1,3);
        
        if(userChoice==1) {
            update(id);
        }else if(userChoice==2) {
            delete(id);
        }else if(userChoice==3) {
            printList();
        }
    }
    
    private void update(int id) {
        Boardt b=selectById(id);
        
        String message=new String("새로운 제목을 입력하세요.");
        b.setTitle(ScannerUtil.nextLine(scanner, message));
        
        message=new String("새로운 내용을 입력하세요.");
        b.setContent(ScannerUtil.nextLine(scanner, message));
        
        printOne(id);
    }
    
    
    private void delete(int id) {
        Boardt b = selectById(id);
        
        String message = new String("정말로 삭제하시겠습니까? Y/N");
        String yesNo = ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("y")) {
            list.remove(b);
            printList();
        }else {
            printOne(id);
        }
    }
    
    private Boardt selectById(int id) {
        Boardt b=new Boardt();
        b.setId(id);
        
        if(list.indexOf(b) !=-1) {
            return list.get(list.indexOf(b));
        }
        
        return null;
    }
    
    
    
    private void print() {
        System.out.println("------------------------");
        System.out.println("제목: "+title);
        System.out.println("------------------------");
        System.out.println("글 번호: "+id);
        System.out.println("작성자: "+writer);
        System.out.println("------------------------");
        System.out.println("내용");
        System.out.println("------------------------");
        System.out.println(content);
    }
    /*
     * 오버라이드 실습
     * java.lang 인 부모클래스에 equals 있는데 이건 ==비교임... 그래서 student에 맞게 equals 재정립
     */
    /*
     * Object는 뭐든 받을수있는 변수' 라고일단 생각하자
     */
    public boolean equals(Object o) {
        /*
         * instanceof => 앞에있는변수가 뒤에있는클래스의 객체면 ture 아니면 false
         * 판별법은 해당 변수가 선언되고 초기화될때 해당 클래스의 생성자가 실행됬는지 확인함.
         */
        if(o instanceof Boardt) {
            Boardt b=(Boardt)o;
            
            return this.id==b.id;
        }
        
        return false;
    }
}
