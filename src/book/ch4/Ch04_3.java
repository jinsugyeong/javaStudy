package book.ch4;
class Member {
	private String name;
	private String id;
	private String pw;
	private int age;
	
	public Member(String name, String id, String pw, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String a) {
		this.name=a;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String a) {
		this.id=a;
	}
	
	public String getPw() {
		return pw;
	}
	public void setPw(String a) {
		this.pw=a;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		this.age=a;
	}
	
	public void print() {
		System.out.println(name+id+pw+age);
	}
	
	
}

public class Ch04_3 {

	public static void main(String[] args) {
		
		Member a = new Member("홍길동","id001","pw001",20);
		a.print();
		

	}

}
