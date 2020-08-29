package mis_applets;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

public class Grafico_Applet extends JApplet{

	public void init(){				
//		int numero1 = Integer.parseInt(getParameter("barra.1"));
//		int numero2 = Integer.parseInt(getParameter("barra.2"));
//		int numero3 = Integer.parseInt(getParameter("barra.3"));		
//		LaminaGrafico milamina=new LaminaGrafico(numero1, numero2, numero3);
		
		
		String numero = getParameter("graficos");
		int n_graficos = Integer.parseInt(numero);
		int arrayGraficos[] = new int[n_graficos];	
		for (int i=0; i<arrayGraficos.length; i++) {
			arrayGraficos[i] = Integer.parseInt(getParameter("barra."+(i+1)));
		}
		
		LaminaGrafico milamina = new LaminaGrafico(arrayGraficos);
		
		add(milamina);		
	}
}

class LaminaGrafico extends JPanel{
	
//	private int barra1, barra2, barra3;
	private int[]valoresGraficos;
	
	public LaminaGrafico (int []valores) {		
		valoresGraficos=valores;
	}	
	
//	public LaminaGrafico (int barra1, int barra2, int barra3) {		
//		this.barra1 = barra1;
//		this.barra2 = barra2;
//		this.barra3 = barra3;
//	}	
	
	public void paint(Graphics g){		
		super.paintComponent(g);		
		Graphics2D g2=(Graphics2D) g;		
		g2.rotate( 180/180.0 * Math.PI, 125, 100);		
//		Rectangle2D graf1=new Rectangle2D.Double(50,0,50,barra1);		
//		Rectangle2D graf2=new Rectangle2D.Double(100,0,50,barra2);		
//		Rectangle2D graf3=new Rectangle2D.Double(150,0,50,barra3);		
//		g2.setPaint(Color.RED);		
//		g2.fill(graf1);		
//		g2.setPaint(Color.YELLOW);		
//		g2.fill(graf2);		
//		g2.setPaint(Color.GREEN);		
//		g2.fill(graf3);
		
		int pos_x = 0;
		for (int i=0; i<valoresGraficos.length; i++) {
			Rectangle2D graf = new Rectangle2D.Double(pos_x,0,25,valoresGraficos[i]);
			int color_rojo = (int) Math.round(Math.random()*200);
			int color_verde = (int) Math.round(Math.random()*200);
			int color_azul = (int) Math.round(Math.random()*200);
			Color colorBarra = new Color(color_rojo,color_verde, color_azul);
			g2.setPaint(colorBarra);
			g2.fill(graf);
			pos_x+=25;
		}
	}	
	
}
