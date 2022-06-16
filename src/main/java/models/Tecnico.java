/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Altair Mateus T Alencastro
 */
@Entity
@Table(name = "tecnico")
@NamedQueries({
    @NamedQuery(name = "Tecnico.findAll", query = "SELECT t FROM Tecnico t"),
    @NamedQuery(name = "Tecnico.findById", query = "SELECT t FROM Tecnico t WHERE t.id = :id"),
    @NamedQuery(name = "Tecnico.findByNome", query = "SELECT t FROM Tecnico t WHERE t.nome = :nome"),
    @NamedQuery(name = "Tecnico.findByTelefone", query = "SELECT t FROM Tecnico t WHERE t.telefone = :telefone"),
    @NamedQuery(name = "Tecnico.findByCpf", query = "SELECT t FROM Tecnico t WHERE t.cpf = :cpf"),
    @NamedQuery(name = "Tecnico.findByEmail", query = "SELECT t FROM Tecnico t WHERE t.email = :email"),
    @NamedQuery(name = "Tecnico.findByDataNasc", query = "SELECT t FROM Tecnico t WHERE t.dataNasc = :dataNasc"),
    @NamedQuery(name = "Tecnico.findByAvRua", query = "SELECT t FROM Tecnico t WHERE t.avRua = :avRua"),
    @NamedQuery(name = "Tecnico.findByNumero", query = "SELECT t FROM Tecnico t WHERE t.numero = :numero"),
    @NamedQuery(name = "Tecnico.findByBairro", query = "SELECT t FROM Tecnico t WHERE t.bairro = :bairro"),
    @NamedQuery(name = "Tecnico.findByCidade", query = "SELECT t FROM Tecnico t WHERE t.cidade = :cidade"),
    @NamedQuery(name = "Tecnico.findByUf", query = "SELECT t FROM Tecnico t WHERE t.uf = :uf"),
    @NamedQuery(name = "Tecnico.findBySenha", query = "SELECT t FROM Tecnico t WHERE t.senha = :senha")})
public class Tecnico implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTecnico")
    private Collection<Chamado> chamadoCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Column(name = "data_nasc")
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    @Column(name = "av_rua")
    private String avRua;
    @Column(name = "numero")
    private String numero;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "uf")
    private String uf;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;

    public Tecnico() {
    }

    public Tecnico(Integer id) {
        this.id = id;
    }

    public Tecnico(Integer id, String nome, String telefone, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getAvRua() {
        return avRua;
    }

    public void setAvRua(String avRua) {
        this.avRua = avRua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
        if (!(object instanceof Tecnico)) {
            return false;
        }
        Tecnico other = (Tecnico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    public Collection<Chamado> getChamadoCollection() {
        return chamadoCollection;
    }

    public void setChamadoCollection(Collection<Chamado> chamadoCollection) {
        this.chamadoCollection = chamadoCollection;
    }
    
}
