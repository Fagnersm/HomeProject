
package br.com.sistcomp.dao;

import br.com.sistcomp.model.Cidade;
import java.util.List;
import javax.ejb.Local;

/**
 * Interface que sera implementada por cidadeDaoImplements.
 *
 * @author Fagner Silva Martins, fagnar.silva@sistcomp.com.br
 * @version 1.0
 * @since 06/09/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@Local
public interface cidadeDao {
    
    public void   salvarCidade (Cidade cidade);
    public void   removerCidade(Cidade cidade);
    public Cidade buscarCidade (Cidade cidade);
    public List <Cidade> listarCidades();    
    
}
