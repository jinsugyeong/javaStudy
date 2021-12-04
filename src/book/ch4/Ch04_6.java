package book.ch4;
class Complex {
	public String num;
	
	public Complex(double x) {
		num = x + " + 0.0i";
	}
	
	public Complex(double x,double y) {
		num = x + " + " + y + "i";
	}
	
	public String print() {
		return num;
	}
}
public class Ch04_6 {

	public static void main(String[] args) {
		
		Complex c = new Complex(2.0);
		System.out.println(c.print());
		
		Complex c2 = new Complex(1.5, 2.5);
		System.out.println(c2.print());
		

	}

}
//2.0 + 0.0i
//1.5 + 2.5i