import java.io.*;
class C07EX30 {
  public static void main(String args[]) {

    int IDADE;
    float ALTURA;
 
    System.out.println();
                        
    System.out.print("Idade ....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      IDADE = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      IDADE = 0;
    }
   
    System.out.print("Altura ...: ");
     try {
       BufferedReader br = new BufferedReader(
       new InputStreamReader(System.in));
       ALTURA = Float.parseFloat(br.readLine()); } 
     catch (Exception e) {
       ALTURA = 0;
     }

     System.out.println();
     if (IDADE <= 1)
       System.out.println("Idade " + String.valueOf(IDADE) + " ano");
     else
       System.out.println("Idade " + String.valueOf(IDADE) + " anos");
     System.out.println("Altura " + String.valueOf(ALTURA));
     System.out.println();

  }
}
