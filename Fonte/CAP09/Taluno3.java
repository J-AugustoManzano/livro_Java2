public class Taluno3 extends Tsala {

  String NOME;
  float MEDIA;

  public static boolean CondAluno(float ALUMEDIA, double CORMEDIA) {
    boolean CONDALUNO = true;
    if (ALUMEDIA < CORMEDIA)
      CONDALUNO = false;
    return(CONDALUNO);
  }

}
