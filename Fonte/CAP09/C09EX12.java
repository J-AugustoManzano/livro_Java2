import java.io.*;

class C09EX12 {
  public static void main(String args[]) {

    Tpai PAI = new Tpai();
    Tfilho FILHO = new Tfilho();

    PAI.Executa();
    FILHO.Executa();

    PAI = FILHO;
    PAI.Executa();

  }
}
