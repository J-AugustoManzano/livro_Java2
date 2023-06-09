import java.io.*;
class C07EX32 {
  public static void main(String args[]) {

    String IDADETXT, ALTURATXT;
    int IDADE;
    float ALTURA;
 
    System.out.println();
  
    System.out.print("Idade ....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      IDADETXT = br.readLine(); } 
    catch (Exception e) {
      IDADETXT = "";
    }

    System.out.print("Altura ...: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ALTURATXT = br.readLine(); } 
    catch (Exception e) {
      ALTURATXT = "";
    }

    IDADE = Integer.valueOf(IDADETXT).intValue(); 
    ALTURA = Float.valueOf(ALTURATXT).floatValue();

    System.out.println();
    if (IDADE <= 1)
      System.out.println("Idade " + IDADE + " ano");
    else
      System.out.println("Idade " + IDADE + " anos");
    System.out.println("Altura " + ALTURA);
    System.out.println();

  }
}
