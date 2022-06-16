/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Altair Mateus T Alencastro
 */
@Entity
@Table(name = "chamado")
@NamedQueries({
    @NamedQuery(name = "Chamado.findAll", query = "SELECT c FROM Chamado c"),
    @NamedQuery(name = "Chamado.findById", query = "SELECT c FROM Chamado c WHERE c.id = :id"),
    @NamedQuery(name = "Chamado.findByNome", query = "SELECT c FROM Chamado c WHERE c.nome = :nome"),
    @NamedQuery(name = "Chamado.findByDescricaoCliente", query = "SELECT c FROM Chamado c WHERE c.descricaoCliente = :descricaoCliente"),
    @NamedQuery(name = "Chamado.findByDataAbertura", query = "SELECT c FROM Chamado c WHERE c.dataAbertura = :dataAbertura"),
    @NamedQuery(name = "Chamado.findByVencimento", query = "SELECT c FROM Chamado c WHERE c.vencimento = :vencimento"),
    @NamedQuery(name = "Chamado.findByDescricaoTecnico", query = "SELECT c FROM Chamado c WHERE c.descricaoTecnico = :descricaoTecnico")})
public class Chamado implements Serializable {

    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empresacliente idEmpresa;

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
    @Column(name = "descricao_cliente")
    private String descricaoCliente;
    @Basic(optional = false)
    @Column(name = "data_abertura")
    @Temporal(TemporalType.DATE)
    private Date dataAbertura;
    @Basic(optional = false)
    @Column(name = "vencimento")
    @Temporal(TemporalType.DATE)
    private Date vencimento;
    @Column(name = "descricao_tecnico")
    private String descricaoTecnico;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "id_prioridade", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Prioridade idPrioridade;
    @JoinColumn(name = "id_situacao", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SituacaoChamado idSituacao;
    @JoinColumn(name = "id_tecnico", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tecnico idTecnico;
    @JoinColumn(name = "id_tipo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tipo idTipo;

    
    //  Construtores
    public Chamado() 
    {
    }

    public Chamado(Integer id) 
    {
        this.id = id;
    }

    public Chamado(Integer id, String nome, String descricaoCliente, Date dataAbertura, Date vencimento) 
    {
        this.id = id;
        this.nome = nome;
        this.descricaoCliente = descricaoCliente;
        this.dataAbertura = dataAbertura;
        this.vencimento = vencimento;
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

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getDescricaoCliente() 
    {
        return descricaoCliente;
    }

    public void setDescricaoCliente(String descricaoCliente) 
    {
        this.descricaoCliente = descricaoCliente;
    }

    public Date getDataAbertura() 
    {
        return dataAbertura;
    }
    
    public String dataAbertura()
    {
        return new SimpleDateFormat("dd/MM/yyyy").format(dataAbertura);
    }

    public void setDataAbertura(Date dataAbertura) 
    {
        this.dataAbertura = dataAbertura;
    }

    public Date getVencimento() 
    {
        return vencimento;
    }
    
    public String dataVencimento()
    {
        return new SimpleDateFormat("dd/MM/yyyy").format(vencimento);
    }

    public void setVencimento(Date vencimento) 
    {
        this.vencimento = vencimento;
    }

    public String getDescricaoTecnico() 
    {
        return descricaoTecnico;
    }

    public void setDescricaoTecnico(String descricaoTecnico) 
    {
        this.descricaoTecnico = descricaoTecnico;
    }

    public Cliente getIdCliente() 
    {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) 
    {
        this.idCliente = idCliente;
    }

    public Prioridade getIdPrioridade() 
    {
        return idPrioridade;
    }

    public void setIdPrioridade(Prioridade idPrioridade) 
    {
        this.idPrioridade = idPrioridade;
    }

    public SituacaoChamado getIdSituacao() 
    {
        return idSituacao;
    }

    public void setIdSituacao(SituacaoChamado idSituacao)
    {
        this.idSituacao = idSituacao;
    }

    public Tecnico getIdTecnico() 
    {
        return idTecnico;
    }

    public void setIdTecnico(Tecnico idTecnico) 
    {
        this.idTecnico = idTecnico;
    }

    public Tipo getIdTipo() 
    {
        return idTipo;
    }

    public void setIdTipo(Tipo idTipo) 
    {
        this.idTipo = idTipo;
    }
        
    public Empresacliente getIdEmpresa()
    {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresacliente idEmpresa) 
    {
        this.idEmpresa = idEmpresa;
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
        if (!(object instanceof Chamado)) 
        {
            return false;
        }
        Chamado other = (Chamado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Nº: " + id ;
    }
    //  Fim dos metodos

    
}// Fim da classe Chamado
