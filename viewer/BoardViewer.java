package viewer;

import java.util.ArrayList;
import java.util.Scanner;

import controller.BoardController;
import model.BoardDTO;
import util.ScannerUtil;
/*
 *  입 출력 담당
 */

public class BoardViewer {
    private Scanner scanner;
    private BoardController boardController;
    
    public BoardViewer() {
        scanner = new Scanner(System.in);
        boardController = new BoardController();
    }
    
    public void showMenu() {
        String message = new String("1. 새 글 쓰기 2. 글 목록 보기 3. 종료");
        while(true) {
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            if(userChoice==1) {
                //새 글 등록 메소드 호출
                writeBoard();
            }else if(userChoice==2) {
                // 글 목록 전체 출력 메소드 호출
                printList();
            }else if(userChoice==3) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }
    
    private void writeBoard() {
        BoardDTO b=new BoardDTO();
        
        String message;
        
        message = new String("글의 제목을 입력해주세요.");
        b.setTitle(ScannerUtil.nextLine(scanner, message));
        
        message = new String("글의 작성자를 입력해주세요.");
        b.setWriter(ScannerUtil.nextLine(scanner, message));
        
        message = new String("글의 내용을 입력해주세요.");
        b.setContent(ScannerUtil.nextLine(scanner, message));
        
        boardController.insert(b);
    }
    
    private void printList() {
        ArrayList<BoardDTO> list = boardController.selectAll();
        
        if(list.isEmpty()) {
            System.out.println("아직 등록된 글이 존재하지 않습니다.");
            
        }else {
            // forEach문
            // 배열, 어레이리스트같이 똑같은 데이터타입이 모여있고, 그 안에 각 요소를 인덱스 오름차순으로 "출력만" 해야한다면
            // 아래와 같이 써줄 수 있다.
            // for(데이터타입 임시이름 : 배열){
            //
            // }
            
//            // 기존 for문
//            for(int i=0;i<list.size();i++) {
//                BoardDTO b = list.get(i);
//            }
//            // forEach문
//            for(BoardDTO b : list) {
//                
//            }
//            같은 역할을 담당함
            
            for(BoardDTO b:list) {
                System.out.printf("%d. %s by %s\n", b.getId(),b.getTitle(),b.getWriter());
            }
            
            String message = new String("상세보기할 글의 번호나 뒤로 가실려면 0을 입력해주세요.");
            
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            if(userChoice !=0) {
                // 글 개별보기 메소드 호출
                printOne(userChoice);
            }
        }
    }
    private void printOne(int id) {
        BoardDTO b=boardController.selectOne(id);
        if(b==null) {
            System.out.println("잘못된 번호입니다.");
            printList();
        }else {
            printBoard(b);
            String message = new String("1. 수정 2. 삭제 3. 뒤로가기");
            int userChoice = ScannerUtil.nextInt(scanner, message,1,3);
            
            if(userChoice ==1) {
                update(id);
            }else if(userChoice==2) {
                delete(id);
            }else if(userChoice==3) {
                printList();
            }
        }
    }
    
    private void update(int id) {
        BoardDTO b=boardController.selectOne(id);
        
        String message = new String("새로운 제목을 입력해주세요.");
        b.setTitle(ScannerUtil.nextLine(scanner, message));
        
        message = new String("새로운 내용을 입력해주세요");
        b.setContent(ScannerUtil.nextLine(scanner, message));
        
        message = new String("정말로 수정하시겠습니까? Y/N");
        String yesNo = ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("y")) {
            boardController.update(b);
        }
        
        printOne(id);
    }
    private void delete(int id) {
        String message = new String("정말로 삭제하시겠습니까? Y/N");
        String yesNo=ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("y")) {
            boardController.delete(id);
            printList();
        }else {
            printOne(id);
        }
    }
    
    
    
    
    private void printBoard(BoardDTO b) {
        System.out.println("------------------------");
        System.out.println("제목: "+b.getTitle());
        System.out.println("------------------------");
        System.out.println("글 번호: "+b.getId());
        System.out.println("작성자: "+b.getWriter());
        System.out.println("------------------------");
        System.out.println("내용");
        System.out.println("------------------------");
        System.out.println(b.getContent());
    }
}
