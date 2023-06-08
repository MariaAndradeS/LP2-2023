
import java.util.ArrayList;

public class MetodosList {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		// método add adiciona elemento ao final do vetor e retorna;
		// retorna true ou false para a inclusão do elemento
		
		System.out.println( lista.add(10) );
		
		System.out.println( lista.add(20) );
		
		// método addAll adiciona no vetor os elementos do vetor que foi passado como argumento do método;
		// retorna true ou false para a inclusão dos elementos
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(3);
		lista2.add(3);
		lista2.add(3);
		
		System.out.println( lista.addAll(lista2) );
		
		for( Integer x: lista )
			System.out.println( x );
		
		// método indexOf retorna posição da primeira ocorrência do elemento, ou -1 se não encontrar;
		// retorna um valor inteiro
		
		System.out.println( "posição no vetor: " + lista.indexOf(3) );
		
		// método lastIndexOf retorna posição da última ocorrência do elemento, ou -1 se não encontrar;
		// retorna um valor inteiro
		
		System.out.println( "posição no vetor: " + lista.lastIndexOf(3) );
		
		// método retainAll mantém no vertor apenas os elementos que estão armazenados no vetor passado como argumento;
		// retorna true ou false para a sucesso da operação
		
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		lista3.add(10);
		lista3.add(20);
		
		lista.retainAll(lista3);
		
		for( Integer x: lista )
			System.out.println( x );
		
	}

}