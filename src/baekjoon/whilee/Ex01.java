package baekjoon.whilee;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*
		int a = in.nextInt();
		int b = in.nextInt();
		
		while(a!=0 && b!=0) {
			System.out.println(a+b);
			a = in.nextInt();
			b = in.nextInt();
		}*/
		
		while(true) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			
			
			if(a==0 && b==0) {
				break;
			}
			
			System.out.println(a+b);
		}
		
	}

}
