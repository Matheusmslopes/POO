/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02;

/**
 *
 * @author alunolab08
 */


import java.util.Scanner;

public class Pedido {
    /** Declaração de variáveis*/
    private int pedidoId;
    private String dataEmissao;
    private float valorTotalCalculado;
    Loja loja;
    
    
    /** Construtores*/
    public Pedido() {
    }

    public Pedido(int pedidoId, String dataEmissao, float valorTotalCalculado) {
        this.pedidoId = pedidoId;
        this.dataEmissao = dataEmissao;
        this.valorTotalCalculado = valorTotalCalculado;
    }
    

     /**
     * Função para pegar o ID do pedido
     * @return um INT que será o ID do pedido
     */
    public int getPedidoId() {
        return pedidoId;
    }

     /**
     * Função para setar o ID do pedido
     * @return um INT que será o ID do pedido
     */
    public void setPedidoId() {
        pedidoId = pedidoId + 1;
        this.pedidoId = getPedidoId();
        System.out.println("Id do pedido e: " + pedidoId);
    }

     /**
     * Função para pegar a data, que vai
     * ser definida pela função setDataEmissao
     * @return uma string em data
     */
    public String getDataEmissao() {
        
        return dataEmissao;
    }

     /**
     * Função para chamar a função data, presente
     * no Main.
     */
    public void setDataEmissao() {
        dataEmissao = Atividade02.data();
        this.dataEmissao = dataEmissao;
    }

     /**
     * Função para pegar o valor total do pedido
     * @return um float que será o valor final do pedido
     */
    public float getValorTotalCalculado() {
        return valorTotalCalculado;
    }

    /**
     * Função para setar o valor total do pedido final 
     * do cliente
     */
    public void setValorTotalCalculado(float valorTotalCalculado) {
        this.valorTotalCalculado = valorTotalCalculado;
    }


    
}
