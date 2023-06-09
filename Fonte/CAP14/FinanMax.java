package br.com.editoraerica.livro.java;
import java.io.*;

public class FinanMax {

  // Metodo: cterm()

  public static double cterm(double I, double FV, double PV) {
    double CTERM = Math.log(FV / PV) / Math.log(1 + I);
    return(CTERM);
  }

  // Metodo: fv()

  public static double fv(double PMT, double I, double N, float TIPO) {
    double FV = PMT * ((Math.pow(1 + I, N) - 1) / I);
    if (TIPO == 1)
      FV = FV * (1 + I);
    return(FV);
  }

  // Metodo: pmt()

  public static double pmt(double PV, double I, double N, float TIPO) {
    double PMT = PV * I / (1 - Math.pow((1 + I), (N * -1)));
    if (TIPO == 1)
      PMT = PMT / (1 + I);
    return(PMT);
  }

  // Metodo: pv()

  public static double pv(double PMT, double I, double N, float TIPO) {
    double PV = PMT * ((1 - Math.pow((1 + I), (N * -1))) / I);
    if (TIPO == 1)
      PV = PV * (1 + I);
    return(PV);
  }

  // Metodo: rate()

  public static double rate(double FV, double PV, double N, float PERIODO) {
    double RATE = (Math.pow((FV / PV), (1 / N)) - 1);
    if (PERIODO == 1)
      RATE = Math.pow(1 + RATE, 12) - 1;
    return(RATE * 100);
  }

  // Metodo: term()

  public static double term(double PMT, double I, double FV) {
    double TERM = Math.log(1 + (FV * I / PMT)) / Math.log(1 + I);
    return(Math.abs(TERM));
  }

}
