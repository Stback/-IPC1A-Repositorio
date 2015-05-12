
public class PilaConCola {

	int cola1[];	
	int cola2[];
	int cola3[];	
	int cabeza1,cabeza2,cabeza3,final1,final2,final3;
	int tamano=5;
	
	
	public PilaConCola() {
		cabeza1=0;
		cabeza2=0;
		cabeza3=0;
		final1=-1;
		final2=-1;
		final3=-1;
		cola1=new int [tamano];
		cola2=new int [tamano];
		cola3=new int [tamano];
	}

	
		
	public void enqueue1(int n){	
	final1++;
	cola1[final1]=n;
	}
	public int dequeue1(){
		if (colaVacia1()){
			return (100000);  //Este 100000 signigica que la cola esta vacia. jajaja
		}else{
			int aux = cabeza1;
			cabeza1++;
			return cola1[aux];
		}
		}
	public boolean colaVacia1(){
		return (final1==-1);
	}
	
	
	
	
	
	
	public void enqueue2(int x){	
		final2++;
		cola2[final2]=x;
		}
	
	public int dequeue2(){
		if (colaVacia2()){
			return (100000);  //Este 100000 signigica que la cola esta vacia. jajaja
		}else{
			int aux = cabeza2;
			cabeza2++;
			return cola2[aux];
		}
	}
	public boolean colaVacia2(){
		return (final2==-1);
	}
	
	
	
	
	
	public void enqueue3(int y){	
		final3++;
		cola3[final3]=y;
		}
	
	public int dequeue3(){
		if (colaVacia3()){
			return (100000);  //Este 100000 signigica que la cola esta vacia. jajaja
		}else{
			int aux = cabeza3;
			cabeza3++;
			return cola3[aux];
		}
	}
	public boolean colaVacia3(){
		return (final3==-1);
	}
	
	
	public void ejecucion(){
		for(int i=1;i<4;i++){
			System.out.println("");
		}
		System.out.println("Aqui inicia la PILA-CON-COLA");
		
		for(int i=1;i<4;i++){
			System.out.println(i+". Dato Ingresado:"+i);
			enqueue1(i);
		}
	
		for (int j=1;j<3;j++){
			int s = dequeue1();
			enqueue2(s);
		}
		
		int a = dequeue2();
		enqueue3(a);
		
		enqueue2(dequeue1());
		enqueue2(dequeue3());
		
		for (int j=1;j<4;j++){
			System.out.println(j+". Dato Recuperado:"+dequeue3());
		
	}
		
	}
	
	
	
}
