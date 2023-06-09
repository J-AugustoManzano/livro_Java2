import java.io.*;


class Tpai {

  protected void Executa() {
    System.out.println("Acao na classe-pai");
  }

}


class Tfilho extends Tpai {

  protected void Executa() {
    System.out.println("Acao na classe-filho");
  }

}


class C09EX11 {
  public static void main(String args[]) {

    Tpai PAI = new Tpai();
    Tfilho FILHO = new Tfilho();

    PAI.Executa();
    FILHO.Executa();

    PAI = FILHO;
    PAI.Executa();

  }
}
