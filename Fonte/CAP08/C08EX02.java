// C08EX02.java
// Programa Calculadora

import java.io.*;
import java.text.*;

class C08EX02 {
  public static void main(String args[]) {

    byte OPCAO = 0;

    // Programa principal

    while (OPCAO != 5) {

      System.out.println();
      System.out.println();
      System.out.println("------------------------");
      System.out.println("  Programa Calculadora  ");
      System.out.println("     Menu Principal     ");
      System.out.println("------------------------");
      System.out.println();
      System.out.println("[1] ............. Adicao");
      System.out.println("[2] .......... Subtracao");
      System.out.println("[3] ...... Multiplicacao");
      System.out.println("[4] ............ Divisao");
      System.out.println("[5] .... Fim de Programa");
      System.out.println();
      System.out.print("Escolha uma opcao: ");
      try {
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));
        OPCAO = Byte.parseByte(br.readLine()); } 
      catch (Exception e) {
        OPCAO = 0;
      }
      if (OPCAO != 5 || OPCAO != 0) {
        switch (OPCAO) {
          case 1: rotadicao();        break;
          case 2: rotsubtracao();     break;
          case 3: rotmultiplicacao(); break;
          case 4: rotdivisao();       break;
        }
      }
    }
  }

  // Modulo de Adicao

  public static void rotadicao() {

    double R, A, B;
    DecimalFormat df = new DecimalFormat();

    System.out.println();
    System.out.println();
    System.out.println("Rotina de Adicao");
    System.out.println("----------------");
    System.out.println();
    System.out.print("Entre um valor para a variavel [A]: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      A = Double.parseDouble(br.readLine()); } 
    catch (Exception e) {
      A = 0;
    }
    System.out.print("Entre um valor para a variavel [B]: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      B = Double.parseDouble(br.readLine()); } 
    catch (Exception e) {
      B = 0;
    }
    R = A + B;
    System.out.println();
    df.applyPattern("0.00");
    System.out.println("O resultado entre A e B = " + df.format(R));
    pausa();
  }

  // Modulo de Subtracao

  public static void rotsubtracao() {

    double R, A, B;
    DecimalFormat df = new DecimalFormat();
    
    System.out.println();
    System.out.println();
    System.out.println("Rotina de Subtracao");
    System.out.println("-------------------");
    System.out.println();
    System.out.print("Entre um valor para a variavel [A]: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      A = Double.parseDouble(br.readLine()); } 
    catch (Exception e) {
      A = 0;
    }
    System.out.print("Entre um valor para a variavel [B]: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      B = Double.parseDouble(br.readLine()); } 
    catch (Exception e) {
      B = 0;
    }
    R = A - B;
    System.out.println();
    df.applyPattern("0.00");
    System.out.println("O resultado entre A e B = " + df.format(R));
    pausa();
  }

  // Modulo de Multiplicacao

  public static void rotmultiplicacao() {

    double R, A, B;
    DecimalFormat df = new DecimalFormat();

    System.out.println();
    System.out.println();
    System.out.println("Rotina de Multiplicacao");
    System.out.println("-----------------------");
    System.out.println();
    System.out.print("Entre um valor para a variavel [A]: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      A = Double.parseDouble(br.readLine()); } 
    catch (Exception e) {
      A = 0;
    }
    System.out.print("Entre um valor para a variavel [B]: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      B = Double.parseDouble(br.readLine()); } 
    catch (Exception e) {
      B = 0;
    }
    R = A * B;
    System.out.println();
    df.applyPattern("0.00");
    System.out.println("O resultado entre A e B = " + df.format(R));
    pausa();
  }

  // Modulo de Divisao

  public static void rotdivisao() {

    double R, A, B;
    DecimalFormat df = new DecimalFormat();

    System.out.println();
    System.out.println();
    System.out.println("Rotina de Divisao");
    System.out.println("-----------------");
    System.out.println();
    System.out.print("Entre um valor para a variavel [A]: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      A = Double.parseDouble(br.readLine()); } 
    catch (Exception e) {
      A = 0;
    }
    System.out.print("Entre um valor para a variavel [B]: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      B = Double.parseDouble(br.readLine()); } 
    catch (Exception e) {
      B = 0;
    }
    if (B == 0) {
      System.out.println();
      System.out.println("Erro de divisao"); }
    else {
      R = A / B;
      System.out.println();
      df.applyPattern("0.00");
      System.out.println("O resultado entre A e B = " + df.format(R));
      pausa();
    }

  }

  // Modulo de Pausa

  public static void pausa() {

    byte ENTER;

    System.out.println();
    System.out.print("Tecle <ENTER> para voltar ao menu: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ENTER = Byte.parseByte(br.readLine()); } 
    catch (Exception e) {
      ENTER = 0;
    }

  }

}
