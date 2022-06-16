package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Chamado;
import models.Cliente;
import models.Produto;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-04-29T09:16:26", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(BaixaProduto.class)
public class BaixaProduto_ { 

    public static volatile SingularAttribute<BaixaProduto, Produto> idProduto;
    public static volatile SingularAttribute<BaixaProduto, Cliente> idCliente;
    public static volatile SingularAttribute<BaixaProduto, Chamado> idChamado;
    public static volatile SingularAttribute<BaixaProduto, Integer> id;
    public static volatile SingularAttribute<BaixaProduto, Integer> quantidade;

}