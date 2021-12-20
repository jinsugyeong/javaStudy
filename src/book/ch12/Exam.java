package book.ch12;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Exam {

	public static void main(String[] args) {
		String fileName = "C:\\jinsugyeong\\file.txt";
		
		try {
			byte[] buf = new byte[100];
			
			//코드추가
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			//1바이트 = 8비트 , 영자 1자, 숫자 2자 표현 가능
			bis.read(buf); // 1바이트씩 읽어 바이트배열에 저장한 후 , 읽은 개수= 22
			for(byte b:buf) {
				System.out.print((char)b);
			}
			fis.close();
			bis.close();
			
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			System.out.println();
			System.out.println();
			
			String str;
			while ((str=br.readLine()) != null) {
				System.out.println(str);
			}
			fr.close();
			br.close();
			
			File f = new File(fileName);
			//Path fs = f.toPath();
			Files.lines(f.toPath()).forEach(x->System.out.println(x));
			
			
		}catch(FileNotFoundException ex) {
			System.out.println(fileName + "파일을 열 수 없습니다.");
		}catch(IOException ex) {
			System.out.println(fileName + "파일을 읽을 수 없습니다.");
		}

	}

}
