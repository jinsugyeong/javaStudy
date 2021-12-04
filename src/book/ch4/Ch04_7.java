package book.ch4;
class GolfClub {
	static int num;
	static String name;
	
	public GolfClub() {
		num = 7;
	}
	
	public GolfClub(int x) {
		num = x;
	}
	
	public GolfClub(String y) {
		num = 0;
		name = y;
	}
	
	public static void print() {
		if(num == 0) {
			System.out.println(name + "입니다.");
		}else {
			
			System.out.println(num + "번 아이언입니다.");
		}
		
	}
}
public class Ch04_7 {

	public static void main(String[] args) {
		
		GolfClub gsdfdsf = new GolfClub("sdfdsfsdfdsf");
		gsdfdsf. print();
		
		GolfClub g1 = new GolfClub();
		g1. print();
		
		GolfClub g2 = new GolfClub(8);
		g2. print();
		
		GolfClub g3 = new GolfClub("퍼터");
		g3. print();

	}

}
