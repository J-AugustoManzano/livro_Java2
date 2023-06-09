import java.io.*;
import java.util.Date;

class C07EX35 {
  public static void main(String args[]) {

    Date DATA = new Date();
    int DIA, MES, ANO, ANOX;
    String ENTRADATA;

    System.out.println();
    System.out.print("Entre data no formato DD/MM/AAAA: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ENTRADATA = br.readLine(); } 
    catch (Exception e) {
      ENTRADATA = "";
    }
    System.out.println();

    DIA = Integer.parseInt(ENTRADATA.substring( 0, 2)); 
    MES = Integer.parseInt(ENTRADATA.substring( 3, 5));
    ANO = Integer.parseInt(ENTRADATA.substring( 6,10));

    DATA.setDate(DIA);
    DATA.setMonth(MES - 1);
    DATA.setYear(ANO - 1900);
  
    System.out.println("Data fornecida ..: " + DATA);
    System.out.print("Dia da semana ...: ");
    switch (DATA.getDay())
      {
        case  0: System.out.println("Domingo");       break;
        case  1: System.out.println("Segunda-feira"); break;
        case  2: System.out.println("Terca-feira");   break;
        case  3: System.out.println("Quarta-feira");  break;
        case  4: System.out.println("Quinta-feira");  break;
        case  5: System.out.println("Sexta-feira");   break;
        case  6: System.out.println("Sabado");        break;
      }
    System.out.println("Dia .............: " + DATA.getDate());
    System.out.print("Mes .............: ");
    switch (DATA.getMonth())
      {
        case  0: System.out.println("Janeiro");      break;
        case  1: System.out.println("Fevereiro");    break;
        case  2: System.out.println("Marco");        break;
        case  3: System.out.println("Abril");        break;
        case  4: System.out.println("Maio");         break;
        case  5: System.out.println("Junho");        break;
        case  6: System.out.println("Julho");        break;
        case  7: System.out.println("Agosto");       break;
        case  8: System.out.println("Setembro");     break;
        case  9: System.out.println("Outubro");      break;
        case 10: System.out.println("Novembro");     break;
        case 11: System.out.println("Dezembro");     break;
      }
    ANOX = DATA.getYear() + 1900;
    System.out.println("Ano .............: " + ANOX);

  }
}
