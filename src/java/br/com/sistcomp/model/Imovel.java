package br.com.sistcomp.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Classe Imovel representa a entidade Imovel.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @author Renan Oliveira, renan.oliveira@dce.ufpb.br
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@Entity
@Table(name = "IMO_IMOVEIS")
public class Imovel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "imo_imoveis_id")
    private Integer id;
    @Column(name = "imo_imoveis_descricaoImovel", length = 50, nullable = false,
        unique=false)
    private String descricaoImovel;
    @Column(name = "imo_imoveis_endereco", length = 50, nullable = false,
        unique=false)
    @OneToOne
    private Endereco endereco;
    @Column(name = "imo_imoveis_observacaoSobreImovel", length = 50,
        nullable = false, unique=false)
    private String observacaoSobreImovel;
    @Column(name = "imo_imoveis_fotosImoveis", length = 50, nullable = false,
        unique=false)
    @OneToMany
    private List<Foto> fotosImoveis;

    //Construtores

    public Imovel(){

    }

    public Imovel(String descricaoImovel, Endereco endereco,
            String observacaoSobreImovel, List<Foto> fotosImoveis) {

        this.descricaoImovel = descricaoImovel;
        this.endereco = endereco;
        this.observacaoSobreImovel = observacaoSobreImovel;
        this.fotosImoveis = fotosImoveis;
    }



    //getter and setter
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricaoImovel() {
        return descricaoImovel;
    }

    public void setDescricaoImovel(String descricaoImovel) {
        this.descricaoImovel = descricaoImovel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Foto> getFotosImoveis() {
        return fotosImoveis;
    }

    public void setFotosImoveis(List<Foto> fotosImoveis) {
        this.fotosImoveis = fotosImoveis;
    }

    public String getObservacaoSobreImovel() {
        return observacaoSobreImovel;
    }

    public void setObservacaoSobreImovel(String observacaoSobreImovel) {
        this.observacaoSobreImovel = observacaoSobreImovel;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imovel)) {
            return false;
        }
        Imovel other = (Imovel) object;
        if ((this.id == null && other.id != null) || (this.id != null &&
                !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.sistcomp.model.Imovel[ id=" + id + " ]";
    }
}
