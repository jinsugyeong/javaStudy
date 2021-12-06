/*문제8번.
 일반적으로 무명 클래스는 새롭게 추가한 멤버를 사용할 수 없다.
 그러나 다음 코드는 부모 타입에 대입하기 전에 자식인 무명 객체가
 setRadius() 메서드를 호출한다.
 Shape 및 C8 클래스를 완성하시오.
 메서드 연속 호출을 참조한다. 
 인터페이스 구현 객체의 반환 값과 인터페이스 구현 객체에 setRadius()메서드를
 호출한 반환값은 모두 Shape 타입이다. 
 */
package book.ch8;


interface Shape {
	public abstract double getArea();
	
	default public void printArea() {
		System.out.println("도형의 넓이 = " + getArea());
	}
}

public class C8 {

	public static void main(String[] args) {
		Shape s = (new Shape() {
			//코드 추가
			double r;
			
			@Override
			public double getArea() {
				return r*r*3.14;
			}

			public Shape setRadius(int r) {
				this.r = r;
				return this;
			}
		}).setRadius(5);
		s.printArea(); //도형의 넓이 = 78.5

	}

}
