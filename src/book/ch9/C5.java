package book.ch9;

class Dice{
	
	int roll() {
		return (int)(Math.random()*6+1);
	}
}

public class C5 {

	public static void main(String[] args) {
		System.out.println(new Dice().roll());

	}

}
