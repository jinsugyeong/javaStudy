package book.ch8.again;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class C7 {

	public static void main(String[] args) {
		new JFrame().setVisible(true);
		
		/*1. 지역클래스
		 * class HiEvent implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("안녕!");
				
			}
			
			
		}
		//import가 잘못되었음 확장 패키지로 불러와야함 javax.swing.Timer;
		ActionListener action = new HiEvent(); 
		
		Timer t = new Timer(1000, action);
		t.start();*/
		
		
		/*2. 무명객체
		 * Timer t = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("안녕!");
				
			}
		});
		
		t.start();*/
		
		//3. 람다식
		Timer t = new Timer(1000, (e) -> System.out.println("안녕!"));
		t.start();

	}

}
