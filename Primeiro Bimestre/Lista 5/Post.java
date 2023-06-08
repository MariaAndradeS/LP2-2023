package lista5;

import java.time.LocalDateTime;

public class Post implements Comparable<Post> {

	private LocalDateTime dataHorario;
	private String texto;
	
	public Post() {
		this.dataHorario = LocalDateTime.now();
		this.texto = "";
	}
	public Post( String texto, 
			Integer dia, 
			Integer mes, 
			Integer ano,
			Integer hora,
			Integer minuto,
			Integer segundo
	) {
		this.dataHorario = LocalDateTime.of(
				ano, 
				mes,
				dia, 
				hora, 
				minuto, 
				segundo
		);
		this.texto = texto;
	}
	
	public LocalDateTime getDataHorario() {
		return dataHorario;
	}
	public void setDataHorario(LocalDateTime dataHorario) {
		this.dataHorario = dataHorario;
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHorario == null) ? 0 : dataHorario.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
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
		Post other = (Post) obj;
		if (dataHorario == null) {
			if (other.dataHorario != null)
				return false;
		} else if (!dataHorario.equals(other.dataHorario))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Post [dataHorario=" + dataHorario + ", texto=" + texto + "]";
	}
	@Override
	public int compareTo(Post o) {
		return this.getDataHorario().compareTo( o.getDataHorario() );
	}
	
	
	
}