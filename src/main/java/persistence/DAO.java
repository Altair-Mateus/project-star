/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Altair Mateus T Alencastro
 */
public class DAO 
{
     //  Lê o xml e garante a conexão com o banco de dados
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_project-star_jar_1.0-SNAPSHOTPU");
    
    //  Responsável por realizar o CRUD
    static EntityManager em = emf.createEntityManager();
    
    //  Valida as transações
    static EntityTransaction tx = em.getTransaction(); 
    
    
    public static void salvar(Object objeto)
    {
        tx.begin();
        em.persist(objeto);
        tx.commit();
    }// Fim do método salvar
    
    public static void remover(Object objeto)
    {
        tx.begin();
        em.remove(objeto);
        tx.commit();
    }// Fim do método remover
    
    public static void editar(Object objeto)
    {
        tx.begin();
        em.merge(objeto);
        tx.commit();
    }// Fim do método editar
    
    public static List consulta(Class classe, String where)
    {
        Query q = em.createQuery("select o from " + classe.getSimpleName() + " o " + "where 1=1 " + where);
        
        return q.getResultList();
    }// Fim do método consulta
    
    public static List consultaSQL(Class classe, String where)
    {
        Query q = em.createNativeQuery("select * from " + classe.getSimpleName() + " o " + "where 1=1 " + where, classe);
        
        return q.getResultList();
    }// Fim do método consultaSQL
}
