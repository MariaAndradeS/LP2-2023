
import java.time.LocalDate;

public class RG {

	private String numero;
	private LocalDate nascimento;
	
	public RG() {
		this.numero = "";
		this.nascimento = LocalDate.now();
	}
	public RG( String numero, Integer dia, Integer mes, Integer ano ) {
		this.numero = numero;
		this.nascimento = LocalDate.of( ano, mes, dia );
	}
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		
		int result = 1;
		
		result = prime * result + ((nascimento == null) ? 0 : nascimento.hashCode());
		
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		RG other = (RG) obj;
		
		if (nascimento == null) {
			if (other.nascimento != null)
				return false;
		} else if (!nascimento.equals(other.nascimento))
			return false;
		
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "[numero=" + numero + ", nascimento=" + nascimento + "]";
	}
	
	
}