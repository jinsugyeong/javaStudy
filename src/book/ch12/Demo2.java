//버퍼의 유무에 따라 iexplorer.exe 파일을 복사하는 시간을 비교 -> 3배 더 걸림ㅎ 
package book.ch12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		long start, end, duration;
		String org = "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe";
		String dst = "C:\\jinsugyeong\\iexplore1.exe";
		
		start = System.nanoTime();
		
		try(BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream(org));
			BufferedOutputStream bos = 
				new BufferedOutputStream(new FileOutputStream(dst));){
			
			//available() 읽을 수 있는 바이트 개수 반환 메서드
			while(bis.available() > 1) {
				int b = bis.read();
				bos.write(b);
			}
			
			bos.flush();
				
				
		}catch(IOException e) {
			
		}
		end = System.nanoTime();
		duration = end - start;
		System.out.println("버퍼를 사용한 경우 : " + duration);
		
		
		start = System.nanoTime();
		try(FileInputStream fis = new FileInputStream(org);
			FileOutputStream fos = new FileOutputStream(dst);){
			
			while(fis.available() > 1) {
				int b = fis.read();
				fos.write(b);
			}
			fos.flush();
			
			
		}catch(IOException e) {
			
		}
		end = System.nanoTime();
		duration = end - start;
		System.out.println("버퍼를 사용하지 않은 경우 : " + duration);

	}

}
