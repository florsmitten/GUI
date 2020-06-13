import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonFrame extends JFrame {
	
	private JTextField txtSexo;
	private JLabel LblSexo;
	private JRadioButton rdbFemenino;
	private JRadioButton rdbMasculino;
	private JRadioButton rdbOcultoSex;		
	private ButtonGroup grpSexo;

	public RadioButtonFrame (){	
		
		super("Radio Button");
		setLayout(new FlowLayout());
		
		txtSexo = new JTextField("Indique Sexo");
		txtSexo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtSexo.setEditable(false);
		txtSexo.setBackground(super.getBackground());
		
		LblSexo = new JLabel("Sexo: ");
		
		rdbFemenino = new JRadioButton("Femenino");
		rdbFemenino.setMnemonic('F');
		
		rdbMasculino = new JRadioButton("Masculino");
		rdbMasculino.setMnemonic('M');
		
		rdbOcultoSex = new JRadioButton("");
		rdbOcultoSex.setVisible(false);
		grpSexo = new ButtonGroup();
		grpSexo.add(rdbFemenino);
		grpSexo.add(rdbMasculino);
		grpSexo.add(rdbOcultoSex); 
		
		ItemListener itemListener = new ItemListener() {
			
		      public void itemStateChanged(ItemEvent e){  	
		    	  
		    	  if (e.getSource()==rdbFemenino)
						
		    		  if (e.getStateChange() ==  ItemEvent.SELECTED)
		    			  
							LblSexo.setText("Sexo: " + rdbFemenino.getText());
		    	  
		    		  else
		    			  
		    			  	LblSexo.setText("Sexo: " + rdbMasculino.getText());
		    	  else
		    		  
			  			LblSexo.setText("Sexo: " + rdbMasculino.getText());
		     }   
		};
		
		rdbFemenino.addItemListener(itemListener);
		rdbMasculino.addItemListener(itemListener);
		
		add(txtSexo);
		add(rdbFemenino);
		add(rdbMasculino);
		add(rdbOcultoSex);
		add(LblSexo);
}}
	

