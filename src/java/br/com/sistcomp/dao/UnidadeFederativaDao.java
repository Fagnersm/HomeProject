package br.com.sistcomp.dao;

import br.com.sistcomp.model.UnidadeFederativa;
import java.util.List;
import javax.ejb.Local;

/**
 * Interface que sera implementada por unidadeFederativaDaoImplements.
 *
 * @author Fagner Silva Martins, fagnar.silva@sistcomp.com.br
 * @version 1.0
 * @since 06/09/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@Local
public interface UnidadeFederativaDao {
    
    public void   salvarUnidadeFederativa (UnidadeFederativa unidadeFederativa );
    public void   removerUnidadeFederativa(UnidadeFederativa unidadeFederativa );
    public UnidadeFederativa buscarUnidadeFederativa (UnidadeFederativa unidadeFederativa );
    public List   <UnidadeFederativa>     listarUnidadeFederativa();
    
}
