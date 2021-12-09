package book.ch10;

import java.util.Arrays;

public class Exam2 {
	
	
	static <T extends Comparable> T findBest(T[] a) {
		Arrays.sort(a, T::compareTo);
		T best = a[0];
		return best;
	}
	
	public static void main(String[] args) {
		T[] ea = {new T("김삿갓",77), new T("장영실",88), new T("홍길동",99)};
		System.out.println("영어 최고 점수 : " + findBest(ea));
		
		T[] ma = {new T("김삿갓",80), new T("장영실",98), new T("홍길동",70)};
		System.out.println("수학 최고 점수 : " + findBest(ma));


	}

}


class T implements Comparable<T>{
	String name;
	int score;
	
	T(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		//이름과 점수로 구성된 문자열을 반환하는 코드
				return name+ ", " + score;
	}
	
	@Override
	public int compareTo(T t) {
		T ts = t;
		return ts.score - this.score;
		
	}
	
	
}