package GestionMedicos.Complementos;
import java.awt.Font;
import javax.swing.JButton;

public class button extends JButton {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public button(String caption,int tam)  {
		super(caption); // se crea el bot�n
		super.setHorizontalAlignment(super.CENTER);
		Font fuente = new Font("Arial",Font.ITALIC,tam);
		this.setFont(fuente);
		 
	 }

	
	
}
