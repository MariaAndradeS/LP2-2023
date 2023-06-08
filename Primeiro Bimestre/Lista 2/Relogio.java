
public class Relogio {

	private String marca;
	private String cor;
	private Boolean tamanho;
	
	public Relogio() {
		this.marca = "";
		this.cor = "";
		this.tamanho = false;
	}
	public Relogio( String marca, String cor, Boolean tamanho ) {
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
	}
	public Relogio(String marca, Boolean tamanho) {
		this.marca = marca;
		this.cor = "";
		this.tamanho = tamanho;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Boolean getTamanho() {
		return tamanho;
	}
	public void setTamanho(Boolean tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
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
		Relogio other = (Relogio) obj;
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
		if (tamanho == null) {
			if (other.tamanho != null)
				return false;
		} else if (!tamanho.equals(other.tamanho))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Relogio [marca=" + marca + ", cor=" + cor + ", tamanho=" + tamanho + "]";
	}
		
}