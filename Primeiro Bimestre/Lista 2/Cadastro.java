
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
	
	private ArrayList<Carro> lista;
	private Scanner leitor;
	
	public Cadastro() {
		lista = new ArrayList<Carro>();
		leitor = new Scanner(System.in);
		Integer opcao = 0;
		
		do {
			
			System.out.println("Menu de opções:");
			System.out.println("1 - cadastrar carro");
			System.out.println("2 - listar carros");
			System.out.println("3 - sair");
			
			opcao = leitor.nextInt();
			
			if( opcao.equals(1) )
				cadastrar();
			
			if( opcao.equals(2) )
				listar();
			
			if( opcao.equals(3) )
				sair();
			
			System.out.println("\n-----------------------------------------------\n");
			
		}while( opcao < 3 );
	}
		
	
	public void cadastrar() {		
		System.out.println("\n\nDigite a marca do carro: ");	
		String marca = leitor.next();
		System.out.println("\n\nDigite a modelo do carro: ");	
		String modelo = leitor.next();
		System.out.println("\n\nDigite a cor do carro: ");	
		String cor = leitor.next();
		lista.add( new Carro( marca, modelo, cor ) );
		if( lista.size() == 1 )
			System.out.println( "\n\n" + lista.size() + " carro cadastrado");	
		else
			System.out.println( "\n\n" + lista.size() + " carros cadastrados");	
	}
	
	public void listar() {
		System.out.println("\n\nLista de Carros\n");		
		for( Carro a : lista )
			System.out.println( a );
	}
	
	public void sair() {
		System.out.println("\n\nFim do programa\n");		
	}

}