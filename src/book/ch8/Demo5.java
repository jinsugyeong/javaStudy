
package book.ch8;

public class Demo5 {

	public static void main(String[] args) {
		/*인터페이스는 구현클래스로 객체를 만든 다음에 그 객체참조변수로 메서드를 호출해야하는데
		 * 1개의 추상 메서드로 구성된 인터페이스(=함수형 인터페이스) 구현 객체만 람다식으로 표현할 수 있다.
		 람다식 = 함수형 인터페이스를 연산식 형태로 표현한것
		 메서드 참조 = 이미 정의된 메서드만 표현할 수 있는 람다식의 축약형*/
		
		
		Showable s = System.out::println; //System.out -> 클래스이름, println-> 정적메서드
		//Showable s = str -> System.out.println(str);  
		s.show("잘 있어");
		
		Pickabel p = String::charAt;
		//Pickabel p = (x,y) -> x.charAt(y); x문자열의  y번째 문자 반환
		System.out.println(p.pick("여보세요", 2));
		
		Utils u = new Utils();
		Operable o = u::add;
		//Operable o = (x,y) -> u.add(x, y); u객체참조변수의 add메서드에 x,y라는 매개변수를 넣어라가 o가 되는건가....
		System.out.println(o.operator(20,30));
		
		NewString n = String::new; //String 클래스 생성자 참조
		//NewString n = (x) -> new String(x);
		System.out.println(n.getString("사과"));
		
		IntArray a = int[]::new; //배열 생성자 참조
		//IntArray a = x -> new int[x];
		int[] array = a.getArray(2);
		array[0] = 0;
		array[1] = 1;
		
		for(int i : array) {
			System.out.print(i+" ");
		}
		
		

	}

}


//메서드 참조를 위한 인터페이스와 클래스 
interface Showable {
	void show(String s);
}

interface Pickabel {
	char pick(String s1, int i); 
}

interface Operable {
	int operator (int x, int y); 
}

interface NewString {
	String getString(String s);
}

interface IntArray {
	int[] getArray(int size);
}

class Utils {
	int add(int a, int b) {
		return a+b;
	}
}