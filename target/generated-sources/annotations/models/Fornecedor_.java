package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Tipo;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-04-29T09:16:26", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Fornecedor.class)
public class Fornecedor_ { 

    public static volatile SingularAttribute<Fornecedor, String> uf;
    public static volatile SingularAttribute<Fornecedor, String> telefone;
    public static volatile SingularAttribute<Fornecedor, String> cidade;
    public static volatile SingularAttribute<Fornecedor, String> avRua;
    public static volatile SingularAttribute<Fornecedor, String> numero;
    public static volatile SingularAttribute<Fornecedor, String> bairro;
    public static volatile SingularAttribute<Fornecedor, String> nome;
    public static volatile SingularAttribute<Fornecedor, Tipo> idTipo;
    public static volatile SingularAttribute<Fornecedor, Integer> id;
    public static volatile SingularAttribute<Fornecedor, String> cpfCnpj;
    public static volatile SingularAttribute<Fornecedor, String> email;

}