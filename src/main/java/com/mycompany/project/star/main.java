/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.star;

import java.util.List;
import javax.swing.JOptionPane;
import models.Tipo;
import persistence.DAO;

/**
 *
 * @author Mateus
 */
public class main 
{
     
    public static void main(String[] args)
    {
      
        
       Tipo tipo = new Tipo();
        
       // tipo.setNome("Design");
        
        //dao.salvar(tipo);
        
        List<Tipo> consulta = DAO.consulta(Tipo.class, ""); 
        
        for (Tipo c : consulta)
        { 
            JOptionPane.showMessageDialog(null, c.getNome());
        }
        
    }// Fim do metodo main
}
