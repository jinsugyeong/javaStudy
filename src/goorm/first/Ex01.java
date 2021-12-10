package goorm.first;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		double english[] = new double[3];
		double sum=0;
		
		DecimalFormat f = new DecimalFormat("#.00");
		
		for(int i=0; i<3; i++) {
			english[i] = in.nextDouble();
			sum += english[i];
		}
		
		double avg = sum/english.length;
		
	if(avg>=90) {
			
			System.out.println(f.format(avg) + " A");
		}else if(avg<90 && avg>=80) {
			
			System.out.println(f.format(avg) + " B");
		}else if(avg<80 && avg>=70) {
			
			System.out.println(f.format(avg) + " C");
		}else if(avg<70 && avg>=60) {
			
			System.out.println(f.format(avg) + " D");
		}else {
			System.out.println(f.format(avg) + " F");
		}

		
		
		
	}
}