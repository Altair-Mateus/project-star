package models;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Cliente;
import models.Empresacliente;
import models.Prioridade;
import models.SituacaoChamado;
import models.Tecnico;
import models.Tipo;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-04-29T09:16:26", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Chamado.class)
public class Chamado_ { 

    public static volatile SingularAttribute<Chamado, String> descricaoTecnico;
    public static volatile SingularAttribute<Chamado, Cliente> idCliente;
    public static volatile SingularAttribute<Chamado, Prioridade> idPrioridade;
    public static volatile SingularAttribute<Chamado, SituacaoChamado> idSituacao;
    public static volatile SingularAttribute<Chamado, String> nome;
    public static volatile SingularAttribute<Chamado, Empresacliente> idEmpresa;
    public static volatile SingularAttribute<Chamado, Tipo> idTipo;
    public static volatile SingularAttribute<Chamado, Integer> id;
    public static volatile SingularAttribute<Chamado, String> descricaoCliente;
    public static volatile SingularAttribute<Chamado, Date> vencimento;
    public static volatile SingularAttribute<Chamado, Tecnico> idTecnico;
    public static volatile SingularAttribute<Chamado, Date> dataAbertura;

}