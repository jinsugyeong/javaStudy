package book.ch6;

public class C3 {

	public static void main(String[] args) {
		Point p = new Point(1,2);
		MovablePoint m = new MovablePoint(3,4,5,6);
		
		System.out.println(p.toString());
		System.out.println(m.toString());
		

	}

}


class Point {
	private int x,y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	int getX() {
		return x;
	}
	
	int getY() {
		return y;
	}
	
	public String toString() {
		return "("+x+" , "+y+")";
	}
}

class MovablePoint extends Point {
	private int xSpeed,ySpeed;
	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public int getXspeed() {
		return xSpeed;
	}
	
	public int getYspeed() {
		return ySpeed;
	}
	public String toString() {
		return "("+getX()+" , "+getY()+" , "+getXspeed()+" , "+getYspeed()+")";
	}
	
}