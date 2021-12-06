/*문제1.
문자열 배열에 포함된 원소를 대소문자 구분없이 정렬하는 테스트프로그램을 완성해라*/
package book.ch8;

import java.util.Arrays;
//import java.util.Comparator;

public class C1 {

	public static void main(String[] args) {
		String[] sa = {"K", "o", "r", "e", "a", "n"};
		
		for(String s : sa)
			System.out.println(s+" ");
		System.out.println();
		
		//코드 추가
		/*1. 함수형 인터페이스 이용
		Arrays.sort(sa,new Comparator<String>() {
			public int compare(String x,String y) {
				return x.compareToIgnoreCase(y);
			}
		});*/
		
		/*2. 람다식
		Arrays.sort(sa, (x,y) -> x.compareToIgnoreCase(y));*/
		
		//3. 메서드참조
		Arrays.sort(sa, String::compareToIgnoreCase);
		
		
		for(String s : sa)
			System.out.println(s+" ");
		System.out.println();
	}

}
