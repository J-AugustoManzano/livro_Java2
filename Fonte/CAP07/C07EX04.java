class C07EX04 {
  public static void main(String args[]) {

    System.out.println();

    // arco tangente no quadrante I

    System.out.println(Math.atan2(1,1));                  

    // arco tangente no quadrante II

    System.out.println(Math.atan2(1,-1));    

    // arco tangente no quadrante III

    System.out.println(Math.atan2(-1,-1)); 

    // arco tangente no quadrante IV

    System.out.println(Math.atan2(-1,1)); 

    System.out.println();

    // angulo 45 graus, quadrante I, que vai de 0 a 90 graus

    System.out.println(Math.toDegrees(Math.atan2(1,1)));

    // angulo 135 graus, quadrante II, que vai de 90 a 180 graus

    System.out.println(Math.toDegrees(Math.atan2(1,-1)));

    // angulo -135 graus, quadrante III, que vai de -90 a -180 graus

    System.out.println(Math.toDegrees(Math.atan2(-1,-1)));

    // angulo -45 graus, quadrante IV, que vai de 0 a -90 graus

    System.out.println(Math.toDegrees(Math.atan2(-1,1)));

  }
}

