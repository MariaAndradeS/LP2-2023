=
import java.util.Collections;

public class Mensagens {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.setNome("Maria");
		
		Post p2 = new Post("mensagem teste 1",10,4,2023,5,5,5);
		Post p3 = new Post("mensagem teste 2",11,4,2023,8,8,8);
		Post p1 = new Post("mensagem teste 3",11,4,2023,10,10,10);
		
		u1.getLista().add(p1);
		u1.getLista().add(p2);
		u1.getLista().add(p3);
		
		for( Post p: u1.getLista() )
			System.out.println( p );
		
		System.out.println( "----------------------------" );
				
		Collections.sort( u1.getLista() );
		
		for( Post p: u1.getLista() )
			System.out.println( p );
	}

}