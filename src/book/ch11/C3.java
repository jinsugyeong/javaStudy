//키보드로 이름을 입력하면 대응하는 점수를 알려 주는 프로그램을 작성하시오
package book.ch11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		
		map.put("김열공", 80);
		map.put("우등생", 95);
		map.put("최고봉", 90);
		map.put("나자바", 88);
		
		Scanner in = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name =  in.next();
		
		System.out.println(map.get(name));

	}

}
