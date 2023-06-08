
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Bytes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Boolean sair = true;
		do {
			try {
				
					System.out.println("Digite o nome do arquivo: ");
					String arquivo = sc.nextLine();				
					FileInputStream in = new FileInputStream(arquivo);
					sair = false;
					int c = 0;
					while( ( c = in.read() ) != -1 )
						System.out.println(c);
				
			} 
			catch (FileNotFoundException e) {
				System.out.println("Arquivo não encontrado !!");
			} 
			catch (IOException e) {
				System.out.println("Falha na leitura do arquivo !!");
			}
		}
		while( sair );
	}

}