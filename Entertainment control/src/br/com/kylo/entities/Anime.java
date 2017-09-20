package br.com.kylo.entities;

public class Anime extends Entidade{

	private String nome;
	private int quantidadeEpisodios;
	private int episodiosAssistidos;
	
	Anime(String nome, int quantidadeEpisodios, int episodiosAssistidos,long id){
		super(id);
		this.nome = nome;
		this.quantidadeEpisodios = quantidadeEpisodios;
		this.episodiosAssistidos = episodiosAssistidos;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeEpisodios() {
		return quantidadeEpisodios;
	}

	public void setQuantidadeEpisodios(int quantidadeEpisodios) {
		this.quantidadeEpisodios = quantidadeEpisodios;
	}

	public int getEpisodiosAssistidos() {
		return episodiosAssistidos;
	}

	public void setEpisodiosAssistidos(int episodiosAssistidos) {
		this.episodiosAssistidos = episodiosAssistidos;
	}

	
	
}
