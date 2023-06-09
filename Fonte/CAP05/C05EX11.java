import java.io.*;
class import java.io.*;
class import java.io.*;
class C05EX11 {
  public static void main(String args[]) {

    int MES;

    System.out.println();
    System.out.print("Entre um valor referente a um MES: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      MES = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      MES = 0;
    }
    System.out.println();

    if (MES ==  1)
      System.out.println("Janeiro");
    else if (MES ==  2)
      System.out.println("Fevereiro");
    else if (MES ==  3)
      System.out.println("Marco");
    else if (MES ==  4)
      System.out.println("Abril");
    else if (MES ==  5)
      System.out.println("Maio");
    else if (MES ==  6)
      System.out.println("Junho");
    else if (MES ==  7)
      System.out.println("Julho");
    else if (MES ==  8)
      System.out.println("Agosto");
    else if (MES ==  9)
      System.out.println("Setembro");
    else if (MES == 10)
      System.out.println("Outubro");
    else if (MES == 11)
      System.out.println("Novembro");
    else if (MES == 12)
      System.out.println("Dezembro");
    else 
      System.out.println("Mes invalido");

    System.out.println();
  }
}
 {
  public static void main(String args[]) {

    int MES;

    System.out.println();
    System.out.print("Entre um valor referente a um MES: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      MES = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      MES = 0;
    }
    System.out.println();

    switch (MES)
      {
        case  1: System.out.println("Janeiro");      break;
        case  2: System.out.println("Fevereiro");    break;
        case  3: System.out.println("Marco");        break;
        case  4: System.out.println("Abril");        break;
        case  5: System.out.println("Maio");         break;
        case  6: System.out.println("Junho");        break;
        case  7: System.out.println("Julho");        break;
        case  8: System.out.println("Agosto");       break;
        case  9: System.out.println("Setembro");     break;
        case 10: System.out.println("Outubro");      break;
        case 11: System.out.println("Novembro");     break;
        case 12: System.out.println("Dezembro");     break;
        default: System.out.println("Mes invalido"); break;
      }
    System.out.println();
  }
}
{
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
          System.out.println("dois");
        if (CODIGO == 3)
          System.out.println("tres");
      }
    else
      System.out.println("codigo invalido");

    System.out.println();
  }
}
