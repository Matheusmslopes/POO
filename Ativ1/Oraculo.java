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
public class Oraculo {
    
    boolean resp;
    Guerreiro guerreiro;
    int nivel,escolhaM, Nvidas,miser = 0;
    String Nome, VidaEx,pedidoDeM;
    
    
    public Oraculo() {
    }
    
    public Oraculo(String Nome) {
        this.Nome = Nome;
    }
    
    void setNome(String Nome){
        this.Nome = Nome;
        System.out.println("aaa "+Nome);
    }

    int setVidas(){
        guerreiro.Vida = Atividade01.aleatorio(9, 12);
        Nvidas = guerreiro.Vida;
        return guerreiro.Vida;
    }
    
    String prologoIntroducao(){
        System.out.println("--------------  INTRODUCAO  --------------");
        guerreiro.getNome();
        System.out.println("Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " com Quantidade de Vidas: " + guerreiro.getVidas());
        return guerreiro.nome;
    }
    
    int loadLevel1(){      
        nivel = 1;   
        int SecretNumber,tent;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("--------------  LEVEL 1  --------------");
        SecretNumber = Atividade01.aleatorio(1,100);
        //System.out.println("Numero sorteado é "+SecretNumber);

        do{
            //System.out.println("Nvidas = "+Nvidas);
            System.out.print("Numero secreto é [1, 100]: ");
            tent = sc.nextInt();
            if(tent < 1 || tent >100){
                System.out.println("-----  ERRO  -----");
                System.out.println("Escreva o numero novamente");
                System.out.println("------------------");
            }
            else{
                if(tent != SecretNumber){
                    Nvidas--;
                    if(Nvidas == 0){
                        break;
                    }
                    else{
                        if (tent > SecretNumber){
                            System.out.println("O número secreto é menor.");
                        }       
                        else{
                            System.out.println("O número secreto é maior.");
                        } 
                    }
                }
                else
                    break;    
            }  
        } while(tent != SecretNumber && Nvidas > 0);
        
        if(tent == SecretNumber){
            System.out.println("--------------  LEVEL 2  --------------");
            //TRATAMENTO DE ERRO
            while(escolhaM != 2 || escolhaM != 1){
                System.out.println("2-PAR ou 1-IMPAR: ");
                Scanner es = new Scanner(System.in);
                escolhaM = es.nextInt();
                if(escolhaM == 2 || escolhaM == 1){
                    loadLevel2(escolhaM);
                    break;
                }
                else{
                    System.out.println("-----  ERRO  -----");
                    System.out.println("O numero digitado nao existe no banco de dados");
                    System.out.println("------------------");
                }
            }    
        }else
            prologoPerdedor();
        return SecretNumber;
    }
    
    int loadLevel2(int opcao){
        //fazer um tratamento de erro
        nivel = 2;
        //System.out.println("Nvidas = "+Nvidas);
        int NG,NO, resposta,i, resultado,escolha;
        
        NG = Atividade01.aleatorio(0, 5);
        NO = Atividade01.aleatorio(0, 5);
        resposta = NG + NO;
        // Checando o numero para vê se a resposta bate
        
        if (resposta % 2 == 0){
            //System.out.println("Soma dos números sortedos é PAR (2)");
            resultado = 2;
        }
        else {
            //System.out.println("Soma dos números sorteados é IMPAR (1)");
            resultado = 1;
        }
        
        
        if(opcao == resultado){
            prologoVencedor();
        }
        else{
            Nvidas = Nvidas - 1;
            for(i = Nvidas; i >= 0; i--){
                //System.out.println("Nvidas = "+Nvidas);
                if(Nvidas == 0){
                    VidaEx = guerreiro.vidaExtra();
                    //System.out.println("Vida Extra "+VidaEx);
                    if("sim".equals(VidaEx)){
                        prologoPerdedor();
                        break;
                    }
                    else {
                        miser = 2;
                        prologoPerdedor();
                        break;
                    }
                }
                //------
                NG = Atividade01.aleatorio(0, 5);
                NO = Atividade01.aleatorio(0, 5);
                resposta = NG + NO;
                // Checando o numero para vê se a resposta bate
                if (resposta % 2 == 0){
                    //System.out.println("Soma dos números sortedos é PAR (2)");
                    resultado = 2;
                }
                else {
                    //System.out.println("Soma dos números sorteados é IMPAR (1)");
                    resultado = 1;
                }
                //-----
                // perguntando ao guerreiro oque ele quer ser
                System.out.println("2-PAR ou 1-IMPAR: ");
                Scanner es = new Scanner(System.in);
                escolha = es.nextInt();
                //TRATAMENTO DE ERRO
                if(escolha > 2 || escolha < 1){
                    System.out.println("-----  ERRO  -----");
                    System.out.println("Escreva o numero novamente");
                    System.out.println("------------------");
                }
                else{
                    if (escolha == resultado){
                        prologoVencedor();
                        break;
                    }
                    else{
                        Nvidas--;
                    }
                }      
            }
        } 
        return 0;
    }
    
    String prologoVencedor(){
        System.out.println("--------------  FIM  --------------");
        guerreiro.getNome();
        System.out.println("Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " VENCEDOR");
        return guerreiro.nome;  
    }
       
    String prologoPerdedor(){
        System.out.println("ENTROU PERDEDOR");
        System.out.println("miser = "+miser);
        switch (miser) {
            case 0 -> {
                System.out.println("--------------- PEDIDO DE MISERICORDIA ---------------");
                miser = 1;
                System.out.println("Escreva sua frase de Misericordia: ");
                Scanner palavra = new Scanner(System.in);
                pedidoDeM = palavra.nextLine();
                //System.out.println("PEDIDOM = "+pedidoDeM);
                decidirVidaExtra(pedidoDeM);
            }
            case 1 -> {
                miser = 2;
                //System.out.println("RESP = "+resp);
                if (resp == false){
                    System.out.println("--------------  FIM  --------------");
                    guerreiro.getNome();
                    System.out.println("Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " PERDEDOR");
                    return guerreiro.nome;
                }
                else{
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
            default -> {
                System.out.println("--------------  FIM  --------------");
                guerreiro.getNome();
                System.out.println("Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " PERDEDOR");
                return guerreiro.nome;
            }
        }
        return null; 
    }
    
    boolean decidirVidaExtra(String misericordia){
        int contador;
        StringTokenizer dve = new StringTokenizer(pedidoDeM," ");
        contador = dve.countTokens();
        
        if(contador >= 5){
           resp = true;
           prologoPerdedor();
           return true;
        }
        resp = false;
        prologoPerdedor();
        return false;
        
    }


}
