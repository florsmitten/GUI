import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo {

	private JFrame f;
	private JButton b1, b2, b3, b4, b5;
	
	public GridLayoutDemo() {
		
		f = new JFrame("GridLayoutDemo");
		b1 = new JButton("Button 1" );
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		b4 = new JButton("Long-Named Button 4");
		b5 = new JButton("Button 5");
	}
	
	public void agregoComp() {
		
		f.setLayout(new GridLayout(2,3));
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.pack();
		f.setVisible(true);
	}
}
