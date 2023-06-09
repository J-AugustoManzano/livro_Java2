import java.io.*;
class C07EX42 {
  public static void main(String args[]) {

    int ASCII;
    String STR;

    System.out.println();
    System.out.print("Entre um codigo ASCII: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ASCII = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      ASCII = 0;
    }

    STR = new Character((char)ASCII).toString();

    System.out.println();
    System.out.print(ASCII + " corresponde ao caractere " + STR);
    System.out.println();
    
  }
}
