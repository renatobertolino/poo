package br.com.kylo.entities;

public class Serie extends Entidade{

	private String nome;
	private int numeroTemporadas;
	private int temporadasAssistidas;
	
	Serie(String nome, int numeroTemporadas,int temporadasAssistidas, long id){
		super(id);
		this.nome = nome;
		this.numeroTemporadas = numeroTemporadas;
		this.temporadasAssistidas = temporadasAssistidas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public int getTemporadasAssistidas() {
		return temporadasAssistidas;
	}

	public void setTemporadasAssistidas(int temporadasAssistidas) {
		this.temporadasAssistidas = temporadasAssistidas;
	}
}
