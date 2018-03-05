package cap03;

public class Ejercicio2 {
	/*
	What is the result?
	 A.many
	 B. a few
	 C. Compilation fails
	 D. The output is not predictable
	 E. An exception is thrown at runtime
	RESPUESTA C 
	*/
}

class Alien {
	 String invade(short ships) { return "a few"; }
	 String invade(short... ships) { return "many"; }
	}
	class Defender {
	 public static void main(String [] args) {
	 System.out.println(new Alien().invade()); //linea de error System.out.println(new Alien().invade(7))
	} }
