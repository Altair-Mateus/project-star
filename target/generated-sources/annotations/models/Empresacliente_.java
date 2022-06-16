package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Chamado;
import models.Cliente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-04-29T09:16:26", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Empresacliente.class)
public class Empresacliente_ { 

    public static volatile SingularAttribute<Empresacliente, String> telefone;
    public static volatile SingularAttribute<Empresacliente, String> cidade;
    public static volatile SingularAttribute<Empresacliente, String> avRua;
    public static volatile SingularAttribute<Empresacliente, String> numero;
    public static volatile SingularAttribute<Empresacliente, String> bairro;
    public static volatile SingularAttribute<Empresacliente, String> nome;
    public static volatile SingularAttribute<Empresacliente, String> cnpj;
    public static volatile SingularAttribute<Empresacliente, String> uf;
    public static volatile CollectionAttribute<Empresacliente, Chamado> chamadoCollection;
    public static volatile SingularAttribute<Empresacliente, Integer> id;
    public static volatile SingularAttribute<Empresacliente, String> ie;
    public static volatile SingularAttribute<Empresacliente, String> email;
    public static volatile CollectionAttribute<Empresacliente, Cliente> clienteCollection;

}