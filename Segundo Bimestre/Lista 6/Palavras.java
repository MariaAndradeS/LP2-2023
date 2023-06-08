
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Palavras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a frase: ");
		String frase = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer( frase );
		
		HashSet<String> palavras = new HashSet<String>();
		
		while( st.hasMoreElements() )
			palavras.add( st.nextToken() );
		
		for( String x: palavras )
			System.out.println( x );

	}

}