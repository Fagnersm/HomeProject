package br.com.sistcomp.dao;

import br.com.sistcomp.model.Bairro;
import java.util.List;
import javax.ejb.Local;

/**
 * Interface que sera implementada por bairroDaoImplements.
 *
 * @author Fagner Silva Martins, fagnar.silva@sistcomp.com.br
 * @version 1.0
 * @since 06/09/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@Local
public interface BairroDao {
    
    public void   salvarBairro (Bairro bairro);
    public void   removerBairro(Bairro bairro);
    public Bairro buscarBairro (Bairro bairro);
    public List   <Bairro> listarBairros();
    
}
