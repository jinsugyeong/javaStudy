package javabasic;

public class JavaBasicEx1 {

	public static void main(String[] args) {
		
		//실습. 아래의 배열 담긴 값의 평균을 구하여 출력하여라.
		//실습2. 아래의 배열의 합산값의 원소 백분율을 구하시오. 
		//(원소/전체*100)
		int[] inArray = {13,25,33,45,55};
		//int sum=0;로 선언하면 캐스팅이 필요
		double sum=0;
		double avg=0;
		
		
		for(int i: inArray) {
			sum += i;
		}
		avg = sum / inArray.length;
		System.out.println(avg + " <-- 평균");
		
		System.out.println("\n원소 백분율");
		for(int j :inArray) {
			System.out.println(Math.round(j/sum*100)+"%");
		}
		

	}

}
