package Testes;

import java.util.Scanner;

public class TesteDois {
// Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
// IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma palavra ou frase: ");
    String palavra = sc.nextLine();
    String palavraMinuscula = palavra.toLowerCase();
    char[] a = new char[1];
    a[0] = 'a';
    int vezes = 0;

    char[] letras = palavraMinuscula.toCharArray();
    
    for(int i=0; i<letras.length; i++){
      if(letras[i] == a[0]){
        vezes ++;
      }
    }
    System.out.printf("A letra [A] apereceu: %d vezes", vezes);

    sc.close();

 
  }
  
}
