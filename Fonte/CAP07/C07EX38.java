import java.io.*;
import java.util.Date;
import java.text.DateFormat;

class C07EX38 {
  public static void main(String args[]) {

    Date DATA = new Date();
    String DATATEXTO;
    DateFormat df = DateFormat.getDateInstance();

    DATATEXTO = df.format(DATA);
    System.out.println("Data de hoje = " + DATATEXTO);
  }
}  
