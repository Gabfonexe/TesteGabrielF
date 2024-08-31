package Testes;

public class TesteTres {

  // Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
  // Ao final do processamento, qual será o valor da variável SOMA?

  public static void main(String[] args) {

    int indice, soma, k;
    indice = 12; soma = 0; k = 1;

    Valores valores =  new Valores(indice, soma, k);

    valores.somaValores(indice, soma, k);

    
  }

}

class Valores{

  private int indice;
  private int soma;
  private int k;


  public Valores(){
  }

  public Valores (int indice, int soma, int k){
    this.indice = indice;
    this.soma = soma;
    this.k = k;
  }

  public int getIndice(){
    return indice;
  }

  public void setIndice(int indice){
    this.indice = indice;
  }

  public int getSoma(){
    return soma;
  }

  public void setSoma(int soma){
    this.soma = soma;
  }

  public int getK(){
    return k;
  }

  public void setK(int k){
    this.k = k;
  }


  public void somaValores(int indice, int soma, int k){
    while (k < indice) {
      k = k + 1; 
      soma = soma + k;
    }
    System.out.println("A soma é: " + soma);
    
  }

  
  
}
