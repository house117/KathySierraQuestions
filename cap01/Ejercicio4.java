package cap01;

public class Ejercicio4{
/*
 4. Given:
 1. enum Animals {
 2. DOG("woof"), CAT("meow"), FISH("burble");
 3. String sound;
 4. Animals(String s) { sound = s; }
 5. }
 6. class TestEnum {
 7. static Animals a;
 8. public static void main(String [] args) {
 9. System.out.println(a.DOG.sound + " " + a.FISH.sound);
10. }
11. }
 What is the result?
 A. woof burble
 B. Multiple compilation errors
 C. Compilation fails due to an error on line 2
 D. Compilation fails due to an error on line 3
 E. Compilation fails due to an error on line 4
 F. Compilation fails due to an error on line 9
 
 
 RESPUESTA ES A
 */
	enum Animals{
		DOG("woof"), CAT("meow"), FISH("burble");
		String sound;
		Animals(String s) {sound = s;}
	}
	static Animals a;
	public static void main(String[] args) {
		
		System.out.println(Animals.DOG.sound+" "+Animals.FISH.sound);
	}
		 


}
