package cap03;

public class Ejercicio3 {
	/*
	What is the result?
	 A.hi
	 B.hi hi
	 C.hi hi hi
	 D. Compilation fails
	 E.hi, followed by an exception
	 F.hi hi, followed by an exception
	RESPUESTA F
	*/
	class Mixer {
		 Mixer() { }
		 Mixer(Mixer m) { m1 = m; }
		 Mixer m1;
		 public static void main(String[] args) {
		 Mixer m2 = new Mixer();
		 Mixer m3 = new Mixer(m2); m3.go();
		 Mixer m4 = m3.m1; m4.go();
		 Mixer m5 = m2.m1; m5.go();
		 }
		 void go() { System.out.print("hi "); }
		}
}
