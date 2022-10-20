/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho2;

import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alunolab08
 */


public class Funcionario {
    
    // ATRIBUTOS
    private String nome;
    private int matricula;
    private String senha;
    Pedido pedido;
    Loja loja;
    int voltou = 0,volta;
    int foiM = 0;    
    

    public Funcionario() {
    }

    public Funcionario(String nome, int matriula) {
        this.nome = nome;
        this.matricula = matriula;
    }
    
//    public void login(){
//        if(voltou == 0){
//            loja.addFuncionario();
//        }
//        else{
//            mostraUsuarios();
//            System.out.println("------ LOGIN ------");
//            System.out.println("INFORME SUA MATRICULA: ");
//            Scanner urso = new Scanner(System.in);
//            int matric = urso.nextInt();
//            System.out.println("INFORME SUA SENHA: ");
//            Scanner urso1 = new Scanner(System.in);
//            String senhaI = urso1.next();
//
//            
//            for (Funcionario f : loja.usuario) {
//                System.out.println("AAA");
//                System.out.println("FUNCIONARIO-> NOME: " + f.getNome() + " SENHA: " + f.getSenha() + " MATRICULA: " + f.getMatricula());
//                if(matric == f.matricula ){
//                    System.out.println("EEEE");
//                    System.out.println("BEM-VINDO "+f.getNome()+" AO BANCO DE DADOS");
//                    loja.menu();
//                }
//
//            }
//        }
//        
//    }  
    
    int getMatricula() {
       matricula = setMatricula(matricula);
       return matricula;
    }

    int setMatricula(int matricula) {
        
        if(foiM == 1){
            matricula = matricula + 1;
        }
        else{
            matricula = 1203;
            foiM = 1;
        }
        
        return matricula;  
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    Icon ic = new ImageIcon("funcionario.png");
    
    public void mostraUsuarios(){
        JOptionPane.showMessageDialog (null, loja.usuario.size()+ ": FUNCIONARIOS FORAM ENCONTRADOS","USUARIOS ENCONTRADOS", JOptionPane.INFORMATION_MESSAGE, ic);
        int i = 0;
        for (Funcionario f : loja.usuario) {
            JOptionPane.showMessageDialog(null,"FUNCIONARIO [" + i + "] -> NOME: " + f.getNome() + System.lineSeparator() + " SENHA: " + f.getSenha() + System.lineSeparator() +" MATRICULA: " + f.getMatricula(), "USUARIOS ENCONTRADOS", JOptionPane.INFORMATION_MESSAGE, ic);
            i++;
        }  
        // -- ESCOLHA DE VOLTA PARA O MENU --
        OUTER:
        while (volta != 1 || volta != 2) {
            String Entrada = JOptionPane.showInputDialog (null, " 1-SIM ou 2-NAO " , " DESEJA VOLTAR PARA O MENU? ", JOptionPane.QUESTION_MESSAGE);
            volta = Integer.parseInt(Entrada);
            
            if(volta==1){
                    loja.menu();
                    break;
                }
            else if(volta==2){
                    InOut.MsgDeInformacao(" ", "SAIU");
//                    System.out.println("--- SAIU ---");
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
     
   

    
    
    
}
