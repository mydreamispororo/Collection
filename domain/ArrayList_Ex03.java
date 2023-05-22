package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Ex03 {

	public static void main(String[] args) {
		//List 생성 -> new 생성자() -> set -> 배열명.add() -> List배열.get(i).getter();
		//List, Scanner, 무한반복
		//1이면 입력, 2번 목록, 3이면 종료
		//2 값이 없으면 "등록된 게시물이 없습니다." 있으면 for 출력
		
		List<Board> aList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Board board = null;
		
		boolean flag = true;
		while(flag) {
			
			ListMethod Im = new ListMethod();
			Im.menu();

			
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(aList.size() == 0) {
					Im.noCount();
				}else {
					System.out.println("1. 게시물 목록");
					System.out.println("전체 게시물 수 : " + aList.size());
					Im.boardUI();
					
					//List 생성 -> new 생성자() -> set -> 배열명.add() -> List배열.get(i).getter();
					for(int i = 0; i < aList.size(); ++i) {
						System.out.println(aList.get(i).boardShow());
						
//						System.out.print(aList.get(i).getSubject()); 
//						System.out.print(aList.get(i).getWriter()); 
//						System.out.print(aList.get(i).getContent()); 
//						System.out.print(aList.get(i).getCount()); 
					}
				}				
				
				
			}else if (sel == 2) {
				board = new Board(); //게시물 하나 등록한 생성자
			
				System.out.println("2. 게시물 등록");
				
				System.out.println("제목 > ");
				String title = sc.next();
				
				System.out.println("작성자 > ");
				String uname = sc.next();
				
				System.out.println("내용 > ");
				String con = sc.next();
				
				board.setSubject(title);
				board.setWriter(uname);
				board.setContent(con);
				board.setCount(board.getCount() + 1);
				
				aList.add(board);
				System.out.println("게시물이 등록되었습니다.");
				System.out.println();
				
			
			}else if (sel == 3){
				System.out.println("프로그램 종료");
				System.exit(0);
			}else {
				System.out.println("다시 입력해 주세요");
				
			}
			
			
		}
		
		

	}

}
