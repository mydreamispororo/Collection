package domain;

public class ListMethod {
	public void menu() {
		System.out.println("---------------------------------------");
		System.out.println("1. 게시물 목록  2. 게시물 등록  3. 프로그램 종료");
		System.out.println("---------------------------------------");
	}
	
	public void noCount() {
		System.out.println("등록된 게시물이 없습니다.");
	}
	
	public void boardUI() {
		System.out.println("---------------------------------------");
		System.out.println("제  목     작성자     내  용     조회수");
		System.out.println("---------------------------------------");
	}

}
