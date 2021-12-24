package day1102;
import object.Boardt;

public class Ex01Boardt {
    public static void main(String[] args) {
        Boardt b=new Boardt();
        b.showMenu();
    }
    /*
     * 객체지향의 5원칙
     * S.O.L.I.D
     * 
     * L은 리스코프어쩌구...
     * 
     * 모두 중요하지만 S 특히 중요함
     * 
     * S=Single Responsibility Principle
     * 단일 책임 원칙
     * 
     *  클래스는 한번에 한가지책임(목적)만 져야한다
     * 
     * 근데 Boardt.java?
     * 데이터 저장 저장을 리턴 데이터틀 출력 컨트롤 등등 죄다 담당함
     * 
     * -> 하나의 클래스가 여러개 목적을 가졌을때 유지보수가 힘듬
     * 
     * + 변수도 뭔 죄다 담당함
     * Ex) boardt 의 insert의 경우 사용된거? boardt 밖엔 없는데
     * scanner arraylist nextid 등등 죄다 초기화되어 공간활용되는중
     * 
     * !!!!클래스분리필요!!!!
     * 
     * 클래스 분류 방법
     * 이거랑 관련된 MVC
     * M odel
     * V iew
     * C ontroller
     * 
     * Model -> 데이터담당(=데이터 틀)
     * View -> 출력담당
     * Controller -> 데이터로직담당
     * 
     * 자바로 예비서버 열어버릴꺼임..
     */
}
