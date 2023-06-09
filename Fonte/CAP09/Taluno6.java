public class Taluno6 extends Tsala3 {

  public String NOME;
  public float N1, N2;
  private float MEDIA;

  Taluno6() {
    NOME = "";
    N1 = 0;
    N2 = 0;
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
