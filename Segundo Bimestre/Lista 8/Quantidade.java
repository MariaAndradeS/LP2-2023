
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Quantidade {

	public static void main(String[] args) {
		
		FileReader in = null;
		Integer vogais = 0;
		Integer consoantes = 0;
		Integer outros = 0;
		ArrayList<Character> conso = new ArrayList<Character>();
		conso.add('b');conso.add('c');conso.add('d');conso.add('f');conso.add('g');conso.add('h');
		conso.add('j');conso.add('k');conso.add('l');conso.add('m');conso.add('n');conso.add('p');
		conso.add('q');conso.add('r');conso.add('s');conso.add('t');conso.add('v');conso.add('w');		
		conso.add('y');conso.add('x');conso.add('z');
		try {
			in = new FileReader("x.txt");
			int c;
			while( ( c = in.read() ) != -1 ) {
				Character x = (char) c;
				x = Character.toLowerCase(x);
				if( x.equals('a') || x .equals('e') || x .equals('i') || x .equals('o') || x .equals('u') ) {
					vogais++;
				}	
				else if( conso.contains(x) ) {
					consoantes++;
				}
				else {
					outros++;
				}
			}
			
		} 
		catch (FileNotFoundException e) {			
			e.printStackTrace();
		} 
		catch (IOException e) {			
			e.printStackTrace();
		}	
		
		System.out.println("vogais:" + vogais);
		System.out.println("consoantes:" + consoantes);
		System.out.println("outros:" + outros);

	}

}