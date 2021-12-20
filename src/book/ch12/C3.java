package book.ch12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C3 {

	public static void main(String[] args) {
		String fileName = "C:\\jinsugyeong\\double.txt";

		File dbTxt = new File(fileName);
		double[] dbArr = { 0, 0, 0, 0, 0 };
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
				DataInputStream dis = new DataInputStream(new FileInputStream(fileName));) {
			
			dbTxt.createNewFile();
			/* 파일 생성 성공 */
			
			for(double d : dbArr) {
				dos.writeDouble(d);
			}
			dos.flush();
			
			for(int i=0;i<5; i++)
				System.out.println();
			
			
			
		} catch (IOException e) {

		}
	}
}
