
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Media {

	public static void main(String[] args) {
		
		FileReader in = null;
		String resposta = "";
		ArrayList<Double> valores = new ArrayList<Double>();
		Double total = 0.0;
		Double media = 0.0;
		
		try {			
			in = new FileReader("notas.txt");
			int c;
			while( ( c = in.read() ) != -1 ) {
				Character x = (char) c;
				resposta = resposta + x.toString();	
			}
			
			StringTokenizer w = new StringTokenizer(resposta);
			
			while( w.hasMoreElements() )
				valores.add( Double.parseDouble( w.nextToken() ) );
			
			for( Double q: valores )
				total = total + q;
			
			media = total / 4;			
			System.out.println( "media: " + media );			
		} 
		catch (FileNotFoundException e) {			
			e.printStackTrace();
		} 
		catch (IOException e) {			
			e.printStackTrace();
		}	
		
	}

}