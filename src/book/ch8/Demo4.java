//Demo3의 Arrays.sort 인수부분 람다식으로 바꿔주기
package book.ch8;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		String[] strings = {"로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다."};
		
		Arrays.sort(strings, (first, second) -> first.length() - second.length());
		//람다식으로 두 문자열 길이를 뺄셈해 비교한다.
		
		for(String s : strings) {
			System.out.println(s);
		}
		
		

	}

}
