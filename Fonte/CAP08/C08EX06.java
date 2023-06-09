import java.io.*;
import br.com.editoraerica.livro.java.DataMax;

class C08EX06 {

  public static void main(String args[]) { 

    String DATA1, DATA2;
    int DIAS;

    System.out.println();
    System.out.println("------------------------");
    System.out.println("    Programa DataMax    ");
    System.out.println("------------------------");
    System.out.println();
    System.out.println("Datas fornecidas no formato DD/MM/AAAA");
    System.out.println();
    System.out.print("Entre a 1a. data ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      DATA1 = br.readLine(); } 
    catch (Exception e) {
      DATA1 = "";
    }
    System.out.print("Entre a 2a. data ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      DATA2 = br.readLine(); } 
    catch (Exception e) {
      DATA2 = "";
    }
    if (DataMax.dt_ansi(DATA1) > DataMax.dt_ansi(DATA2))
      DIAS = DataMax.juliano(DATA1) - DataMax.juliano(DATA2);
    else
      DIAS = DataMax.juliano(DATA2) - DataMax.juliano(DATA1);
    System.out.println();
    System.out.println("Diferenca de " + DIAS + " dias.");
    System.out.println();
    System.out.print("Entre uma data ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      DATA1 = br.readLine(); } 
    catch (Exception e) {
      DATA1 = "";
    }
    System.out.println();
    System.out.println("Dia semana abr. " + DataMax.ds_abr(DATA1));
    System.out.println("Dia semana ext. " + DataMax.ds_ext(DATA1));
    System.out.println("Dia semana num. " + DataMax.ds_num(DATA1));
    System.out.println();
    System.out.println("Dia data em carac. " + DataMax.cdia(DATA1));
    System.out.println("Mes data em carac. " + DataMax.cmes(DATA1));
    System.out.println("Ano data em carac. " + DataMax.cano(DATA1));
    System.out.println();
    System.out.println("Dia data em num. " + DataMax.ndia(DATA1));
    System.out.println("Mes data em num. " + DataMax.nmes(DATA1));
    System.out.println("Ano data em num. " + DataMax.nano(DATA1));
    System.out.println();
    if (DataMax.bissexto(DATA1) == 1)
      System.out.println("Ano bissexto");
    else
      System.out.println("Ano nao bissexto");
    System.out.println();
    System.out.print("Entre outra data ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      DATA1 = br.readLine(); } 
    catch (Exception e) {
      DATA1 = "";
    }
    System.out.println();
    System.out.println("Data juliano " + DataMax.juliano(DATA1));
    DIAS = DataMax.juliano(DATA1) + 10;
    System.out.println();
    System.out.println("Data com 10 dias " + DataMax.dt_cal(DIAS));
    System.out.println();
    System.out.print("Entre data juliano (9999999) ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      DIAS = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      DIAS = 0;
    }
    System.out.println();
    System.out.println("O dia juliano = " + DataMax.dt_cal(DIAS));
    System.out.println();
  }

}
