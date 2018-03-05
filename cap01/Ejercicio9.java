package cap01;

public class Ejercicio9 extends Hobbit{
	/*
	 Given:
4. public class Frodo extend
5. public static void main
6. Short myGold = 7;
7. System.out.println(co
8. }
9. }
10. class Hobbit {
11. int countGold(int x, in
12. }
What is the result?
A. 13
B. Compilation fails due to multiple errors
C. Compilation fails due to an error on line 6
D. Compilation fails due to an error on line 7
E. Compilation fails due to an error on line 11
RESPUESTA: D
	 */
	Short myGold = 7;
	System.out.println(countGold(myGold, 6));
}
class Hobbit{
	int countGold(int x, int y) {
		return x+y;
	}
}