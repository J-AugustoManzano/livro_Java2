package br.com.editoraerica.livro.java;
import java.io.*;

public class DataMax {

  public static String cdia(String DT) {
    String CDIA = DT.substring( 0, 2);
    return(CDIA);
  }

  public static String cmes(String DT) {
    String CMES = DT.substring( 3, 5);
    return(CMES);
  }

  public static String cano(String DT) {
    String CANO = DT.substring( 6,10);
    return(CANO);
  }

  public static byte ndia(String DT) {
    byte NDIA = Byte.valueOf(cdia(DT)).byteValue(); 
    return(NDIA);
  }

  public static byte nmes(String DT) {
    byte NMES = Byte.valueOf(cmes(DT)).byteValue();
    return(NMES);
  }

  public static short nano(String DT) {
    short NANO = Short.valueOf(cano(DT)).shortValue();
    return(NANO);
  }

  public static byte bissexto(String DT) {
    byte BISSEXTO;
    if (nano(DT) % 4 != 0)  
      BISSEXTO = 0;
    else 
      if (nano(DT) % 100 == 0) 
        if (nano(DT) % 400 == 0) 
          BISSEXTO = 1;        
        else 
          BISSEXTO = 0;
      else 
        BISSEXTO = 1;
    return(BISSEXTO);
  }

  public static int dt_ansi(String DT) {
    String DT_ANSI_CHAR = cano(DT) + cmes(DT) + cdia(DT);
    int DT_ANSI = Integer.valueOf(DT_ANSI_CHAR).intValue();
    return(DT_ANSI);
  }

  public static int juliano(String DT) {
    int JULIANO, A, B, C, D, E;
    double F;
    byte DIA = ndia(DT); 
    byte MES = nmes(DT);
    short ANO = nano(DT);
    if (MES < 3) {
       ANO -= 1;
       MES += 12;
    }
    if (dt_ansi(DT) >= dt_ansi("15/10/1582")) {
      A = new Float(ANO / 100).intValue();
      B = new Float(A / 4).intValue();
      C = 2 - A + B; }
    else {
      C = 0;
    }
    D = new Float(365.25 * (ANO + 4716)).intValue();
    E = new Float(30.6001 * (MES + 1)).intValue();
    F = D + E + DIA + 0.5 + C - 1524.5;
    JULIANO = new Float(F).intValue();
    return(JULIANO);
  }

  public static String dt_cal(int DJ) {
    String DT_CAL, DIA, MES, ANO, XDIA, XMES, XANO;
    int A = DJ, B, C, D, E, F, G, H, I, J, K, X, TAMANHO;
    if (A > 2299160) {
      B = new Float((A - 1867216.25) / 36524.25).intValue();
      X = new Float(B / 4).intValue();
      C = A + 1 + B - X; }
    else {
      C = A;
    }
    D = C + 1524;
    E = new Float((D - 122.1) / 365.25).intValue();
    F = new Float(E * 365.25).intValue();
    G = new Float((D - F) / 30.6001).intValue();
    X = new Float(G * 30.6001).intValue();
    H = D - F - X;
    if (G < 14)
      I = G - 1;
    else
      I = G - 13;
    if (I > 2)
      J = E - 4716;
    else
      J = E - 4715;
    if (J > 0)
      K = J;
    else
      K = Math.abs(J + 1);
    DIA = String.valueOf(H); 
    MES = String.valueOf(I); 
    ANO = String.valueOf(K); 
    TAMANHO = DIA.length();
    if (TAMANHO == 1) {
      XDIA = "0" + DIA;
      DIA = XDIA;
    }
    TAMANHO = MES.length();
    if (TAMANHO == 1) {
      XMES = "0" + MES;
      MES = XMES;
    }
    TAMANHO = ANO.length();
    if (TAMANHO < 4) {
      X = Short.valueOf(ANO).intValue();
      X += 10000;
      XANO = String.valueOf(X);
      ANO = XANO.substring(1, 4);
    }   
    DT_CAL = DIA + "/" + MES + "/" + ANO;
    return(DT_CAL);
  }

  public static String ds_abr(String DT) {
    int DIA = (juliano(DT) + 2) % 7;
    String DS_ABR = "";
    switch (DIA) {
      case 0: DS_ABR = "sab"; break;
      case 1: DS_ABR = "dom"; break;
      case 2: DS_ABR = "seg"; break;
      case 3: DS_ABR = "ter"; break;
      case 4: DS_ABR = "qua"; break;
      case 5: DS_ABR = "qui"; break;
      case 6: DS_ABR = "sex"; break;
    }
    return(DS_ABR);
  }

  public static String ds_ext(String DT) {
    int DIA = (juliano(DT) + 2) % 7;
    String DS_EXT = "";
    switch (DIA) {
      case 0: DS_EXT = "sabado";        break;
      case 1: DS_EXT = "domingo";       break;
      case 2: DS_EXT = "segunda-feira"; break;
      case 3: DS_EXT = "terca-feira";   break;
      case 4: DS_EXT = "quarta-feira";  break;
      case 5: DS_EXT = "quinta-feira";  break;
      case 6: DS_EXT = "sexta-feira";   break;
    }
    return(DS_EXT);
  }

  public static byte ds_num(String DT) {
    int DIA = (juliano(DT) + 2) % 7;
    byte DS_NUM = new Integer(DIA).byteValue();
    return(DS_NUM);
  }

}
