/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01;
import java.util.Scanner;
import java.util.StringTokenizer; 
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author alunolab08
 */
public class Oraculo {
    /**declaração de variaveis*/
    boolean resp;
    Guerreiro guerreiro;
    int nivel,escolhaM, Nvidas,miser = 0;
    String Nome, VidaEx,pedidoDeM, palavra, ent, Entrada;
    
    /** Construtores*/
    public Oraculo() {
    }
    
    public Oraculo(String Nome, String palavra, String ent) {
        this.Nome = Nome;
        this.palavra = palavra;
        this.ent = ent;
    }
    
    /** Método para setar do nome */
    void setNome(String Nome){
        this.Nome = Nome;
        //System.out.println("aaa "+Nome);
    }
    
    /** Método para setar a quantidade de vida
     * que o guerreiro irá ter, ele chama a função aleatorio
     * que está presente na Atividade01.java
     */
    int setVidas(){
        guerreiro.Vida = Atividade01.aleatorio(9, 12);
        Nvidas = guerreiro.Vida;
        return guerreiro.Vida;
    }
    
    /** Uma introdução para mostrar os nomes do
     * guerreiro e oráculo e a quantidade de vidas 
     * q o jogador tem disponível
     */
    String prologoIntroducao(){
        InOut.MsgSemIcone("JOGADORES", "INTRODUÇÃO");
        guerreiro.getNome();
        InOut.MsgSemIcone("JOGADORES", "Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " possuem " + guerreiro.getVidas() + " vidas");
        return guerreiro.nome;
    }
    
        Icon ic4 = new ImageIcon("qMark.png");
        Icon ic5 = new ImageIcon("loteria.png");
        
    /** O loadLevel1 vai ser o primeiro desafio do jogador,
     * ele terá que adivinhar um número entre 0 e 100 com
     * a quantidade de vida que lhe foi sorteada no
     *  método setVidas.
     */
     int loadLevel1(){      
        nivel = 1;   
        int SecretNumber,tent;
        Scanner sc = new Scanner(System.in);
        
        InOut.MsgSemIcone(" ", "--------------  LEVEL 1  --------------");
        SecretNumber = Atividade01.aleatorio(1,100);
        //System.out.println("Numero sorteado é "+SecretNumber);

        do{
            //System.out.println("Nvidas = "+Nvidas);
//            System.out.print("Numero secreto é [1, 100]: ");
//            tent = sc.nextInt();
            Entrada = JOptionPane.showInputDialog (null, "Numero secreto entre [1, 100]:", "vidas restantes: " + Nvidas, JOptionPane.QUESTION_MESSAGE, ic4 ,null,null).toString();
            tent = Integer.parseInt(Entrada);
                                
            if(tent < 1 || tent >100){
                InOut.MsgDeErro("Jogadores", "-----  ERRO  -----");
                InOut.MsgDeInformacao(" ", "Escreva o numero novamente");
            }
            else{
                if(tent != SecretNumber){
                    Nvidas--;
                    if(Nvidas == 0){
                        break;
                    }
                    else{
                        if (tent > SecretNumber){
                            InOut.MsgDeInformacao(" ", "O número secreto é menor.");
                        }       
                        else{
                            InOut.MsgDeInformacao(" ", "O número secreto é maior.");
                        } 
                    }
                }
                else{
                    InOut.MsgSemIcone("Jogadores", " ---------- VOCE ACERTOU O NUMERO ---------- ");
                    break;
                }
            }  
        } while(tent != SecretNumber && Nvidas > 0);
        
        if(tent == SecretNumber){
            InOut.MsgSemIcone(" ", "--------------  LEVEL 2  --------------");
            //TRATAMENTO DE ERRO
            while(escolhaM != 2 || escolhaM != 1){
                
                Entrada = JOptionPane.showInputDialog (null, "2-PAR ou 1-IMPAR: ", "vidas restantes: " + Nvidas, JOptionPane.QUESTION_MESSAGE, ic5 ,null,null).toString();
                escolhaM = Integer.parseInt(Entrada);
                                
//                System.out.println("2-PAR ou 1-IMPAR: ");
//                Scanner es = new Scanner(System.in);
//                escolhaM = es.nextInt();
                if(escolhaM == 2 || escolhaM == 1){
                    loadLevel2(escolhaM);
                    break;
                }
                else{
                    InOut.MsgDeErro("Jogadores", "-----  ERRO  -----");
                    InOut.MsgDeInformacao(" ","O numero digitado nao existe no banco de dados");
                }
            }    
        }else
            prologoPerdedor();
        return SecretNumber;
    }
    
    /** Após passar pelo level1, o jogador seguirá para
     * o level2, onde terá que adivinhar se o número é
     * par ou ímpar, usando a qunatidade de vidas que 
     * restou do level1.
     */
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
                Entrada = JOptionPane.showInputDialog (null, "2-PAR ou 1-IMPAR: ", "vidas restantes: " + Nvidas , JOptionPane.QUESTION_MESSAGE, ic5 ,null,null).toString();
                escolha = Integer.parseInt(Entrada);
//                System.out.println("2-PAR ou 1-IMPAR: ");
//                Scanner es = new Scanner(System.in);
//                escolha = es.nextInt();
                //TRATAMENTO DE ERRO
                if(escolha > 2 || escolha < 1){
                    InOut.MsgDeErro("Jogadores", "   ERRO   ");
                    InOut.MsgDeInformacao(" ","Escreva o número novamente");
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
    
    Icon ic6 = new ImageIcon("trofeu.png");
    Icon ic7 = new ImageIcon("game-over.png");
    
    /** Se o jogador conseguiu passar pelos 2 níveis,
     * essa função será chamada para informar que ele
     *  foi o vencedor do jogo.
     */
    String prologoVencedor(){
        InOut.MsgSemIcone(" ", "--------------  FIM  --------------");
        guerreiro.getNome();
        JOptionPane.showMessageDialog(null, "Oráculo:" + Nome + " e o Guerreiro: " + guerreiro.nome + " VENCEDOR", " ", JOptionPane.INFORMATION_MESSAGE, ic6);
//        InOut.MsgSemIcone(" ","Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " VENCEDOR");
        return guerreiro.nome;  
    }
       
    /** Se o jogador não conseguiu passar pelos 2 níveis,
     * essa função será chamada para informar que ele
     *  foi o perdedor do jogo.
     */
    String prologoPerdedor(){
       // InOut.MsgSemIcone(" ", "ENTROU PERDEDOR");
        // System.out.println("miser = "+miser);
        switch (miser) {
            case 0 -> {
                InOut.MsgDeInformacao(" ","PEDIDO DE MISERICORDIA");
                Icon ic3 = new ImageIcon("misericordia.png");
                pedidoDeM = JOptionPane.showInputDialog (null, palavra , "Escreva sua frase de Misericordia: ", JOptionPane.QUESTION_MESSAGE, ic3, null, null).toString();
                miser = 1;
//                System.out.println("Escreva sua frase de Misericordia: ");
//                Scanner palavra = new Scanner(System.in);
//                pedidoDeM = palavra.nextLine();
                //System.out.println("PEDIDOM = "+pedidoDeM);
                decidirVidaExtra(pedidoDeM);
            }
            case 1 -> {
                miser = 2;
                //System.out.println("RESP = "+resp);
                if (resp == false){
                    InOut.MsgSemIcone(" ", "FIM, voce perdeu!");
                    guerreiro.getNome();
                    JOptionPane.showMessageDialog(null,"Oráculo:" + Nome + " e o Guerreiro: " + guerreiro.nome + " PERDEDOR", " ", JOptionPane.INFORMATION_MESSAGE, ic7);
//                    InOut.MsgSemIcone(" ", "Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " PERDEDOR");
                    return guerreiro.nome;
                }
                else{
                    if(nivel == 1){
                        Nvidas++;
                        loadLevel1();
                    }else{
                        Nvidas++;
                        Entrada = JOptionPane.showInputDialog (null, "2-PAR ou 1-IMPAR: ", ent, JOptionPane.QUESTION_MESSAGE, ic5 ,null,null).toString();
                        escolhaM = Integer.parseInt(Entrada);
//                        System.out.println("2-PAR ou 1-IMPAR: ");
//                        Scanner es = new Scanner(System.in);
//                        escolhaM = es.nextInt();
                        loadLevel2(escolhaM);
                    }
                }
            }
            default -> {
                InOut.MsgSemIcone(" ", "--------------  FIM  --------------");
                guerreiro.getNome();
                JOptionPane.showMessageDialog(null,"Oráculo:" + Nome + " e o Guerreiro: " + guerreiro.nome + " PERDEDOR", " ", JOptionPane.INFORMATION_MESSAGE, ic7);
//                InOut.MsgSemIcone(" ","Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " PERDEDOR");
                return guerreiro.nome;
            }
        }
        return null; 
    }
    
    /** Essa função decidirá se o jogador vai gnaher uma
     * vida extra ou não. Ela concederá ao jogador uma vida
     * extra se o pedido de misericórdia tiver 5 ou mais 
     *  palavras.
     */
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
