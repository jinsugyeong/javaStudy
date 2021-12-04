package book.ch5;
import java.util.Scanner;

public class Ch05_05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] num = new int[10];
		int[] hist = new int[10];
		
		System.out.println("숫자를 10개 입력하세요.");
		for(int i=0; i<num.length; i++) {
			num[i] = in.nextInt();	
			
			if(num[i]>=0 && num[i]<10) {
				hist[0]++;
			} else if(num[i]>=10 && num[i]<20) {
				hist[1]++;
			} else if(num[i]>=20 && num[i]<30) {
				hist[2]++;
			} else if(num[i]>=30 && num[i]<40) {
				hist[3]++;
			} else if(num[i]>=40 && num[i]<50) {
				hist[4]++;
			} else if(num[i]>=50 && num[i]<60) {
				hist[5]++;
			} else if(num[i]>=60 && num[i]<70) {
				hist[6]++;
			} else if(num[i]>=70 && num[i]<80) {
				hist[7]++;
			} else if(num[i]>=80 && num[i]<90) {
				hist[8]++;
			} else if(num[i]>=90 && num[i]<100) {
				hist[9]++;
			}else {
				
			}
			
		}
		
		for(int i=0; i<hist.length; i++) {
			System.out.print((i*10)+"~"+(i*10+9)+" : ");
			for(int j=0; j<hist[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		

	}

}
