package book.ch8.again;

import java.util.Arrays;
import java.util.Comparator;

public class C1{

	public static void main(String[] args) {
		String[] sa = {"K", "o", "r", "e", "a", "n"};
		
		for(String s : sa) {
			System.out.println(s + " ");
		}
		System.out.println();
		
		
		/*1. 무명 객체 구현
		Arrays.sort(sa,new Comparator<String>(){
			public int compare(String s1,String s2) {				
				return s1.compareToIgnoreCase(s2);
			}
		});*/
		
/*		2. 람다식
		Arrays.sort(sa, (s1,s2) -> s1.compareToIgnoreCase(s2));*/
		
		//3. 메서드 참조
		Arrays.sort(sa, String::compareToIgnoreCase);
		
		for(String s : sa ) {
			System.out.println(s + " ");
		}
	}

}
