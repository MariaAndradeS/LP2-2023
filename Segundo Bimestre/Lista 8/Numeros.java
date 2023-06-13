
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String resposta = "";
				
		for( int a = 1; a <=10; a++ ) {
			System.out.println("Digite o numero " + a + ": ");
			int numero = sc.nextInt();			
			resposta = resposta + numero;
			resposta = resposta + " ";
		}
		
		FileWriter out = null;
		
		try {
			out = new FileWriter("num.txt");			
			for( int b = 0; b < resposta.length(); b++ ) {
				out.write( resposta.charAt(b) );
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				out.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}