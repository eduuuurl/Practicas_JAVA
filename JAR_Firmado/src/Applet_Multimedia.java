import java.awt.*;
import javax.swing.*;

public class Applet_Multimedia extends JApplet{
	
	Image logo;
	
	public void init() {
		logo=getImage(getDocumentBase(),"logo.png");		
	}
	
	public void paint(Graphics g) {
		g.drawImage(logo, 50, 50, this);
	}
}
