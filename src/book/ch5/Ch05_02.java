package book.ch5;

public class Ch05_02 {

	public static void main(String[] args) {
		System.out.println(sum(1,2,3));
		int arr[] = {2,3};
		System.out.println(sum(1, arr));

	}
	
	public static int sum(int j, int...x) {
		int sum=0;
		
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		
		return sum;
	}

}
