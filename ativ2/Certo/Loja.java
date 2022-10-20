/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alunolab08
 */


public class Loja {
    
    private int listaPedidos; 
    int volta;
    Pedido pedido;
    Funcionario funcionario;
    int opcao, prodA = 0,prodE = 0,prodB = 0,cria=0,funcQ=0;

    List<Pedido> lista = new ArrayList<>();
    List<Funcionario> usuario = new ArrayList<>();

    public Loja() {
        
    }
    
        Icon ic1 = new ImageIcon("menu.png");

    public void menu(){  
        gerente();
        InOut.MsgDeInformacao(" ", "MENU");
        String original;

// add new line
        original = JOptionPane.showInputDialog (null, "1 - BUSCAR PRODUTO" + System.lineSeparator() +"2 - INSERIR UM PRODUTO" + System.lineSeparator() + "3 - REMOVER UM PRODUTO" + System.lineSeparator() + "4 - MOSTRA PRODUTOS" +
                 System.lineSeparator() + "5 - MOSTRA RELATORIO" + System.lineSeparator() + "6 - ADICIONA FUNCIONARIO" + System.lineSeparator() + "7 - MOSTRAR FUNCIONARIO" , "MENU", 
											   JOptionPane.QUESTION_MESSAGE, ic1, null, null).toString();
        opcao = Integer.parseInt(original);

        if(opcao == 1)
            buscarPedido();
        else if(opcao == 2)
            inserirPedido();
        else if(opcao==3)
            removerPedido();
        else if(opcao==4)
            mostraPedido();
        else if(opcao==5)
            mostraRelatorio();
        else if(opcao==6)
            addFuncionario();
        else if(opcao==7)
            funcionario.mostraUsuarios();
        else{
            InOut.MsgDeErro("", "   ERRO   ");
            InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
            menu();
        }
        
//        switch (opcao) {
//            case 1 -> buscarPedido();
//            case 2 -> inserirPedido();
//            case 3 -> removerPedido();
//            case 4 -> mostraPedido();
//            case 5 -> mostraRelatorio();
//            case 6 -> addFuncionario();
//            case 7 -> System.out.println("TROCA DE USUARIO");
//            default -> {
//                System.out.println("------ ERRO ------"); 
//                System.out.println("A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
//                System.out.println("------------------");
//                menu();
//            }
//        }  
    }
    Icon ic2 = new ImageIcon("new.png");
    public void inserirPedido(){
        prodA++;
        
        InOut.MsgDeInformacao(" ", "PRODUTO NOVO");
        String nome = JOptionPane.showInputDialog (null, "1 - NOME DO PRODUTO: ", "PRODUTO NOVO" , JOptionPane.QUESTION_MESSAGE, ic2, null, null).toString();

        String r2 = JOptionPane.showInputDialog (null,"2 - VALOR DO PRODUTO:  ", "PRODUTO NOVO" , JOptionPane.QUESTION_MESSAGE, ic2, null, null).toString();
         float valor = Float.valueOf(r2); 

        String r3 = JOptionPane.showInputDialog (null , "3 - QUANTIDADE DO PRODUTO: ", "PRODUTO NOVO" , JOptionPane.QUESTION_MESSAGE, ic2, null, null).toString();
        int quantidade = Integer.parseInt(r3);

        int id = pedido.getPedidoId();
        JOptionPane.showMessageDialog(null, "ID: " + id, "PRODUTO NOVO ", JOptionPane.INFORMATION_MESSAGE, ic2);

        Pedido p = new Pedido();
        p.idP = id;
        p.nomeP = nome;
        p.valorP = valor;
        p.quantP = quantidade;
        lista.add(p);
        // -- ESCOLHA DE VOLTA PARA O MENU --
        OUTER:
        while (volta != 1 || volta != 2) {
            String esc = JOptionPane.showInputDialog (null, " 1-SIM ou 2-NAO " , " DESEJA VOLTAR PARA O MENU? ", JOptionPane.QUESTION_MESSAGE);
            volta = Integer.parseInt(esc);

            if(volta==1){
                    menu();
                    break;
                }
            else if(volta==2){
                    InOut.MsgDeInformacao(" ", "SAIU");
                    break;
                }
            else{
                InOut.MsgDeErro("", "   ERRO   ");
                InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
            }
            
//            switch (volta) {
//                case 1 -> {
//                    menu();
//                    break OUTER;
//                }
//                case 2 -> {
//                    System.out.println("--- SAIU ---");
//                    break OUTER;
//                }
//                default -> {
//                    System.out.println("------ ERRO ------");
//                    System.out.println("A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
//                    System.out.println("------------------");
//                }
//            }
        }
   }
    
    Icon ic3 = new ImageIcon("lupa.png");
    public void buscarPedido(){
        prodB++;
        InOut.MsgDeInformacao(" ", "BUSCAR PRODUTO");
        String lerB = JOptionPane.showInputDialog (null, "DIGITE A POSICAO DO PRODUTO: ", "BUSCAR PRODUTO" , JOptionPane.QUESTION_MESSAGE, ic3, null, null).toString();
        int pesquisa = Integer.parseInt(lerB);

        int foiID = 1;
        for (Pedido p : lista){
            if(pesquisa == p.idP){
                foiID = 0;
                break;
            }
        }
        if(foiID == 0){
            for (Pedido p : lista){
                if(p.idP == pesquisa){
                 JOptionPane.showMessageDialog (null, "Produto -> " + System.lineSeparator() +"ID: " + p.idP + System.lineSeparator() + "NOME: " + p.nomeP +
                 System.lineSeparator() + "VALOR: " + p.valorP + System.lineSeparator() + "QUANTIDADE: " + p.quantP , "MENU", 
											   JOptionPane.QUESTION_MESSAGE, ic3);
                    break;
                }
            }
        }
        else{
            InOut.MsgDeErro("Jogadores", "   ERRO   ");
            InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
            menu();
        }
        // -- ESCOLHA DE VOLTA PARA O MENU --
        OUTER:
        while (volta != 1 || volta != 2) {
            String ler3 = JOptionPane.showInputDialog (null, " 1-SIM ou 2-NAO " , " DESEJA VOLTAR PARA O MENU? ", JOptionPane.QUESTION_MESSAGE);
            volta = Integer.parseInt(ler3);
            
            if(volta==1){
                    menu();
                    break;
                }
            else if(volta==2){
                    InOut.MsgDeInformacao(" ", "SAIU");
                    break;
                }
            else{
                   InOut.MsgDeErro("", "   ERRO   ");
                   InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
            }
        }
    }

    Icon ic4 = new ImageIcon("excluir-produto.png");
    public void removerPedido(){
        prodE++;
        InOut.MsgDeInformacao(" ", "REMOVER PRODUTO");
        String lerID = JOptionPane.showInputDialog (null, "DIGITE A POSICAO DO PRODUTO: ", "REMOVER PRODUTO" , JOptionPane.QUESTION_MESSAGE, ic4, null, null).toString();
        int excluiID = Integer.parseInt(lerID);

        int foiID = 1;
        for (Pedido p : lista){
            if(excluiID == p.idP){
                foiID = 0;
                break;
            }
        }
        if(foiID == 0){
            String lerR = JOptionPane.showInputDialog (null, "1 - SIM e 2 - NAO: ", "DESEJA EXCLUIR MESMO ESSE PRODUTO?" , JOptionPane.QUESTION_MESSAGE, ic4 ,null,null).toString();
            int respostaE = Integer.parseInt(lerR);

            if(respostaE == 1){
                for (Pedido p : lista){
                    if(p.idP == excluiID){
                        lista.remove(p.idP);
                        InOut.MsgDeInformacao("", "PRODUTO EXCLUIDO");
                        mostraPedido();
                        break;
                    }
                } 
            }
        }
        else{
            InOut.MsgDeErro("", "   ERRO   ");
            InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
            menu();
        }
       // -- ESCOLHA DE VOLTA PARA O MENU --
        OUTER:
        while (volta != 1 || volta != 2) {
            String ler3 = JOptionPane.showInputDialog (null, " 1-SIM ou 2-NAO " , " DESEJA VOLTAR PARA O MENU? ", JOptionPane.QUESTION_MESSAGE);
            volta = Integer.parseInt(ler3);

            if(volta==1){
                    menu();
                    break ;
                }
            else if(volta==2){
                InOut.MsgDeInformacao(" ", "SAIU");;
                    break ;
                }
            else{
                InOut.MsgDeErro("", "   ERRO   ");
                InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
            }
        }   
    }
    
    //---- NOVOS DENTRO DE METODOS DE MANIPULACAO DO PEDIDO ----
    Icon ic5 = new ImageIcon("pedido.png");
    public void mostraPedido(){
        InOut.MsgDeInformacao(" ", "PRODUTOS ENCONTRADOS");
        JOptionPane.showMessageDialog (null, "ENCONTRADOS " + lista.size()+ " PRODUTOS","PRODUTOS ENCONTRADOS", JOptionPane.INFORMATION_MESSAGE, ic5);

        int i = 0;
        for (Pedido p : lista){
            JOptionPane.showMessageDialog (null, "Produto [" + i + "] -> ID: " + p.idP + System.lineSeparator() + " NOME: " + p.nomeP + System.lineSeparator()+
                    " VALOR: " + p.valorP + System.lineSeparator() + " QUANTIDADE: " + p.quantP , "PRODUTOS ENCONTRADOS" , JOptionPane.INFORMATION_MESSAGE, ic5);
            i++;
        }
        // -- ESCOLHA DE VOLTA PARA O MENU --
        OUTER:
        while (volta != 1 || volta != 2) {
            String ler4 = JOptionPane.showInputDialog (null, " 1-SIM ou 2-NAO " , " DESEJA VOLTAR PARA O MENU? ", JOptionPane.QUESTION_MESSAGE);
            volta = Integer.parseInt(ler4);
            
            if(volta==1){
                    menu();
                    break;
                }
            else if(volta==2){
                    InOut.MsgDeInformacao(" ", "SAIU");
                    break;
                }
            else{
                InOut.MsgDeErro("", "   ERRO   ");
                InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
            }
        }
    }
     
    public void mostraRelatorio(){
        InOut.MsgDeInformacao(" ", "RELATORIO ");
        JOptionPane.showMessageDialog (null, "ENCONTRADOS " + lista.size()+ " PRODUTOS","PRODUTOS ENCONTRADOS", JOptionPane.INFORMATION_MESSAGE, ic5);
        String data = pedido.getDataEmissao();
        float total = pedido.getValorTotal();
        
        JOptionPane.showMessageDialog (null, "-> RELATORIO FEITO NO DIA " + data + System.lineSeparator() +"-> " + prodA + " PRODUTOS NOVOS FORAM ADICONADOS" + System.lineSeparator() + "-> " + prodE + " PRODUTOS FORAM EXCLUIDOS" +
                System.lineSeparator() + "-> FORAM PESQUISADOS " + prodB + " PRODUTOS" + System.lineSeparator() + "-> " + funcQ + " FUNCIONARIOS NOVOS FORAM ADICIONADOS" +
                System.lineSeparator() + "-> VALOR TOTAL DOS PRODUTOS: R$"+total, "RELATORIO", JOptionPane.INFORMATION_MESSAGE, ic5);

        // -- ESCOLHA DE VOLTA PARA O MENU --
        OUTER:
        while (volta != 1 || volta != 2) {
            String ler5 = JOptionPane.showInputDialog (null, " 1-SIM ou 2-NAO " , " DESEJA VOLTAR PARA O MENU? ", JOptionPane.QUESTION_MESSAGE);
            volta = Integer.parseInt(ler5);

            if(volta==1){
                    menu();
                    break;
                }
            else if(volta==2){
                    InOut.MsgDeInformacao(" ", "SAIU");
                    break;
                }
            else{
                InOut.MsgDeErro("", "   ERRO   ");
                InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
            }
        }
    }
    Icon ic6 = new ImageIcon("adicionar.png");
    
    public void gerente(){
    Funcionario f = new Funcionario();
        if(cria == 0){
            f.setNome("kimberly");
            f.setSenha("123");
            f.setMatricula(123);
            usuario.add(f);
            cria = cria + 1;
            funcionario.voltou = 1;
            //funcionario.login();
        }
    }
    public void addFuncionario(){
        Funcionario f1 = new Funcionario();
           if(cria != 0){
            InOut.MsgDeInformacao(" ", "ADICIONA NOVO FUNCIONARIO ");
            String nome =JOptionPane.showInputDialog (null, "ESCREVA O NOME DO FUNCIONARIO: ", "ADICIONA NOVO FUNCIONARIO " , JOptionPane.QUESTION_MESSAGE, ic6, null, null).toString();

            String senhaF =JOptionPane.showInputDialog (null, "ESCREVA A SENHA DO USUARIO:", "ADICIONA NOVO FUNCIONARIO " , JOptionPane.QUESTION_MESSAGE, ic6, null, null).toString();            

            int matri = funcionario.getMatricula();
            JOptionPane.showMessageDialog (null, "MATRICULA DO USUARIO E: "+matri ,"ADICIONA NOVO FUNCIONARIO ", JOptionPane.INFORMATION_MESSAGE, ic6);

            f1.setNome(nome);
            f1.setSenha(senhaF);
            f1.setMatricula(matri);

            usuario.add(f1);
            funcQ++;
            // -- ESCOLHA DE VOLTA PARA O MENU --
            OUTER:
            while (volta != 1 || volta != 2) {
                String lerAd = JOptionPane.showInputDialog (null, " 1-SIM ou 2-NAO " , " DESEJA VOLTAR PARA O MENU? ", JOptionPane.QUESTION_MESSAGE);
                volta = Integer.parseInt(lerAd);

                if(volta==1){
                    menu();
                    break OUTER;
                }
            else if(volta==2){
                InOut.MsgDeInformacao(" ", "SAIU");
                    break OUTER;
                }
            else{
                InOut.MsgDeErro("", "   ERRO   ");
                InOut.MsgDeInformacao(" ","A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
            }
          }
        } 
    }
}
