package book.ch12;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		Path p = new File("C:\\jinsugyeong\\number.txt").toPath(); //저 경로에 number.txt가 있고, 행마다 숫자 한자릿수가 기록되어있음
		Stream<String> s = Files.lines(p); //Path객체로 스트림 생성
		s.forEach(x->System.out.println(x));
		
		s = Files.lines(p); //스트림을 위에서 출력하는데 썻기때문에 한번 더 생성해 줘야한다.
		
		s.map(x->number[Integer.parseInt(x)])
		.forEach(x->System.out.print(x + " "));
		//스트림 원소 값에 대응하는 number 배열 값으로 출력한다.

	}

}
