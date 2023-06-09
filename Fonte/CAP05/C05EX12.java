import java.io.*;
class C05EX12 {
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