import java.io.*;

class C09EX13 {

  public static void main(String args[]) {

    String VALOR;
    long N1;
    double N2;
    int N3;

    System.out.println();
    System.out.print("Entre um valor ....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      VALOR = br.readLine(); } 
    catch (Exception e) {
      VALOR = "";
    }

    System.out.println();
    N1 = Long.valueOf(VALOR).longValue(); 
    System.out.println("Area: Quadrado ..: " + Area(N1));
    N3 = Integer.valueOf(VALOR).intValue();
    System.out.println("Area: Cubo ......: " + Area(N3, N3, N3));
    N2 = Float.valueOf(VALOR).floatValue();
    System.out.println("Area: Cilindro ..: " + Area(N2, N2));
    System.out.println();
  }

  public static long Area(long X) {
    long AREA = X * X;
    return(AREA);
  }

  public static double Area(double R, double H) {
    double AREA = R * R * 3.14159 * H;
    return(AREA);
  }

  public static int Area(int X, int Y, int Z) {
    int AREA = X * Y * Z;
    return(AREA);
  }
}
