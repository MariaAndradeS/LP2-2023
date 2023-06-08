
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Frases {

	public static void main(String args[]) {
	
		HashMap<String, Integer> mapa = new HashMap<String,Integer>();
		HashSet<String> valores = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		String frase = "";
		
		do {
			
			System.out.println("Digite a frase:");			
			frase = sc.nextLine();		
			StringTokenizer st = new StringTokenizer(frase);			
			while( st.hasMoreElements() )
				valores.add( st.nextToken() );
			
			if( !frase.isBlank() )
				mapa.put(frase, valores.size() );
			
			valores.clear();
		}
		while( ! frase.isBlank() );			
		
		for( String f: mapa.keySet() )
			System.out.println( f + " - " + mapa.get(f) );		
		
	}
	
}