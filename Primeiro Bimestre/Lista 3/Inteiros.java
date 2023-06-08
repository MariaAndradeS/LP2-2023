
import java.util.ArrayList;
import java.util.Scanner;

public class Inteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		do {
			System.out.println("Digite o valor do elemento " + (lista.size()+1) + " : " );
			Integer valor = sc.nextInt();
			lista.add(valor);
		}
		while( lista.size() < 5 );
		
		for( Integer i: lista )
			System.out.println( i );
		
		sc.close();
		
	}

}