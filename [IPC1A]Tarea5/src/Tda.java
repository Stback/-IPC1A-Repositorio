import java.util.Scanner;


public class Tda {
	
	Scanner lee = new Scanner(System.in);
	DobleEnlazada dobleEnlazada;
	CircularEnlazada circularEnlazada;
	CircularDoble circularDoble;
	int uso;	
	public Tda(){}
	
	public Tda(int uso) {
	this.uso = uso;
	switch(this.uso)
	{
	case(1): dobleEnlazada = new DobleEnlazada();
	dobleEnlazada.ventana.setVisible(true);

		
	case(2): circularEnlazada = new CircularEnlazada();
	
	case(3): circularDoble = new CircularDoble();
	
	}
	}
	
public void menu()
{
	System.out.println("Ingresa el numero de Ejercicio");
	System.out.println("1. Lista Doblemente Enlazada");
	System.out.println("2. Lista Circular Enlazada");
	System.out.println("3. Lista Circular Doblemente Enlazada");
	int o = lee.nextInt();
	Tda iniciar = new Tda(o);
	
}
	
	public static void main(String[] args) {
	Tda correr = new Tda();
	correr.menu();

	}

}
