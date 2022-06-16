package models;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Chamado;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-04-29T09:16:26", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Tecnico.class)
public class Tecnico_ { 

    public static volatile SingularAttribute<Tecnico, String> telefone;
    public static volatile SingularAttribute<Tecnico, String> cidade;
    public static volatile SingularAttribute<Tecnico, String> avRua;
    public static volatile SingularAttribute<Tecnico, String> numero;
    public static volatile SingularAttribute<Tecnico, String> bairro;
    public static volatile SingularAttribute<Tecnico, String> nome;
    public static volatile SingularAttribute<Tecnico, String> uf;
    public static volatile SingularAttribute<Tecnico, String> senha;
    public static volatile SingularAttribute<Tecnico, Date> dataNasc;
    public static volatile SingularAttribute<Tecnico, String> cpf;
    public static volatile CollectionAttribute<Tecnico, Chamado> chamadoCollection;
    public static volatile SingularAttribute<Tecnico, Integer> id;
    public static volatile SingularAttribute<Tecnico, String> email;

}