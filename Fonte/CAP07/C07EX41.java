import java.io.*;
import java.util.Date;
import java.text.DecimalFormat;

class C07EX41 {
  public static void main(String args[]) {

    DecimalFormat df = new DecimalFormat();

    Date DATA1 = new Date();
    Date DATA2 = new Date();

    int DIA1, MES1, ANO1;
    int DIA2, MES2, ANO2;
    int HOR1, MIN1;
    int HOR2, MIN2;

    double VLRHR, FRACAO, VLRTOT;

    String EDATA1, EHORA1;
    String EDATA2, EHORA2;

    System.out.println();
    System.out.println("*** Estacionamento 24 Horas ***");
    System.out.println();
    System.out.println();

    System.out.print("Entre data de entrada [DD/MM/AAAA] ...: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      EDATA1 = br.readLine(); } 
    catch (Exception e) {
      EDATA1 = "";
    }

    System.out.print("Entre hora de entrada [HH:MM] ........: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      EHORA1 = br.readLine(); } 
    catch (Exception e) {
      EHORA1 = "";
    }

    System.out.print("Entre data de saida   [DD/MM/AAAA] ...: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      EDATA2 = br.readLine(); } 
    catch (Exception e) {
      EDATA2 = "";
    }

    System.out.print("Entre hora de saida   [HH:MM] ........: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      EHORA2 = br.readLine(); } 
    catch (Exception e) {
      EHORA2 = "";
    }

    System.out.print("Entre o valor da hora em R$ ..........: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      VLRHR = Double.parseDouble(br.readLine()); } 
    catch (Exception e) {
      VLRHR = 0;
    }

    System.out.println();

    DIA1 = Integer.parseInt(EDATA1.substring( 0, 2)); 
    MES1 = Integer.parseInt(EDATA1.substring( 3, 5));
    ANO1 = Integer.parseInt(EDATA1.substring( 6,10));

    DATA1.setDate(DIA1);
    DATA1.setMonth(MES1 - 1);
    DATA1.setYear(ANO1 - 1900);

    DIA2 = Integer.parseInt(EDATA2.substring( 0, 2)); 
    MES2 = Integer.parseInt(EDATA2.substring( 3, 5));
    ANO2 = Integer.parseInt(EDATA2.substring( 6,10));

    DATA2.setDate(DIA2);
    DATA2.setMonth(MES2 - 1);
    DATA2.setYear(ANO2 - 1900);

    HOR1 = Integer.parseInt(EHORA1.substring( 0, 2)); 
    MIN1 = Integer.parseInt(EHORA1.substring( 3, 5));

    DATA1.setHours(HOR1);
    DATA1.setMinutes(MIN1);

    HOR2 = Integer.parseInt(EHORA2.substring( 0, 2)); 
    MIN2 = Integer.parseInt(EHORA2.substring( 3, 5));

    DATA2.setHours(HOR2);
    DATA2.setMinutes(MIN2);

    FRACAO = VLRHR / 60;

    if (DATA1.getTime() > DATA2.getTime())
      VLRTOT = (DATA1.getTime() - DATA2.getTime()) / 60000 * FRACAO;
    else
      VLRTOT = (DATA2.getTime() - DATA1.getTime()) / 60000 * FRACAO;
  
    df.applyPattern("0.00");
    System.out.println("Valor a ser pago = " + df.format(VLRTOT));

  }
}
