package cap02;


class Mammal {
	/*
	What is the result?
	 A. furry bray
	 B. stripes bray
	 C. furry generic noise
	 D. stripes generic noise
	 E. Compilation fails
	 F. An exception is thrown at runtime
	RESPUESTA A
	*/
 String name = "furry ";
 String makeNoise() { return "generic noise"; }
 }
 class Zebra extends Mammal {
 String name = "stripes ";
 String makeNoise() { return "bray"; }
 }
 public class Ejercicio13 {
 public static void main(String[] args) { new Ejercicio13().go(); }
 void go() {
 Mammal m = new Zebra();
 System.out.println(m.name + m.makeNoise());
 }
}