import java.io.*;
class C06EX06 {
  public static void main(String args[]) {

    int I, RESP = 1;

    do 
      {

        System.out.println();

        I = 1;
        do
          {
            System.out.println("Valor = " + I);
            I++;
          }
        while (I <= 5);

        System.out.println();
        System.out.println("Deseja continuar?");
        System.out.print("Tecle: [1] para SIM / [2] para NAO: ");
        try {
          BufferedReader br = new BufferedReader(
          new InputStreamReader(System.in));
          RESP = Integer.parseInt(br.readLine()); } 
        catch (Exception e) {
          RESP = 0;
        }

      }
    while (RESP == 1); 

  }
}
