
import java.time.LocalDate;

public class Navio {

	private String nome;
	private LocalDate funcionamento;
	
	public Navio() {
		this.nome = "";
		this.funcionamento = LocalDate.now();
	}	
	public Navio( String nome, Integer dia, Integer mes, Integer ano ) {
		this.nome = "";
		this.funcionamento = LocalDate.of( ano, mes, dia);
	}
	public Navio( String nome ) {
		this.nome = nome;
		this.funcionamento = LocalDate.now();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getFuncionamento() {
		return funcionamento;
	}
	public void setFuncionamento(LocalDate funcionamento) {
		this.funcionamento = funcionamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((funcionamento == null) ? 0 : funcionamento.hashCode());
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
		Navio other = (Navio) obj;
		if (funcionamento == null) {
			if (other.funcionamento != null)
				return false;
		} else if (!funcionamento.equals(other.funcionamento))
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
		return "Navio [nome=" + nome + ", funcionamento=" + funcionamento + "]";
	}
	
	
}