package cap02;

public class Ejercicio3 extends Clidder {
	/*
	 3. Given:
	class Clidder {
	private final void flipper() { System.out.println("Clidder"); }
	}
	public class Clidlet extends Clidder {
	public final void flipper() { System.out.println("Clidlet"); }
	public static void main(String [] args) {
	new Clidlet().flipper();
	} }
	What is the result?
	A. Clidlet
	B. Clidder
	C.Clidder
	Clidlet
	D.Clidlet
	Clidder
	E. Compilation fails
	 */
	//RESPUESTA: A
public final void flipper() { System.out.println("Clidlet"); }
public static void main(String [] args) {
new Ejercicio3().flipper();
} }
class Clidder{
	private final void fipper() {
		System.out.println("Clidder");
	}
}
