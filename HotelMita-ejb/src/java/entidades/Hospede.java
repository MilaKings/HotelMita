/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author thais
 */
@Entity
@Table(name = "HOSPEDE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hospede.findAll", query = "SELECT h FROM Hospede h")
    , @NamedQuery(name = "Hospede.findById", query = "SELECT h FROM Hospede h WHERE h.id = :id")
    , @NamedQuery(name = "Hospede.findByNome", query = "SELECT h FROM Hospede h WHERE h.nome = :nome")
    , @NamedQuery(name = "Hospede.findByEndereco", query = "SELECT h FROM Hospede h WHERE h.endereco = :endereco")
    , @NamedQuery(name = "Hospede.findByTelefone", query = "SELECT h FROM Hospede h WHERE h.telefone = :telefone")})
public class Hospede implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "NOME")
    private String nome;
    @Size(max = 50)
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "TELEFONE")
    private Integer telefone;

    public Hospede() {
    }

    public Hospede(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
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
        if (!(object instanceof Hospede)) {
            return false;
        }
        Hospede other = (Hospede) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Hospede[ id=" + id + " ]";
    }
    
}
