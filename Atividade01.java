/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade01;

import java.util.Random;
import java.util.Scanner;

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
        
        Guerreiro guerreirom = new Guerreiro();
        guerreirom.setNome();
//        guerreirom.getVidas();
        
        Oraculo Oraculom = new Oraculo();
        
        Oraculom.guerreiro = guerreirom;
        guerreirom.Oraculo = Oraculom;
        
        Oraculom.Nvidas = Oraculom.guerreiro.Vida;
        
        //Oraculom.setVidas();
        
        System.out.println("Escreva o nome do Oráculo: ");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.next();
        Oraculom.setNome(nome);
      
        Oraculom.prologoIntroducao();
        Oraculom.loadLevel1();    
        
    }
    public static int aleatorio(int minimo, int maximo){
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }
}
