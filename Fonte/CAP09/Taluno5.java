public class Taluno5 extends Tsala2 {

  public String NOME;
  public float N1, N2;
  private float MEDIA;

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
