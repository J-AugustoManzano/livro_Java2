import java.io.*;
import java.util.Date;

class C07EX34 {
  public static void main(String args[]) {

    Date DATA = new Date();
    int ANO;
  
    System.out.println();
    System.out.println("Data do sistema .: " + DATA);
    System.out.println("Dia da semana ...: " + DATA.getDay());
    System.out.print("Nome do dia .....: ");
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
    System.out.println("Mes .............: " + DATA.getMonth());
    System.out.print("Nome do mes .....: ");
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

    ANO = DATA.getYear() + 1900;
    System.out.println("Ano .............: " + ANO);

  }
}
