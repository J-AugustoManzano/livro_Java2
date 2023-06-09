import java.io.*;
class C05EX05 {
  public static void main(String args[]) {
    int CODIGO;
    System.out.println();
   
    System.out.print("Entre o codigo de acesso: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      CODIGO = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      CODIGO = 0;
    }
   
    if (CODIGO == 1 || CODIGO == 2 || CODIGO == 3)
      {
        if (CODIGO == 1)
          System.out.println("um");
        if (CODIGO == 2)
          System.out.println("dois");;
        if (CODIGO == 3)
          System.out.println("tres");;
      }
    else
      System.out.println("codigo invalido");

    System.out.println();
  }
}
