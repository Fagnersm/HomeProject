package br.com.sistcomp.dao;

import br.com.sistcomp.model.PessoaFisica;
import java.util.List;
import javax.ejb.Local;
/**
 * Interface que sera implementada por PessoaFisicaDaoImplements.
 *
 * @author Fagner Silva Martins, fagnar.silva@sistcomp.com.br
 * @version 1.0
 * @since 06/09/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@Local
public interface PessoaFisicaDao {
    
    public void salvarPessoaFisica(PessoaFisica pessoaFisica);
    public void removerPessoaFisica(PessoaFisica pessoaFisica );
    public PessoaFisica buscarPessoaJuridica(PessoaFisica pessoaFisica );
    public List <PessoaFisica> listarPessoaFisica();
    
}
