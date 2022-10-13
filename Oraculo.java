/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01;
import java.util.Scanner;
import java.util.StringTokenizer; 

/**
 *
 * @author alunolab08
 */
public class oraculo {
    
    String Nome, VidaEx,pedidoDeM;
    boolean resp;
    Guerreiro guerreiro;
    int nivel,escolhaM, Nvidas;
    
    //Nvidas = guerreiro.Vida

    public oraculo() {
    }
    public oraculo(String Nome) {
        this.Nome = Nome;
    }
    
    void setNome(String Nome){
        this.Nome = Nome;
        System.out.println("aaa "+Nome);
    }

    int setVidas(){
        guerreiro.Vida = Atividade01.aleatorio(9, 12);
        return guerreiro.Vida;
    }
    String prologoIntroducao(){
        System.out.println("---------------------------------");
        guerreiro.getNome();
        System.out.println("Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " com Quantidade de Vidas: " + guerreiro.getVidas());
        return guerreiro.nome;
    }
    int loadLevel1()
    {
        int SecretNumber,tent, Vidas = 0, vidasRest;
        Scanner sc = new Scanner(System.in);
    
    
        SecretNumber = Atividade01.aleatorio(1,100);
        vidasRest = Vidas;
        System.out.println(SecretNumber);

        do
        {
            System.out.print("Numero secreto é [1, 100]: ");
            tent = sc.nextInt();
            vidasRest--;
            if (tent > SecretNumber)
                System.out.println("O número secreto é menor.");
            else if (tent == SecretNumber)
                System.out.println("Você acertou");
            else
                System.out.println("O número secreto é maior.");
      
        } while(tent != SecretNumber && vidasRest > 0);
    
        return SecretNumber;
    //Oraculo.loadLevel2();
    }
    
    int loadLevel2(int opcao){
        nivel = 2;
        System.out.println("------------ LEVEL 2 ---------------");
       
        int NG,NO, resposta,i, resultado,escolha;
        NG = Atividade01.aleatorio(0, 5);
        NO = Atividade01.aleatorio(0, 5);
        resposta = NG + NO;
        // Checando o numero para vê se a resposta bate
        
            if (resposta % 2 == 0){
                System.out.println("O número sortedo é PAR = 2");
                resultado = 2;
            }
            else {
                System.out.println("O número sorteado é IMPAR = 1");
                resultado = 1;
            }
        if(opcao == resultado){
            prologoVencedor();
        }
        else{
            for(i = Nvidas; i >= 0; i--){
                System.out.println("2-PAR ou 1-IMPAR: ");
                Scanner es = new Scanner(System.in);
                escolha = es.nextInt();
                if (escolha == resultado){
                    prologoVencedor();
                }
                else if(Nvidas == 0){
                  VidaEx = guerreiro.vidaExtra();
                    if(VidaEx == "sim"){
                        Nvidas++;
                    }
                    else {

                        prologoPerdedor();
                        break;
                    }
                }
                else{
                    Nvidas--;
                }
            }
        }
        
        
        return 0;
    }
    String prologoVencedor(){
        System.out.println("---------------------------------");
        guerreiro.getNome();
        System.out.println("Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " VENCEDOR");
        return guerreiro.nome;  
    }
       
    String prologoPerdedor(){
        System.out.println("Escreva sua frase de Misericordia");
        Scanner palavra = new Scanner(System.in);
        pedidoDeM = palavra.next(pedidoDeM);
        resp = this.decidirVidaExtra(pedidoDeM);
        
        if (resp == false){
            System.out.println("---------------------------------");
            guerreiro.getNome();
            System.out.println("Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " PERDEDOR");
            return guerreiro.nome;
        }
        if(nivel == 1){
            loadLevel1();
        }else{
            System.out.println("2-PAR ou 1-IMPAR: ");
            Scanner es = new Scanner(System.in);
            escolhaM = es.nextInt();
            loadLevel2(escolhaM);
        }
        return null;//retorna a level 2
        
    }
    boolean decidirVidaExtra(String misericordia){
        StringTokenizer dve = new StringTokenizer(pedidoDeM," ");
        System.out.println("Total number of Tokens: "+dve.countTokens());    
        if(dve.countTokens() == 5){
           Nvidas++;
           return true;
        }
         return false;
        
    }


}
