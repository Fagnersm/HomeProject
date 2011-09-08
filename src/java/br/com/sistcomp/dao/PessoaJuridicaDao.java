package br.com.sistcomp.dao;

import br.com.sistcomp.model.PessoaJuridica;
import java.util.List;
import javax.ejb.Local;
/**
 * Interface que sera implementada por PessoaJuridicaDaoImplements.
 *
 * @author Fagner Silva Martins, fagnar.silva@sistcomp.com.br
 * @version 1.0
 * @since 06/09/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@Local
public interface PessoaJuridicaDao {
    
    public void salvarPessoaJuridica(PessoaJuridica pessoaJuridica);
    public void removerPessoaJuridica(PessoaJuridica pessoaJuridica );
    public PessoaJuridica buscarPessoaJuridica (PessoaJuridica pessoaJuridica );
    public List <PessoaJuridica> listarPessoaJuridica();
    
}
