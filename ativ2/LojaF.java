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
    
    /** Declaração de atributos */
    private int listaPedidos; 
    private boolean aberta;
    int pedidoN;
    int opcao;
    Pedido pedido;
    // o pedido é um produto dentro dele tem que pedir as coisas do produto
    // list no listaPedido
    
     /**
     * Função para dar a opção do clinte escolher qual o 
     * caminho ele quer seguir dentro da loha online.
     */
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
    
    /**
     * Função para o cliente inserir pedidos na sua compra.
     * Ela será chamada se na função menu, ela for escolhida.
     */
    public void inserirPedido(){
        System.out.println("ENTROU - INSERIR UM PEDIDO");    
                
        
        
    }
    
    /**
     * Função para o cliente buscar seus pedidos na sua compra.
     * Ela será chamada se na função menu, ela for escolhida.
     */
    public void buscarPedido(){
        System.out.println("ENTROU - BUSCAR PEDIDO");
    }
    
    /**
     * Função para o cliente remover pedidos na sua compra.
     * Ela será chamada se na função menu, ela for escolhida.
     */
    public void removerPedido(){
        System.out.println("ENTROU - REMOVER UM PEDIDO");
    }
    
    //---- NOVOS DENTRO DE METODOS DE MANIPULACAO DO PEDIDO ----

    /**
     * Função que irá ser chamada na hora de finalizar a compra
     */
    public Pedido getListaPedidos() {
        
        return null;
        
    }

    /** Vai setar a lista de pedidos do cliente.*/
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
