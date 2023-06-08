
import java.util.ArrayList;
import java.util.Collections;

public class Usuarios {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.setNome("Maria");
		
		Usuario u2 = new Usuario();
		u2.setNome("Cain");
		
		Usuario u3 = new Usuario();
		u3.setNome("Bea");
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		lista.add(u1);
		lista.add(u2);
		lista.add(u3);
		
		for( Usuario u: lista )
			System.out.println( u );
		
		System.out.println( "----------------------------" );
				
		Collections.sort( lista, new ComparadorNome() );
		
		for( Usuario u: lista )
			System.out.println( u );
			
		
		
	}

}