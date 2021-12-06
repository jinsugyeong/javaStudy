/*
 호텔에는 10개의 객실이 있고, 객실 번호는 1~10번까지이다.
 객실번호와 이름으로 객실을 예약하는 add()메서드, 
 현재 예약된 객실 번호와 고객 이름을 보여주는 show() 메서드가 필요하다.
 */

package book.ch8;

public class C6 {
	public static void main(String[] args) {

		Hotel hotel = new Hotel();
		hotel.add(5, "호돌이");
		hotel.add(7, "길동이");
		hotel.show();
	}
}

class Hotel {

	class Room {
		String[] room = new String[10];

	}

	Room r = new Room();

	void add(int num, String name) {

		r.room[num -1] = name;
	}

	void show() {
		int i = 0;
		for (String a : r.room) {
			if (a != null) {
				System.out.printf("%d번 방을 %s가 예약했습니다.\n", ++i, a);	
			}
			else {
				i++;
			}
		}
	}
	

}

/*
 * 콘솔창결과: 
 * 5번 방을 호돌이가 예약했습니다. 
 * 7번 방을 길동이가 예약했습니다.
 */