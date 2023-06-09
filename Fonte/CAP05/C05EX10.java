import java.io.*;
class C05EX10 {
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
    else
      if (MES ==  2)
        System.out.println("Fevereiro");
      else
        if (MES ==  3)
          System.out.println("Marco");
        else
          if (MES ==  4)
            System.out.println("Abril");
          else
            if (MES ==  5)
              System.out.println("Maio");
            else
              if (MES ==  6)
                System.out.println("Junho");
              else
                if (MES ==  7)
                  System.out.println("Julho");
                else
                  if (MES ==  8)
                    System.out.println("Agosto");
                  else
                    if (MES ==  9)
                      System.out.println("Setembro");
                    else
                      if (MES == 10)
                        System.out.println("Outubro");
                      else
                        if (MES == 11)
                          System.out.println("Novembro");
                        else
                          if (MES == 12)
                            System.out.println("Dezembro");
                          else
                            System.out.println("Mes invalido");

    System.out.println();
  }
}
