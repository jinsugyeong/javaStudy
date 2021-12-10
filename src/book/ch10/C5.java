package book.ch10;

import java.util.ArrayList;
import java.util.List;

interface Animal {
	void sound();
}

//Dog 클래스와 Cuckoo 클래스
class Dog implements Animal {
	public void sound() {
		System.out.println("멍멍~~");
	}
}

class Cuckoo implements Animal {
	public void sound() {
		System.out.println("뻐꾹뻐꾹~~");
	}
}



public class C5 {
	
	//printSound() 메서드
	public static<T extends Animal> void printSound(List<T> lists) {
		for(T t: lists) {
			t.sound();
		}
	}

	public static void main(String[] args) {
		List<Animal> lists = new ArrayList<>();
		lists.add(new Dog());
		lists.add(new Cuckoo());
		printSound(lists);
		//콘솔창 결과 : 멍멍~~ , 뻐꾹뻐꾹~~

	}

}
