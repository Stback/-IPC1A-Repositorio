import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Jugando {

	JLabel tiempo;
	JFrame juego= new JFrame("Demostracion");
	public ImageIcon newgame = new ImageIcon("img\\newgame.png");
	public ImageIcon newdemo = new ImageIcon("img\\demo.png");
	public ImageIcon newinstrucciones = new ImageIcon("img\\instrucciones.png");
	public ImageIcon newreglas = new ImageIcon("img\\reglas.PNG");
	public ImageIcon fondo = new ImageIcon("img\\play.PNG");
	public ImageIcon disco6 = new ImageIcon("img\\disco6.png");
	public ImageIcon disco7 = new ImageIcon("img\\disco7.png");
	public ImageIcon disco8 = new ImageIcon("img\\disco8.png");
	public ImageIcon disco5 = new ImageIcon("img\\disco5.png");
	public ImageIcon disco4 = new ImageIcon("img\\disco4.png");
	public ImageIcon disco3 = new ImageIcon("img\\disco3.png");
	public ImageIcon disco2 = new ImageIcon("img\\disco2.png");
	public ImageIcon disco1 = new ImageIcon("img\\disco1.png");
	
	JLabel panel = new JLabel(fondo);
	
	JLabel d8 = new JLabel ();
	JLabel d7 = new JLabel ();
	JLabel d6 = new JLabel ();
	JLabel d5 = new JLabel ();
	JLabel d4 = new JLabel ();
	JLabel d3 = new JLabel ();
	JLabel d2 = new JLabel ();
	JLabel d1 = new JLabel ();
	JLabel verPasos = new JLabel("00");
	
	
	public Jugando(int nodiscos,String nombre){
		
		juego.setSize(1060, 677);
		juego.setVisible(true);
		juego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		juego.setLocationRelativeTo(null);
		juego.setResizable(false);
		juego.setLayout(null);
	
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
		
		JButton m13 = new JButton();
		m13.setBounds(92,560,123,46);
		m13.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		m13.setForeground(new java.awt.Color(0,0,0));
		m13.setBackground(new java.awt.Color(200,200,200));
		m13.setText("Mover a 3");
		
		
		JButton m12 = new JButton();
		m12.setBounds(215,560,123,46);
		m12.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		m12.setForeground(new java.awt.Color(0,0,0));
		m12.setBackground(new java.awt.Color(200,200,200));
		m12.setText("Mover a 2");
		
		
		JButton m21 = new JButton();
		m21.setBounds(407,560,123,46);
		m21.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		m21.setForeground(new java.awt.Color(0,0,0));
		m21.setBackground(new java.awt.Color(200,200,200));
		m21.setText("Mover a 1");
		
		
		JButton m23 = new JButton();
		m23.setBounds(530,560,123,46);
		m23.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		m23.setForeground(new java.awt.Color(0,0,0));
		m23.setBackground(new java.awt.Color(200,200,200));
		m23.setText("Mover a 3");
		
		
		JButton m31 = new JButton();
		m31.setBounds(727,560,123,46);
		m31.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		m31.setForeground(new java.awt.Color(0,0,0));
		m31.setBackground(new java.awt.Color(200,200,200));
		m31.setText("Mover a 1");
		
		
		JButton m32 = new JButton();
		m32.setBounds(850,560,123,46);
		m32.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		m32.setForeground(new java.awt.Color(0,0,0));
		m32.setBackground(new java.awt.Color(200,200,200));
		m32.setText("Mover a 2");
		
		JButton iniciar= new JButton();
		iniciar.setBounds(430,75,185,46);
		iniciar.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		iniciar.setForeground(new java.awt.Color(0,0,0));
		iniciar.setBackground(new java.awt.Color(200,200,200));
		iniciar.setText("INICIAR JUEGO");
		
		
		tiempo = new JLabel("0:0:0");
		tiempo.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		tiempo.setForeground(new java.awt.Color(255, 255, 0));
		tiempo.setBounds(190,75,195,42);
		tiempo.setVisible(true);
				
		bNuevo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	juego.dispose();
            	Juego jugar = new Juego();
            	jugar.ventanaj.setVisible(true);
            }
        });
		
		
		breglas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	juego.dispose();
            	Ventana v = new Ventana(newreglas);
            	v.ventana.setVisible(true); }
        });
		
		bDemo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){ 	
            	juego.dispose();
            	Demo d = new Demo();
            	d.ventanad.setVisible(true);
            	
            }
        });
		
		
		
		iniciar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	
            }	
		});
		
		
		verPasos.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		verPasos.setForeground(new java.awt.Color(255, 255, 0));
		verPasos.setBounds(1000,75,195,42);
		verPasos.setVisible(true);

		d8.setIcon(disco8);
		d7.setIcon(disco7);
		d6.setIcon(disco6);
		d5.setIcon(disco5);
		d4.setIcon(disco4);
		d3.setIcon(disco3);
		d2.setIcon(disco2);
		d1.setIcon(disco1);
		
		int valoresx [][] = new int [9][4];{
			valoresx [1][1] = 165; valoresx [1][2] = 477;	valoresx [1][3] =798; 
			valoresx [2][1] = 155; valoresx [2][2] = 470;	valoresx [2][3] =791;
			valoresx [3][1] = 145; valoresx [3][2] = 460;	valoresx [3][3] =781;
			valoresx [4][1] = 135; valoresx [4][2] = 450;	valoresx [4][3] =771;
			valoresx [5][1] = 126; valoresx [5][2] = 441;	valoresx [5][3] =762;
		    valoresx [6][1] = 115; valoresx [6][2] = 430;	valoresx [6][3] =751;
			valoresx [7][1] = 105; valoresx [7][2] = 420;	valoresx [7][3] =741;
			valoresx [8][1] = 98;  valoresx [8][2] = 413;	valoresx [8][3] =734;}
		
		int valoresy [][] = new int [9][9];{
			valoresy[1][1]=214; valoresy[1][2]=256;	valoresy[1][3]=298; valoresy[1][4]=340;	valoresy[1][5]=382;valoresy[1][6]=423; valoresy[1][7]=465; valoresy[1][8]=506;
								valoresy[2][2]=256;	valoresy[2][3]=298; valoresy[2][4]=340; valoresy[2][5]=382;valoresy[2][6]=423; valoresy[2][7]=465; valoresy[2][8]=506;
													valoresy[3][3]=298; valoresy[3][4]=340; valoresy[3][5]=382;valoresy[3][6]=423; valoresy[3][7]=465; valoresy[3][8]=506;
																		valoresy[4][4]=340; valoresy[4][5]=382;valoresy[4][6]=423; valoresy[4][7]=465; valoresy[4][8]=506;
																							valoresy[5][5]=382;valoresy[5][6]=423; valoresy[5][7]=465; valoresy[5][8]=506;
																											   valoresy[6][6]=423; valoresy[6][7]=465; valoresy[6][8]=506;
																											   					   valoresy[7][7]=465; valoresy[7][8]=506; 
																											   					   					   valoresy[8][8]=506;
		}
		
		if(nodiscos==3){
			d3.setBounds(valoresx[3][1],valoresy[3][8],139,46);
			d2.setBounds(valoresx[2][1],valoresy[2][7],120,46);
			d1.setBounds(valoresx[1][1],valoresy[1][6],101,46);
		}
		if(nodiscos==4){
			d4.setBounds(valoresx[4][1],valoresy[4][8],158,46);
			d3.setBounds(valoresx[3][1],valoresy[3][7],139,46);
			d2.setBounds(valoresx[2][1],valoresy[2][6],120,46);
			d1.setBounds(valoresx[1][1],valoresy[1][5],101,46);
		}
		if(nodiscos==5){
			d5.setBounds(valoresx[5][1],valoresy[5][8],176,46);
			d4.setBounds(valoresx[4][1],valoresy[4][7],158,46);
			d3.setBounds(valoresx[3][1],valoresy[3][6],139,46);
			d2.setBounds(valoresx[2][1],valoresy[2][5],120,46);
			d1.setBounds(valoresx[1][1],valoresy[1][4],101,46);
		}
		if(nodiscos==6){
			d6.setBounds(valoresx[6][1],valoresy[6][8],195,46);
			d5.setBounds(valoresx[5][1],valoresy[5][7],176,46);
			d4.setBounds(valoresx[4][1],valoresy[4][6],158,46);
			d3.setBounds(valoresx[3][1],valoresy[3][5],139,46);
			d2.setBounds(valoresx[2][1],valoresy[2][4],120,46);
			d1.setBounds(valoresx[1][1],valoresy[1][3],101,46);
		}
		if(nodiscos==7){
			d7.setBounds(valoresx[7][1],valoresy[7][8],214,46);
			d6.setBounds(valoresx[6][1],valoresy[6][7],195,46);
			d5.setBounds(valoresx[5][1],valoresy[5][6],176,46);
			d4.setBounds(valoresx[4][1],valoresy[4][5],158,46);
			d3.setBounds(valoresx[3][1],valoresy[3][4],139,46);
			d2.setBounds(valoresx[2][1],valoresy[2][3],120,46);
			d1.setBounds(valoresx[1][1],valoresy[1][2],101,46);
		}
		if(nodiscos==8){
			d8.setBounds(valoresx[8][1],valoresy[8][8],233,46);
			d7.setBounds(valoresx[7][1],valoresy[7][7],214,46);
			d6.setBounds(valoresx[6][1],valoresy[6][6],195,46);
			d5.setBounds(valoresx[5][1],valoresy[5][5],176,46);
			d4.setBounds(valoresx[4][1],valoresy[4][4],158,46);
			d3.setBounds(valoresx[3][1],valoresy[3][3],139,46);
			d2.setBounds(valoresx[2][1],valoresy[2][2],120,46);
			d1.setBounds(valoresx[1][1],valoresy[1][1],101,46);
		}
		
		
		JLabel discos [] = {d1,d2,d3,d4,d5,d6,d7,d8};
		for (int i=1;i<=nodiscos;i++){
		discos[i-1].setVisible(true);
		panel.add(discos[i-1]);
		
		}
		

		//crono = new Thread(this);

		panel.add(bNuevo);
		panel.add(bDemo);
		panel.add(breglas);
		panel.add(tiempo);
		panel.add(m13);
		panel.add(m12);
		panel.add(m21);
		panel.add(m23);
		panel.add(m31);
		panel.add(m32);
		panel.add(iniciar);
		panel.add(verPasos);
		juego.add(panel);

		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
