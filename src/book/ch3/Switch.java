package book.ch3;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int year, month, days=0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �⵵�� �Է��ϼ��� : ");
		year = in.nextInt();
		System.out.print("���� ���� �Է��ϼ��� : ");
		month = in.nextInt();
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				if (((year%4 == 0) && !(year%100 == 0)) || (year%400 == 0))
					days = 29;
				else
					days = 28;
				break;
			default:
				System.out.println("�߸��� ���Դϴ�.");
				break;
					
		}
		System.out.printf("%d�� %d���� %d�ϱ��� �Դϴ�.", year, month, days);
		
	}

}
