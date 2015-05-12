import java.util.Scanner;
public class Tarea3 {
	public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	System.out.println("Ingresa un Numero");
	int n = num.nextInt(); 
	if (n%2==0)
		System.out.println("El numero es par");
	else
		System.out.println("El numero es impar");
	}
}