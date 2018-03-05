package cap02;

public class Ejercicio2 {
	/*
	 Given:
class Top {
 public Top(String s) { System.out.print("B"); }
}
public class Bottom2 extends Top {
 public Bottom2(String s) { System.out.print("D"); }
 public static void main(String [] args) {
 new Bottom2("C");
 System.out.println(" ");
} }
Self Test Answers 171
172 Chapter 2: Object Orientation
  What is the result?
 A. BD
 B. DB
 C. BDC
 D. DBC
 E. Compilation fails
 RESPUESTA : E
	 */
	
	
	public Ejercicio2(String s) { System.out.print("D"); }
	public static void main(String [] args) {
	new Ejercicio2("C");
	System.out.println(" ");
	}
}
class Top{
	public Top(String s) {
		System.out.println("B");
	}
}
