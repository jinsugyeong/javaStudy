package book.ch6;

public class Lesson6_1 {

	public static void main(String[] args) {
		//1~10 짝수 출력
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int i;
		

		
		for(i=0; i<10; i++) {
			if(a[i]%2 == 1) {
				continue;
			}
			System.out.println(a[i]);
		}

	}

}
