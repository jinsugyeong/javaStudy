package book.ch6;

public class C2 {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 22);
		Student s = new Student("황진이",23,100);
		ForeignStudent f = new ForeignStudent("Amy",30,200,"U.S.A");
		
		Person[] array = {p,s,f};
		
		for(Person i : array ) {
			i.show();
		}

	}

}

class Person {
	private String name;
	private int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	void show() {
		System.out.printf("사람[이름: %s, 나이: %d]\n",name,age);
	}
}

class Student extends Person {
	private int num;
	
	Student(String name, int age,int num) {
		super(name,age);
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	void show() {
		System.out.printf("학생[이름: %s, 나이: %d, 학번: %d]\n",getName(),getAge(),getNum());
	}
}

class ForeignStudent extends Student {
	private String nation;
	
	ForeignStudent(String name, int age,int num, String nation){
		super(name,age,num);
		this.nation = nation;
	}
	
	public String getNation() {
		return nation;
	}
	
	void show() {
		System.out.printf("외국학생[이름: %s, 나이: %d, 학번: %d, 국적: %s]\n",getName(),getAge(),getNum(),getNation());
	}
}