package domain;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex {

	public static void main(String[] args) {
		//객체 사용 x
//		List<Integer> aList = new ArrayList<>();
//		
//		aList.add(100);
//		aList.add(200);
//		aList.add(300);
//		
//		aList.remove(1);
//		
//		System.out.println(aList); //참조 객체의 메모리 주소
//		System.out.println(aList.size());
//		
//		List<String> aList1 = new ArrayList<>();
//		
//		aList1.add("홍길동");	
//		aList1.add("김철수");	
//		aList1.add("이영희");
//		
//		aList1.remove("김철수"); //값으로 삭제
//		aList1.remove(1); //인덱스 번호로 삭제
//		
//		aList1.clear();
//		
//		System.out.println(aList1);
//		System.out.println(aList1.size() + "명");
		
		//게시판 만들기
		List<Board> aList = new ArrayList<>(); //공간만 기본이 10개를 생성
		
		Board board = new Board();
		
		//set : 배열이 아닌 임시 메모리에 저장해 놓으면 -> 배열에 보내서 저장
		board.setSubject("게시물 제목 1");
		board.setWriter("작성자1");
		board.setContent("게시물 내용 1");
		board.setCount(0);
		
		aList.add(board);
		System.out.println(aList.size());

		//값을 가져올 때 : 배열명.get(i).get
		//기본적으로 공간 10개 생성 -> 객체를 삽입
		
		System.out.println(aList.get(0).getSubject());
		
		
		
	}

}
