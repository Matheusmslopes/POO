/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author alunolab08
 */
public class trabalho2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        Pedido pedido = new Pedido();
        Funcionario funcionario = new Funcionario();
        Loja loja = new Loja();    
        loja.pedido = pedido;
        loja.funcionario = funcionario;
        pedido.loja = loja;    
        funcionario.loja = loja;
        funcionario.pedido = pedido;
        pedido.funci = funcionario;
        loja.menu();    
    }
    public static String data(){
      Date date = new Date();
      SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
      String stringDate = DateFor.format(date);
      return stringDate;
      
    }
}
