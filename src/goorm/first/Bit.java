package goorm.first;

import java.util.Scanner;

public class Bit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int input2 = in.nextInt();
				
		System.out.println(input >> input2);
		System.out.println(input << input2);

	}

}
