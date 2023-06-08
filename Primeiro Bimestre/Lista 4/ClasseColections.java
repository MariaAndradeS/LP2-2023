
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ClasseColections {

	public static void main(String[] args) {
		
		// A classe java.util.Collections é uma classe utilitária introduzida no Java 1.2 
		// que fornece métodos estáticos para auxiliar na manipulação de objetos armazenados 
		// em coleções Java.
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		Random random = new Random();
		
		do {
			lista.add( random.nextInt(1, 10));
		}
		while( lista.size() < 5 );
			
		// min: retorna o menor valor do vetor
		System.out.println("Menor valor: " + Collections.min(lista) );
		
		// max: seleciona o maior valor do vetor 
		System.out.println("Maior valor: " + Collections.max(lista) );
		
		for( Integer i: lista )
			System.out.println( i );
		
		System.out.println("-------------------------" );
		
		// reverseOrder: coloca os elementos em ordem inversa;
		
		Collections.sort( lista, Collections.reverseOrder() );
		
		for( Integer i: lista )
			System.out.println( i );
		
		System.out.println("-------------------------" );
		
		// sort: ordena elementos no vetor;
		
		Collections.sort( lista );
		
		for( Integer i: lista )
			System.out.println( i );
		
		System.out.println("-------------------------" );
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		lista2.add(500);
		lista2.add(500);
		
		// copy: copia os elementos de um vetor para outro vetor;
		// verifique que os elementos são sobrepostos.
		
		Collections.copy( lista, lista2 );
		
		for( Integer i: lista )
			System.out.println( i );
		
		
		
	}

}