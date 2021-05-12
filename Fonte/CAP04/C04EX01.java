import java.io.*;

class C04EX01 {

  public static void main(String args[]) {

    String NOME;
    int IDADE;
    float ALTURA;
 
    System.out.println();

    System.out.print("Entre seu nome ....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      NOME = br.readLine(); } 
    catch (Exception e) {
      NOME = "";
    }
   
    System.out.print("Entre sua idade ...: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      IDADE = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      IDADE = 0;
    }
   
    System.out.print("Entre sua altura ..: ");
     try {
       BufferedReader br = new BufferedReader(
       new InputStreamReader(System.in));
       ALTURA = Float.parseFloat(br.readLine()); } 
     catch (Exception e) {
       ALTURA = 0;
     }

     System.out.println();
     System.out.print("Nome ..............: " + NOME);
     System.out.print("\nIdade .............: " + IDADE + " anos");
     System.out.print("\nAltura ............: " + ALTURA);
     System.out.println();

  }
}
