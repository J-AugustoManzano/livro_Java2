import java.io.*;

class C09EX10 {

  public static void main(String args[]) {

    Tarea A = new Tarea();

    System.out.println();
    System.out.println("Area: Quadrado ..: " + A.Area(5));
    System.out.println("Area: Cubo ......: " + A.Area(5, 6, 7));
    System.out.println("Area: Cilindro ..: " + A.Area(7, 3));
    System.out.println();
  }

}
