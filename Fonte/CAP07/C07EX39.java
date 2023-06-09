import java.io.*;
import java.util.Date;
import java.text.DateFormat;

class C07EX39 {
  public static void main(String args[]) {

    Date DATA = new Date();
    String DATATEXTO1,
           DATATEXTO2,
           DATATEXTO3,
           DATATEXTO4,
           DATATEXTO5;

    DateFormat df1 = DateFormat.getDateInstance();
    DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT);
    DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
    DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG);
    DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL); 

    DATATEXTO1 = df1.format(DATA);
    DATATEXTO2 = df2.format(DATA);
    DATATEXTO3 = df3.format(DATA);
    DATATEXTO4 = df4.format(DATA);
    DATATEXTO5 = df5.format(DATA);

    System.out.println();
    System.out.println("Modos de Apresentacao da Data de Hoje");
    System.out.println();
    System.out.println();

    System.out.println("Padrao ....: " + DATATEXTO1);
    System.out.println("Curto .....: " + DATATEXTO2);
    System.out.println("Medio .....: " + DATATEXTO3);
    System.out.println("Longo .....: " + DATATEXTO4);
    System.out.println("Completo ..: " + DATATEXTO5);
  }
}  

