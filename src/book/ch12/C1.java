package book.ch12;

import java.io.File;

public class C1 {
	public static void main(String[] args) {
		//C:\jinsugyeong\file.txt 파일의 유무를 출력하는 프로그램
		
		String fileName = "C:\\jinsugyeong\\file.txt";
		//File클래스에 존재유무를 boolean값으로 반환해주는 exists() 메서드이용
		File f = new File(fileName);
		
		if(f.exists()) {
			System.out.println("파일이 존재합니다");
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
}
