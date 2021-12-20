package book.ch12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) {
		
		try(
			//DataOutputSteam과 생성하고, data.dat 파일이 없으면 data.dat파일을 생성한다
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\jinsugyeong\\data.dat"));
			//DataInputStream을 생성한다.
			DataInputStream dis = new DataInputStream(new FileInputStream("C:\\jinsugyeong\\data.dat"));){
			
			
			dos.writeDouble(1.0);
			dos.writeInt(1);
			dos.writeUTF("one");
			
			
			dos.flush();//출력하려고 버퍼의 내용을 비우는 메서드
			
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			
		}catch(IOException e) {
			
		}
		
	}
}
