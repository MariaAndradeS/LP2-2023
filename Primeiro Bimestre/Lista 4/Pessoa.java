
public class Pessoa {

	private String nome;
	private RG identidade;
	
	public Pessoa() {
		this.nome = "";
		this.identidade = new RG();
	}
	
	public Pessoa( String nome, String numero, Integer dia, Integer mes, Integer ano ) {
		this.nome = nome;
		this.identidade = new RG( numero, dia, mes, ano );
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public RG getIdentidade() {
		return identidade;
	}
	public void setIdentidade(RG identidade) {
		this.identidade = identidade;
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		
		int result = 1;
		
		result = prime * result + ((identidade == null) ? 0 : identidade.hashCode());
		
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		
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
		
		Pessoa other = (Pessoa) obj;
		
		if (identidade == null) {
			if (other.identidade != null)
				return false;
		} else if (!identidade.equals(other.identidade))
			return false;
		
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		
		return true;
		
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", identidade=" + identidade + "]";
	}
		
}