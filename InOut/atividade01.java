/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade01;

import java.util.Random;
//import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alunolab08
 */
public class Atividade01 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Icon ic2 = new ImageIcon("oraculo.png");
            
        Guerreiro guerreirom = new Guerreiro();
        guerreirom.setNome();
//        guerreirom.getVidas();
        
        Oraculo Oraculom = new Oraculo();
        
        Oraculom.guerreiro = guerreirom;
        guerreirom.Oraculo = Oraculom;
        
        Oraculom.Nvidas = Oraculom.guerreiro.Vida;
        
        //Oraculom.setVidas();
//      Icon ic2 = new ImageIcon("oraculo.png");
        String nome  = JOptionPane.showInputDialog (null, Oraculom.Nome , "Insira o nome do Oraculo", JOptionPane.QUESTION_MESSAGE, ic2, null, null).toString();
//        System.out.println("Escreva o nome do Oráculo: ");
//        Scanner teclado = new Scanner(System.in);
//        String nome = teclado.next();
        Oraculom.setNome(nome);
      
        Oraculom.prologoIntroducao();
        Oraculom.loadLevel1();    
        
    }
    /** Função para sortear números aleátorios dentro
     * de um intervalo, que é definido pelos parâmetros
     * minimo e maximo.
     */
    public static int aleatorio(int minimo, int maximo){
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }
}
