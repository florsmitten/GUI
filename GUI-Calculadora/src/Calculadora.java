
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Calculadora implements ActionListener{

	public static final int VENTANA_ANCHO = 275;
	public static final int VENTANA_ALTO = 250;
	public static final int ANCHO_TEXTO = 20;
	public static final FlowLayout ESTILO_LAYOUT = new FlowLayout();
	public static final String LEYENDA = "Calculadora para los datos numéricos. pero" + "sólo divide!";
	
	private JFrame ventana = new JFrame("Calculadora");
	private JTextArea leyenda = new JTextArea(LEYENDA,2,ANCHO_TEXTO);
	
	private JLabel LblDividiendo = new JLabel ("Dividiendo");
	private JTextField TxtDividiendo = new JTextField(ANCHO_TEXTO);
	
	private JLabel LblDivisor = new JLabel ("Divisor");
	private JTextField TxtDivisor = new JTextField(ANCHO_TEXTO);
	
	private JLabel LblCociente = new JLabel ("Cociente");
	private JTextField TxtCociente = new JTextField(ANCHO_TEXTO);
	private JButton btnCalcular = new JButton("Calcular");
	
	public Calculadora() {
		
		ventana.setSize(VENTANA_ANCHO, VENTANA_ALTO);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		leyenda.setEditable(false);
		leyenda.setLineWrap(true);
		leyenda.setWrapStyleWord(true);
		leyenda.setBackground(ventana.getBackground());
		TxtCociente.setEditable(false);
		TxtCociente.setBackground(Color.WHITE);
		btnCalcular.addActionListener(this);
		ventana.setLayout(ESTILO_LAYOUT);
		ventana.add(leyenda);
		ventana.add(LblDividiendo);
		ventana.add(TxtDividiendo);
		ventana.add(LblDivisor);
		ventana.add(TxtDivisor);
		ventana.add(LblCociente);
		ventana.add(TxtCociente);
		ventana.add(btnCalcular);
		ventana.setVisible(true);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String StrDividiendo = TxtDividiendo.getText();
		double dividiendo = Double.parseDouble(StrDividiendo);
		
		String StrDivisor = TxtDivisor.getText();
		double divisor = Double.parseDouble(StrDivisor);
		
		double Dbl_Cociente = dividiendo/divisor;
		
		String output = String.valueOf(Dbl_Cociente);
		TxtCociente.setText(output);
	}

	
	
}