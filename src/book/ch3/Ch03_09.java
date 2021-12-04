package book.ch3;

public class Ch03_09 {

	public static void main(String[] args) {
		// 다음은 foo() 메서드가 빠진 프로그램 일부와 실행 결과이다. foo() 메서드를 완성하시오
		foo("안녕", 1);
		foo("안녕하세요", 1,2);
		foo("잘 있어");
	}
	
	public static void foo(String a, int b) {
		System.out.println(a + b);
	}
	public static void foo(String a, int b, int c) {
		System.out.println(a + b + c);
	}
	public static void foo(String a) {
		System.out.println(a);
	}

}

/*실행결과
안녕 1
안녕하세요 1 2
잘 있어
*/