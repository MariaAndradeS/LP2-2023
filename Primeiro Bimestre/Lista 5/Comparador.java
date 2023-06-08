package lista5;

import java.util.Comparator;

public class ComparadorNome implements Comparator<Usuario>{

	@Override
	public int compare(Usuario u1, Usuario u2) {
		return u1.getNome().compareTo(u2.getNome() );
	}

}