package com.br.farmacia.contrato;

import java.util.List;

/**
 *
 * @author gabriel
 */
public interface iCrudDao<E> {

    public void salvar(E entidade) throws Exception;

    public void deletar(E entidade) throws Exception;

    public void atualizar(E entidade) throws Exception;

    public List<E> buscar(E entidade) throws Exception;
}
