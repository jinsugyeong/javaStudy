package book.ch9;

import java.text.MessageFormat;

public class C8 {

	public static void main(String[] args) {
		Object[][] data = {{"세종대왕",1,"조선"}, {"오바마",2,"미국"}, {"징기스칸",3,"몽고"}};
		//MessageFormat 클래스를 이용하는 코드
		
		String s = "이름 : {0}\t\t번호 : {1}\t국적 : {2}";
		for(Object[] k : data) {
			System.out.println(MessageFormat.format(s, k));
		}
	}

}
