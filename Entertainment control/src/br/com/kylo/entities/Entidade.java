package br.com.kylo.entities;

public abstract class Entidade {

	private long id;
	
	Entidade(long id){
		
		this.id=id;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
