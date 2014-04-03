package pratice.lesson11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class TestPanel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("ÊµãËØïÁ™óÂè£");
		Panel p=new Panel();
		p.add(new TextField(20));
		p.add(new Button("ÂçïÂáªÊàë"));
		f.add(p);
		f.setBounds(30, 30, 350, 120);
		f.setVisible(true);
	}

}
