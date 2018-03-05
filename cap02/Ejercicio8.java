package cap02;

public class Ejercicio8 {
/*
 8. Given:
3. class Dog {
4. public void bark() { System.out.print("woof "); }
5. }
6. class Hound extends Dog {
7. public void sniff() { System.out.print("sniff "); }
RESPUESTA F
 */
		public static void main(String[] args) { new DogShow().go(); }
		 void go() {
		 new Hound().bark();
	 ((Dog) new Hound()).bark();
		((Dog) new Hound()).sniff();
		 }
		 }
}
	class Dog {
		 public void bark() { System.out.print("woof "); }
		class Hound extends Dog {
		 public void sniff() { System.out.print("sniff "); }
		}
			 }
		class Hound extends Dog {
		public void sniff() { System.out.print("sniff "); }
