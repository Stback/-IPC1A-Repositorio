import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Demo implements Runnable{

	
	JLabel tiempo;
	JFrame ventanad= new JFrame("Demostracion");
	public ImageIcon newgame = new ImageIcon("img\\newgame.png");
	public ImageIcon newdemo = new ImageIcon("img\\demo.png");
	public ImageIcon newinstrucciones = new ImageIcon("img\\instrucciones.png");
	public ImageIcon newreglas = new ImageIcon("img\\reglas.PNG");
	public ImageIcon findemo = new ImageIcon("img\\findemo.png");
	public ImageIcon fondo = new ImageIcon("img\\play.PNG");
	public ImageIcon inicia = new ImageIcon("img\\iniciar.png");
	public ImageIcon disco5 = new ImageIcon("img\\disco5.png");
	public ImageIcon disco4 = new ImageIcon("img\\disco4.png");
	public ImageIcon disco3 = new ImageIcon("img\\disco3.png");
	public ImageIcon disco2 = new ImageIcon("img\\disco2.png");
	public ImageIcon disco1 = new ImageIcon("img\\disco1.png");
	JLabel panel = new JLabel(fondo);
	JLabel d5 = new JLabel ();
	JLabel d4 = new JLabel ();
	JLabel d3 = new JLabel ();
	JLabel d2 = new JLabel ();
	JLabel d1 = new JLabel ();
	JLabel verPasos = new JLabel("00");
	
	
	public Demo(){
		
		ventanad.setSize(1060, 677);
		ventanad.setVisible(true);
		ventanad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanad.setLocationRelativeTo(null);
		ventanad.setResizable(false);
		ventanad.setLayout(null);

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
		
		JButton bdemo = new JButton();
		bdemo.setBounds(350,600,195,46);
		bdemo.setIcon(inicia);
		
		JButton parademo = new JButton();
		parademo.setBounds(545,600,195,46);
		parademo.setIcon(findemo);
		
		tiempo = new JLabel("0:0:0");
		tiempo.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		tiempo.setForeground(new java.awt.Color(255, 255, 0));
		tiempo.setBounds(190,75,195,42);
		tiempo.setVisible(true);
				
		bNuevo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	ventanad.dispose();
            	Juego jugar = new Juego();
            	jugar.ventanaj.setVisible(true);
            }
        });
		
		
		breglas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	ventanad.dispose();
            	Ventana v = new Ventana(newreglas);
            	v.ventana.setVisible(true); }
        });
		
		bDemo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){ 	
            	ventanad.dispose();
            	Demo d = new Demo();
            	d.ventanad.setVisible(true);
            	
            }
        });
		
		bdemo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	demostracion();
            }

			private void demostracion() {
				   
				crono.start();
			}
        });
		
		parademo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            	ventanad.dispose();
            	Demo d = new Demo();
            	d.ventanad.setVisible(true);
            }

        });
		
		verPasos.setFont(new java.awt.Font("Bradley Hand ITC", 1, 20));
		verPasos.setForeground(new java.awt.Color(255, 255, 0));
		verPasos.setBounds(1000,75,195,42);
		verPasos.setVisible(true);
		
		d5.setIcon(disco5);
		d4.setIcon(disco4);
		d3.setIcon(disco3);
		d2.setIcon(disco2);
		d1.setIcon(disco1);
		d5.setBounds(126,506,176,46);
		d4.setBounds(135,465,158,46);
		d3.setBounds(145,423,139,46);
		d2.setBounds(155,382,120,46);
		d1.setBounds(165,340,101,46);
		d5.setVisible(true);d4.setVisible(true);d3.setVisible(true);d2.setVisible(true);d1.setVisible(true);	
		panel.add(d1);panel.add(d2);panel.add(d3);panel.add(d4);panel.add(d5);

		crono = new Thread(this);

		panel.add(bNuevo);
		panel.add(bDemo);
		panel.add(breglas);
		panel.add(tiempo);
		panel.add(bdemo);
		panel.add(parademo);
		panel.add(verPasos);
		ventanad.add(panel);

	}
	
	
	
	
	
	int horas=0, minutos=0, segundos=-1;
	Thread crono;
	
	
	
	
	@Override
	public void run() {
		try
		{ 
		for(;;) {
		if(segundos==59) { segundos=0; minutos++; }
		if(minutos==59) { minutos=0; horas++; }
		segundos++;

		tiempo.setText(horas+":"+minutos+":"+segundos);
		if (segundos==31){JOptionPane.showMessageDialog(null,"Tiempo de solucion: "+tiempo.getText()+"      Ganador: " + " Demo    " + "     Movimientos: "+ verPasos.getText(),"Fin Demo",JOptionPane.INFORMATION_MESSAGE);
		ventanad.dispose();
		Demo d = new Demo();
    	d.ventanad.setVisible(true);
    	}else{demoTorres();}
		;
		
		crono.sleep(1000); }
		
		}
		catch (InterruptedException e) { System.out.println(e.getMessage()); }
		
	}

	
		
	int valoresx [][] = new int [6][4];{
		valoresx [1][1] = 165; valoresx [1][2] = 477;	valoresx [1][3] =798; 
		valoresx [2][1] = 155; valoresx [2][2] = 470;	valoresx [2][3] =791;
		valoresx [3][1] = 145; valoresx [3][2] = 460;	valoresx [3][3] =781;
		valoresx [4][1] = 135; valoresx [4][2] = 450;	valoresx [4][3] =771;
		valoresx [5][1] = 126; valoresx [5][2] = 441;	valoresx [5][3] =762;}
	
	int valoresy [][] = new int [6][6];{
		valoresy[1][1]=340; valoresy[1][2]=382;	valoresy[1][3]=423; valoresy[1][4]=465;	valoresy[1][5]=506;
							valoresy[2][2]=382;	valoresy[2][3]=423; valoresy[2][4]=465; valoresy[2][5]=506;
												valoresy[3][3]=423; valoresy[3][4]=465; valoresy[3][5]=506;
																	valoresy[4][4]=465; valoresy[4][5]=506;
																						valoresy[5][5]=506;
	}
int pasos =1;
	private void demoTorres(){
		
		switch(pasos){
		case(1):d1.setBounds(valoresx [1][3],valoresy[1][5],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(2):d2.setBounds(valoresx [2][2],valoresy[2][5],120,46);verPasos.setText(pasos+"");pasos++;break;
		case(3):d1.setBounds(valoresx [1][2],valoresy[1][4],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(4):d3.setBounds(valoresx [3][3],valoresy[3][5],139,46);verPasos.setText(pasos+"");pasos++;break;
		case(5):d1.setBounds(valoresx [1][1],valoresy[1][3],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(6):d2.setBounds(valoresx [2][3],valoresy[2][4],120,46);verPasos.setText(pasos+"");pasos++;break;
		case(7):d1.setBounds(valoresx [1][3],valoresy[1][3],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(8):d4.setBounds(valoresx [4][2],valoresy[4][5],158,46);verPasos.setText(pasos+"");pasos++;break;
		case(9):d1.setBounds(valoresx [1][2],valoresy[1][4],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(10):d2.setBounds(valoresx [2][1],valoresy[2][4],120,46);verPasos.setText(pasos+"");pasos++;break;
		case(11):d1.setBounds(valoresx [1][1],valoresy[1][3],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(12):d3.setBounds(valoresx [3][2],valoresy[3][4],139,46);verPasos.setText(pasos+"");pasos++;break;
		case(13):d1.setBounds(valoresx [1][3],valoresy[1][5],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(14):d2.setBounds(valoresx [2][2],valoresy[2][3],120,46);verPasos.setText(pasos+"");pasos++;break;
		case(15):d1.setBounds(valoresx [1][2],valoresy[1][2],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(16):d5.setBounds(valoresx [5][3],valoresy[5][5],176,46);verPasos.setText(pasos+"");pasos++;break;
		case(17):d1.setBounds(valoresx [1][1],valoresy[1][5],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(18):d2.setBounds(valoresx [2][3],valoresy[2][4],120,46);verPasos.setText(pasos+"");pasos++;break;
		case(19):d1.setBounds(valoresx [1][3],valoresy[1][3],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(20):d3.setBounds(valoresx [3][1],valoresy[3][5],139,46);verPasos.setText(pasos+"");pasos++;break;
		case(21):d1.setBounds(valoresx [1][2],valoresy[1][4],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(22):d2.setBounds(valoresx [2][1],valoresy[2][4],120,46);verPasos.setText(pasos+"");pasos++;break;
		case(23):d1.setBounds(valoresx [1][1],valoresy[1][3],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(24):d4.setBounds(valoresx [4][3],valoresy[4][4],158,46);verPasos.setText(pasos+"");pasos++;break;
		case(25):d1.setBounds(valoresx [1][3],valoresy[1][3],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(26):d2.setBounds(valoresx [2][2],valoresy[2][5],120,46);verPasos.setText(pasos+"");pasos++;break;
		case(27):d1.setBounds(valoresx [1][2],valoresy[1][4],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(28):d3.setBounds(valoresx [3][3],valoresy[3][3],139,46);verPasos.setText(pasos+"");pasos++;break;
		case(29):d1.setBounds(valoresx [1][1],valoresy[1][5],101,46);verPasos.setText(pasos+"");pasos++;break;
		case(30):d2.setBounds(valoresx [2][3],valoresy[2][2],120,46);verPasos.setText(pasos+"");pasos++;break;
		case(31):d1.setBounds(valoresx [1][3],valoresy[1][1],101,46);verPasos.setText(pasos+"");pasos++;break;
		default:
		
		
		
		ventanad.dispose();
		
		}
		
	}
}
