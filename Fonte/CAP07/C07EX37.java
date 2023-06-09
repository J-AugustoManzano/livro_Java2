import java.io.*;
import java.util.Date;

class C07EX37 {
  public static void main(String args[]) {

    Date HORARIO = new Date();
    int HORA, MINUTO, SEGUNDO;
    String ENTRAHORARIO;

    System.out.println();
    System.out.print("Entre hora no formato HH:MM:SS --> ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ENTRAHORARIO = br.readLine(); } 
    catch (Exception e) {
      ENTRAHORARIO = "";
    }
    System.out.println();

    HORA = Integer.parseInt(ENTRAHORARIO.substring( 0, 2)); 
    MINUTO = Integer.parseInt(ENTRAHORARIO.substring( 3, 5));
    SEGUNDO = Integer.parseInt(ENTRAHORARIO.substring( 6, 8));

    HORARIO.setHours(HORA);
    HORARIO.setMinutes(MINUTO);
    HORARIO.setSeconds(SEGUNDO);
  
    System.out.println("Hora ............: " + HORARIO.getHours());
    System.out.println("Minutos .........: " + HORARIO.getMinutes());
    System.out.println("Segundos ........: " + HORARIO.getSeconds());

  }
}
