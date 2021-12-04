package book.ch3;
import java.util.Scanner;

public class Ch03_coding {

	public static void main(String[] args) {
		
		
		/*1��
		Scanner in = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = in.nextInt();
		
		if (age >= 19) {
			System.out.println("����");
		} else {
			System.out.println("�̼���");
		}
*/
		
/*		2��
		Scanner in = new Scanner(System.in);
		System.out.print("����� �Է��ϼ��� : ");
		int r = in.nextInt();
		
		switch(r) {
			case 1:
				System.out.println("���� ���߽��ϴ�.");
				break;
			case 2:
			case 3:
				System.out.println("���߽��ϴ�.");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("�����Դϴ�.");
				break;
			default:
				System.out.println("����ؾ߰ڽ��ϴ�.");
		}
		*/
		
		
/*		3��
		Scanner in = new Scanner(System.in);
		int even = 0;
		
		do {
			System.out.print("���� ������ �Է��ϼ��� : ");
			int x = in.nextInt();
			
			if(x%2 == 0) {
				even += x;
			}else if (x <= 0) {
				break;
			}
			
		}while (true);
		System.out.println("�Է��� ���� ���� �߿��� ¦���� ���� " + even);
		*/
		
		
/*		4��
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
			
		}
*/		
		
		
		
		int a, b, c;
		
		for (a = 1; a <10; a++) {
			for (b = 1; b <10; b++) {
				for (c = 1; c <10; c++) {
					if ((a * a + b * b == c * c) && (a + b + c <= 20)) {
						System.out.printf("a = %d b = %d c = %d",a,b,c);
						System.out.println();
						} 
					} 
				} 
			}

		
		
	}

}
