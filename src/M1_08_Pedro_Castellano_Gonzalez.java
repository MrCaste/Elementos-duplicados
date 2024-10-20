import java.util.Scanner;

public class M1_08_Pedro_Castellano_Gonzalez {

	public static void main(String[] args) {
		
		/* En la primera parte le vamos a pedir al usuario que nos indique el tamaño del array y que introduzca los numeros
		 * que desee poner
		 */
		
		System.out.print("Indique el tamaño del array: ");
		
		Scanner sc = new Scanner(System.in);
		
		int numeros = sc.nextInt();
		int [] arrayNumerico = new int [numeros];
		int [] numDuplicados = new int [arrayNumerico.length];
		boolean contado;
		int contador, k, numContados = 0;
		
		
		
		
		System.out.println("Introduzca los numeros del array: ");
		
		for (int i = 0; i < arrayNumerico.length; i++) {
			
			arrayNumerico [i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.print("Los numeros duplicados son el numero: ");
		
		/*
		 * primer for del bucle, recorremos el primer array con un contador que servira para contar cada numero en el segundo for
		 * y se inicializara a 1 cada vez que comience el primero, una variable k que servira para comparar el numero actual por los que
		 * tiene antes en el array y si son iguales que deje de contarlo con la variable contado que simplemente es un boolean que se
		 * inicializa a false cada vez que comienza el bucle y pasa a true cada vez que un numero anterior sea igual que actual dentro del while
		 * para que se salte el if a continuacion.
		 */
		
		for (int i = 0; i < arrayNumerico.length; i++) {
			contador = 1;
			contado = false;
			k = 0;
			
			while((!contado) && (k<numContados)) {
				
				if(arrayNumerico[i] == numDuplicados[k]) {
					contado = true;
				}
				k++;
			}
			
			/*
			 * segundo bucle dentro del if, entrara solo si contado es falso, ya que si es verdadero ya habremos contado ese numero
			 * y no sera necesario volver a contarlo, en caso que sea un numero nuevo, lo guardamos en otro array para compararlo en el while
			 * de arriba que tiene el mismo tamaño que el array original, despues en el segundo bucle for, recorreremos de nuevo el array
			 * para contar los numeros que se repiten del numero i del primer bucle sumandolo al contador, finalmente imprimimos el numero
			 * solo si en el contador ha contado almenos 1 vez dicho numero.
			 */
			if(!contado) {
				
				numDuplicados[numContados] = arrayNumerico[i];
				numContados++;
				
					for (int j = 0; j < arrayNumerico.length; j++) {	
						if(j != i && arrayNumerico[i] == arrayNumerico[j]) {
								
								contador++;		
						}
					
					}
							if(contador > 1)
							System.out.print(arrayNumerico[i]+", ");
							
			}
		}
		
	}
		
		
			
		

}
