package cap02;

public class Ejercicio09 extends Tree {
	
	
	/*
	What is the result? (Choose all that apply.)
	 A. An exception is thrown at runtime
	 B. The code compiles and runs with no output
	 C. Compilation fails with an error at line 8
	 D. Compilation fails with an error at line 9
	 E. Compilation fails with an error at line 12
	 F. Compilation fails with an error at line 13
	Respuesta A 
	 public static void main(String[] args) {
	 new Ejercicio09().go();
	}
	void go() {
	go2(new Tree(), new Ejercicio09());
	go2((Ejercicio09) new Tree(), new Ejercicio09());
	}
	void go2(Tree t1, Ejercicio09 r1) {
	Ejercicio09 r2 = (Ejercicio09)t1;
	Tree t2 = (Tree)r1;
	}
	}


	class Tree { }


	*/