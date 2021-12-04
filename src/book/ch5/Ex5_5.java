package book.ch5;
import java.util.Scanner;

public class Ex5_5 {

	public static void main(String[] args) {
		// 배열에 정수를 입력하고 평균계산하기
		
		
		int[] score = new int[5];
		
		
		Scanner in = new Scanner(System.in);
		
		
		int i;
		for(i=0; i<5; i++) {
			score[i] = in.nextInt();
		}
		
		int sum=0;
		for(i=0; i<5; i++) {
			
			sum += score[i];
		}
		
		double average = sum / 5;
		System.out.println(average);
		



	}

}
