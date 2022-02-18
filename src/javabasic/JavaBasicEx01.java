package javabasic;
import java.util.ArrayList;
import java.util.List;

class MyCar {
	private String carName;
	private String carColor;
	private int totalMove;
	private int move;
	
	public MyCar() {
		
	}
	
	public MyCar(String carName, String carColor, int totalMove) {
		this.carName = carName;
		this.carColor = carColor;
		this.totalMove = totalMove;
	}

	
	public void addMove(int move) {
		this.move += move;
	}
	public int getMove() {
		
		return totalMove;
		//return move;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public String getCarName() {
		return carName;
	}
	
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	public String getCarColor() {
		return carColor;
	}
	
}

class MyCarMove{
	private String carName;
	private String carColor;
	private List<Integer> move;
	private MyCar myCar;
	
	public MyCarMove() {
		move = new ArrayList<Integer>();
		this.myCar = new MyCar();
	}
	
	public void setCarInfo(String carName, String carColor) {
		this.carName = carName;
		this.carColor = carColor;
		myCar.setCarName(carName);
		myCar.setCarColor(carColor);
	}
	
	public void addMove(int i) {
		if(Integer.valueOf(i)!=null) {
			move.add(i);
		}else {
			move.add(0);
		}
		
		myCar.addMove(i);
	}
	
	public int getTotalMove() {
		int result=0;
		if(move != null) {
		for(int i : move) {
			result += i;
		}
		}
		
		return result;
		//return myCar.getMove();
	}
	

	public int getMove(int i) {
		if(move!=null)return move.get(i);
		else return 0;
	}
	
	public MyCar getMyCar() {		
		MyCar m = new MyCar(this.carName, this.carColor, getTotalMove());
		return m;
		//return myCar;
	}
	
	
}

public class JavaBasicEx01 {

	public static void main(String[] args) {
		/*********************************************************************
		 * 실습. 아래의 구현체를 보고 각 클래스와 메서드를 선언하도록 하여라.
		 *********************************************************************/
		
		MyCarMove mc = new MyCarMove();
		mc.setCarInfo("소나타", "검정");
		mc.addMove(30);
		mc.addMove(60);
		mc.addMove(10);
		
		System.out.println("총 이동 거리 : "+ mc.getTotalMove());	//100
		System.out.println("첫번째 이동거리 : "+ mc.getMove(0));	//30
		
		MyCar m = mc.getMyCar();
		System.out.println("모델 : " + m.getCarName());	//소나타
		System.out.println("색상 : " + m.getCarColor());	//검정
		System.out.println("이 차량의 총 주행거리 : " + m.getMove());	//100

	}

}
