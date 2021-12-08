package book.ch8.again;

public class C6 {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5, "호돌이");
		hotel.add(7, "길동이");
		hotel.show();

	}

}


class Hotel {
	

	class Room extends Hotel {
		String[] h = new String[10];
	}
	
	Room r = new Room();
	
	void add(int num, String name) {
		r.h[num-1] = name;
		
	}
	
	void show() {
		
		for(int i=0; i<10; i++) {
			if(r.h[i] != null)
				System.out.println((i+1)+"번 방을 "+r.h[i]+"가 예약했습니다.");
		}
	}
	
}


