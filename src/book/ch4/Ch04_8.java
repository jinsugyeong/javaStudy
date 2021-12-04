package book.ch4;
/*class Dice{
	static int[] face= {1,2,3,4,5,6};
	
	public static int roll() {
		int r = 0;
		if(Math.random()<0.2) {
			r = face[0];
		}else if(Math.random()<0.3) {
			r = face[1];
		}else if(Math.random()<0.4) {
			r = face[2];
		}else if(Math.random()<0.5) {
			r = face[3];
		}else if(Math.random()<0.6) {
			r = face[4];
		}else {
			r = face[5];
		}
		return r;
	}
}*/

class Dice{
	static double face;
	
	public int roll() {
		face = ((Math.random() * 10 % 6) +1);
		return (int)face;
		
	}
}
public class Ch04_8 {

	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println("주사위 숫자 : " + d.roll());
		

	
	}

}
