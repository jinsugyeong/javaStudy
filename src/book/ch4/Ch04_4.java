package book.ch4;
class Car {
	public static String color;
	public static int numOfCar;
	public static int numOfRedCar;
	public Car(String x) {
		color = x;
		numOfCar++;
		if(color.equalsIgnoreCase("red")) {
			numOfRedCar++;
		}
	}
	public static int getNumOfCar() {
		return numOfCar;
	}
	
	public static int getNumOfRedCar() {
		
		return numOfRedCar;
	}
}
public class Ch04_4 {

	public static void main(String[] args) {
		
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
		

	}

}
