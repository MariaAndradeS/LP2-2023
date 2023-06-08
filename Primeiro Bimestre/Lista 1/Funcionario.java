public class Funcionario extends Pessoa {
	
	private String rg;
	private String cpf;
	
	public Funcionario() {
		super();
		this.rg = "";
		this.cpf = "";
	}
	public Funcionario( String nome, Integer dia, Integer mes, Integer ano, String rg, String cpf ) {
		super( nome, dia, mes, ano );
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		
	public String toString() {
		return super.toString() + "Funcionario [rg=" + rg + ", cpf=" + cpf + "]";
	}
			
}