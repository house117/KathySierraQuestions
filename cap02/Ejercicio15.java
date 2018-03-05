package cap02;

class A { }
class B extends A { }
public class Ejercicio15 {
static String s = "-";
public static void main(String[] args) {
	/*
	What is the result?
	 A. -124
	 B. -134
	 C. -424
	 D. -434
	 E. -444
	 F. Compilation fails
	RESPUESTA  D
	*/
	A[] aa = new A[2];
	B[] ba = new B[2];
	sifter(aa);
	sifter(ba);
	sifter(7);
	System.out.println(s);
}


static void sifter(A[]... a2) { s += "1"; }
static void sifter(B[]... b1) { s += "2"; }
static void sifter(B[] b1) { s += "3"; }
static void sifter(Object o) { s += "4"; }
}
