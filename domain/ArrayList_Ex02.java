package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Ex02 {

	public static void main(String[] args) {
		//List -> 게시물 2개(생성자 2개) 저장 후 출력
		
//		List<Board> aList = new ArrayList<>();
//		Board b1 = new Board();
//		b1.setSubject("게시물 1");
//		b1.setWriter("작성자1");
//		b1.setContent("내용1");
//		b1.setCount(0);
//		
//		Board b2 = new Board();
//		b2.setSubject("게시물 2");
//		b2.setWriter("작성자2");
//		b2.setContent("내용2");
//		b2.setCount(0);
//		
//		aList.add(b1);
//		aList.add(b2);
//		
//		System.out.println(aList.size());
//		System.out.print(aList.get(0).getSubject());
//		System.out.print(aList.get(0).getWriter());
//		System.out.print(aList.get(0).getContent());
//		System.out.print(aList.get(0).getCount());
//		System.out.println("-----------------------------");
//		System.out.print(aList.get(1).getSubject());
//		System.out.print(aList.get(1).getWriter());
//		System.out.print(aList.get(1).getContent());
//		System.out.print(aList.get(1).getCount());
		
		//List 공간만 할당(객체를 담는 공간)
		//자장할 개수만큼 new 생성자(실질 데이터가 저장되는 곳) 
		
		//List 생성 -> new 생성자() -> set -> 배열명.add() -> get
		
		//for 입력 : 5명 입력
		List<Board> aList = new ArrayList<>(); //공간 10개

		
		
		Board board = null; //객체를 전역변수로 사용하며 초기화
		
		
		for(int i = 0; i < 5; ++i) {
			board = new Board(); //게시물 5개 정보가 저장될 객체 생성
			board.setSubject("게시물1");
			board.setWriter("작성자");
			board.setContent("내용");
			board.setCount(0);
			
			aList.add(board);
			System.out.println("게시물이 등록되었습니다.");
		}
		System.out.println(aList.size());
		
		//for 출력 : 일반, foreach
		System.out.println();
		System.out.println("제목\t작성자\t내용\t조회수");
		for(int i = 0; i < aList.size(); ++i) {
			System.out.println(board.boardShow());
		}
		
		
		
		
		
		
		
	}

}
