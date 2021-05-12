import java.io.*;
import java.text.DecimalFormat;

class C04EX03 {

  public static void main(String args[]) {

    float HT, VH, PD, TD, SB, SL;
    DecimalFormat df = new DecimalFormat();
 
    System.out.println();

    System.out.print("Entre quantidade de horas trabalhadas ..: ");
     try {
       BufferedReader br = new BufferedReader(
       new InputStreamReader(System.in));
       HT = Float.parseFloat(br.readLine()); } 
     catch (Exception e) {
       HT = 0;
     }

    System.out.print("Entre valor da hora de trabalho ........: ");
     try {
       BufferedReader br = new BufferedReader(
       new InputStreamReader(System.in));
       VH = Float.parseFloat(br.readLine()); } 
     catch (Exception e) {
       VH = 0;
     }

    System.out.print("Entre valor do percentual de desconto ..: ");
     try {
       BufferedReader br = new BufferedReader(
       new InputStreamReader(System.in));
       PD = Float.parseFloat(br.readLine()); } 
     catch (Exception e) {
       PD = 0;
     }

     SB = HT * VH;
     TD = (PD / 100) * SB;
     SL = SB - TD;

     df.applyPattern("0.00");
     System.out.print("\nSalario Bruto .....: " + df.format(SB));
     System.out.print("\nDesconto ..........: " + df.format(TD));
     System.out.print("\nSalario Liquido ...: " + df.format(SL));
     System.out.println();

  }
}
