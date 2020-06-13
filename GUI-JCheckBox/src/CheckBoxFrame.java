import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxFrame extends JFrame implements ActionListener {

	private JTextField TxtIdiomas;
	private JCheckBox ChkIngles;
	private JCheckBox ChkFrances;
	private JCheckBox ChkPortugues;
	private JLabel LblIdiomas;
	private JLabel LblIngles;
	private JLabel LblFrances;
	private JLabel LblPortugues;
	
	public CheckBoxFrame(){
		
		super("CkeckBox");
		setLayout(new FlowLayout());
		
		TxtIdiomas = new JTextField("Indique Idiomas que domina" );
		TxtIdiomas.setFont(new Font("Times New Roman", Font.BOLD,14));
		TxtIdiomas.setEditable(false);
		TxtIdiomas.setBackground(super.getBackground());
		add(TxtIdiomas);
		LblIdiomas = new JLabel("Idiomas seleccionados   ");
		LblIngles = new JLabel("");
		LblFrances = new JLabel("");
		LblPortugues = new JLabel("");
		ChkIngles = new JCheckBox("Ingles");
		ChkIngles.setMnemonic('I');
		
		ItemListener itemListener = new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				
				if(e.getSource() == ChkIngles) 
					
					if(e.getStateChange() == ItemEvent.SELECTED) 
						
						LblIngles.setText("Ingles");
					
					else
						LblIngles.setText("");
				else
					
					if(ChkPortugues.isSelected()) 
						
						LblPortugues.setText("Portugues");
					
					else
						LblPortugues.setText("");
					
			}
		};
		
		ChkIngles.addItemListener(itemListener);	   
		add(ChkIngles);
		ChkFrances = new JCheckBox("Frances");
		ChkFrances.setMnemonic('F');
		ChkFrances.addActionListener(this);	
		
		add(ChkFrances);
		ChkPortugues = new JCheckBox("Portugues");
		ChkPortugues.setMnemonic('P');
		ChkPortugues.addItemListener(itemListener);     
		add(ChkPortugues);
		add(LblIdiomas);
		add(LblIngles);
		add(LblFrances);
		add(LblPortugues);
		
	}						
		
	public void actionPerformed (ActionEvent e)	
	{	if (e.getSource() == ChkFrances)		 // no es necesario
	{  LblFrances.setText( ( (ChkFrances.isSelected()) ? "Frances " : "") ); } 
	}

}
