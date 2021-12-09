package book.ch9;

import java.text.MessageFormat;

public class C2 {

	public static void main(String[] args) {
		System.out.println(new Student("김삿갓")); //학생[김삿갓]
		System.out.println(new Student("홍길동"));

	}

}
class Student {
	String name;
	Student(String name){
		this.name = name;
		
	}
	public String toString() { //String클래스 메서드 오버라이딩..?
		return "학생["+name+"]";
	}

}