package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Chamado;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-04-29T09:16:26", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Tipo.class)
public class Tipo_ { 

    public static volatile CollectionAttribute<Tipo, Chamado> chamadoCollection;
    public static volatile SingularAttribute<Tipo, String> nome;
    public static volatile SingularAttribute<Tipo, Integer> id;

}