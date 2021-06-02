package Ph;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonTest extends Frame{
	public ButtonTest(){ 
		super("익명 클래스 테스트"); // 창의 타이틀
		Button btn = new Button("눌러"); //생성자에게 문자열 넣기
		add(btn);
		setSize(500,500);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("프레임 종료");
				System.exit(0);
			}
			
		});
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("버튼 누름 ");
				
			}
		});
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ButtonTest();
	}
	

}
