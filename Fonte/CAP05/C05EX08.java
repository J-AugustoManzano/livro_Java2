import java.io.*;
class import java.io.*;
class C05EX08 {
  public static void main(String args[]) {
    float A, B, C;
    System.out.println();
   
    System.out.print("Entre o lado <A>: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      A = Float.parseFloat(br.readLine()); } 
    catch (Exception e) {
      A = 0;
    }
      
    System.out.print("Entre o lado <B>: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      B = Float.parseFloat(br.readLine()); } 
    catch (Exception e) {
      B = 0;
    }
   
    System.out.print("Entre o lado <C>: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      C = Float.parseFloat(br.readLine()); } 
    catch (Exception e) {
      C = 0;
    }
   
    if (A<B+C && B<A+C && C<A+B)
      if (A==B && B==C)
        System.out.println("Triangulo Equilatero");
      else
        if (A==B || A==C || C==B)
          System.out.println("Triangulo Isosceles");
        else
          System.out.println("Triangulo Escaleno");
    else
      System.out.println("Os valores nao formam um triangulo");
    System.out.println();
  }
}
 {
  public static void main(String args[]) {

    float A, B, R = 0;
    int OPCAO;

    System.out.println();
   
    System.out.print("Entre o valor <A>: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      A = Float.parseFloat(br.readLine()); } 
    catch (Exception e) {
      A = 0;
    }
      
    System.out.print("Entre o valor <B>: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      B = Float.parseFloat(br.readLine()); } 
    catch (Exception e) {
      B = 0;
    }
   
    System.out.println();
    System.out.println("[1] - Adicao");
    System.out.println("[2] - Subtracao");
    System.out.println("[3] - Multiplicacao");
    System.out.println("[4] - Divisao");
    System.out.println();
    System.out.print("Escolha uma opcao: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      OPCAO = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      OPCAO = 0;
    }

    if (OPCAO == 1)
      R = A + B;
    if (OPCAO == 2)
      R = A - B;
    if (OPCAO == 3)
      R = A * B;
    if (OPCAO == 4)
      if (B == 0)
        R = 0;
      else
        R = A / B;

    System.out.println("O resultado equivale a: " + R);
    System.out.println();
  }
}
