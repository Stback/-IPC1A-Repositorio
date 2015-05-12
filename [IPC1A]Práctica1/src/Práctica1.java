import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
public class Práctica1 {
	static Scanner leer = new Scanner(System.in);
	static void menu() {
	System.out.println("Selecciona el número de programa a utilizar: ");	
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("1. Dibujar Rombo");
	System.out.println("2. Promedio de 6 Notas");
	System.out.println("3. Traductor de hora");
	System.out.println("4. Área y Perímetro");
	System.out.println("5. Número de días entre dos fechas");
	System.out.println("6. Calculadora Simple");
	System.out.println("7. Tabla de Multiplicar");
	System.out.println("8. Conversor Entero a Cadena (0-100)");
	System.out.println("9. Conversor Número Arábigo a Romano");
	System.out.println("10. Pirámide Invertida de 'x' fila de números");
	System.out.println("11. Lista de Romanos");
	System.out.println("12. Cadena en Asteriscos");
	System.out.println("13. Adivinar la Letra");
	System.out.println("14. Dibujar Cuadrado");
	System.out.println("15. Mostrar Números Primos");
	System.out.println("16. Salir de la Aplicacion");
	System.out.println();System.out.println();
	System.out.println("##############################################################################################################################");
	
	seleccionar();
}
	static void seleccionar(){
	int seleccion = leer.nextInt();
		switch (seleccion){
		 	case (1): rombo(); break;
		 	case (2): promedio(); break;
		 	case (3): hora(); break;
		 	case (4): area(); break;
		 	case (5): dias(); break;
		 	case (6): calcu(); break;
		 	case (7): tabla(); break;
		 	case (8): letras(); break;
		 	case (9): romanos(); break;
		 	case (10): piramide(); break;
		 	case (11): romanos2(); break;
		 	case (12): asterisco(); break;
		 	case (13): adivinar(); break;
		 	case (14): cuadrado(); break;
		 	case (15): primos(); break;
		 	case (16): ; break;
		default:System.out.println("El programa no existe");menu();
		}
}
	static void primos() {
		String otra;
		do{
		System.out.println("Imprime los numeros primos entre 1 y el numero ingresado: ");
			for (int i=0;i<6;i++)
				System.out.println(" ");	
		System.out.println(" Ingresar número: (MAYOR QUE 1)");
		int n,divisores=0;
		n = leer.nextInt();
		System.out.println("Los numeros primos de 1 a " + n +" son:");
		for(int i=1; i<=n; i++){
			divisores = 0;
			for(int j=1; j<=i; j++){
				if (i%j==0)
				divisores++;
				if (divisores>2)break;
			}				 
			if(divisores==2)
			System.out.print(i+" ");
		}System.out.println();
		System.out.println("##############################################################################################################################");
		System.out.println("¿Realizar otra operacion?: SI/NO");		
		otra = leer.next();	
		}while(otra.equals("SI"));
		System.out.println("¿Volver al menu principal?: SI/NO");
		otra = leer.next();
		if (otra.equals("SI")){
			System.out.println("##############################################################################################################################");
			menu();}
	}
	static void cuadrado() {
		
		
		String otra;
		do{
			
			System.out.println("Se imprime un cuadrado de 'n' asteriscos por lado");
			for (int i=0;i<6;i++)
			    System.out.println(" ");
			System.out.println("Ingresar número deseado: ");		
			int n = leer.nextInt();
			for (int l=1;l<=n;l++){
				if (l<2 || l==n){
					for (int a=1;a<=n;a++)
						System.out.print("* ");
				}
				else{ 
					for (int a=1;a<=n;a++){
						if (a<2 || a==n)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
					}
			System.out.println();
			}
			System.out.println("##############################################################################################################################");
			System.out.println("¿Realizar otra operacion?: SI/NO");		
			otra = leer.next();	
			}while(otra.equals("SI"));
			System.out.println("¿Volver al menu principal?: SI/NO");
			otra = leer.next();
			if (otra.equals("SI")){
				System.out.println("##############################################################################################################################");
				menu();}

}
	static void adivinar() {
		String otra,letra,p2;
		int tamano,adivinar = 0,i2 = 0;
		do{
			System.out.println("Ingresa una letra y posteriormente adivinarla: ");
				for (int i=0;i<6;i++)
					System.out.println(" ");	
			
			do{
			System.out.println("Ingresa letra:");
			letra = leer.next();
			tamano = letra.length();
			}while (tamano>1);
			
			for (int i=0;i<45;i++)
				   System.out.println(" ");
			
			String alpha[] = new String [26];
			alpha[0]="A";alpha[1]="B";alpha[2]="C";alpha[3]="D";alpha[4]="E";alpha[5]="F";alpha[6]="G";alpha[7]="H";alpha[8]="I";alpha[9]="J";
			alpha[10]="K";alpha[11]="L";alpha[12]="M";alpha[13]="N";alpha[14]="O";alpha[15]="P";alpha[16]="Q";alpha[17]="R";alpha[18]="S";alpha[19]="T";
			alpha[20]="U";alpha[21]="V";alpha[22]="W";alpha[23]="X";alpha[24]="Y";alpha[25]="Z";
			

			for(int i=0;i<26;i++){
				if (alpha[i].equals(letra)){
					adivinar = i;
				}}
		
			System.out.println("Adivina la letra:");	
			
			do{
				do{
				System.out.println("Ingresa una opcion:");
				p2 = leer.next();
				}while(p2.length()!=1);
				for(int i=0;i<26;i++){
					if (alpha[i].equals(p2)){
						i2 = i;
					}}
				
				if (i2>adivinar){
					System.out.println("La letra buscada se encuentra a la izquierda de: "+ p2);
				}if (i2<adivinar)
					System.out.println("La letra buscada se encuentra a la derecha: "+p2);
				
			}while(i2!=adivinar);
			
			System.out.println("Felicidades Has Ganado! " + "Encontraste: " + letra);
			
			
			
			System.out.println("##############################################################################################################################");
			System.out.println("¿Volver a Intentarlo?: SI/NO");		
			otra = leer.next();	
			}while(otra.equals("SI"));
			System.out.println("¿Volver al menu principal?: SI/NO");
			otra = leer.next();
			if (otra.equals("SI")){
				System.out.println("##############################################################################################################################");
				menu();}
	
}
	static void piramide() {
		
		String otra;
		do{
			int n,nu,l,e=0;
			System.out.println("Imprime una piramide invertida de 'n' filas de numeros: ");
			for (int i=0;i<6;i++)
					System.out.println(" ");	
			
			System.out.println(" Ingresar número: (2-99)");
			n = leer.nextInt();
			nu=1;
			
			if (n<10){	
				for(l=n;l>0;l--){
					
					for(int i=0;i<e;i++){
						System.out.print(" ");
					}
					for(int i=nu;i<=n;i++){
						System.out.print(nu+" ");
					}
					nu=nu+1;
					e=e+1;
					System.out.println();
				}
			}else{
				
				for(l=n;l>0;l--){
					
				if(nu<10){
					for(int i=0;i<e;i++){
						System.out.print("  ");
					}
					
					
					for(int i=nu;i<=n;i++){
						System.out.print(" "+"0"+nu+" ");
					}
				}else{	
					for(int i=0;i<e;i++){
						System.out.print("  ");
					}
					
					
					for(int i=nu;i<=n;i++){
						System.out.print(" "+nu+" ");
					}
				}	
					

					nu=nu+1;
					e=e+1;
					System.out.println();
				}
			}
			
			
			
			System.out.println();
			System.out.println("##############################################################################################################################");
			System.out.println("¿Realizar otra operacion?: SI/NO");		
			otra = leer.next();	
		}while(otra.equals("SI"));
			System.out.println("¿Volver al menu principal?: SI/NO");
			otra = leer.next();
			if (otra.equals("SI")){
				System.out.println("##############################################################################################################################");
				menu();}
	
}
	static void letras() {
		System.out.println("Se debe ingresar el limite inferior, luego el superior; para generar un numero aleatorio entre el rango dado y mostrarlo en letras: ");
		for (int i=0;i<6;i++)
		    System.out.println(" ");
		Random num = new Random();
		String otra,ca,b="";
		int li,ls,a;
		do{
			do{
				System.out.println("Ingresa el Limite Inferior: ");
				li = leer.nextInt();
				}while(li<0 || li>98);
			do{
				System.out.println("Ingresa el Limite Superior: ");
				ls = leer.nextInt();
				}while(ls<=li+1 || ls>101);
			a = (int)(num.nextDouble()*(ls-li)+li);
			ca = Integer.toString(a);
			String U[]= new String[10];
			String D[]= new String[10];
			U[0]="";
			U[1]="Uno";
			U[2]="Dos";
			U[3]="Tres";
			U[4]="Cuatro";
			U[5]="Cinco";
			U[6]="Seis";
			U[7]="Siete";
			U[8]="Ocho";
			U[9]="Nueve";
			D[0]="";
			D[1]="Diez";
			D[2]="Veinti";
			D[3]="Treinta";
			D[4]="Cuarenta";
			D[5]="Cincuenta";
			D[6]="Sesenta";
			D[7]="Setenta";
			D[8]="Ochenta";
			D[9]="Noventa";
			if (ca.length()<2){
				if (Integer.parseInt(ca)==0){
					System.out.println("Numero Generado: "+ a + " ---> "+ "Cero");
				}else{
					System.out.println("Numero Generado: "+ a + " ---> "+ U[Integer.parseInt(b+ca.charAt(0))]);
				}
					
			}else{
				if (a>9 && a < 21 ){
				switch(a){
				case(10):System.out.println("Numero Generado: "+ a + " ---> "+D[1]);break;
				case(11):System.out.println("Numero Generado: "+ a + " ---> Once");break;
				case(12):System.out.println("Numero Generado: "+ a + " ---> Doce");break;
				case(13):System.out.println("Numero Generado: "+ a + " ---> Trece");break;
				case(14):System.out.println("Numero Generado: "+ a + " ---> Catorce");break;
				case(15):System.out.println("Numero Generado: "+ a + " ---> Quince");break;
				case(16):System.out.println("Numero Generado: "+ a + " ---> Dieciseis");break;
				case(17):System.out.println("Numero Generado: "+ a + " ---> Diecisiete");break;
				case(18):System.out.println("Numero Generado: "+ a + " ---> Dieciocho");break;
				case(19):System.out.println("Numero Generado: "+ a + " ---> Diecinueve");break;
				case(20):System.out.println("Numero Generado: "+ a + " ---> Veinte");break;
				}
			}else{
				if (a>20&&a<30){
				System.out.println("Numero Generado: "+ a + " ---> "+ D[Integer.parseInt(b+ca.charAt(0))]+U[Integer.parseInt(b+ca.charAt(1))]);
				}else{
					if(ca.charAt(1)!=0){
				System.out.println("Numero Generado: "+ a + " ---> "+ D[Integer.parseInt(b+ca.charAt(0))]+" y "+U[Integer.parseInt(b+ca.charAt(1))]);	
				}else{
					System.out.println("Numero Generado: "+ a + " ---> "+ D[Integer.parseInt(b+ca.charAt(0))]);
				}
					}
			}
			}
		System.out.println("¿Realizar otra operacion?: SI/NO");		
		otra = leer.next();	
		System.out.println("##############################################################################################################################");	
		}while(otra.equals("SI"));
		System.out.println("¿Volver al menu principal?: SI/NO");
		otra = leer.next();
		if (otra.equals("SI"))
			menu();
	}
	static void tabla() {
		String otra;
		do{
				System.out.println("Se Recibe un numero entre 0 y 100 y muestra su tabla de multiplicar: ");
				for (int i=0;i<6;i++)
			    	System.out.println(" ");
				
				
				int n;
				do{
				System.out.println("Por Favor Ingresar numero de tabla solicitada (0-100)");
				n=leer.nextInt();
				}while(n>100 || n<0);

				System.out.println("Tabla del: "+n);
				System.out.println(" ");
				for (int i=10;i>0;i--){
					System.out.println(n+" * "+i+" = "+n*i);
				}
				for (int i=0;i<6;i++)
			    	System.out.println(" ");

		System.out.println("##############################################################################################################################");
		System.out.println("¿Realizar otra operacion?: SI/NO");		
		otra = leer.next();	
		}while(otra.equals("SI"));
		System.out.println("¿Volver al menu principal?: SI/NO");
		otra = leer.next();
		if (otra.equals("SI")){
			System.out.println("##############################################################################################################################");
			menu();}
	
	}
	static void calcu() {
		String otra;
		do{
			int n1,n2,res = 0;
			String op=" ";
				System.out.println("Se Reciben dos numeros, un caracter y se operan simulando una calculadora: (s:suma; r:resta; m:producto; d:division)");
				for (int i=0;i<6;i++)
			    	System.out.println(" ");
				System.out.println("Ingresa tu primer numero");
				n1 = leer.nextInt();
				System.out.println("Ingresa tu segundo numero");
				n2 = leer.nextInt();
				System.out.println("Por Favor Ingresa tu Operador (Ej. s,r,m,d)");
				op = leer.next();
				switch(op){
				case("s"):res=n1+n2;break;
				case("r"):res=n1-n2;break;
				case("m"):res=n1*n2;break;
				case("d"):res=n1/n2;break;
				default:System.out.println("Operador no reconocido ");}
				System.out.println("El resultado de tu operacion es: "+res);
			System.out.println("##############################################################################################################################");
			System.out.println("¿Realizar otra operacion?: SI/NO");		
			otra = leer.next();	
			}while(otra.equals("SI"));
			System.out.println("¿Volver al menu principal?: SI/NO");
			otra = leer.next();
			if (otra.equals("SI")){
				System.out.println("##############################################################################################################################");
				menu();}	

	}
	static void asterisco() {
		
		String otra;
		do{
			System.out.println("Imprime tantos * como la longitud de el nombre ingresado : ");
				for (int i=0;i<5;i++)
					System.out.println(" ");	
			
		System.out.println("Ingresa un Nombre:");
		for (int i=0;i<3;i++)
			System.out.println(" ");	
		String nombre = leer.next();
	
		for(int i = 0;i<nombre.length();i++){
			System.out.print("*");	
		}
			for (int i=0;i<3;i++)
			System.out.println();
			System.out.println("##############################################################################################################################");
			System.out.println("¿Realizar otra operacion?: SI/NO");		
			otra = leer.next();	
			}while(otra.equals("SI"));
			System.out.println("¿Volver al menu principal?: SI/NO");
			otra = leer.next();
			if (otra.equals("SI")){
				System.out.println("##############################################################################################################################");
				menu();}
		
		
		
		
		
		
		
		
		
		
}
	static void romanos2() {
		
		String roma[]=new String[101];
		roma[0]=" ";roma[1]="I";roma[2]="II";roma[3]="III";roma[4]="IV";roma[5]="V";roma[6]="VI";roma[7]="VII";roma[8]="VIII";roma[9]="IX";roma[10]="X";roma[11]="XI";
		roma[12]="XII";roma[13]="XIII";roma[14]="XIV";roma[15]="XV";roma[16]="XVI";roma[17]="XVII";roma[18]="XVIII";roma[19]="XIX";roma[20]="XX";roma[21]="XXI";roma[22]="XXII";roma[23]="XXIII";
		roma[24]="XXIV";roma[25]="XXV";roma[26]="XXVI";roma[27]="XXVII";roma[28]="XXVIII";roma[29]="XXIX";roma[30]="XXX";roma[31]="XXXI";roma[32]="XXXII";roma[33]="XXXIII";roma[34]="XXXIV";roma[35]="XXXV";
		roma[36]="XXXVI";roma[37]="XXXVII";roma[38]="XXXVIII";roma[39]="XXXIX";roma[40]="XL";roma[41]="XLI";roma[42]="XLII";roma[43]="XLIII";roma[44]="XLIV";roma[45]="XLV";roma[46]="XLVI";roma[47]="XLVII";
		roma[48]="XLVIII";roma[49]="XLIX";roma[50]="L";roma[51]="LI";roma[52]="LII";roma[53]="LIII";roma[54]="LIV";roma[55]="LV";roma[56]="LVI";roma[57]="LVII";roma[58]="LVIII";roma[59]="LIX";
		roma[60]="LX";roma[61]="LXI";roma[62]="LXII";roma[63]="LXIII";roma[64]="LXIV";roma[65]="LXV";roma[66]="LXVI";roma[67]="LXVII";roma[68]="LXVIII";roma[69]="LXIX";roma[70]="LXX";roma[71]="LXXI";
		roma[72]="LXXII";roma[73]="LXXIII";roma[74]="LXXIV";roma[75]="LXXV";roma[76]="LXXVI";roma[77]="LXXVII";roma[78]="LXXVIII";roma[79]="LXXIX";roma[80]="LXXX";roma[81]="LXXXI";roma[82]="LXXXII";roma[83]="LXXXIII";
		roma[84]="LXXXIV";roma[85]="LXXXV";roma[86]="LXXXVI";roma[87]="LXXXVII";roma[88]="LXXXVIII";roma[89]="LXXXIX";roma[90]="XC";roma[91]="XCI";roma[92]="XCII";roma[93]="XCIII";roma[94]="XCIV";roma[95]="XCV";
		roma[96]="XCVI";roma[97]="XCVII";roma[98]="XCVIII";roma[99]="XCIX";roma[100]="C";
		String n,b="",c;
		do{
			int menor = 0,mayor = 0;
			Vector<String> v = new Vector<String>();
			System.out.println("Imprime en letras el numero mayor y menor de una lista ingresada en romanos:  ");
				for (int i=0;i<6;i++)
					System.out.println(" ");	
			do{
				
				System.out.println("Ingresa numeros romanos: (Terminar con FIN)");		
				n = leer.next();	
				if(n!=" ")
				v.add(n);	
			}while(!n.equals("FIN"));
			
			int pos[]=new int[v.size()];
			
			for(int i=0;i<v.size()-1;i++){
				for(int j=0;j<101;j++){
					if(v.elementAt(i).equals(roma[j])){
					pos[i]=j;break;
					}
				
				}//System.out.println(pos[i]);
			}
			
			int posima;
	        mayor=pos[0];
	        posima=0;
	        for(int f=1;f<pos.length;f++) {
	            if (pos[f]>mayor) {
	                mayor=pos[f];
	                posima=f;
	            }
	        }
	        
	        int posime;
	        menor=pos[0];
	        posime=0;
	        for(int f=1;f<pos.length-1;f++) {
	            if (pos[f]<menor) {
	                menor=pos[f];
	                posime=f;
	            }
	        }
			c="El Menor es: ";	
	        int ahora=menor;
	        int posahora=posime;
	        for(int h=0;h<2;h++){
	        String ca = Integer.toString(ahora);
			String U[]= new String[10];
			String D[]= new String[10];
			U[0]="";
			U[1]="Uno";
			U[2]="Dos";
			U[3]="Tres";
			U[4]="Cuatro";
			U[5]="Cinco";
			U[6]="Seis";
			U[7]="Siete";
			U[8]="Ocho";
			U[9]="Nueve";
			D[0]="";
			D[1]="Diez";
			D[2]="Veinti";
			D[3]="Treinta";
			D[4]="Cuarenta";
			D[5]="Cincuenta";
			D[6]="Sesenta";
			D[7]="Setenta";
			D[8]="Ochenta";
			D[9]="Noventa";
			if (ca.length()<2){
				if (Integer.parseInt(ca)==0){
					
				}else{
					System.out.println(c+v.elementAt(posahora)+" ---> "+ ahora + " ---> "+ U[Integer.parseInt(b+ca.charAt(0))]);
				}
					
			}else{
				if (ahora>9 && ahora < 21 ){
				switch(ahora){
				case(10):System.out.println(c+v.elementAt(posahora)+" ---> " +ahora + " ---> "+D[1]);break;
				case(11):System.out.println(c+v.elementAt(posahora)+" ---> " +ahora + " ---> Once");break;
				case(12):System.out.println(c+v.elementAt(posahora)+" ---> " +ahora + " ---> Doce");break;
				case(13):System.out.println(c+v.elementAt(posahora)+" ---> " +ahora + " ---> Trece");break;
				case(14):System.out.println(c+v.elementAt(posahora)+" ---> " +ahora + " ---> Catorce");break;
				case(15):System.out.println(c+v.elementAt(posahora)+" ---> " +ahora + " ---> Quince");break;
				case(16):System.out.println(c+v.elementAt(posahora)+" ---> " +ahora + " ---> Dieciseis");break;
				case(17):System.out.println(c+v.elementAt(posahora)+" ---> " +ahora + " ---> Diecisiete");break;
				case(18):System.out.println(c+v.elementAt(posahora)+" ---> " +ahora + " ---> Dieciocho");break;
				case(19):System.out.println(c+v.elementAt(posahora)+" ---> " +ahora + " ---> Diecinueve");break;
				case(20):System.out.println(c+v.elementAt(posahora)+" ---> " +ahora + " ---> Veinte");break;
				}
			}else{
				if (ahora>20&&ahora<30){
				System.out.println(c+v.elementAt(posahora)+" ---> "+ahora+ " ---> "+ D[Integer.parseInt(b+ca.charAt(0))]+U[Integer.parseInt(b+ca.charAt(1))]);
				}else{
					if(ca.charAt(1)!='0'){
				System.out.println(c+v.elementAt(posahora)+" ---> "+ahora+ " ---> "+ D[Integer.parseInt(b+ca.charAt(0))]+" y "+U[Integer.parseInt(b+ca.charAt(1))]);	
					}else {
						System.out.println(c+v.elementAt(posahora)+" ---> "+ahora+ " ---> "+ D[Integer.parseInt(b+ca.charAt(0))]);
					}
					}
			}
			
	        
	        
	        
	        
	        
	        
	        
			}
	        ahora=mayor;posahora=posima;c="El Mayor es: ";
			}
	        
	      
				
			System.out.println("##############################################################################################################################");
			System.out.println("¿Realizar otra operacion?: SI/NO");		
			n = leer.next();	
			}while(n.equals("SI"));
			System.out.println("¿Volver al menu principal?: SI/NO");
			n = leer.next();
			if (n.equals("SI")){
				System.out.println("##############################################################################################################################");
				menu();}
		}
	static void romanos() {
		
		String otra;
		do{
			System.out.println("Se convierte un numero arabigo a romano: ");
				for (int i=0;i<6;i++)
			    	System.out.println(" ");
				
			System.out.println("Ingresar 1 numero arabigo (0-3999): ");
				for (int i=0;i<6;i++)
			    	System.out.println(" ");
					String n = leer.next();
			String U[]=new String[10];
			U[0]= "";
			U[1]= "I";
			U[2]= "II";
			U[3]= "III";
			U[4]= "IV";
			U[5]= "V";
			U[6]= "VI";
			U[7]= "VII";
			U[8]= "VIII";
			U[9]= "IX";
			String D[]=new String[10];
			D[0]= "";
			D[1]= "X";
			D[2]= "XX";
			D[3]= "XX";
			D[4]= "XL";
			D[5]= "L";
			D[6]= "LX";
			D[7]= "LXX";
			D[8]= "LXXX";
			D[9]= "XC";
			String C[]=new String[10];
			C[0]= "";
			C[1]= "C";
			C[2]= "CC";
			C[3]= "CCC";
			C[4]= "CD";
			C[5]= "D";
			C[6]= "DC";
			C[7]= "DCC";
			C[8]= "DCCC";
			C[9]= "CM";
			String M[]=new String[4];
			M[0]= "";
			M[1]= "M";
			M[2]= "MM";
			M[3]= "MMM";
			String sa = null;
			int u = 0,d,c,m;
			if (n.length()==4){
				u = (n.charAt(n.length()-1))-48;
				d = (n.charAt(n.length()-2))-48;
				c = (n.charAt(n.length()-3))-48;
				m = (n.charAt(n.length()-4))-48;
				sa = M[m]+C[c]+D[d]+U[u];
			}
			if (n.length()==3){
				u = (n.charAt(n.length()-1))-48;
				d = (n.charAt(n.length()-2))-48;
				c = (n.charAt(n.length()-3))-48;
				sa = C[c]+D[d]+U[u];}
			
			if (n.length()==2){
				u = (n.charAt(n.length()-1))-48;
				d = (n.charAt(n.length()-2))-48;
				sa = D[d]+U[u];}
			if (n.length()==1){
				u = (n.charAt(n.length()-1))-48;
				sa = U[u];}
			System.out.println(n +" ---> "+ sa);
			
			
			System.out.println("##############################################################################################################################");
			System.out.println("¿Realizar otra operacion?: SI/NO");		
			otra = leer.next();	
			}while(otra.equals("SI"));
			System.out.println("¿Volver al menu principal?: SI/NO");
			otra = leer.next();
			if (otra.equals("SI")){
				System.out.println("##############################################################################################################################");
				menu();}
		
}
	static void dias() {
		String otra;
		do{
		System.out.println("Programa que calcula el número de días entre dos fechas: ");
				for (int i=0;i<6;i++)
			    	System.out.println(" ");
				
			int d1,m1,a1,d2,m2,a2,m = 0,d = 0,a= 0;
				System.out.println("Primera fecha: (ej. 01 03 2016)");
				System.out.print("Dia: (ej. 01)  ");
				d1=leer.nextInt();
				System.out.print("Mes: (ej. 03)  ");
				m1=leer.nextInt();
				System.out.print("Anho: (ej. 2016)  ");
				a1=leer.nextInt();
				System.out.println("Segunda fecha: (ej. 15 01 1990)");
				System.out.print("Dia: (ej. 15)  ");
				d2=leer.nextInt();
				System.out.print("Mes: (ej. 01)  ");
				m2=leer.nextInt();
				System.out.print("Anho: (ej. 1990)  ");
				a2=leer.nextInt();
				d= d1-d2;
				m=m1-m2;
				a=a1-a2;
		
				System.out.println("El numero de dias entre las fechas es: "+(Math.abs(d)+Math.abs(m)*30+Math.abs(a)*360));

			System.out.println("##############################################################################################################################");
			System.out.println("¿Realizar otra operacion?: SI/NO");		
			otra = leer.next();	
			}while(otra.equals("SI"));
			System.out.println("¿Volver al menu principal?: SI/NO");
			otra = leer.next();
			if (otra.equals("SI")){
				System.out.println("##############################################################################################################################");
				menu();}
			
}
	static void area() {

		String otra = null;
		System.out.println("Calcula el area y perimetro de la figura seleccionada:  ");
		do{
		System.out.println("Ingresa la LETRA que corresponde a la figura deseada:  ");
		System.out.println();
		System.out.println("C: Circunferencia  ");
		System.out.println("U: Cuadrado ");
		System.out.println("T: Triangulo Equilatero");
		String f = leer.next();
		for (int i=0;i<6;i++)
		    System.out.println(" ");
		switch(f){
		case("C"):{
			System.out.println("Ingresa el radio:  ");
			float r = leer.nextFloat();
			System.out.println("Area: "+ (Math.PI*r*r)+" Unidades Cuadradas");
			System.out.println("Perimetro: "+(2*Math.PI*r)+" Unidades Lineales");
			};break;
		case("U"):{
			System.out.println("Ingresar lado:  ");
			float l = leer.nextFloat();
			System.out.println("Area: "+ (l*l)+"Unidades Cuadradas");
			System.out.println("Perimetro: "+(4*l)+" Unidades Lineales");
			};break;
		case("T"):{
			System.out.println("Ingresar lado:  ");
			float l = leer.nextFloat();
			System.out.println("Area: "+ ((((Math.sqrt(3))/2)*l)/2)+" Unidades Cuadradas");
			System.out.println("Altura: "+(((Math.sqrt(3))/2)*l)+" Unidades Lineales");
			System.out.println("Perimetro: "+(3*l)+" Unidades Lineales");
			};break;
		}System.out.println("¿Realizar otro cálculo?: SI/NO");
		otra = leer.next();
		
		}while(otra.equals("SI"));
		System.out.println("##############################################################################################################################");
		System.out.println("¿Volver al menu principal?: SI/NO");
		otra = leer.next();
		if (otra.equals("SI")){
			System.out.println("##############################################################################################################################");
			menu();}
	
	}
	static void hora() {
		
		String otra;
		do{
			String h24,m,h;
			for (int i=0;i<3;i++)
		    	System.out.println(" ");
			System.out.println("Programa que lee la hora en notacion de 24 hrs y la devuelve en notacion 12 hrs. ");
				for (int i=0;i<3;i++)
			    	System.out.println(" ");
			do{
				System.out.println("Ingresa la hora en Notacion 24 hrs. (Ej. 17:00)");
				h24 = leer.next();m="";h="";
				h = h+((h24.charAt(0)))+((h24.charAt(1)));
				m = m+((h24.charAt(3)))+((h24.charAt(4)));
			}while(h24.length()!=5 || h24.charAt(2)!=':'||Integer.parseInt(m)>59 ||Integer.parseInt(h)>23);
			if (Integer.parseInt(h)!=0 && Integer.parseInt(h)<12)
				System.out.println(h+":"+m+" AM");
			else if (Integer.parseInt(h)!=0 && Integer.parseInt(h)>12)
				System.out.println((Integer.parseInt(h)-12)+":"+m+" PM");
			else if (Integer.parseInt(h)==12)
				System.out.println((Integer.parseInt(h))+":"+m+" PM");
			else if (Integer.parseInt(h)==0)
				System.out.println("12"+":"+m+" AM");
			
			
			System.out.println("##############################################################################################################################");
			System.out.println("¿Realizar otra operacion?: SI/NO");		
			otra = leer.next();	
			}while(otra.equals("SI"));
			System.out.println("¿Volver al menu principal?: SI/NO");
			otra = leer.next();
			if (otra.equals("SI")){
				System.out.println("##############################################################################################################################");
				menu();}
		
		
		
	}	
	static void promedio() {
		Object otra;
		do{
			float p=0,n;
				System.out.println("Se muestra el Promedio y Puntuacion de: 6 NOTAS INGRESADAS");
				for (int i=0;i<5;i++)
			    	System.out.println(" ");
			    
			for(int i=1;i<7;i++){
				System.out.println("Ingresar Nota "+i);
				n=leer.nextFloat();
				p+=n;
			}
			for (int i=0;i<5;i++)
		    	System.out.println(" ");
			if (p/6>0 && p/6<60)
				System.out.println("Media: "+ (p/6) + "  Puntuacion: " + " E");
			if (p/6>59 && p/6<70)
				System.out.println("Media: "+ (p/6) + "  Puntuacion: " + " D");
			if (p/6>69 && p/6<80)
				System.out.println("Media: "+ (p/6) + "  Puntuacion: " + " C");
			if (p/6>79 && p/6<90)
				System.out.println("Media: "+ (p/6) + "  Puntuacion: " + " B");
			if (p/6>89)
				System.out.println("Media: "+ (p/6) + "  Puntuacion: " + " A");
			for (int i=0;i<5;i++)
		    	System.out.println(" ");
			
			
			System.out.println("##############################################################################################################################");
			System.out.println("¿Realizar otro calculo	?: SI/NO");		
			otra = leer.next();	
			}while(otra.equals("SI"));
			System.out.println("¿Volver al menu principal?: SI/NO");
			otra = leer.next();
			if (otra.equals("SI")){
				System.out.println("##############################################################################################################################");
				menu();}
		
		
		
		
	
}
	static void rombo() {
	  
		String otra;
		do{
				System.out.println("Se muestra un rombo de asteriscos: ");
				for (int i=0;i<6;i++)
			    	System.out.println(" ");
				
				for (int i=1;i<6;i++){
			    	for(int j=25-i;j>0;j--){
			    		System.out.print(" ");
			    	}
			    	for (int k=1;k<=2*i-1;k++){
			    		System.out.print("*");
			    	}
			    	System.out.println(" ");
			    }
				for (int i=1;i<5;i++){
					for (int j=1;j<=i+20;j++)
						System.out.print(" ");
					for (int k=1;k<=9-2*i;k++)
						System.out.print("*");
					System.out.println(" ");
				}
				for (int i=0;i<6;i++)
			    	System.out.println(" ");
			
			
			System.out.println("##############################################################################################################################");
			System.out.println("¿Volver a ejecutar?: SI/NO");		
			otra = leer.next();	
			}while(otra.equals("SI"));
			System.out.println("¿Volver al menu principal?: SI/NO");
			otra = leer.next();
			if (otra.equals("SI")){
				System.out.println("##############################################################################################################################");
				menu();}
		
		
}
	public static void main(String[] args) {
		menu();
	}
}  

