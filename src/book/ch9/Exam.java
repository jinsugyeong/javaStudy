package book.ch9;


import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;



class Car {
	private String model;
	Car(String model) {
		this.model = model;
		
	}
	public String toString() {
		return model;
		
	}
}


public class Exam {

	public static void main(String[] args) {
		Car myCar = new Car("그랜저");
		Car yourCar = new Car("그랜저");
		
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		String pattern = "날짜: {1}, 자동차 모델=[{0}], 운전자(홍길동)";
		
		String ss = MessageFormat.format(pattern, myCar.toString(), sf.format(new Date()));
		StringTokenizer str = new StringTokenizer(ss,",:=[]() ",true);
		
		String re = null;
		if(myCar.toString().equals(yourCar.toString())) {
			System.out.printf("자동차 모델이 둘 다 [%s]로 동일하다.\n",myCar.toString());
			System.out.println(MessageFormat.format(pattern, myCar.toString(), sf.format(new Date())));
		}else {
			System.out.printf("내 자동차는 [%s], 너 자동차는 [%s]로 모델이 다르다.",myCar.toString(),yourCar.toString());
		}
		System.out.println();
		

		while(str.hasMoreTokens()) {
			String s = str.nextToken();
			if(s.length() > 1)
				System.out.println(s);
		}
		

	}


}
