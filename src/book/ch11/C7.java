package book.ch11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C7 {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "a", "b", "c"};
		String[] s2 = {"c"};
		
		
		//두 배열을 Collections의 addAll() 메서드를 이용해 HashSet 객체로 생성
		Set<String> set1 = new HashSet<>();
		set1.addAll(Arrays.asList(s1));
		
		Set<String> set2 = new HashSet<>();
		set2.addAll(Arrays.asList(s2));
		
		
		//2개의 HashSet 객체를 출력
		System.out.println("set1 : " + set1);		
		System.out.println("set2 : " + set2);
		
		
		//2개의 HashSet 객체가 동일한지 비교한 값을 출력
		System.out.println("set1과 set2는 같다 : " + set1.equals(set2));
		
		
		//s1에 의한 HashSet이 s2에 의한 HashSet 원소를 모두 포함하는지 출력
		System.out.println("set1은 set2의 모든 원소를 포함한다 : " + set1.containsAll(set2));
		
		
		//2개의 HashSet 합집합과 교집합을 구해서 출력
		Set<String> a = new HashSet<>();
		a.addAll(set1);
		a.addAll(set2);
		System.out.println("합집합 : " + a);
		
		Set<String> b = new HashSet<>(set1);
		b.retainAll(set2);
		System.out.println("교집합 : " + b);

	}

}
