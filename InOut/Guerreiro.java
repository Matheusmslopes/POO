/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01;
//import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alunolab08
 */
public class Guerreiro {
    /** declaração de variáveis*/
    String nome,vidaR;
    int Vida,vidaS;
    Oraculo Oraculo;

    /** Construtores */ 
    public Guerreiro(String nome, int Vida) {
        this.nome = nome;
        this.Vida = Vida;
    }
    public Guerreiro() {
    }
    
    Icon ic = new ImageIcon("knight.png");
		
    void setNome(){
//        System.out.println("Informe o nome do Guerreiro: ");
//        this.nome = InOut.leString(nome);
        //this.nome = nome;
	nome = JOptionPane.showInputDialog (null, nome, "Insira o nome do Guerreiro", JOptionPane.QUESTION_MESSAGE, ic ,null,null).toString();
        //this.nome = JOptionPane.showInputDialog (null, nome , "Insira o nome do Guerreiro", JOptionPane.QUESTION_MESSAGE);
        //Scanner tecladoG = new Scanner(System.in);
        //nome = tecladoG.next();
    }
    /** Método para guardar a quantidade de vidas do jogador*/
    int getVidas(){
        Vida = Oraculo.setVidas();
        return Vida;
    }
    /** Método para guardar o nome do jogador*/
    String getNome(){
        return nome;
    }
    
    /** Função para adicionar uma vida extra para o jogador.
     * Se a função que está em Oraculo.java, conceder a vida
     * extra, essa é afunção que vai adicionar a vida extra
     *  a contagem do jogador.
     */
    String vidaExtra(){
        vidaS = Atividade01.aleatorio(0, 1);
        if(vidaS == 1){
           vidaR = "sim"; 
        }
        else{
            vidaR = "nao";
        }
        return vidaR;
    }
    
}
