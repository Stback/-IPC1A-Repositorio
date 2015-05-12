import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class DobleEnlazada {

	
 class Ventana extends JFrame {

	JTextField t;
	JButton b1; 
	//JButton b2; 
	//JButton b3;
	Lista ir = new Lista();
	public Ventana(){
		 t = new JTextField();
		b1 = new JButton("Insertar Datos");
		//b2 = new JButton("Borrar Datos");
		//b3 = new JButton(" Datos");
		this.setBounds(500, 500, 300, 200);
		this.setLayout(null);
	
		t.setBounds(10,10,80,30);
		b1.setBounds(100,10,150,30);
		b1.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent e){
	              ir.agregar(t.getText());
	              ir.mostrar();
	           }
	       });	
		this.add(t);
		this.add(b1);
	}
}
	
 		class Nodo {
		
		String contenido;
		Nodo anterior;
		Nodo siguiente;
		
		Nodo(String datos){
			contenido = datos;
			anterior = null;
			siguiente = null;
		}
		
		public void mostrarNodo(){
			System.out.println(contenido);
		}
		
	}
 		
 		
 		class Lista {
 			Nodo inicio;
 			
 			Lista(){
 				inicio=null;
 			}
 			
 			
			public void agregar(String text) {
			
			Nodo nuevo = new Nodo(text);
				
			if(inicio==null){
				inicio = nuevo;
			}else{
				
				Nodo actual = inicio;
				while(actual!=null){
					
					if(actual.siguiente == null){
						actual.siguiente = nuevo;
						actual.anterior = inicio;
						break;
					}
					
					actual = actual.siguiente;
						
				}
			}
				
			}

			public void mostrar() {

				if(inicio!=null){
					Nodo mostraractual = inicio; 
					while(mostraractual!=null){
						System.out.print(mostraractual.contenido+"->");
						mostraractual = mostraractual.siguiente;
					}
					
				}System.out.println();
				
				
			}
 			
 			
 			
 		}
 		
Ventana ventana= new Ventana();

}
