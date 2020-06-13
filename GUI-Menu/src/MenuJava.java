import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuJava extends JFrame{	
	
	public MenuJava(){	
		
			super("Usando Menues");
			JMenu fileMenu = new JMenu("Archivo");
			fileMenu.setMnemonic('F');
			
			JMenuItem aboutItem = new JMenuItem("About");
			aboutItem.setMnemonic('A');
			
			fileMenu.add(aboutItem);
			aboutItem.addActionListener(new ActionListener() 
				{public void actionPerformed (ActionEvent event)
				{JOptionPane.showMessageDialog (MenuJava.this, "Acerca de ..."); }});

			JMenuItem exitItem = new JMenuItem("Salir");
			exitItem.setMnemonic('S');
			fileMenu.add(exitItem);

			exitItem.addActionListener( new ActionListener() 
				{public void actionPerformed (ActionEvent event){System.exit(0); }});

			JMenu editMenu = new JMenu("Edición");
			editMenu.setMnemonic('E');
			JMenuItem selectItem = new JMenuItem("Seleccionar");	
			 selectItem.setMnemonic('S');
			editMenu.add(selectItem);

			JMenuItem allSelectItem = new JMenuItem("Seleccionar Todo");
				// reusando el objeto anterior 
				// selectItem = new JMenuItem("Seleccionar Todo"); 
			 allSelectItem.setMnemonic('T');
			editMenu.add(allSelectItem);
			editMenu.addSeparator();

			JMenuItem copyItem = new JMenuItem("Copiar");
			copyItem.setMnemonic('C');
			
			editMenu.add(copyItem);
			JMenuItem pasteItem = new JMenuItem("Pegar");
			pasteItem.setMnemonic('P');
			editMenu.add(pasteItem);
			editMenu.addSeparator();
			JMenu subMenu = new JMenu("Limpiar");
			subMenu.setMnemonic('F');
			JMenuItem contentsItem = new JMenuItem("Contenidos");
			contentsItem.setMnemonic('C');
			subMenu.add(contentsItem);
			contentsItem = new JMenuItem("Formatos");
			contentsItem.setMnemonic('F');
			subMenu.add(contentsItem);
			editMenu.add(subMenu);
			JMenu ownMenu = new JMenu ("Cálculos");
			ownMenu.setMnemonic('C');
			JMenuItem calc = new JMenuItem("Calculadora");
			calc.setMnemonic('C');
			calc.addActionListener( new ActionListener() 
			{public void actionPerformed (ActionEvent event)
				{new Calculadora(); }});
			ownMenu.add(calc);
			JMenuBar bar = new JMenuBar();
			setJMenuBar(bar);
			bar.add(fileMenu);
			bar.add(editMenu);
			bar.add(ownMenu);
				
		}		
}
