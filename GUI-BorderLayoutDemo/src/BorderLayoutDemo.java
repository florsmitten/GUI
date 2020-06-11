import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {

	private JFrame f;
	private JButton bn, bs, bw, be, bc;
	
	public BorderLayoutDemo() {
		
		f = new JFrame("BorderLayoutDemo");
		bn = new JButton("Button 1 (PAGE_START) ");
		bc = new JButton("Button 2 (LINE_START)");
		bw = new JButton("Button 3 (CENTER)");
		bs = new JButton("Long-Named Button 4 (PAGE_END)");
		be = new JButton("Button 5 (LINE_END)");
	}
	
	public void agregoComp() {
		
		f.add(bn, BorderLayout.NORTH);
		f.add(bs, BorderLayout.SOUTH);
		f.add(bw, BorderLayout.WEST);
		f.add(be, BorderLayout.EAST);
		f.add(bc, BorderLayout.CENTER);
		f.setVisible(true);
	}
}
