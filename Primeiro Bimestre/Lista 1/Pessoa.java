import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private LocalDate nascimento;
	
	public Pessoa() {
		this.nome = "";
		this.nascimento = LocalDate.now();
	}
	public Pessoa( String nome, Integer dia, Integer mes, Integer ano ) {
		this.nome = nome;
		this.nascimento = LocalDate.of(ano, mes, dia);
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
		
	public String toString() {
		return "Pessoa [nome=" + nome + ", nascimento=" + nascimento + "]";
	}
}