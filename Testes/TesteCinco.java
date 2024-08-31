package Testes;

public class TesteCinco {

  // Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?  

  public static void main(String[] args) {

    Salas salas = new Salas(); // usarei o construtor vazio devido a herença das classes filhas

    salas.setInterruptorUm("Interruptor - 1");
    salas.setInterruptorDois("Interruptor - 2");
    salas.setInterruptorTres("Interruptor - 3");

    salas.setLampadaUm("Lâmpada - 1");
    salas.setLampadaDois("Lâmpada - 2");
    salas.setLampadaTres("Lâmpada - 3");

    // Para descobrir qual Lâmpada é a certa para cada interrputor, basta acender 2 lâmpada. Como eu só tenho 2 idas para visitar as salas (sendo 3 salas), eu iria visitar 1 sala após os 5 min. Se essa sala estivesse com a lâmpada quente, eu saberia que era de algum interruptor que deixei aceso durante os 5 minutos. Ou seja, a probabilidade seria de 1/2 ou 50%. Caso a lâmpada estivesse fria, saberia que pertencia ao interruptor desligado.  Após consultar isso, eu voltaria para a sala dos interruptores. Sobrou 2 interruptores e 2 lâmpadas, para finalizar, bastava deixar ligado somente 1 dos 2 interruptores e após 10 minutos ir para uma das duas salas restantes. Caso a lâmpada esteja fria ou quente, conseguiria relacionar a razão entre elas.

    System.out.println(salas.getInterruptorUm());
    salas.ligar(); System.out.println();

    System.out.println(salas.getInterruptorDois());
    salas.ligar(); System.out.println();

    System.out.println("Cheguei na Sala 1");
    System.out.println(salas.getLampadaUm());
    salas.desligada(); System.out.println();

    System.out.println("Então o Interruptor 3 está associado a Lâmpada 1"); System.out.println();

    System.out.println("Voltando para a sala Principal"); System.out.println();

    System.out.println(salas.getInterruptorUm());
    salas.desligar(); System.out.println();

    System.out.println("Após 10 minutos . . . "); System.out.println();

    System.out.println("Cheguei na Sala 2");
    System.out.println(salas.getLampadaDois());
    salas.desligada(); System.out.println();
    
    System.out.println("Então o Interruptor 1 está associado a Lâmpada 2"); System.out.println();

    System.out.println("Resultados: \n");

    System.out.println(salas.getInterruptorUm() + " = " + salas.getLampadaDois());
    System.out.println(salas.getInterruptorDois() + " = " + salas.getLampadaTres());
    System.out.println(salas.getInterruptorTres() + " = " + salas.getLampadaUm());

    
  }


  
}
class Salas extends Lampadas{
  private Lampadas salas;

  public Salas(){
  }

  public Salas(String lampadaUm, String lampadaDois, String lampadaTres, Interruptor interruptores, Lampadas salas) {
    super(lampadaUm, lampadaDois, lampadaTres, interruptores);
    this.salas = salas;
  }
  
  public Lampadas getSalas() {
    return salas;
  }

  public void setSalas(Lampadas salas) {
    this.salas = salas;
  }

  
}

class Lampadas extends Interruptor{

  protected String lampadaUm;
  protected String lampadaDois;
  protected String lampadaTres;
  protected Interruptor interruptores;

  public Lampadas() {
  }

  public Lampadas(String lampadaUm, String lampadaDois, String lampadaTres, Interruptor interruptores) {
    this.lampadaUm = lampadaUm;
    this.lampadaDois = lampadaDois;
    this.lampadaTres = lampadaTres;
    this.interruptores = interruptores;
  }

  public String getLampadaUm() {
    return lampadaUm;
  }

  public void setLampadaUm(String lampadaUm) {
    this.lampadaUm = lampadaUm;
  }

  public String getLampadaDois() {
    return lampadaDois;
  }

  public void setLampadaDois(String lampadaDois) {
    this.lampadaDois = lampadaDois;
  }

  public String getLampadaTres() {
    return lampadaTres;
  }

  public void setLampadaTres(String lampadaTres) {
    this.lampadaTres = lampadaTres;
  }

  public Interruptor getInterruptores() {
    return interruptores;
  }

  public void setInterruptores(Interruptor interruptores) {
    this.interruptores = interruptores;
  }

  public void acesa(){
    System.out.println("Acesa !");
  }

  public void desligada(){
    System.out.println("Desligada !");
  }
}

class Interruptor{

  protected String interruptorUm;
  protected String interruptorDois;
  protected String interruptorTres;

  public Interruptor() {
  }

  public Interruptor(String interruptorUm, String interruptorDois, String interruptorTres) {
    this.interruptorUm = interruptorUm;
    this.interruptorDois = interruptorDois;
    this.interruptorTres = interruptorTres;
  }

  public String getInterruptorUm() {
    return interruptorUm;
  }

  public void setInterruptorUm(String interruptorUm) {
    this.interruptorUm = interruptorUm;
  }

  public String getInterruptorDois() {
    return interruptorDois;
  }

  public void setInterruptorDois(String interruptorDois) {
    this.interruptorDois = interruptorDois;
  }

  public String getInterruptorTres() {
    return interruptorTres;
  }

  public void setInterruptorTres(String interruptorTres) {
    this.interruptorTres = interruptorTres;
  }

  public void ligar(){
    System.out.println("Ligar");
  }

  public void desligar(){
    System.out.println("Desligar");
  }
}