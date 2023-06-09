import java.io.*;
import java.util.Date;

class C07EX36 {
  public static void main(String args[]) {

    Date HORA = new Date();
  
    System.out.println();
    System.out.println("Hora ............: " + HORA.getHours());
    System.out.println("Minutos..........: " + HORA.getMinutes());
    System.out.println("Segundos ........: " + HORA.getSeconds());
    System.out.println("Milisegundos ....: " + HORA.getTime());

  }
}
