import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mensagem {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);		
		System.out.println("Digite sua mensagem:");		
		String resposta = sc.nextLine();		
		
		FileWriter out = null;
		
		try {
			out = new FileWriter("mensagem.txt");
			for( int a = 0; a < resposta.length(); a++ ) {
				System.out.print( resposta.charAt(a) );
				out.write( resposta.charAt(a) );
			}
		}
		catch(IOException e) {
			System.out.print( "Arquivo não encontrado" );
		}
		finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}