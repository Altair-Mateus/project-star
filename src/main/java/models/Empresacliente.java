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
@Table(name = "empresacliente")
@NamedQueries({
    @NamedQuery(name = "Empresacliente.findAll", query = "SELECT e FROM Empresacliente e"),
    @NamedQuery(name = "Empresacliente.findById", query = "SELECT e FROM Empresacliente e WHERE e.id = :id"),
    @NamedQuery(name = "Empresacliente.findByNome", query = "SELECT e FROM Empresacliente e WHERE e.nome = :nome"),
    @NamedQuery(name = "Empresacliente.findByTelefone", query = "SELECT e FROM Empresacliente e WHERE e.telefone = :telefone"),
    @NamedQuery(name = "Empresacliente.findByCnpj", query = "SELECT e FROM Empresacliente e WHERE e.cnpj = :cnpj"),
    @NamedQuery(name = "Empresacliente.findByIe", query = "SELECT e FROM Empresacliente e WHERE e.ie = :ie"),
    @NamedQuery(name = "Empresacliente.findByEmail", query = "SELECT e FROM Empresacliente e WHERE e.email = :email"),
    @NamedQuery(name = "Empresacliente.findByAvRua", query = "SELECT e FROM Empresacliente e WHERE e.avRua = :avRua"),
    @NamedQuery(name = "Empresacliente.findByNumero", query = "SELECT e FROM Empresacliente e WHERE e.numero = :numero"),
    @NamedQuery(name = "Empresacliente.findByBairro", query = "SELECT e FROM Empresacliente e WHERE e.bairro = :bairro"),
    @NamedQuery(name = "Empresacliente.findByCidade", query = "SELECT e FROM Empresacliente e WHERE e.cidade = :cidade"),
    @NamedQuery(name = "Empresacliente.findByUf", query = "SELECT e FROM Empresacliente e WHERE e.uf = :uf")})
public class Empresacliente implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private Collection<Chamado> chamadoCollection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private Collection<Cliente> clienteCollection;

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
    @Basic(optional = false)
    @Column(name = "cnpj")
    private String cnpj;
    @Basic(optional = false)
    @Column(name = "ie")
    private String ie;
    @Column(name = "email")
    private String email;
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

    public Empresacliente() {
    }

    public Empresacliente(Integer id) {
        this.id = id;
    }

    public Empresacliente(Integer id, String nome, String telefone, String cnpj, String ie) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.ie = ie;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresacliente)) {
            return false;
        }
        Empresacliente other = (Empresacliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }

    public Collection<Chamado> getChamadoCollection() {
        return chamadoCollection;
    }

    public void setChamadoCollection(Collection<Chamado> chamadoCollection) {
        this.chamadoCollection = chamadoCollection;
    }
    
}
