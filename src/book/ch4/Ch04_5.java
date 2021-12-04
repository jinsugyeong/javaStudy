package book.ch4;
class Line {
	public int rlfdl;
	
	public Line(int x) {
		rlfdl = x;
	}
	public boolean isSameLine(Line x) {
		return rlfdl == x.rlfdl;
	}
}
public class Ch04_5 {

	public static void main(String[] args) {
		
		
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a == b);

	}

}
