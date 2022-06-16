/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Altair Mateus T Alencastro
 */
public class Utilitarios 
{
    
    //  Limpa a Tela
    public static void LimpaTela(JPanel container)
    {
        Component components[] = container.getComponents();
        
        for(Component component: components)
        {
            if(component instanceof JTextField)
            {
                ((JTextField) component).setText(null);
            }// Fim do bloco de condição if
        }// Fim do bloco de repetição for
    }// Fim do método LimpaTela
    
    //  Limpa a Tela
    public static void LimpaTelaJDialog(JDialog container)
    {
        Component components[] = container.getComponents();
        
        for(Component component: components)
        {
            if(component instanceof JTextField)
            {
                ((JTextField) component).setText(null);
            }// Fim do bloco de condição if
        }// Fim do bloco de repetição for
    }// Fim do método LimpaTela
    
    public static void InserirIcone(JFrame frm)
    {
        try
        {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/Images/icon-star.png"));
        } catch (Exception ex)
                {
                        System.out.println(ex.toString());
                }// Fim try-catch
    }// Fim do método InserirIcone
    
    public static void InserirIconeJdialog(JDialog frm)
    {
        try
        {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/Images/icon-star.png"));
        } catch (Exception ex)
                {
                    System.out.println(ex.toString());
                }// Fim try-catch
    }// Fim do método InserirIcone
    
    //  Método usada nas pesquisas por números
    public static boolean isNumeric(String str) 
    {
    return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }// Fim do método isNumeric
    
 
    
}// Fim da classe Utilitarios
