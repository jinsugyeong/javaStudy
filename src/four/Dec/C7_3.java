package four.Dec;

import java.util.Arrays;

public class C7_3 {

	public static void main(String[] args) {
		
		Book[] b = {new Book(15000), new Book(50000), new Book(20000)};
		
		System.out.println("정렬 전");
		for (Book i : b) {
			i.show();
		}
		
		
		/*막힌 부분 : b 라는 객체배열안에 있는 객체의 필드를 비교해야하는데...
		 * int타입의 배열을 만들어서 대입할 수도 있지만 
		 * Comparable과(자바가 제공하는 기본 인터페이스) 
		 * comparTo() 메서드(Object를 매개변수로 사용하고 내가 써줘야함)를 사용해야한다
		 
		int[] a = new int[3];
		for(int j =0; j<b.length; j++) {
			a[j] = b[j].price;
		}
		
		Arrays.sort(a);
		
		for(int j =0; j<b.length; j++) {
			b[j].price = a[j];
		}*/
		
		
		
		
		
		
		Arrays.sort(b); //import 필요..
			
		System.out.println("정렬 후");
		
		for (Book i : b) {
			//for-each문은 모든 멤버를 다 사용하니간...
			i.show();
		}

	}

}
// Book클래스 -int 타입의 price 필드, 생성자, 필요한 메서드 포함
// 테스트 프로그램 - 3개의 Book 객체로 구성된 Book 배열을 사용해 가격 순서대로 정렬한 후 출력한다.
// 배열 정렬 메서드 -> Arrays.sort()


class Book implements Comparable{
	int price;
	
	Book(int price){
		this.price = price;
	}
	
	void show() {
		System.out.println("Book [price="+price+"]");
	}
	
	@Override
	public int compareTo(Object o) {
		Book b = (Book) o;
		if(this.price > b.price) {
			return 1; //두 객체 자리 변경 
		}else if(this.price == b.price) {
			return 0; //두 객체 자리 유지
		}else {
			return -1; //두 객체 자리 유지
		}
		
	}
}