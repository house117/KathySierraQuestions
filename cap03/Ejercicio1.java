package cap03;

public class Ejercicio1 {
/*
 When // doStuff is reached, how many objects are eligible for GC?
 A. 0
 B. 1
 C. 2
 D. Compilation fails
 E. It is not possible to know
 F. An exception is thrown at runtime
RESPUESTA C
*/
 */
}
class CardBoard {
	 Short story = 200;
	 CardBoard go(CardBoard cb) {
		 cb = null;
		 return cb;
	 }
	 public static void main(String[] args) {
		 CardBoard c1 = new CardBoard();
		 CardBoard c2 = new CardBoard();
	 	 CardBoard c3 = c1.go(c2);
	 	 c1 = null;
	 // do Stuff
	 } 
}