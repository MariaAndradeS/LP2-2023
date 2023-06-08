
import java.util.HashMap;

public class MetodosMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> mapa = new HashMap<String,Integer>();
		
		// V put(K key, V value) - método para incluir chave e valor
		
		mapa.put("bernardo", 50);
		mapa.put("marcia", 40);
		mapa.put("gabriel medina", 28);
		
		// Set<K> keySet() - método retorna uma coleção do tipo Set com as chaves do Mapa
		
		for( String c: mapa.keySet() )
			System.out.println( c + " - " + mapa.get(c) );
		
		//  boolean	containsKey(Object key) - método retorna true se encontrar a chave no mapa
		
		System.out.println( mapa.containsKey("bernardo") );
		
		// void clear() - método para limpar o mapa
		
		mapa.clear();
		
	}

}