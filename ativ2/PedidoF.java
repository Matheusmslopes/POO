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
    
    private int pedidoId;
    private String dataEmissao;
    private float valorTotalCalculado;
    Loja loja;
    
    // --------

    public Pedido() {
    }

    public Pedido(int pedidoId, String dataEmissao, float valorTotalCalculado) {
        this.pedidoId = pedidoId;
        this.dataEmissao = dataEmissao;
        this.valorTotalCalculado = valorTotalCalculado;
    }
    

    
    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId() {
        pedidoId = pedidoId + 1;
        this.pedidoId = getPedidoId();
        System.out.println("Id do pedido e: " + pedidoId);
    }

    public String getDataEmissao() {
        
        return dataEmissao;
    }

    public void setDataEmissao() {
        dataEmissao = Atividade02.data();
        this.dataEmissao = dataEmissao;
    }

    public float getValorTotalCalculado() {
        return valorTotalCalculado;
    }

    public void setValorTotalCalculado(float valorTotalCalculado) {
        this.valorTotalCalculado = valorTotalCalculado;
    }


    
}
