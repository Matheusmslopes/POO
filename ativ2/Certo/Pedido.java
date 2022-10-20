/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho2;

/**
 *
 * @author alunolab08
 */


public class Pedido {   
    public String dataEmissao;   
    private float valorTotalCalculado;
    Loja loja;
    Funcionario funci;    
    private int pedidoId,foi = 0;
    int idP,quantP;
    String nomeP;
    float valorP;

    public Pedido() {
      
    }

    public Pedido(int pedidoId, String dataEmissao, float valorTotalCalculado) {
        this.pedidoId = pedidoId;
        this.dataEmissao = dataEmissao;
        this.valorTotalCalculado = valorTotalCalculado;
    }
    
    int getPedidoId() {
       pedidoId = setPedidoId();
       return pedidoId;
    }

    int setPedidoId() {
        if(foi == 1){
            pedidoId = pedidoId + 1;
        }
        else{
            pedidoId = 0;
            foi = 1;
        }
        return pedidoId;  
    }
    
    public String getDataEmissao(){
       dataEmissao = dataEmissao();
       return dataEmissao;
    }

    public String dataEmissao() {
        dataEmissao = trabalho2.data();
        return dataEmissao;
    }

    public float getValorTotal() {
        valorTotalCalculado = setValorTotal();
        return valorTotalCalculado;
    }

    public float setValorTotal() {
        for (Pedido p : loja.lista){
            valorTotalCalculado = valorTotalCalculado + p.valorP;
        }
        return valorTotalCalculado;
    }   
}
