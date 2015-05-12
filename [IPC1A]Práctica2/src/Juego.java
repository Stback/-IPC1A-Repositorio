import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Juego {
	JComboBox nodisc;
	JFrame ventanaj= new JFrame("Nuevo Juego");
	JTextField inname = new JTextField();
	public ImageIcon newgame = new ImageIcon("img\\newgame.png");
	public ImageIcon newdemo = new ImageIcon("img\\demo.png");
	public ImageIcon newinstrucciones = new ImageIcon("img\\instrucciones.png");
	public ImageIcon newreglas = new ImageIcon("img\\reglas.PNG");
	public ImageIcon nuevo = new ImageIcon("img\\nuevo.PNG");
	public ImageIcon text = new ImageIcon("img\\espacioname.png");
	public ImageIcon inicia = new ImageIcon("img\\iniciar.png");
	int nodiscos;
	String nombre;
	public Juego(){
		
		ventanaj.setSize(1060, 677);
		ventanaj.setVisible(true);
		ventanaj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaj.setLocationRelativeTo(null);
		ventanaj.setResizable(false);
		ventanaj.setLayout(null);

		JLabel panel = new JLabel(nuevo);
		panel.setVisible(true);
		panel.setSize(1060,677);

		JButton bNuevo = new JButton();
		bNuevo.setBounds(11,9,195,42);
		bNuevo.setIcon(newgame);
		
		JButton bDemo = new JButton();
		bDemo.setBounds(206,9,195,42);
		bDemo.setIcon(newdemo);
		
		JButton breglas = new JButton();
		breglas.setBounds(401,9,195,42);
		breglas.setIcon(newinstrucciones);
		
		JButton jugar = new JButton();
		jugar.setIcon(inicia);
		jugar.setBounds(400,400,195,46);
		
		
		bNuevo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	ventanaj.dispose();
            	Juego jugar = new Juego();
            	jugar.ventanaj.setVisible(true);

            }
        });
		
		
		breglas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	ventanaj.dispose();
            	Ventana v = new Ventana(newreglas);
            	v.ventana.setVisible(true); }
        });
		
		bDemo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	ventanaj.dispose();
            	Demo d = new Demo();
            	d.ventanad.setVisible(true);
            }
        });
		
		jugar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	proceso();
            }
        });

		
		inname.setBounds(490,275,100,42);
		inname.setBackground(new java.awt.Color(51,51,51));
		inname.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		inname.setForeground(new java.awt.Color(255, 255, 0));
		
		nodisc = new JComboBox();
		nodisc.setBounds(490,320,100,42);
		nodisc.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		nodisc.addItem("3");
		nodisc.addItem("4");
		nodisc.addItem("5");
		nodisc.addItem("6");
		nodisc.addItem("7");
		nodisc.addItem("8");

		panel.add(bNuevo);
		panel.add(bDemo);
		panel.add(breglas);
		panel.add(nodisc);
		panel.add(jugar);
		panel.add(inname);
		ventanaj.add(panel);
	
	}

	protected void proceso() {
		nodiscos=Integer.parseInt((String) nodisc.getSelectedItem());
		nombre=inname.getText();
		ventanaj.dispose();
		Jugando jugando = new Jugando(nodiscos,nombre);
		jugando.juego.setVisible(true);
	}
	

	
	
	
	
	
	
	
	
	
	
}
