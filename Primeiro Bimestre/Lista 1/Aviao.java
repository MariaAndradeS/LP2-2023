
public class Aviao {

	private String fabricante;
	private String tipo;
	
	public Aviao() {
		this.fabricante = "";
		this.tipo = "";
	}
	public Aviao( String fabricante, String tipo ) {
		this.fabricante = fabricante;
		this.tipo = tipo;
	}
	public Aviao( String fabricante ) {
		this.fabricante = fabricante;
		this.tipo = "";
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Aviao other = (Aviao) obj;
		
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		
		return true;
		
	}
	
	public String toString() {
		return "Aviao [fabricante=" + fabricante + ", tipo=" + tipo + "]";
	}	
			
}