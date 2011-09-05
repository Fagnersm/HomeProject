package br.com.sistcomp.dao;

import br.com.sistcomp.model.Imovel;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 * Classe ImovelDao que representa uma interface dao.
 *
 * @author Renan Oliveira, renan.oliveira@dce.ufpb.br
 * @version 1.0
 * @since 31/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */

@Stateless(name = "ImovelDaoImpl")
public class ImovelDaoImpl implements ImovelDao {


    @PersistenceContext(name="HomeProjectPU")
    private EntityManager entityManager;

    /**
     *
     * Esse método é responsável por salvar uma Entidade
     * Imovel no banco de dados.
     * @param Um objeto imovel
     *
     */
    @Override
    public void salvarImovel(Imovel imovel) {

        try {

            entityManager.persist(imovel);

        } catch (NoResultException e) {
            //TODO Implementar as exceções
        }

    }

    /**
     *
     * Esse método é responsável por remover um Imovel
     * do banco de dados.
     * @param Um objeto imovel.
     *
     */
    @Override
    public void removerImovel(Imovel imovel) {
        try {

            entityManager.remove(imovel);

        } catch (NoResultException e) {
            //TODO Implementar as exceções
        }
    }

    /**
     *
     * Esse método é responsável por alterar um imovel no banco
     * de dados.
     * @param Um objeto imovel.
     * @return Um objeto Imovel que foi alterado.
     */
    @Override
    public Imovel alterarImovel(Imovel imovel) {
        try {

            return entityManager.merge(imovel);

        } catch (NoResultException e) {
            //TODO Implementar as exceções
            return null;
        }
    }

    /**
     *
     * Esse método é responsável por buscar uma Entidade
     * Imovel no banco de dados.
     * @param Um objeto imovel.
     * @return Um objeto imovel encontrado.
     */
    @Override
    public Imovel buscarImovel(Imovel imovel) {
        try {

            return entityManager.find(Imovel.class, imovel.getId());

        } catch (NoResultException e) {
            //TODO Implementar as exceções
            return null;
        }
    }

    /**
     *
     * Esse método é responsável por listar todos imoveis
     * contido no banco de dados.
     * @param Um objeto imovel
     * @return Uma lista de Imoveis
     */
    @Override
    public List<Imovel> listarImoveis() {
        try {

            return entityManager.createQuery("SELECT i FROM Imovel i").getResultList();

        } catch (NoResultException e) {
            //TODO Implementar as exceções
            return null;
        }        
    }
}
