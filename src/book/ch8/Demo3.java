//Comparator 인터페이스의 활용
// -3개의 문자열을 Arrays.sort() 메서드를 사용해 문자열의 길이 순서대로 정렬후 출력하기
package book.ch8;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {

	public static void main(String[] args) {
		String[] strings = {"로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다."};
		
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String first, String second) {
				return first.length() - second.length();
			}
			
		});
		
		for(String s : strings) {
			System.out.println(s);
		}
		
		new String().length();

	}

}
