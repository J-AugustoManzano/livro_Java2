import java.io.*;
import br.com.editoraerica.livro.java.MateMax;

class C14EX01 {
  public static void main(String args[]) { 

  // Mostra valores das constantes

  System.out.println();
  System.out.println("1/pi ..............: " + MateMax.MM1PI);
  System.out.println("1/raiz quad. de pi : " + MateMax.MM1SQRTPI);
  System.out.println("2/pi ..............: " + MateMax.MM2PI);
  System.out.println("2/raiz quad. de pi : " + MateMax.MM2SQRTPI);
  System.out.println("Logar. nat. de 10 .: " + MateMax.MMLN10);
  System.out.println("Logar. nat. de 2 ..: " + MateMax.MMLN2);
  System.out.println("Logar. com. de 10 .: " + MateMax.MMLOG10E);
  System.out.println("Logar. com. de 2 ..: " + MateMax.MMLOG2E);
  System.out.println("pi/2 ..............: " + MateMax.MMPI2);
  System.out.println("pi/4 ..............: " + MateMax.MMPI4);
  System.out.println("Raiz quad. de 2 ...: " + MateMax.MMSQRT2);
  System.out.println("Raiz quad. de 0.5 .: " + MateMax.MMSQRTM);
  System.out.println("Raiz quad. de pi ..: " + MateMax.MMSQRTPI);

  // Mostra valores dos metodos

  System.out.println();
  System.out.println("Inv. de 3 .........: " + MateMax.inv(3.0));
  System.out.println("Raiz 2 e indice 3 .: " + MateMax.root(2,3));

  }
}
