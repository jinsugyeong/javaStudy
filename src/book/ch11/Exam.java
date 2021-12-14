package book.ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Exam {

	public static void main(String[] args) {
		Map<String,String> dic = new HashMap<>();
		
		dic.put("head","대가빠리");
		dic.put("teacher","쌤");
		dic.put("cat","꼬네이");
		dic.put("aunt","아지매");
		dic.put("noodle","국시");
		dic.put("child","얼라");
		
		
		/*for(String key : dic.keySet()) {
			System.out.printf("%s=%s ", key, dic.get(key));
		}*/
		
		//람다식으로
		dic.forEach((key, value) -> System.out.printf("%s=%s ", key, value));
		System.out.println();
		
		//사전 객체에서 값이 한글인 단어를 추출한다 >\
		//Map객체에서 값을 추출하려면 Map인터페이스의 values() 메서드를 호출한다.
		
		Collection<String> collection1 = dic.values();
		
		//shuffle() 메서드는 List 타입의 인자를 사용한다
		
		List<String> list = new ArrayList<>(collection1); //collection 타입을 List타입으로 변환
		Collections.shuffle(list); //List 객체의 원소 섞기
		
		list.forEach(value->System.out.print(value + " "));
		System.out.println();
		
		
		
		Collection<String> collection2 =  dic.keySet();
		collection2.forEach(x->System.out.print(x + " "));
		System.out.println();
		
		Stream<String> stream = collection2.stream();
		
		
		stream.sorted()
		.filter(s -> s.length()>4)
		.sorted()
		.forEach(x-> System.out.print(x + " "));
		
		
	}

}
//https://hianna.tistory.com/573