package br.com.sistcomp.controller;

import br.com.sistcomp.dao.ImovelDao;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;

/**
 * Classe ImovelController.
 *
 * @author Renan Oliveira, renan.oliveira@dce.ufpb.br
 * @version 1.0
 * @since 31/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@ManagedBean(value = "imovelController")
public class ImovelBean {

    @EJB
    ImovelDao imovelDao;

    //TODO implementar a classe controllers


}
