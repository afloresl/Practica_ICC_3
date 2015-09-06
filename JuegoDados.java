import java.util.*;

public class Main{
    public static void main(String[] pps) {

	int valor1;
	int valor2;
	int valor3;
	int valor4;
	int producto1;
	int producto2; 
	String nombre;

	Scanner entrada = new Scanner(System.in);
	// se solicita el nombre del jugador
	System.out.println("Este es un programa para jugar dados contra la computadora");
	System.out.println("Por favor ingresa tu nombre: ");
	nombre = entrada.nextLine();

	// el jugador tira el primer dado
	System.out.println("Tira el dado (pulsa Enter)");
	while(!entrada.nextLine().equals(""));
	valor1=(int)(Math.random()*3)+1;
	System.out.println("Salio: " + valor1);
	// el jugar tira el segundo dado
	System.out.println("Tira de nuevo el dado (pulsa Enter)");
	while(!entrada.nextLine().equals(""));
	valor2=(int)(Math.random()*3)+1;
	System.out.println("Salio: " + valor2);
	// se calcula el valor de los dos dados
	producto1 = valor1 * valor2;
	// se imprime el resultado de los dados del jugador
	System.out.println("El producto de ambos dados es: " + producto1);

	// la computadora tira dos dados y se muestran los resultados
	System.out.println("Computadora: Ahora es mi turno...");
	valor3=(int)(Math.random()*3)+1;
	System.out.println("Salio: " + valor3);
	valor4=(int)(Math.random()*3)+1;
	System.out.println("Salio: " + valor4);
	producto2 = valor3 * valor4;
	// se imprime el resultado de los dados del jugador
	System.out.println("El producto de ambos dados es: " + producto2);
		//se evalua quien es el ganador
		if(producto1>producto2){
	    System.out.println("Tu ganas " + nombre + ". Has tenido un poco de suerte...");
	}else if (producto1 == producto2){
		 System.out.println("Empate");
	}else{
	   System.out.println("Yo gano");
	}
 }
}
