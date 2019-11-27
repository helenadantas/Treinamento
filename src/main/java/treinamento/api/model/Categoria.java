package treinamento.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {
	@Id
	private Long codigo;
	
	@Column
	private String nome;
	
	public Categoria(Long codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Categoria() {
		
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}	
