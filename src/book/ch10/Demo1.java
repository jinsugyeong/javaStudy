package book.ch10;

public class Demo1 {
	public static void main(String[] args) {
		int[] array = {0,1,2};
		
		try {
			
			//array는 3개의 원소만 있응므로 array[3]은 없다. 따라서 예외가 발생한다
			System.out.println(array[3] + "<-- 마지막 원소"); 
			
			//이전 실행문에서 예외가 발생했으므로 이 실행문은 실행하지 않는다
			System.out.println(array[0] + "<-- 첫번째 원소");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열에서 범위를 벗어난 인덱스를 사용할 때 발생되는 예외");
			
		}finally {
				//선택 사양
			System.out.println("예외 발생과 상관없이 항상 실행");			
		}
	
	}
}
