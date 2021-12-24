package day1101;
//object 패키지에 게시판을 담당할 클래스를 만들어서

//이 Ex02Board.java에 해당 클래스 객체를 사용하여
//게시글 1개를 입력하고 출력하는 프로그램을 작성해보세요.

//해당 클래스에는
//1. 파라미터 없는 생성자
//2. 파라미터 있는 생성자
//3. 객체를 예쁘게 출력하는 메소드
//가 반드시 포함되어야 합니다.

// -> 캡슐화해서 한번더 수정
import object.Boardt;
import util.ScannerUtil;

import java.util.Scanner;

public class Ex02Boardt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boardt b=new Boardt();
        String message = "1. 입력 2. 출력 3. 종료";
        while(true) {
            int userChoice = ScannerUtil.nextInt(scanner, message,1,3);
            if(userChoice==1) {
                String inputMessage = "글 번호를 입력해주세요.";
                int id=ScannerUtil.nextInt(scanner, inputMessage);
                
                inputMessage = "글 제목을 입력해주세요.";
                String title=ScannerUtil.nextLine(scanner, inputMessage);
                
                inputMessage = "글 작성자을 입력해주세요.";
                String writer=ScannerUtil.nextLine(scanner, inputMessage);
                
                inputMessage = "글 내용을 입력해주세요.";
                String content=ScannerUtil.nextLine(scanner, inputMessage);
                
//                b=new Boardt(id,title,writer,content);
                
                b.setId(id);
                b.setTitle(title);
                b.setWriter(writer);
                b.setContent(content);
                
            }else if(userChoice==2) {
                /*
                 * 캡슐화로 인하여 직접호출 불가
                 */
//                if(b.id==-1) {
                if(b.getId()==-1) {
                    System.out.println("아직 입력된 글이 없습니다.");
                }else {
                    b.print();
                    /*
                     * private되서 못호출함
                     */
                }
                
            }else if(userChoice==3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
        
        
        scanner.close();
    }

}
