package domain;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex {

	public static void main(String[] args) {
		//Collection 객체를 컨트롤 할 때 사용
		//Map -> HashMap > 순서를 보장하지 않고 key 값을 이용해서 value 찾아 냄 = json
	
		//key, value
		//입력 : 배열명.put
		//삭제 : 배열명.remove(key)
		//완전삭제 : 배열명.clear()
		
		//출력 : 배열명.get(key);
		
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1000, "koreait");
		m1.put(2000, "Seoulit");
		
//		m1.remove(1);
		
		System.out.println(m1);
		System.out.println(m1.size());
		System.out.println(m1.get(1000));
		System.out.println(m1.get(2000));
		
		
		Map<String, String> m2 = new HashMap<>();
		
		
		

	}

}
