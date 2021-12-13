package book.ch11;

import java.util.*; //Arrays,HashSet, List, Random

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> gt10 = new ArrayList<>(); //10보다 큰 원소를 임시로 보관할 저장 공간이다.
		
		Random r = new Random();
		
		for (int i=0; i<10; i++) {
			list.add(r.nextInt(30));
		}
		// 0~29사이의 무작위 정수 20개를 생성해 List 컬렉션에 추가
		
		
		
		for (int i : list) {
			if (i > 10 ) {
				gt10.add(i);
			}
		}
		
		Collections.sort(gt10);
		System.out.println(gt10);
		
		//Collection 이용방식
		
		list.stream() //컬렉션에서 스트림을 가져온다.
		.filter(i -> i>10 ) //10보다 큰 원소만 추출한다
		.sorted() //정렬한다
		.forEach(x-> System.out.print(x + " "));//원소를 하나씩 출력한다
		//Stream 이용방식

	}

}
