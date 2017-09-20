package br.com.kylo.dao;

import br.com.kylo.entities.Entidade;

public interface IDao {

	void inserir(Entidade e);
	void deletar(long id);
	void atualizar(Entidade e);
	<T> Entidade list();
}
