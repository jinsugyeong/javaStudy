package book.ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C5 {

	public static void main(String[] args) {
		
		List<Integer> score = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("점수를 입력하세요 : ");
			int s = in.nextInt();			
			
			if(s<0) {
				break;
			}
			score.add(s);
		}

		System.out.printf("전체 학생은 %d명이다.\n", score.size());
		System.out.print("학생들의 성적 : ");
		for(int i : score) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		int max = Collections.max(score);
		String rank=null;
		
		
		
		for(int i =0; i<score.size(); i++) {
			
			if(score.get(i) >= max-10) {
				rank="A";
			}else if(score.get(i) >= max-20) {
				rank="B";
			}else if(score.get(i) >= max-30) {
				rank="C";
			}else if(score.get(i) >= max-40) {
				rank="D";
			}else {
				rank="F";
			}
			
			System.out.printf("%d번 학생의 성적은 %d점이며 등급은 %s이다.\n", i+1, score.get(i),rank);
		}			
		
	}

}
