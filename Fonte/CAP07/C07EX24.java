class C07EX24 {
  public static void main(String args[]) {

    String TEXTO1 = "PROGRAMACAO COM JAVA";
    String TEXTO2 = "programacao com java";

    System.out.println();
 
    if (TEXTO1.equals(TEXTO2))
      System.out.println("Os textos sao iguais");
    else
      System.out.println("Os textos sao diferentes");

    if (TEXTO1.equalsIgnoreCase(TEXTO2))
      System.out.println("Os textos sao iguais");
    else
      System.out.println("Os textos sao diferentes");

  }
}
