package cap03;


/**
 *
 * @author bautista
 */
public class Ejercicio09 {
  static String s = "";
  public static void main(String[] args) {
  int x = 4; Boolean y = true; short[] sa = {1,2,3};
  doStuff(x, y);
  doStuff(x);
  doStuff(sa, sa);
 System.out.println(s);
 }
 static void doStuff(Object o) { s += "1"; }
 static void doStuff(Object... o) { s += "2"; }
 static void doStuff(Integer... i) { s += "3"; }
 static void doStuff(Long L) { s += "4"; }
 }
/*
What is the result?
 A. 212
 B. 232
 C. 234
 D. 312
 E. 332
 F. 334
 G. Compilation fails
RESPUESTA A
*/