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
    int nivel,escolhaM, Nvidas,miser;
    
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
    
    int loadLevel1(){
            
        nivel = 1;   
        int SecretNumber,tent;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("------------ LEVEL 1 ---------------");
        SecretNumber = Atividade01.aleatorio(1,100);
        Nvidas = guerreiro.Vida;
        System.out.println("Numero sorteado é "+SecretNumber);

        do
        {
            System.out.print("Numero secreto é [1, 100]: ");
            tent = sc.nextInt();
            
            if (tent > SecretNumber){
                System.out.println("O número secreto é menor.");
                Nvidas--;
            }   
            else if (tent == SecretNumber){
                System.out.println("Você acertou");
            }    
            else{
                System.out.println("O número secreto é maior.");
                Nvidas--;
            }
        } while(tent != SecretNumber && Nvidas > 0);
        
        if(tent == SecretNumber){
            System.out.println("------------ LEVEL 2 ---------------");
            System.out.println("2-PAR ou 1-IMPAR: ");
            Scanner es = new Scanner(System.in);
            escolhaM = es.nextInt();
            loadLevel2(escolhaM);
        }else{
            prologoPerdedor();
        }
        
        return SecretNumber;
    }
    int loadLevel2(int opcao){
        nivel = 2;
        System.out.println("Nvidas = "+Nvidas);
        int NG,NO, resposta = 0 ,i, resultado,escolha;
        
       // do{
        resposta=0;
        NG = Atividade01.aleatorio(0, 5);
        NO = Atividade01.aleatorio(0, 5);
        resposta = NG + NO;
        // Checando o numero para vê se a resposta bate
        
            if (resposta % 2 == 0){
                System.out.println("Soma dos números sortedos é PAR (2)");
                resultado = 2;
            }
            else {
                System.out.println("Soma dos números sorteados é IMPAR (1)");
                resultado = 1;
            }
        if(opcao == resultado){
            prologoVencedor();
            //break;
        }
        else{
            
            Nvidas = Nvidas - 1;
            for(i = Nvidas; i >= 0; i--){
               System.out.println("Nvidas = "+Nvidas);
                resposta=0;
                NG = Atividade01.aleatorio(0, 5);
                NO = Atividade01.aleatorio(0, 5);
                resposta = NG + NO;
                // Checando o numero para vê se a resposta bate

                    if (resposta % 2 == 0){
                        System.out.println("Soma dos números sortedos é PAR (2)");
                        resultado = 2;
                    }
                    else {
                        System.out.println("Soma dos números sorteados é IMPAR (1)");
                        resultado = 1;
                    }
                System.out.println("2-PAR ou 1-IMPAR: ");
                Scanner es = new Scanner(System.in);
                escolha = es.nextInt();
                if (escolha == resultado){
                    prologoVencedor();
                    break;
                }
                else if(Nvidas == 0){
                  VidaEx = guerreiro.vidaExtra();
                    System.out.println("Vida Extra "+VidaEx);
                    if("sim".equals(VidaEx)){
                        System.out.println("ENTROU");
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
       // }while (resposta != resultado);
        
        return 0;
    }
    String prologoVencedor(){
        
        System.out.println("--------------- FIM ------------------");
        guerreiro.getNome();
        System.out.println("Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " VENCEDOR");
        return guerreiro.nome;  
    }
       
    String prologoPerdedor(){
        if(miser == 0){
           miser++;
           System.out.println("Escreva sua frase de Misericordia: ");
           Scanner palavra = new Scanner(System.in);
           pedidoDeM = palavra.next();
           decidirVidaExtra(pedidoDeM); 
           
        }
        else{
           resp = this.decidirVidaExtra(pedidoDeM);
           System.out.println("RESP = "+resp);
           if (resp == false){
                System.out.println("---------------------------------");
                guerreiro.getNome();
                System.out.println("Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " PERDEDOR");
                return guerreiro.nome;
            }else{
                if(nivel == 1){
                    Nvidas++;
                    loadLevel1();
                }else{
                    Nvidas++;
                    System.out.println("2-PAR ou 1-IMPAR: ");
                    Scanner es = new Scanner(System.in);
                    escolhaM = es.nextInt();
                    loadLevel2(escolhaM);
                }
            } 
        }
        
        
        
        return null;//retorna a level 2
        
    }
    boolean decidirVidaExtra(String misericordia){
        
        StringTokenizer dve = new StringTokenizer(pedidoDeM," ");
        int contador= dve.countTokens();
        System.out.println("Total number of Tokens: "+ contador);
        while (dve.hasMoreElements()){    
            System.out.println(dve.nextToken());    
        }    
        if(contador >= 5){
           Nvidas++;
           prologoPerdedor();
           return true;
        }
         return false;
        
    }


}
