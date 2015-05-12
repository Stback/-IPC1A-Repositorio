
public class ColaConPila {

int pila1 [];	
int pila2[];				   		//declaracion
int cima1,cima2;
int tamano=5;
	
public ColaConPila() {
		pila1 = new int[tamano]; 
		pila2 = new int[tamano];	//Constructor
		cima1 = -1;
		cima2= -1;
	}
	
public void push1(int n) {
	cima1++;
	pila1[cima1]=n;
	}

public int pop1() {
	if (PilaVacia1()){
	return(1000);	//Xq esto en pop2...
	}
	else
	{int aux=cima1;
	cima1--;
	return (pila1[aux]);
	}
}

public boolean PilaVacia1() {
	return (cima1==-1);	
}



public void push2(int x) {
	cima2++;
	pila2[cima2]=x;
	}

public int pop2() {
	if (PilaVacia2()){
	return(1000);     //ese 1000 significa que la pila esta vacia. Pero como el metodo retorna int 
	}				  //me pide el retorno entero.  Igual para el pop1.
	else
	{int aux=cima2;
	cima2--;
	return (pila2[aux]);
	}
}

public boolean PilaVacia2() {
	return (cima2==-1);	
}


public void ejecucion(){
	for(int i=1;i<6;i++){
		System.out.println(i+". Dato Ingresado:"+i);
		push1(i);
	}

	for (int j=1;j<6;j++){
	int s =pop1();
	System.out.println("Como queda el arreglo: "+s);
	push2(s);
}

	
	
	
	for (int j=1;j<6;j++){
		System.out.println(j+". Dato Recuperado:"+pop2());
	}
}

public static void main(String[] args) {
		ColaConPila colaconpila =new ColaConPila();
		colaconpila.ejecucion();
	
		PilaConCola pilaconcola = new PilaConCola();
		pilaconcola.ejecucion();
	

}
}
