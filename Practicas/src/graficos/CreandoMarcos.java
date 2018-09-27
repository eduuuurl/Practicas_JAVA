package graficos;
import javax.swing.*;

public class CreandoMarcos {
	public static void main(String[] args) {		
		miMarco marco1 = new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class miMarco extends JFrame{
	public miMarco(){
		/*setSize(500,300);
		setLocation(500,500);*/
		setBounds(500, 300, 800, 600);
		//setResizable(false);
		//setExtendedState(MAXIMIZED_BOTH);
		setTitle("Mi primera ventana");
	}
}
