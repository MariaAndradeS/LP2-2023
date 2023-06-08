
import java.util.HashSet;
import java.util.Iterator;

public class MetodosSet {

	public static void main(String[] args) {
		
		HashSet<Integer> lista = new HashSet<Integer>();
		
		// método add adiciona elemento ao final do vetor e retorna;
		// retorna true ou false para a inclusão do elemento
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		for( Integer x: lista )
			System.out.println( x );	
		
		System.out.println("-------------------------------------");
		
		// método contains verifica se existe o elemento armazenado no vetor;
		// retorna um valor true caso encontre o objeto no vetor ou false caso contrário;
		
		System.out.println( lista.contains(5) );
		System.out.println( lista.contains(1) );
		
		System.out.println("-------------------------------------");
		
		// método containsAll verifica se existe os elementos armazenados no vetor;
		// retorna um valor true caso encontre TODOS objetos no vetor ou false caso contrário;
		
		HashSet<Integer> lista2 = new HashSet<Integer>();
		lista2.add(1);
		lista2.add(2);
		
		HashSet<Integer> lista3 = new HashSet<Integer>();
		lista3.add(5);
		lista3.add(2);
		
		System.out.println( lista.containsAll( lista2 ) );
		System.out.println( lista.containsAll( lista3 ) );
		
		System.out.println("-------------------------------------");
		
		// método iterator retorna objeto Iterator utilizado para navegar entre os objetos do vetor;
		
		Iterator<Integer> it = lista.iterator();
		
		while( it.hasNext() ) {
			  System.out.println( it.next() );
		}
		
		System.out.println("-------------------------------------");
		
		// método removeAll remove os elementos armazenados no vetor passado como argumento;
		// retorna um valor true caso remova os elementos do vetor ou false caso contrário;
		
		lista.removeAll(lista2);
		
		for( Integer x: lista2 )
			System.out.println( x );		
		
	}

}