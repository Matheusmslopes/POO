/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01;
import java.util.Scanner;

/**
 *
 * @author alunolab08
 */
public class Guerreiro {
    String nome,vidaR;
    int Vida,vidaS;
    oraculo Oraculo;

    public Guerreiro(String nome, int Vida) {
        this.nome = nome;
        this.Vida = Vida;
    }
    public Guerreiro() {
    }
    
    void setNome(){
        System.out.println("Informe o nome do Guerreiro: ");
        Scanner tecladoG = new Scanner(System.in);
        nome = tecladoG.next();
    }
    int getVidas(){
        Vida = Oraculo.setVidas();
        return Vida;
    }
    String getNome(){
        return nome;
    }
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
