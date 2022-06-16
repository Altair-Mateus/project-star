/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Altair Mateus T Alencastro
 */
@Entity
@Table(name = "baixaproduto")
@NamedQueries({
    @NamedQuery(name = "BaixaProduto.findAll", query = "SELECT b FROM BaixaProduto b"),
    @NamedQuery(name = "BaixaProduto.findById", query = "SELECT b FROM BaixaProduto b WHERE b.id = :id"),
    @NamedQuery(name = "BaixaProduto.findByQuantidade", query = "SELECT b FROM BaixaProduto b WHERE b.quantidade = :quantidade")})
public class BaixaProduto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @JoinColumn(name = "id_chamado", referencedColumnName = "id")
    @ManyToOne
    private Chamado idChamado;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    @ManyToOne
    private Cliente idCliente;
    @JoinColumn(name = "id_produto", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Produto idProduto;

    
    //  Construtores
    public BaixaProduto() 
    {
        
    }

    public BaixaProduto(Integer id) 
    {
        this.id = id;
    }
        
    public BaixaProduto(Integer id, int quantidade) 
    {
        this.id = id;
        this.quantidade = quantidade;
    }
    //  Fim dos construtores
    
    
    //  Getters e Setters
    public Integer getId() 
    {
        return id;
    }

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public int getQuantidade() 
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade) 
    {
        this.quantidade = quantidade;
    }

    public Chamado getIdChamado() 
    {
        return idChamado;
    }

    public void setIdChamado(Chamado idChamado) 
    {
        this.idChamado = idChamado;
    }

    public Cliente getIdCliente() 
    {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) 
    {
        this.idCliente = idCliente;
    }

    public Produto getIdProduto() 
    {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) 
    {
        this.idProduto = idProduto;
    }
    //  Fim dos getters e setters
    
    
    //  Metodos
    @Override
    public int hashCode() 
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) 
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BaixaProduto)) {
            return false;
        }
        BaixaProduto other = (BaixaProduto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "models.BaixaProduto[ id=" + id + " ]";
    }
    //  Fim dos metodos
    
}// Fim da classe BaixaProduto
