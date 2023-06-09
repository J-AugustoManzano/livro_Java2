class C07EX19 {
  public static void main(String args[]) {

    int NUMERO, COLUNA, LINHA;

    for(LINHA = 1; LINHA <= 3; LINHA++)
      {
        for(COLUNA = 1; COLUNA <= 5; COLUNA++)
          {
            NUMERO = (int) (Math.random() * 50);
            System.out.print(NUMERO + 1 + "  ");
          }
        System.out.println();
      }

  }
}
