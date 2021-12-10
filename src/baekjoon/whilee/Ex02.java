package baekjoon.whilee;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b=0;
		int c=0;
		int d=a;

		
		if(a<10) {
			a = Integer.parseInt(0+""+a);
		}
		
		while(true) {
			b = a/10 + a%10;
			System.out.println(b+"<--b값");
			a = Integer.parseInt((a%10)+""+(b%10));
			System.out.println(a+"<--a값");
			
			c++;
			
			if(a==d) {
				break;
			}
			
		}
		
		System.out.println(c);
		
	}

}
