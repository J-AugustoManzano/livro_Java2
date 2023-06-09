public class Taluno7 extends Tsala3 {

  public String NOME;
  public float N1, N2;
  private float MEDIA;

  Taluno7(String N, float X, float Y, int SL) {
    NOME = N;
    N1 = X;
    N2 = Y;
    SALA = SL;
  }

  protected void finalize() {}

  public float CalcMedia(float NT1, float NT2) {
    MEDIA = (NT1 + NT2) / 2;
    return(MEDIA);
  }

  public static boolean CondAluno(float ALUMEDIA, double CORMEDIA) {
    boolean CONDALUNO = true;
    if (ALUMEDIA < CORMEDIA)
      CONDALUNO = false;
    return(CONDALUNO);
  }

}
