package models;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Fornecedor;
import models.Produto;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-04-29T09:16:26", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Fornecedor> idFornecedor;
    public static volatile SingularAttribute<Compra, Produto> idProduto;
    public static volatile SingularAttribute<Compra, Double> valor;
    public static volatile SingularAttribute<Compra, Integer> id;
    public static volatile SingularAttribute<Compra, Integer> quantidade;
    public static volatile SingularAttribute<Compra, Date> dataCompra;

}