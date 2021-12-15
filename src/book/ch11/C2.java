package book.ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name =name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+" : "+age;
		
	}
	
}

public class C2 {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 35));
		
		//HashSet은 원소의 중복 여부를 hashCode()와 equals() 메서드를 이용해 판단한다.
		for(Person s : set) {
			System.out.println(s);
		}
		
		Iterator<Person> iterator = set.iterator();
		while(iterator.hasNext()) {
		Person p = iterator.next();
		System.out.printf("Person[%s, %d] ", p.name, p.age);
		}
		
		
		
		
		
	}

}
