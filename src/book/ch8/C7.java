/*문제7번. 포기... 무슨말인지 이해안됨...
다음은 1초마다 "안녕!"메시지를 출력하는 프로그램이다.
코드를 지역클래스,무명 객체,람다식을 사용해 완성하시오.
버튼 클릭같은 이벤트 처리-ActionListener인터페이스
시간에맞추어 이벤트를 발생하는 javax.swing.Timer 클래스
*/
package book.ch8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.management.timer.Timer;
import javax.swing.JFrame;

public class C7 {

	public static void main(String[] args) {
		new JFrame().setVisible(true); //import 필요
		
		class HiEvent implements ActionListener { //지역클래스

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("안녕!");
				
			}
			
		}
		
		
		ActionListener action = new HiEvent();
		
		//Timer t = new Timer(1000, action);
		//t.start();
		
		

	}

}
