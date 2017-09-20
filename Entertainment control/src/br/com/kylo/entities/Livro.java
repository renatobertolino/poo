package br.com.kylo.entities;

public class Livro extends Entidade{

	private String nome;
	private String autor;
	
	Livro(String nome,String autor, long id){
		super(id);
		this.nome = nome;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
