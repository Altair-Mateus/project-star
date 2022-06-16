/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Altair Mateus T Alencastro
 */
@Entity
@Table(name = "prioridade")
@NamedQueries({
    @NamedQuery(name = "Prioridade.findAll", query = "SELECT p FROM Prioridade p"),
    @NamedQuery(name = "Prioridade.findById", query = "SELECT p FROM Prioridade p WHERE p.id = :id"),
    @NamedQuery(name = "Prioridade.findByNome", query = "SELECT p FROM Prioridade p WHERE p.nome = :nome")})
public class Prioridade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrioridade")
    private Collection<Chamado> chamadoCollection;

    public Prioridade() {
    }

    public Prioridade(Integer id) {
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

    public Collection<Chamado> getChamadoCollection() {
        return chamadoCollection;
    }

    public void setChamadoCollection(Collection<Chamado> chamadoCollection) {
        this.chamadoCollection = chamadoCollection;
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
        if (!(object instanceof Prioridade)) {
            return false;
        }
        Prioridade other = (Prioridade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
