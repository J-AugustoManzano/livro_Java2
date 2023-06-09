package br.com.editoraerica.livro.java;
import java.io.*;

public class MateMax {

  // Constantes matematicas

  public static final double MM1PI     = 0.3183098861837906d;
  public static final double MM1SQRTPI = 0.5641895835477562d;
  public static final double MM2PI     = 0.6366197723675813d;
  public static final double MM2SQRTPI = 1.1283791670955125d;
  public static final double MMLN10    = 2.3025850929940456d;
  public static final double MMLN2     = 0.6931471805599453d;
  public static final double MMLOG10E  = 0.4342944819032518d;
  public static final double MMLOG2E   = 1.4426950408889634d;
  public static final double MMPI2     = 1.5707963267948966d;
  public static final double MMPI4     = 0.7853981633974483d;
  public static final double MMSQRT2   = 1.4142135623730950d;
  public static final double MMSQRTM   = 0.7071067811865475d;
  public static final double MMSQRTPI  = 1.7724538509055160d;

  // Metodo: inv(x)

  public static double inv(double X) {
    double INV = 1 / X;
    return(INV);
  }

  // Metodo: root(x,y)

  public static double root(double X, double Y) {
    double ROOT = Math.pow(X, (1 / Y));
    return(ROOT);
  }

}
