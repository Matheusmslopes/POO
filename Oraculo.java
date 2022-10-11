import java.util.Scanner;

/**
 *
 * @author alunolab08
 */
public class oraculo {
    
    String Nome, VidaEx;
    Guerreiro guerreiro;
    int Nvidas = guerreiro.Vida;

    public oraculo() {
    }
    public oraculo(String Nome) {
        this.Nome = Nome;
    }
    
    void setNome(String Nome){
        this.Nome = Nome;
        System.out.println("aaa "+Nome);
    }

    int setVidas(){
        guerreiro.Vida = Atividade01.aleatorio(9, 12);
        return guerreiro.Vida;
    }
    String prologoIntroducao(){
        System.out.println("---------------------------------");
        guerreiro.getNome();
        System.out.println("Oráculo: " + Nome +" e o Guerreiro: " + guerreiro.nome +  " com Quantidade de Vidas: " + guerreiro.getVidas());
        return guerreiro.nome;
    }
    int loadLevel1(){
        
        int SecretNumber,tent, Vidas = 0, vidasRest;
        Scanner sc = new Scanner(System.in);
        
        SecretNumber = Atividade01.aleatorio(1,100);
        vidasRest = Vidas;
        System.out.println(SecretNumber);

    do
    {
      System.out.print("Numero secreto é [1, 100]: ");
      tent = sc.nextInt();
      vidasRest--;
      if (tent > SecretNumber)
        System.out.println("O número secreto é menor.");
      else if (tent == SecretNumber)
      {
        System.out.println("Você acertou");
      }
      else
        System.out.println("O número secreto é maior.");
      
    } while(tent != SecretNumber && vidasRest > 0);
    
    return SecretNumber;

    //Oraculo.loadLevel2();
    }
    int loadLevel2(int opcao){
        int NG,NO, resposta,i;
        String escolha, resultado;
        NG = Atividade01.aleatorio(0, 5);
        NO = Atividade01.aleatorio(0, 5);
        resposta = NG + NO;
            if (resposta % 2 == 0){
                System.out.println("O número sortedo é PAR");
                resultado = "par";
            }
            else {
                System.out.println("O número sorteado é IMPAR");
                resultado = "impar";
            }
        for(i = Nvidas; i >= 0; i--){
            System.out.println("A soma dos números sorteados é PAR ou IMPAR:");
            Scanner es = new Scanner(System.in);
            escolha = es.next();
            if (escolha == resultado){
                prologoVencedor();
            }
            else if(Nvidas == 0){
              VidaEx = guerreiro.vidaExtra();
                if(VidaEx == "sim"){
                    Nvidas++;
                }
                else {
                    prologoPerdedor();
                    break;
                }
            }
            else{
                Nvidas--;
            }
        }
        
        return 0;
    }
    String prologoVencedor(){
        return "";
    }
    String prologoPerdedor(){
        return "";
    }
    boolean decidirVidaExtra(String misericordia){
        
        return false;
        
    }


}
