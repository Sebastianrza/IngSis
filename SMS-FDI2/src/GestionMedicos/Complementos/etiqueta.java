package GestionMedicos.Complementos;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class etiqueta extends JLabel {
	public etiqueta (String caption, Color color,int tam) {
		super(caption); // se crea la etiqueta
		super.setHorizontalAlignment(SwingConstants.CENTER); // se centra en su rect�ngulo
		setForeground(color); // se le da color a la fuente
		Font fuente = new Font("Arial",Font.ITALIC,tam);
		super.setFont(fuente);
		}
	
	
}
