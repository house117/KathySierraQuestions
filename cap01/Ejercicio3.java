package cap01;

public class Ejercicio3 {
	/*
	 * Given:
1. class Voop {
2. public static void main(String[] args) {
3. doStuff(1);
4. doStuff(1,2);
5. }
6. // insert code here
7. }
Which, inserted independently at line 6, will compile? (Choose all that apply.)
 A. static void doStuff(int... doArgs) { }
 B. static void doStuff(int[] doArgs) { }
 C. static void doStuff(int doArgs...) { }
 D. static void doStuff(int... doArgs, int y) { }
 E. static void doStuff(int x, int... doArgs) { }
 
 RESPUESTA: A,E
	 */
	public static void main(String[] args) {
		doStuff(1);
		doStuff(1,2);
	}
	static void doStuff(int... doArgs) {
		System.out.println("");
	}
	static void doStuff(int x, int... doArgs) {
		System.out.println("");
	}
}
