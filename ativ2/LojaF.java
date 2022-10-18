/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02;

import java.util.Scanner;

/**
 *
 * @author alunolab08
 */


public class Loja {
    
    // ATRIBUTOS
    private int listaPedidos; 
    private boolean aberta;
    int pedidoN;
    int opcao;
    Pedido pedido;
    // o pedido é um produto dentro dele tem que pedir as coisas do produto
    // list no listaPedido
    
    public void menu(){
        System.out.println("------ MENU ------");
        System.out.println("1 - BUSCAR PEDIDO");
        System.out.println("2 - INSERIR UM PEDIDO");
        System.out.println("3 - REMOVER UM PEDIDO");
        System.out.println("------------------");
        System.out.println("ESCOLHA A OPCAO: ");
        Scanner resposta = new Scanner(System.in);
        opcao = resposta.nextInt();
        if(opcao > 3 || opcao < 1){
            System.out.println("------ ERRO ------"); 
            System.out.println("A OPCAO QUE ESCOLHEU NAO TEM NO SISTEMA");
            System.out.println("------------------");
        }
        else if(opcao == 1){
            buscarPedido();
        }
        else if(opcao == 2){
            inserirPedido();
        }
        else{
            removerPedido();
        }
        
    }
    
    public void inserirPedido(){
        System.out.println("ENTROU - INSERIR UM PEDIDO");    
                
        
        
    }
    
    public void buscarPedido(){
        System.out.println("ENTROU - BUSCAR PEDIDO");
    }
    
    public void removerPedido(){
        System.out.println("ENTROU - REMOVER UM PEDIDO");
    }
    
    //---- NOVOS DENTRO DE METODOS DE MANIPULACAO DO PEDIDO ----

    public Pedido getListaPedidos() {
        
        return null;
        
    }

    public void setListaPedidos(Pedido listaPedidos) {
       
    }
   
    
}
/*

No caso vc deve utilizar um array, array é matriz em inglês, e um vetor nada mais é que uma matriz unidimensional.

Sabendo disso como criar:

int [] valores = {15, 2548};
Nesse caso ele ira criar um vetor de tamanho 2 com esses valores contidos.

Se vc já souber a quantidade de dados pode criar o vetor com tamanho definido e então atribuir os valores em um laço por exemplo:

int [] valores = new int[2];
valores[0] = 15;
valores[1] = 2548;
Já se não souber a quantidade de dados pode utilizar então um ArrayList (um vetor “infinito”):

ArrayList<Integer> valores = new ArrayList<Integer>();
valores.add(15);
valores.add(2548);

*/
