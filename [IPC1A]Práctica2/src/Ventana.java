import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Ventana{
		
	
	
	JFrame ventana= new JFrame("Torres de Hanoi");
	
	public ImageIcon newgame = new ImageIcon("img\\newgame.png");
	public ImageIcon newdemo = new ImageIcon("img\\demo.png");
	public ImageIcon newinstrucciones = new ImageIcon("img\\instrucciones.png");
	public ImageIcon newreglas = new ImageIcon("img\\reglas.PNG");
	
	

	public Ventana(ImageIcon actual){

				ventana.setSize(1060, 677);
				ventana.setVisible(true);
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ventana.setLocationRelativeTo(null);
				ventana.setResizable(true);
				ventana.setLayout(null);
		
				JLabel panel = new JLabel(actual);
				panel.setVisible(true);
				panel.setSize(1060,677);
		
				JButton bNuevo = new JButton();
				bNuevo.setBounds(11,12,195,42);
				bNuevo.setIcon(newgame);
				
				JButton bDemo = new JButton();
				bDemo.setBounds(206,12,195,42);
				bDemo.setIcon(newdemo);
				
				JButton breglas = new JButton();
				breglas.setBounds(401,12,195,42);
				breglas.setIcon(newinstrucciones);
				
				bNuevo.addActionListener(new ActionListener(){
		            @Override
		            public void actionPerformed(ActionEvent e){
		            	ventana.dispose();
		            	Juego jugar = new Juego();
		            	jugar.ventanaj.setVisible(true);
		            	
		            	
		            }
		        });
				
				bDemo.addActionListener(new ActionListener(){
		            @Override
		            public void actionPerformed(ActionEvent e){ 
		            	ventana.dispose();
		            	Demo d = new Demo();
		            	d.ventanad.setVisible(true);
		            }
		        });
				
				breglas.addActionListener(new ActionListener(){
		            @Override
		            public void actionPerformed(ActionEvent e){
		            	ventana.dispose();
		            	Ventana v = new Ventana(newreglas);
		            	v.ventana.setVisible(true); }
		        });
				

				
				panel.add(bNuevo);
				panel.add(bDemo);
				panel.add(breglas);
				ventana.add(panel);
	}	
}
