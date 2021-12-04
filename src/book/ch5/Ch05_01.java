package book.ch5;
public class Ch05_01 {

	public static void main(String[] args) {
		//문자열 s에 포함된 문자 c의 개수를 반환 하도록, cahrAt() 메서드 이용
		

	
		System.out.println(	countChar("javazzdfsdaffadg jjwfihewldjf",'a'));
	}
	
	static int countChar(String s, char c) {
		
		int re=0;		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == c) {
				re++;
			}
		}
		
		return re;
		
	}

}
