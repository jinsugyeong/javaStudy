package book.ch10;

import java.util.Arrays;

public class Exam {
	
	/*매개변수를 각자 클래스 타입으로 했을 때
	 * static EnglishScore findBest(EnglishScore[] a) {		
		//점수가 최고인 학생의 이름과 영어 점수를 반환 하는 코드
		Arrays.sort(a, EnglishScore::compareTo);
		EnglishScore best = a[0];
		return best;
	}
	
	static MathScore findBest(MathScore[] a) {
		Arrays.sort(a, MathScore::compareTo);
		MathScore best = a[0];
		return best;
	}*/
	
	//제너릭 메서드
	static <T extends Comparable> T findBest(T[] a) {
		Arrays.sort(a, T::compareTo);
		T best = a[0];
		return best;
	}
	
	static <T> T findScore(T[] a, String name) {
		//주어진 name을 포함하는 배열 a의 원소를 반환하는 코드
		
		for(T tt : a ) {
			String s = tt.toString().substring(0, 3);
			if(s.equals(name)) {
				return tt;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		String name= "장영실";
		
		EnglishScore[] ea = {new EnglishScore("김삿갓",77), new EnglishScore("장영실",88), new EnglishScore("홍길동",99)};
		System.out.println("영어 최고 점수 : " + findBest(ea));
		
		MathScore[] ma = {new MathScore("김삿갓",80), new MathScore("장영실",98), new MathScore("홍길동",70)};
		System.out.println("수학 최고 점수 : " + findBest(ma));
		
		
		System.out.println(ma[0].toString().substring(0, 3));
		
		if(name != null) {
			System.out.println("영어\t점수 : "+findScore(ea,name));
			System.out.println("수학\t점수 : "+findScore(ma,name));
		}else {
			System.out.println("명령행 인자가 없습니다.");
		}
	}

}

class EnglishScore implements Comparable<EnglishScore> {
	String name;
	int score;
	
	//생성자
	EnglishScore(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		//이름과 점수로 구성된 문자열을 반환하는 코드
				return name+ ", " + score;
	}

	@Override
	public int compareTo(EnglishScore e) {
		//2개의 EnglishScore 객체를 비교하는 코드
		EnglishScore eg = e;
		return eg.score - this.score;
		
	}
}

class MathScore implements Comparable<MathScore>{
	String name;
	int score;
	
	MathScore(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		//이름과 점수로 구성된 문자열을 반환하는 코드
				return name+ ", " + score;
	}
	
	@Override
	public int compareTo(MathScore m) {
		MathScore mt = m;
		return mt.score - this.score;
		
	}
	
	
}