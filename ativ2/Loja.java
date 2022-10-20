package sistemapedidos;

public class Loja {
    
    // ATRIBUTOS
    private Pedido listaPedidos; 
    private int codigoPedido, carrinhoCompras;
    private boolean aberta;
    
    // MÉTODOS PERSONALIZADOS
    public void main (){
    
    }
    
    public void menu(){
        System.out.println("-------MENU-------");
        System.out.println("Escolha o que deseja pedir:");
        System.out.println("[1] Bolsa rosa.");
        System.out.println("[2] Botas de cowboy.");
        System.out.println("[3] Lenço verde.");
        System.out.println("[4] Chapéu.");
        System.out.println("[5] Calça verde.");
        System.out.println("[6] Blusa amarela.");
        System.out.println("[7] Bolsa azul.");
        
        
    }
    
    public void inserirPedido(){
        if (getAberta()){
            System.out.println("A loja está aberta e seu pedido foi processado.");
            switch (codigoPedido){
            case 1:
                System.out.println("O item 1 foi adicionado ao seu carrinho.");
                this.setCarrinhoCompras(this.getCarrinhoCompras() + 1);
                break;
            case 2:
                System.out.println("O item 2 foi adicionado ao seu carrinho.");
                this.setCarrinhoCompras(this.getCarrinhoCompras() + 1);
                break;
            case 3:
                System.out.println("O item 3 foi adicionado ao seu carrinho.");
                this.setCarrinhoCompras(this.getCarrinhoCompras() + 1);
                break;
            case 4:
                System.out.println("O item 4 foi adicionado ao seu carrinho.");
                this.setCarrinhoCompras(this.getCarrinhoCompras() + 1);
                break;
            case 5:
                System.out.println("O item 5 foi adicionado ao seu carrinho.");
                this.setCarrinhoCompras(this.getCarrinhoCompras() + 1);
                break;
            case 6:
                System.out.println("O item 6 foi adicionado ao seu carrinho.");
                this.setCarrinhoCompras(this.getCarrinhoCompras() + 1);
                break;
            case 7:
                System.out.println("O item 7 foi adicionado ao seu carrinho.");
                this.setCarrinhoCompras(this.getCarrinhoCompras() + 1);
                break;
            default:
                System.out.println("código do pedido escolhido inválido.");
        }  
            
        } else{
            System.out.println("A loja está fechda e seu pedido não foi efetuado.");
        }
    }
    
    public void buscarPedido(){
        if (carrinhoCompras > 0){
            System.out.println("Estes foram seus pedidos: " + this.getListaPedidos()); 
        } else{
            System.out.println("Seu carrinho de compras está vazio.");
        }
    }
    
    public void removerPedido(){
        this.setCarrinhoCompras(this.getCarrinhoCompras() - 1);
    }
    
    public void abrirLoja(){
        this.setAberta(true);
    }
    
    public void fecharLoja(){
        this.setAberta(false);
    }
    
    // MÉTODOS ESPECIAIS
    
    // (GETTERS E SETTERS)
    public Pedido getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(Pedido listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public void setCarrinhoCompras(int carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    
    
}
