package domain;

public class Board {
	//게시물 제목
	//게시물 작성자
	//게시물 내용
	//조회수
	
	public String subject;
	public String writer;
	public String content;
	public int count;
	
	public Board() {
	}
	
	public Board(String subject, String writer, String content, int count) {
		super();
		this.subject = subject;
		this.writer = writer;
		this.content = content;
		this.count = count;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public String boardShow() {
		return "제목 :" + this.getSubject() + " \t작성자 : " + this.getWriter() + " \t내용 : " + this.getCount() + " \t조회수 : " + this.getCount();
	}
	
	
	
}
