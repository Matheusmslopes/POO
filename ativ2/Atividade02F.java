/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alunolab08
 */
public class Atividade02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pedido pedido = new Pedido();
        Funcionario funcionario = new Funcionario();
        Loja loja = new Loja();
        //pedido.setDataEmissao();
        loja.menu();
        //pedido.getDataEmissao();
        
        
        
        
    }
    
    /**
     * Função para pegar a data atual
     * @return  uma string em data
     */
    public static String data(){
      Date date = new Date();
      SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
      String stringDate = DateFor.format(date);
      System.out.println(stringDate);
      return stringDate;
      
    }
    
}
