public class Mobile {

	private String marca;
	private String modelo;
	
	public Mobile() {
		this.marca = "";
		this.modelo = "";
	}
	public Mobile( String marca, String modelo ) {
		this.marca = marca;
		this.modelo = modelo;
	}
	public Mobile( String marca ) {
		this.marca = marca;
		this.modelo = "";
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
		
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Mobile other = (Mobile) obj;
		
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
		return "Mobile [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
}