package br.com.sistcomp.dao;

import br.com.sistcomp.model.Imovel;
import java.util.List;
import javax.ejb.Local;

/**
 * Classe ImovelDao que representa uma interface dao.
 *
 * @author Renan Oliveira, renan.oliveira@dce.ufpb.br
 * @version 1.0
 * @since 31/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */

@Local
public interface ImovelDao {

    public void salvarImovel(Imovel imovel);
    public void removerImovel(Imovel imovel);
    public Imovel alterarImovel(Imovel imovel);
    public Imovel buscarImovel(Imovel imovel);
    public List<Imovel> listarImoveis();

}
