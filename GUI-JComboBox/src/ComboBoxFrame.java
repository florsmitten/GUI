import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxFrame extends JFrame {
	
	private JTextField txtProv;
	private JLabel lblProv;
	private JComboBox cmbProv;

	public ComboBoxFrame (){
		
		super("Combo Box");
		setLayout(new FlowLayout());
		final String strProv[] = {" ", "Buenos Aires", "Santa Fe", "Cordoba", "Mendoza", "San Juan","Entre Ríos"};
		txtProv = new JTextField("Indique Provincia");
		txtProv.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtProv.setEditable(false);
		txtProv.setBackground(super.getBackground());
		
		lblProv = new JLabel("Provincia: ");
		
		cmbProv = new JComboBox(strProv);
		cmbProv.setMaximumRowCount(3);
		
		ItemListener itemListener = new ItemListener() {
			
		      public void itemStateChanged(ItemEvent e){  
		    	  
		    	  if (cmbProv.getSelectedIndex()!=0)
		    		  if (e.getStateChange() ==  ItemEvent.SELECTED)
		    	     	lblProv.setText("Provincia: " + strProv[cmbProv.getSelectedIndex()]);
		    	  } 
		};
		
    	cmbProv.addItemListener(itemListener);
    	add(txtProv);
    	add(cmbProv);
    	add(lblProv);
	}
}
