package cap01;
public class Ejercicio5 {
	/*
	 5. Given two files:
 1. package pkgA;
 2. public class Foo {
 3. int a = 5;
 4. protected int b = 6;
 5. public int c = 7;
 6. }
 3. package pkgB;
 4. import pkgA.*;
 5. public class Baz {
 6. public static void main(String[] args) {
 7. Foo f = new Foo();
 8. System.out.print(" " + f.a);
 9. System.out.print(" " + f.b);
10. System.out.print(" " + f.c);
11. }
12. }
 What is the result? (Choose all that apply.)
 A. 5 6 7
 B. 5 followed by an exception
 C. Compilation fails with an error on line 7
 D. Compilation fails with an error on line 8
 E. Compilation fails with an error on line 9
 F. Compilation fails with an error on line 10
 
 RESPUESTA ES: D, E
	 */
	 

	public static void main(String[] args) {
	Foo f = new Foo();
	 System.out.print(" " + f.a);
	 System.out.print(" " + f.b);
	 	System.out.print(" " + f.c);
	 }
	
}
