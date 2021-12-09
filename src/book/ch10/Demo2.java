package book.ch10;

public class Demo2 {
	
	static class Utils {
		//Number 클래스의 자식 타입으로 제한한다.
		public static <T extends Number> void showArray(T[] a) {
			for(T t : a) {
				System.out.println(t + " ");
			}
			System.out.println();
		}
		
		public static <T> T getLast(T[] a) {
			return a[a.length-1];
		}
	}

	public static void main(String[] args) {
		Integer[] ia = {1,2,3,4,5};
		Character[] ca = {'H', 'E', 'L', 'L', 'O'};
		
		Utils.showArray(ia); //제네릭 메서드의 구체적 타입을 생략해도 된다.
		//Utils.<Character>showArray(ca); 컴파일 오류 <- 타입매개변수를 제한해둬서
		
		System.out.println(Utils.getLast(ia));

	}

}
