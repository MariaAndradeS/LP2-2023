
public class Carro {

	private String marca;
	private String modelo;
	private String cor;
	
	public Carro() {
		this.marca = "";
		this.modelo = "";
		this.cor = "";
	}
	public Carro( String marca, String modelo, String cor ) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	public Carro( String marca, String modelo ) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = "";
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Carro other = (Carro) obj;
		
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		
		return true;
	}
	
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + "]";
	}
		
}