import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		String sPrimerNro = JOptionPane.showInputDialog("Ingrese el primer n�mero");
		String sSegundoNro = JOptionPane.showInputDialog("Ingrese el segundo n�mero");
		
		int PrimerNro = Integer.parseInt(sPrimerNro);
		int SegundoNro = Integer.parseInt(sSegundoNro);
		int suma = PrimerNro+SegundoNro;
		
		JOptionPane.showMessageDialog(null, "El resultado es:" + suma, "Suma de Enteros", JOptionPane.PLAIN_MESSAGE);
	}
}
